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

    block_path = os.path.join("F:", "forge-1.19.3-44.1.23-mdk", "src", "main", "resources", "assets", "rocksolid", "models", "block", f"{block}.json")
    item_path = os.path.join("F:", "forge-1.19.3-44.1.23-mdk", "src", "main", "resources", "assets", "rocksolid", "models", "item", f"{block}.json")

   with open(filepath, "w") as outfile:
     json.dump(blockJSON, outfile)
   print("createdfile")
   with open(filepath2, "w") as outfile:
     json.dump(itemJSON, outfile)
   print("createdfile")

createBlockJson(block, modname)
input("")
