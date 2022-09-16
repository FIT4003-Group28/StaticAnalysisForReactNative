package defpackage;
/* compiled from: PG */
/* renamed from: anha  reason: default package */
/* loaded from: classes.dex */
public class anha {
    public static int a(int i) {
        return i - 2;
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 1) {
                return 3;
            }
            if (i == 2) {
                return 4;
            }
            if (i == 200) {
                return 202;
            }
            switch (i) {
                case 100:
                    return 102;
                case 101:
                    return 103;
                case 102:
                    return 104;
                case 103:
                    return 105;
                case 104:
                    return 106;
                case 105:
                    return 107;
                case 106:
                    return 108;
                case 107:
                    return 109;
                case 108:
                    return 110;
                case 109:
                    return 111;
                case 110:
                    return 112;
                case 111:
                    return 113;
                default:
                    switch (i) {
                        case 300:
                            return 302;
                        case 301:
                            return 303;
                        case 302:
                            return 304;
                        case 303:
                            return 305;
                        case 304:
                            return 306;
                        case 305:
                            return 307;
                        case 306:
                            return 308;
                        case 307:
                            return 309;
                        case 308:
                            return 310;
                        case 309:
                            return 311;
                        case 310:
                            return 312;
                        case 311:
                            return 313;
                        case 312:
                            return 314;
                        case 313:
                            return 315;
                        case 314:
                            return 316;
                        case 315:
                            return 317;
                        case 316:
                            return 318;
                        case 317:
                            return 319;
                        case 318:
                            return 320;
                        case 319:
                            return 321;
                        case 320:
                            return 322;
                        case 321:
                            return 323;
                        case 322:
                            return 324;
                        case 323:
                            return 325;
                        case 324:
                            return 326;
                        case 325:
                            return 327;
                        case 326:
                            return 328;
                        case 327:
                            return 329;
                        case 328:
                            return 330;
                        case 329:
                            return 331;
                        default:
                            switch (i) {
                                case 400:
                                    return 402;
                                case 401:
                                    return 403;
                                case 402:
                                    return 404;
                                case 403:
                                    return 405;
                                case 404:
                                    return 406;
                                default:
                                    switch (i) {
                                        case 1000:
                                            return 1002;
                                        case 1001:
                                            return 1003;
                                        case 1002:
                                            return 1004;
                                        case 1003:
                                            return 1005;
                                        case 1004:
                                            return 1006;
                                        case 1005:
                                            return 1007;
                                        case 1006:
                                            return 1008;
                                        case 1007:
                                            return 1009;
                                        case 1008:
                                            return 1010;
                                        case 1009:
                                            return 1011;
                                        case 1010:
                                            return 1012;
                                        case 1011:
                                            return 1013;
                                        default:
                                            switch (i) {
                                                case 2000:
                                                    return 2002;
                                                case 2001:
                                                    return 2003;
                                                case 2002:
                                                    return 2004;
                                                case 2003:
                                                    return 2005;
                                                case 2004:
                                                    return 2006;
                                                case 2005:
                                                    return 2007;
                                                case 2006:
                                                    return 2008;
                                                case 2007:
                                                    return 2009;
                                                case 2008:
                                                    return 2010;
                                                case 2009:
                                                    return 2011;
                                                case 2010:
                                                    return 2012;
                                                case 2011:
                                                    return 2013;
                                                case 2012:
                                                    return 2014;
                                                case 2013:
                                                    return 2015;
                                                default:
                                                    return 0;
                                            }
                                    }
                            }
                    }
            }
        }
        return 2;
    }

    public static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str.concat(" must not be null"));
    }

    public static void d(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static boolean e(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }
}
