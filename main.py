import json

modname = str(input("MODID: "))
block = str(input("block name: "))

def createBlockJson(block, modname):
  #Defines the JSON file for the block folder
   blockJSON = {
            "parent": "minecraft:block/cube_all",
            "textures": {
                f"all": f"{modname}:block/{block}"
            }
        }   
   itemJSON = {
      "parent": f"{modname}:block/{block}"
      }

  
   with open(f"{block}.json", "w") as outfile:
     json.dump(blockJSON, outfile)
   with open(f"{block}(1).json", "w") as outfile:
     json.dump(itemJSON, outfile)

createBlockJson(block, modname)