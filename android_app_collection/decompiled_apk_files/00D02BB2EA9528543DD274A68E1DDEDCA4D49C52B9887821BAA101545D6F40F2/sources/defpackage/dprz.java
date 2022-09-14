package defpackage;
/* compiled from: PG */
/* renamed from: dprz  reason: default package */
/* loaded from: classes.dex */
public enum dprz implements dsrb {
    EXPERIENCE_CATEGORY_UNKNOWN(0),
    EXPERIENCE_CATEGORY_ATTRACTIONS(17),
    EXPERIENCE_CATEGORY_GAMES_AND_ARCADE(4369),
    EXPERIENCE_CATEGORY_FASHION_AND_SHOPPING(18),
    EXPERIENCE_CATEGORY_FASHION_SHOW(4625),
    EXPERIENCE_CATEGORY_HEALTH_AND_WELLNESS(19),
    EXPERIENCE_CATEGORY_NIGHTLIFE(20),
    EXPERIENCE_CATEGORY_FOOD_AND_DRINK(21),
    EXPERIENCE_CATEGORY_BEER(5393),
    EXPERIENCE_CATEGORY_WINE(5394),
    EXPERIENCE_CATEGORY_RECREATION(22),
    EXPERIENCE_CATEGORY_CELEBRATION(23),
    EXPERIENCE_CATEGORY_FAIR(5905),
    EXPERIENCE_CATEGORY_PARADE(5906),
    EXPERIENCE_CATEGORY_RELIGIOUS_CELEBRATION(5907),
    EXPERIENCE_CATEGORY_ARTS(24),
    EXPERIENCE_CATEGORY_ENTERTAINMENT(6161),
    EXPERIENCE_CATEGORY_THEATER(1577233),
    EXPERIENCE_CATEGORY_FILM(1577234),
    EXPERIENCE_CATEGORY_COMEDY_SHOW(1577235),
    EXPERIENCE_CATEGORY_MUSIC(6162),
    EXPERIENCE_CATEGORY_CONCERT(1577489),
    EXPERIENCE_CATEGORY_MUSIC_CLASS(1577490),
    EXPERIENCE_CATEGORY_MUSIC_FESTIVAL(1577491),
    EXPERIENCE_CATEGORY_VISUAL_ART(6163),
    EXPERIENCE_CATEGORY_LITERATURE(6164),
    EXPERIENCE_CATEGORY_SPORTS(25),
    EXPERIENCE_CATEGORY_BASEBALL(6417),
    EXPERIENCE_CATEGORY_BASKETBALL(6418),
    EXPERIENCE_CATEGORY_AMERICAN_FOOTBALL(6419),
    EXPERIENCE_CATEGORY_SOCCER(6420),
    EXPERIENCE_CATEGORY_RUNNING_RACE(6421),
    EXPERIENCE_CATEGORY_CAR_RACE(6422),
    EXPERIENCE_CATEGORY_CYCLING(6423),
    EXPERIENCE_CATEGORY_HORSE_RACE(6424),
    EXPERIENCE_CATEGORY_CRICKET(6425),
    EXPERIENCE_CATEGORY_ICE_HOCKEY(6426),
    EXPERIENCE_CATEGORY_GROUP_SPORTS(6427),
    EXPERIENCE_CATEGORY_FITNESS(26),
    EXPERIENCE_CATEGORY_NETWORKING_AND_EDUCATIONAL(27),
    EXPERIENCE_CATEGORY_CONVENTION(6929),
    EXPERIENCE_CATEGORY_VOLUNTEERING_AND_ACTIVISM(28),
    EXPERIENCE_CATEGORY_CRISIS(29),
    EXPERIENCE_CATEGORY_ATTACK(7425),
    EXPERIENCE_CATEGORY_AVALANCHE(7429),
    EXPERIENCE_CATEGORY_BOMBING(7426),
    EXPERIENCE_CATEGORY_BUSHFIRE(7427),
    EXPERIENCE_CATEGORY_CONFLAGRATION(7428),
    EXPERIENCE_CATEGORY_CYCLONE(7430),
    EXPERIENCE_CATEGORY_EARTHQUAKE(7431),
    EXPERIENCE_CATEGORY_EXPLOSION(7432),
    EXPERIENCE_CATEGORY_FLOOD(7433),
    EXPERIENCE_CATEGORY_FROST(7451),
    EXPERIENCE_CATEGORY_HAIL(7453),
    EXPERIENCE_CATEGORY_HURRICANE(7434),
    EXPERIENCE_CATEGORY_LANDSLIDE(7450),
    EXPERIENCE_CATEGORY_POWER_OUTAGE(7435),
    EXPERIENCE_CATEGORY_RAIN(7446),
    EXPERIENCE_CATEGORY_SHOOTING(7436),
    EXPERIENCE_CATEGORY_SNOW(7449),
    EXPERIENCE_CATEGORY_SUPER_TYPHOON(7437),
    EXPERIENCE_CATEGORY_THUNDERSTORM(7448),
    EXPERIENCE_CATEGORY_TORNADO(7438),
    EXPERIENCE_CATEGORY_TROPICAL_CYCLONE(7439),
    EXPERIENCE_CATEGORY_TROPICAL_STORM(7440),
    EXPERIENCE_CATEGORY_TSUNAMI(7441),
    EXPERIENCE_CATEGORY_TYPHOON(7442),
    EXPERIENCE_CATEGORY_VEHICLE_RAMMING_ATTACK(7443),
    EXPERIENCE_CATEGORY_VOLCANO(7452),
    EXPERIENCE_CATEGORY_WILDFIRE(7444),
    EXPERIENCE_CATEGORY_WIND(7447),
    EXPERIENCE_CATEGORY_WINTER_STORM(7445);
    
    public final int au;

    dprz(int i) {
        this.au = i;
    }

    public static dprz b(int i) {
        if (i != 0) {
            if (i == 4369) {
                return EXPERIENCE_CATEGORY_GAMES_AND_ARCADE;
            }
            if (i == 4625) {
                return EXPERIENCE_CATEGORY_FASHION_SHOW;
            }
            if (i == 6929) {
                return EXPERIENCE_CATEGORY_CONVENTION;
            }
            if (i == 5393) {
                return EXPERIENCE_CATEGORY_BEER;
            }
            if (i == 5394) {
                return EXPERIENCE_CATEGORY_WINE;
            }
            switch (i) {
                case 17:
                    return EXPERIENCE_CATEGORY_ATTRACTIONS;
                case 18:
                    return EXPERIENCE_CATEGORY_FASHION_AND_SHOPPING;
                case 19:
                    return EXPERIENCE_CATEGORY_HEALTH_AND_WELLNESS;
                case 20:
                    return EXPERIENCE_CATEGORY_NIGHTLIFE;
                case 21:
                    return EXPERIENCE_CATEGORY_FOOD_AND_DRINK;
                case 22:
                    return EXPERIENCE_CATEGORY_RECREATION;
                case 23:
                    return EXPERIENCE_CATEGORY_CELEBRATION;
                case 24:
                    return EXPERIENCE_CATEGORY_ARTS;
                case 25:
                    return EXPERIENCE_CATEGORY_SPORTS;
                case 26:
                    return EXPERIENCE_CATEGORY_FITNESS;
                case 27:
                    return EXPERIENCE_CATEGORY_NETWORKING_AND_EDUCATIONAL;
                case 28:
                    return EXPERIENCE_CATEGORY_VOLUNTEERING_AND_ACTIVISM;
                case 29:
                    return EXPERIENCE_CATEGORY_CRISIS;
                default:
                    switch (i) {
                        case 5905:
                            return EXPERIENCE_CATEGORY_FAIR;
                        case 5906:
                            return EXPERIENCE_CATEGORY_PARADE;
                        case 5907:
                            return EXPERIENCE_CATEGORY_RELIGIOUS_CELEBRATION;
                        default:
                            switch (i) {
                                case 6161:
                                    return EXPERIENCE_CATEGORY_ENTERTAINMENT;
                                case 6162:
                                    return EXPERIENCE_CATEGORY_MUSIC;
                                case 6163:
                                    return EXPERIENCE_CATEGORY_VISUAL_ART;
                                case 6164:
                                    return EXPERIENCE_CATEGORY_LITERATURE;
                                default:
                                    switch (i) {
                                        case 6417:
                                            return EXPERIENCE_CATEGORY_BASEBALL;
                                        case 6418:
                                            return EXPERIENCE_CATEGORY_BASKETBALL;
                                        case 6419:
                                            return EXPERIENCE_CATEGORY_AMERICAN_FOOTBALL;
                                        case 6420:
                                            return EXPERIENCE_CATEGORY_SOCCER;
                                        case 6421:
                                            return EXPERIENCE_CATEGORY_RUNNING_RACE;
                                        case 6422:
                                            return EXPERIENCE_CATEGORY_CAR_RACE;
                                        case 6423:
                                            return EXPERIENCE_CATEGORY_CYCLING;
                                        case 6424:
                                            return EXPERIENCE_CATEGORY_HORSE_RACE;
                                        case 6425:
                                            return EXPERIENCE_CATEGORY_CRICKET;
                                        case 6426:
                                            return EXPERIENCE_CATEGORY_ICE_HOCKEY;
                                        case 6427:
                                            return EXPERIENCE_CATEGORY_GROUP_SPORTS;
                                        default:
                                            switch (i) {
                                                case 7425:
                                                    return EXPERIENCE_CATEGORY_ATTACK;
                                                case 7426:
                                                    return EXPERIENCE_CATEGORY_BOMBING;
                                                case 7427:
                                                    return EXPERIENCE_CATEGORY_BUSHFIRE;
                                                case 7428:
                                                    return EXPERIENCE_CATEGORY_CONFLAGRATION;
                                                case 7429:
                                                    return EXPERIENCE_CATEGORY_AVALANCHE;
                                                case 7430:
                                                    return EXPERIENCE_CATEGORY_CYCLONE;
                                                case 7431:
                                                    return EXPERIENCE_CATEGORY_EARTHQUAKE;
                                                case 7432:
                                                    return EXPERIENCE_CATEGORY_EXPLOSION;
                                                case 7433:
                                                    return EXPERIENCE_CATEGORY_FLOOD;
                                                case 7434:
                                                    return EXPERIENCE_CATEGORY_HURRICANE;
                                                case 7435:
                                                    return EXPERIENCE_CATEGORY_POWER_OUTAGE;
                                                case 7436:
                                                    return EXPERIENCE_CATEGORY_SHOOTING;
                                                case 7437:
                                                    return EXPERIENCE_CATEGORY_SUPER_TYPHOON;
                                                case 7438:
                                                    return EXPERIENCE_CATEGORY_TORNADO;
                                                case 7439:
                                                    return EXPERIENCE_CATEGORY_TROPICAL_CYCLONE;
                                                case 7440:
                                                    return EXPERIENCE_CATEGORY_TROPICAL_STORM;
                                                case 7441:
                                                    return EXPERIENCE_CATEGORY_TSUNAMI;
                                                case 7442:
                                                    return EXPERIENCE_CATEGORY_TYPHOON;
                                                case 7443:
                                                    return EXPERIENCE_CATEGORY_VEHICLE_RAMMING_ATTACK;
                                                case 7444:
                                                    return EXPERIENCE_CATEGORY_WILDFIRE;
                                                case 7445:
                                                    return EXPERIENCE_CATEGORY_WINTER_STORM;
                                                case 7446:
                                                    return EXPERIENCE_CATEGORY_RAIN;
                                                case 7447:
                                                    return EXPERIENCE_CATEGORY_WIND;
                                                case 7448:
                                                    return EXPERIENCE_CATEGORY_THUNDERSTORM;
                                                case 7449:
                                                    return EXPERIENCE_CATEGORY_SNOW;
                                                case 7450:
                                                    return EXPERIENCE_CATEGORY_LANDSLIDE;
                                                case 7451:
                                                    return EXPERIENCE_CATEGORY_FROST;
                                                case 7452:
                                                    return EXPERIENCE_CATEGORY_VOLCANO;
                                                case 7453:
                                                    return EXPERIENCE_CATEGORY_HAIL;
                                                default:
                                                    switch (i) {
                                                        case 1577233:
                                                            return EXPERIENCE_CATEGORY_THEATER;
                                                        case 1577234:
                                                            return EXPERIENCE_CATEGORY_FILM;
                                                        case 1577235:
                                                            return EXPERIENCE_CATEGORY_COMEDY_SHOW;
                                                        default:
                                                            switch (i) {
                                                                case 1577489:
                                                                    return EXPERIENCE_CATEGORY_CONCERT;
                                                                case 1577490:
                                                                    return EXPERIENCE_CATEGORY_MUSIC_CLASS;
                                                                case 1577491:
                                                                    return EXPERIENCE_CATEGORY_MUSIC_FESTIVAL;
                                                                default:
                                                                    return null;
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return EXPERIENCE_CATEGORY_UNKNOWN;
    }

    public static dsrd c() {
        return dpry.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.au;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.au);
    }
}
