function main() {
    let store = require('app-store-scraper');
    let collection = store.collection.TOP_FREE_IOS;
    let categories = [
        store.category.BUSINESS,
        store.category.EDUCATION,
        store.category.FINANCE,
        store.category.FOOD_AND_DRINK,
        store.category.GAMES,
        store.category.HEALTH_AND_FITNESS,
        store.category.LIFESTYLE,
        store.category.MEDICAL,
        store.category.NEWS,
        store.category.NAVIGATION,
        store.category.PRODUCTIVITY,
        store.category.PHOTO_AND_VIDEO,
        store.category.SHOPPING,
        store.category.SOCIAL_NETWORKING,
        store.category.SPORTS,
        store.category.TRAVEL,
        store.category.UTILITIES,
        store.category.WEATHER
    ];
    let num = 200;
    writeAllIOSAppsToCSV(store, collection, categories, num);
}

async function writeAllIOSAppsToCSV(store, collection, categories, num) {
    let setOfBundleIds = new Set();

    // Retrieve the bundle ids of all apps by iterating through each category
    for (category of categories) {
        setOfBundleIds = new Set([...setOfBundleIds, ...await getIOSAppBundleIds(store, collection, category, num)]);
    }

    // Write to a csv file
    const fs = require('fs');
    const writeStream = fs.createWriteStream('ios_bundle_ids.csv');
    writeStream.write(Array.from(setOfBundleIds).join('\n'));
}

async function getIOSAppBundleIds(store, collection, category, num) {
    let setOfBundleIds = new Set();

    // Retrieve the bundle ids of apps that meet the provided criteria
    const listOfApps = await store.list({
        collection: collection,
        category: category,
        num: num
    })

    try {
        for (i in listOfApps) {
            setOfBundleIds.add(listOfApps[i].appId);
        }
        return setOfBundleIds;
    }
    catch (error) {
        console.log(error)
    };
}

main();