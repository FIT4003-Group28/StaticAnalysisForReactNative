package defpackage;

import com.google.cardboard.sdk.R;
/* compiled from: PG */
/* renamed from: aotd  reason: default package */
/* loaded from: classes.dex */
public enum aotd implements aopm {
    UC_DEFAULT(0),
    UC_PROTO_METADATA(1),
    UC_DELEGATED(2),
    UC_RESERVED_FOR_TESTING_IN_PRODUCT_CONTROL(197),
    UC_NEVER_COLLECT(3),
    UC_1P_APP_PROVISION_OF_SERVICE(194),
    UC_3P_APP_PROVISION_OF_SERVICE(203),
    UC_PLATFORM_OR_FEATURE_PRODUCT_IMPROVEMENT_WW(100),
    UC_PLATFORM_OR_FEATURE_FUNCTIONAL_DEBUGGING_WW(101),
    UC_PLATFORM_OR_FEATURE_PRODUCT_DEVELOPMENT_WW(102),
    UC_PLATFORM_OR_FEATURE_MEASURING_USER_ENGAGEMENT_WW(103),
    UC_SERVICE_OR_API_FUNCTIONAL_DEBUGGING_WW(104),
    UC_SERVICE_OR_API_PRODUCT_IMPROVEMENT_WW(105),
    UC_SERVICE_OR_API_PRODUCT_DEVELOPMENT_WW(106),
    UC_SERVICE_OR_API_MEASURING_USER_ENGAGEMENT_WW(154),
    UC_UNBRANDED_1P_APP_FUNCTIONAL_DEBUGGING_WW(117),
    UC_UNBRANDED_1P_APP_PRODUCT_IMPROVEMENT_WW(118),
    UC_UNBRANDED_1P_APP_PRODUCT_DEVELOPMENT_WW(119),
    UC_UNBRANDED_1P_APP_MEASURING_USER_ENGAGEMENT_WW(120),
    UC_HEADLESS_1P_APP_FUNCTIONAL_DEBUGGING_WW(121),
    UC_HEADLESS_1P_APP_PRODUCT_IMPROVEMENT_WW(122),
    UC_HEADLESS_1P_APP_PRODUCT_DEVELOPMENT_WW(R.styleable.AppCompatTheme_windowFixedWidthMinor),
    UC_HEADLESS_1P_APP_MEASURING_USER_ENGAGEMENT_WW(R.styleable.AppCompatTheme_windowMinWidthMajor),
    UC_APP_USAGE_FOREGROUND_USER_BEHAVIOR_WW(R.styleable.AppCompatTheme_windowMinWidthMinor),
    UC_APP_USAGE_SYSTEM_HEALTH_WW(R.styleable.AppCompatTheme_windowNoTitle),
    UC_SYSTEM_HEALTH_INTERACTION_WITH_PRODUCT_WW(128),
    UC_SYSTEM_HEALTH_FUNCTIONAL_DEBUGGING_WW(129),
    UC_PLATFORM_MARKET_STATISTICS_WW(130),
    UC_CONTEXTUALIZATION_NO_USER_DATA_WW(131),
    UC_1P_HW_FUNCTIONAL_DEBUGGING_WW(173),
    UC_1P_HW_PRODUCT_IMPROVEMENT_WW(174),
    UC_1P_HW_PRODUCT_DEVELOPMENT_WW(175),
    UC_1P_HW_MEASURING_USER_ENGAGEMENT_WW(176),
    UC_APP_USAGE_PERSONALIZATION_WW(127),
    UC_SERVICE_OR_API_FUNCTIONAL_DEBUGGING(116),
    UC_SERVICE_OR_API_PRODUCT_IMPROVEMENT(108),
    UC_SERVICE_OR_API_PRODUCT_DEVELOPMENT(132),
    UC_SERVICE_OR_API_MEASURING_USER_ENGAGEMENT(113),
    UC_HEADLESS_1P_APP_FUNCTIONAL_DEBUGGING(150),
    UC_HEADLESS_1P_APP_PRODUCT_IMPROVEMENT(151),
    UC_HEADLESS_1P_APP_PRODUCT_DEVELOPMENT(152),
    UC_HEADLESS_1P_APP_MEASURING_USER_ENGAGEMENT(153),
    UC_UNBRANDED_1P_APP_FUNCTIONAL_DEBUGGING(111),
    UC_UNBRANDED_1P_APP_PRODUCT_IMPROVEMENT(112),
    UC_UNBRANDED_1P_APP_PRODUCT_DEVELOPMENT(156),
    UC_UNBRANDED_1P_APP_MEASURING_USER_ENGAGEMENT(155),
    UC_PLATFORM_OR_FEATURE_FUNCTIONAL_DEBUGGING(115),
    UC_PLATFORM_OR_FEATURE_PRODUCT_IMPROVEMENT(109),
    UC_PLATFORM_OR_FEATURE_PRODUCT_DEVELOPMENT(133),
    UC_PLATFORM_OR_FEATURE_MEASURING_USER_ENGAGEMENT(134),
    UC_CRITICAL_FLEET_MANAGEMENT(135),
    UC_EXPERIMENT_TARGETING(159),
    UC_INTERNAL_DESCRIPTION(167),
    UC_1P_HW_DEVICE_MANAGEMENT(193),
    UC_DEVICE_FINGERPRINT(142),
    UC_DEVICE_INTEGRITY(143),
    UC_PLATFORM_INTEGRITY(144),
    UC_APP_INTEGRITY(145),
    UC_ACCOUNT_INTEGRITY(107),
    UC_FRAUD_SPAM_ABUSE_PREVENTION(146),
    UC_DROIDGUARD_VERDICT_INPUT(147),
    UC_PLAY_MALWARE_DETECTION(148),
    UC_SIDELOAD_MALWARE_DETECTION(149),
    UC_SERVICE_ABUSE_PREVENTION(158),
    UC_ABUSE_CONTENT_CLASSIFICATION_VERDICTS(231),
    UC_CRITICAL_FUNCTIONAL_FLEET_ISSUES(114),
    UC_CONTEXTUALIZATION_NO_USER_DATA(140),
    UC_ANDROID_ECOSYSTEM_HEALTH(141),
    UC_REFINING_EXPERIMENTS(160),
    UC_PRIMES_APP_HEALTH(110),
    UC_CHIME_FUNCTIONAL_DEBUGGING(206),
    UC_CHIME_PRODUCT_IMPROVEMENT(207),
    UC_CHIME_MEASURING_USER_ENGAGEMENT(205),
    UC_1P_APP_FUNCTIONAL_DEBUGGING(136),
    UC_1P_APP_PRODUCT_IMPROVEMENT(137),
    UC_1P_APP_PRODUCT_DEVELOPMENT(138),
    UC_1P_APP_MEASURING_USER_ENGAGEMENT(139),
    UC_SDK_FUNCTIONAL_DEBUGGING(199),
    UC_SDK_PRODUCT_IMPROVEMENT(200),
    UC_SDK_PRODUCT_DEVELOPMENT(201),
    UC_SDK_MEASURING_USER_ENGAGEMENT(202),
    UC_FCM_FUNCTIONAL_DEBUGGING(192),
    UC_FIT_FUNCTIONAL_DEBUGGING(177),
    UC_FIT_PRODUCT_IMPROVEMENT(178),
    UC_FIT_PRODUCT_DEVELOPMENT(179),
    UC_FIT_MEASURING_USER_ENGAGEMENT(180),
    UC_FIT_APP_OR_API_FUNCTIONAL_DEBUGGING(188),
    UC_FIT_APP_OR_API_PRODUCT_IMPROVEMENT(189),
    UC_FIT_APP_OR_API_PRODUCT_DEVELOPMENT(190),
    UC_FIT_APP_OR_API_MEASURING_USER_ENGAGEMENT(191),
    UC_GBOARD_FUNCTIONAL_DEBUGGING(161),
    UC_GBOARD_PRODUCT_IMPROVEMENT(162),
    UC_GBOARD_PRODUCT_DEVELOPMENT(163),
    UC_GBOARD_MEASURING_USER_ENGAGEMENT(164),
    UC_PAY_FUNCTIONAL_DEBUGGING(234),
    UC_PAY_PRODUCT_IMPROVEMENT(235),
    UC_PAY_MEASURING_USER_ENGAGEMENT(236),
    UC_GPP_SIDELOADED_UNSAFE_APP_DETECTION(165),
    UC_GPP_UNSAFE_APP_DETECTION(166),
    UC_GPP_UPLOAD_UNSAFE_APP(196),
    UC_CROSS_PRODUCT_PERSONALIZATION_FOOTPRINTS(157),
    UC_SEARCH_HISTORY(238),
    UC_UNBRANDED_CROSS_PRODUCT_PERSONALIZATION_FOOTPRINTS(217),
    UC_BROWSING_HISTORY(239),
    UC_FMD_RING(168),
    UC_FMD_LOCATE(169),
    UC_FMD_LOCK(170),
    UC_FMD_UNPAIR(171),
    UC_FMD_LOCATE_ACCESSORY(237),
    UC_FMD_IDENTIFY_DEVICE_STATE_AND_CAPABILITY(181),
    UC_ENX_OPT_OUT_DEIDENTIFIED_TELEMETRY(172),
    UC_FOREGROUND_LOCATION(182),
    UC_IP_LOCATION(222),
    UC_POPULATED_SERVER_SIDE(223),
    UC_LOCATION_HISTORY(183),
    UC_LOCATION_HISTORY_USER_EDIT(184),
    UC_LOCATION_ACCURACY(185),
    UC_LOCATION_ACCURACY_WIFI(186),
    UC_LOCATION_HISTORY_CONSENT_CHANGE(241),
    UC_EARTHQUAKE_ALERTING(187),
    UC_EARTHQUAKE_DETECTION(226),
    UC_BACKUP_USER_DATA(195),
    UC_RESTORE_USER_DATA(240),
    UC_WEAR_CLOUD_SYNC(204),
    UC_CONTACTS_ACCOUNT_TYPE_LOGGING(208),
    UC_IN_PRODUCT_PERSONALIZATION(209),
    UC_NEARBY_MESSAGES(210),
    UC_FAST_PAIR(211),
    UC_NEARBY_SHARING(212),
    UC_USER_AUTHENTICATION(213),
    UC_GOOGLE_CONTACTS_SYNC(214),
    UC_DEVICE_CONTACT_INFO_COLLECTION(215),
    UC_PEOPLE_DETAILS_SYNC(216),
    UC_WIFI_NETWORK_SCORING(218),
    UC_3P_APP_DEVICE_INTEGRITY(219),
    UC_VERIFY_URL(220),
    UC_FI_FUNCTIONAL_DEBUGGING(224),
    UC_FI_PRODUCT_IMPROVEMENT(225),
    UC_FI_MEASURING_USER_ENGAGEMENT(227),
    UC_FI_CELL_TOWER_HISTORY(233),
    UC_ADS_TARGETING(228),
    UC_ADS_DELIVERY(245),
    UC_ADS_GENERAL_TARGETING(246),
    UC_ADS_PERSONALIZATION(247),
    UC_ADS_MEASUREMENT(229),
    UC_ADS_EXTERNAL_INTEGRATION(230),
    UC_BRELLA_FUNCTIONAL_DEBUGGING(232),
    UC_UNICORN_SETUP(242),
    UC_UNICORN_MANAGEMENT(243),
    UC_UNICORN_ACTIVITY_SUPERVISION(244);
    
    public final int bU;

    aotd(int i) {
        this.bU = i;
    }

    public static aopo a() {
        return aoli.s;
    }

    public static aotd b(int i) {
        if (i != 0) {
            if (i == 1) {
                return UC_PROTO_METADATA;
            }
            if (i == 2) {
                return UC_DELEGATED;
            }
            if (i == 3) {
                return UC_NEVER_COLLECT;
            }
            switch (i) {
                case 100:
                    return UC_PLATFORM_OR_FEATURE_PRODUCT_IMPROVEMENT_WW;
                case 101:
                    return UC_PLATFORM_OR_FEATURE_FUNCTIONAL_DEBUGGING_WW;
                case 102:
                    return UC_PLATFORM_OR_FEATURE_PRODUCT_DEVELOPMENT_WW;
                case 103:
                    return UC_PLATFORM_OR_FEATURE_MEASURING_USER_ENGAGEMENT_WW;
                case 104:
                    return UC_SERVICE_OR_API_FUNCTIONAL_DEBUGGING_WW;
                case 105:
                    return UC_SERVICE_OR_API_PRODUCT_IMPROVEMENT_WW;
                case 106:
                    return UC_SERVICE_OR_API_PRODUCT_DEVELOPMENT_WW;
                case 107:
                    return UC_ACCOUNT_INTEGRITY;
                case 108:
                    return UC_SERVICE_OR_API_PRODUCT_IMPROVEMENT;
                case 109:
                    return UC_PLATFORM_OR_FEATURE_PRODUCT_IMPROVEMENT;
                case 110:
                    return UC_PRIMES_APP_HEALTH;
                case 111:
                    return UC_UNBRANDED_1P_APP_FUNCTIONAL_DEBUGGING;
                case 112:
                    return UC_UNBRANDED_1P_APP_PRODUCT_IMPROVEMENT;
                case 113:
                    return UC_SERVICE_OR_API_MEASURING_USER_ENGAGEMENT;
                case 114:
                    return UC_CRITICAL_FUNCTIONAL_FLEET_ISSUES;
                case 115:
                    return UC_PLATFORM_OR_FEATURE_FUNCTIONAL_DEBUGGING;
                case 116:
                    return UC_SERVICE_OR_API_FUNCTIONAL_DEBUGGING;
                case 117:
                    return UC_UNBRANDED_1P_APP_FUNCTIONAL_DEBUGGING_WW;
                case 118:
                    return UC_UNBRANDED_1P_APP_PRODUCT_IMPROVEMENT_WW;
                case 119:
                    return UC_UNBRANDED_1P_APP_PRODUCT_DEVELOPMENT_WW;
                case 120:
                    return UC_UNBRANDED_1P_APP_MEASURING_USER_ENGAGEMENT_WW;
                case 121:
                    return UC_HEADLESS_1P_APP_FUNCTIONAL_DEBUGGING_WW;
                case 122:
                    return UC_HEADLESS_1P_APP_PRODUCT_IMPROVEMENT_WW;
                case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                    return UC_HEADLESS_1P_APP_PRODUCT_DEVELOPMENT_WW;
                case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                    return UC_HEADLESS_1P_APP_MEASURING_USER_ENGAGEMENT_WW;
                case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                    return UC_APP_USAGE_FOREGROUND_USER_BEHAVIOR_WW;
                case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                    return UC_APP_USAGE_SYSTEM_HEALTH_WW;
                case 127:
                    return UC_APP_USAGE_PERSONALIZATION_WW;
                case 128:
                    return UC_SYSTEM_HEALTH_INTERACTION_WITH_PRODUCT_WW;
                case 129:
                    return UC_SYSTEM_HEALTH_FUNCTIONAL_DEBUGGING_WW;
                case 130:
                    return UC_PLATFORM_MARKET_STATISTICS_WW;
                case 131:
                    return UC_CONTEXTUALIZATION_NO_USER_DATA_WW;
                case 132:
                    return UC_SERVICE_OR_API_PRODUCT_DEVELOPMENT;
                case 133:
                    return UC_PLATFORM_OR_FEATURE_PRODUCT_DEVELOPMENT;
                case 134:
                    return UC_PLATFORM_OR_FEATURE_MEASURING_USER_ENGAGEMENT;
                case 135:
                    return UC_CRITICAL_FLEET_MANAGEMENT;
                case 136:
                    return UC_1P_APP_FUNCTIONAL_DEBUGGING;
                case 137:
                    return UC_1P_APP_PRODUCT_IMPROVEMENT;
                case 138:
                    return UC_1P_APP_PRODUCT_DEVELOPMENT;
                case 139:
                    return UC_1P_APP_MEASURING_USER_ENGAGEMENT;
                case 140:
                    return UC_CONTEXTUALIZATION_NO_USER_DATA;
                case 141:
                    return UC_ANDROID_ECOSYSTEM_HEALTH;
                case 142:
                    return UC_DEVICE_FINGERPRINT;
                case 143:
                    return UC_DEVICE_INTEGRITY;
                case 144:
                    return UC_PLATFORM_INTEGRITY;
                case 145:
                    return UC_APP_INTEGRITY;
                case 146:
                    return UC_FRAUD_SPAM_ABUSE_PREVENTION;
                case 147:
                    return UC_DROIDGUARD_VERDICT_INPUT;
                case 148:
                    return UC_PLAY_MALWARE_DETECTION;
                case 149:
                    return UC_SIDELOAD_MALWARE_DETECTION;
                case 150:
                    return UC_HEADLESS_1P_APP_FUNCTIONAL_DEBUGGING;
                case 151:
                    return UC_HEADLESS_1P_APP_PRODUCT_IMPROVEMENT;
                case 152:
                    return UC_HEADLESS_1P_APP_PRODUCT_DEVELOPMENT;
                case 153:
                    return UC_HEADLESS_1P_APP_MEASURING_USER_ENGAGEMENT;
                case 154:
                    return UC_SERVICE_OR_API_MEASURING_USER_ENGAGEMENT_WW;
                case 155:
                    return UC_UNBRANDED_1P_APP_MEASURING_USER_ENGAGEMENT;
                case 156:
                    return UC_UNBRANDED_1P_APP_PRODUCT_DEVELOPMENT;
                case 157:
                    return UC_CROSS_PRODUCT_PERSONALIZATION_FOOTPRINTS;
                case 158:
                    return UC_SERVICE_ABUSE_PREVENTION;
                case 159:
                    return UC_EXPERIMENT_TARGETING;
                case 160:
                    return UC_REFINING_EXPERIMENTS;
                case 161:
                    return UC_GBOARD_FUNCTIONAL_DEBUGGING;
                case 162:
                    return UC_GBOARD_PRODUCT_IMPROVEMENT;
                case 163:
                    return UC_GBOARD_PRODUCT_DEVELOPMENT;
                case 164:
                    return UC_GBOARD_MEASURING_USER_ENGAGEMENT;
                case 165:
                    return UC_GPP_SIDELOADED_UNSAFE_APP_DETECTION;
                case 166:
                    return UC_GPP_UNSAFE_APP_DETECTION;
                case 167:
                    return UC_INTERNAL_DESCRIPTION;
                case 168:
                    return UC_FMD_RING;
                case 169:
                    return UC_FMD_LOCATE;
                case 170:
                    return UC_FMD_LOCK;
                case 171:
                    return UC_FMD_UNPAIR;
                case 172:
                    return UC_ENX_OPT_OUT_DEIDENTIFIED_TELEMETRY;
                case 173:
                    return UC_1P_HW_FUNCTIONAL_DEBUGGING_WW;
                case 174:
                    return UC_1P_HW_PRODUCT_IMPROVEMENT_WW;
                case 175:
                    return UC_1P_HW_PRODUCT_DEVELOPMENT_WW;
                case 176:
                    return UC_1P_HW_MEASURING_USER_ENGAGEMENT_WW;
                case 177:
                    return UC_FIT_FUNCTIONAL_DEBUGGING;
                case 178:
                    return UC_FIT_PRODUCT_IMPROVEMENT;
                case 179:
                    return UC_FIT_PRODUCT_DEVELOPMENT;
                case 180:
                    return UC_FIT_MEASURING_USER_ENGAGEMENT;
                case 181:
                    return UC_FMD_IDENTIFY_DEVICE_STATE_AND_CAPABILITY;
                case 182:
                    return UC_FOREGROUND_LOCATION;
                case 183:
                    return UC_LOCATION_HISTORY;
                case 184:
                    return UC_LOCATION_HISTORY_USER_EDIT;
                case 185:
                    return UC_LOCATION_ACCURACY;
                case 186:
                    return UC_LOCATION_ACCURACY_WIFI;
                case 187:
                    return UC_EARTHQUAKE_ALERTING;
                case 188:
                    return UC_FIT_APP_OR_API_FUNCTIONAL_DEBUGGING;
                case 189:
                    return UC_FIT_APP_OR_API_PRODUCT_IMPROVEMENT;
                case 190:
                    return UC_FIT_APP_OR_API_PRODUCT_DEVELOPMENT;
                case 191:
                    return UC_FIT_APP_OR_API_MEASURING_USER_ENGAGEMENT;
                case 192:
                    return UC_FCM_FUNCTIONAL_DEBUGGING;
                case 193:
                    return UC_1P_HW_DEVICE_MANAGEMENT;
                case 194:
                    return UC_1P_APP_PROVISION_OF_SERVICE;
                case 195:
                    return UC_BACKUP_USER_DATA;
                case 196:
                    return UC_GPP_UPLOAD_UNSAFE_APP;
                case 197:
                    return UC_RESERVED_FOR_TESTING_IN_PRODUCT_CONTROL;
                default:
                    switch (i) {
                        case 199:
                            return UC_SDK_FUNCTIONAL_DEBUGGING;
                        case 200:
                            return UC_SDK_PRODUCT_IMPROVEMENT;
                        case 201:
                            return UC_SDK_PRODUCT_DEVELOPMENT;
                        case 202:
                            return UC_SDK_MEASURING_USER_ENGAGEMENT;
                        case 203:
                            return UC_3P_APP_PROVISION_OF_SERVICE;
                        case 204:
                            return UC_WEAR_CLOUD_SYNC;
                        case 205:
                            return UC_CHIME_MEASURING_USER_ENGAGEMENT;
                        case 206:
                            return UC_CHIME_FUNCTIONAL_DEBUGGING;
                        case 207:
                            return UC_CHIME_PRODUCT_IMPROVEMENT;
                        case 208:
                            return UC_CONTACTS_ACCOUNT_TYPE_LOGGING;
                        case 209:
                            return UC_IN_PRODUCT_PERSONALIZATION;
                        case 210:
                            return UC_NEARBY_MESSAGES;
                        case 211:
                            return UC_FAST_PAIR;
                        case 212:
                            return UC_NEARBY_SHARING;
                        case 213:
                            return UC_USER_AUTHENTICATION;
                        case 214:
                            return UC_GOOGLE_CONTACTS_SYNC;
                        case 215:
                            return UC_DEVICE_CONTACT_INFO_COLLECTION;
                        case 216:
                            return UC_PEOPLE_DETAILS_SYNC;
                        case 217:
                            return UC_UNBRANDED_CROSS_PRODUCT_PERSONALIZATION_FOOTPRINTS;
                        case 218:
                            return UC_WIFI_NETWORK_SCORING;
                        case 219:
                            return UC_3P_APP_DEVICE_INTEGRITY;
                        case 220:
                            return UC_VERIFY_URL;
                        default:
                            switch (i) {
                                case 222:
                                    return UC_IP_LOCATION;
                                case 223:
                                    return UC_POPULATED_SERVER_SIDE;
                                case 224:
                                    return UC_FI_FUNCTIONAL_DEBUGGING;
                                case 225:
                                    return UC_FI_PRODUCT_IMPROVEMENT;
                                case 226:
                                    return UC_EARTHQUAKE_DETECTION;
                                case 227:
                                    return UC_FI_MEASURING_USER_ENGAGEMENT;
                                case 228:
                                    return UC_ADS_TARGETING;
                                case 229:
                                    return UC_ADS_MEASUREMENT;
                                case 230:
                                    return UC_ADS_EXTERNAL_INTEGRATION;
                                case 231:
                                    return UC_ABUSE_CONTENT_CLASSIFICATION_VERDICTS;
                                case 232:
                                    return UC_BRELLA_FUNCTIONAL_DEBUGGING;
                                case 233:
                                    return UC_FI_CELL_TOWER_HISTORY;
                                case 234:
                                    return UC_PAY_FUNCTIONAL_DEBUGGING;
                                case 235:
                                    return UC_PAY_PRODUCT_IMPROVEMENT;
                                case 236:
                                    return UC_PAY_MEASURING_USER_ENGAGEMENT;
                                case 237:
                                    return UC_FMD_LOCATE_ACCESSORY;
                                case 238:
                                    return UC_SEARCH_HISTORY;
                                case 239:
                                    return UC_BROWSING_HISTORY;
                                case 240:
                                    return UC_RESTORE_USER_DATA;
                                case 241:
                                    return UC_LOCATION_HISTORY_CONSENT_CHANGE;
                                case 242:
                                    return UC_UNICORN_SETUP;
                                case 243:
                                    return UC_UNICORN_MANAGEMENT;
                                case 244:
                                    return UC_UNICORN_ACTIVITY_SUPERVISION;
                                case 245:
                                    return UC_ADS_DELIVERY;
                                case 246:
                                    return UC_ADS_GENERAL_TARGETING;
                                case 247:
                                    return UC_ADS_PERSONALIZATION;
                                default:
                                    return null;
                            }
                    }
            }
        }
        return UC_DEFAULT;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.bU;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.bU);
    }
}
