# hero-regionalization
Regionally distributed content to be visible on the index page so that website users have a more customized experience. 
Based on a logic that matches the oem priorties with the HeroContentMap, we find the best hero content match.

Example

```	
imageUrl	"https://www-staging.dealer.com/assets/ddc_globe17.png"
text	"I am a blacklabel text"
url	"https://www.dealer.com/"

```

# API end points
Each OEM has a priority list that priotrizes the order of different campaigns map, in the example below, customMap takes the first place, then zoneMAp, etc... 

http://localhost:8080/hero-regional/findOEMContentPriorityForOemId/lincoln

Expected output:

```
oemId	"lincoln"
priorityList	
0	"customMap"
1	"zoneMap"
2	"regionMap"
3	"nationalMap"
```

http://localhost:8080/hero-regional/findHeroContentMapForOemId/lincoln

Expected output:

```
oemId	"lincoln"
zoneMap	{…}
regionMap	{…}
customMap	
Electric	
imageurl	"https://www-staging.dealer.com/assets/ddc_globe17.png"
text	"I am electric text"
url	"https://www.dealer.com/"
BlackLabel	
imageurl	"https://www-staging.dealer.com/assets/ddc_globe17.png"
text	"I am a blacklabel text"
url	"https://www.dealer.com/"
defaultHeroContent	
default	
imageurl	"https://www-staging.dealer.com/assets/ddc_globe17.png"
text	"I am a default text"
url	"https://www.dealer.com/"
```

http://localhost:8080/hero-regional/findHeroContentForAccountId/whatever

Expected output:

```	
imageUrl	"https://www-staging.dealer.com/assets/ddc_globe17.png"
text	"I am a blacklabel text"
url	"https://www.dealer.com/"
```

# OemContentMap table
```
{
  "customMap": {
    "BlackLabel": {
      "imageUrl": "https://www-staging.dealer.com/assets/ddc_globe17.png",
      "text": "I am a blacklabel text",
      "url": "https://www.dealer.com/"
    },
    "Electric": {
      "imageUrl": "https://www-staging.dealer.com/assets/ddc_globe17.png",
      "text": "I am electric text",
      "url": "https://www.dealer.com/"
    }
  },
  "defaultHeroContent": {
    "default": {
      "imageUrl": "https://www-staging.dealer.com/assets/ddc_globe17.png",
      "text": "I am a default text",
      "url": "https://www.dealer.com/"
    }
  },
  "oemId": "lincoln",
  "regionMap": {
    "central": {
      "imageUrl": "https://www-staging.dealer.com/assets/ddc_globe17.png",
      "text": "I am a central region text",
      "url": "https://www.dealer.com/"
    },
    "east": {
      "imageUrl": "https://www-staging.dealer.com/assets/ddc_globe17.png",
      "text": "I am an east region text",
      "url": "https://www.dealer.com/"
    },
    "greatlakes": {
      "imageUrl": "https://www-staging.dealer.com/assets/ddc_globe17.png",
      "text": "I am a great lakes text",
      "url": "https://www.dealer.com/"
    },
    "southwest": {
      "imageUrl": "https://www-staging.dealer.com/assets/ddc_globe17.png",
      "text": "I am a southwest text",
      "url": "https://www.dealer.com/"
    },
    "west": {
      "imageUrl": "https://www-staging.dealer.com/assets/ddc_globe17.png",
      "text": "I am a west text",
      "url": "https://www.dealer.com/"
    }
  },
  "zoneMap": {
    "A": {
      "imageUrl": "https://www-staging.dealer.com/assets/ddc_globe17.png",
      "text": "I am a zone A text",
      "url": "https://www.dealer.com/"
    },
    "B": {
      "imageUrl": "https://www-staging.dealer.com/assets/ddc_globe17.png",
      "text": "I am a zone B text",
      "url": "https://www.dealer.com/"
    },
    "C": {
      "imageUrl": "https://www-staging.dealer.com/assets/ddc_globe17.png",
      "text": "I am a zone C text",
      "url": "https://www.dealer.com/"
    },
    "D": {
      "imageUrl": "https://www-staging.dealer.com/assets/ddc_globe17.png",
      "text": "I am a zone D text",
      "url": "https://www.dealer.com/"
    }
  }
}
```

# OemContentPriority sample data 
```
{
  "oemId": "lincoln",
  "priorityList": [
    "customMap",
    "zoneMap",
    "regionMap",
    "nationalMap"
  ]
}
```
