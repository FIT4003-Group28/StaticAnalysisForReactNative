package defpackage;
/* compiled from: PG */
/* renamed from: dstt  reason: default package */
/* loaded from: classes.dex */
final class dstt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(dspd dspdVar) {
        StringBuilder sb = new StringBuilder(dsts.a(dspdVar));
        for (int i = 0; i < dsts.a(dspdVar); i++) {
            byte a = dspdVar.a(i);
            if (a != 34) {
                if (a != 39) {
                    if (a == 92) {
                        sb.append("\\\\");
                    } else {
                        switch (a) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case 12:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (a < 32 || a > 126) {
                                    sb.append('\\');
                                    sb.append((char) (((a >>> 6) & 3) + 48));
                                    sb.append((char) (((a >>> 3) & 7) + 48));
                                    sb.append((char) ((a & 7) + 48));
                                    break;
                                } else {
                                    sb.append((char) a);
                                    continue;
                                }
                                break;
                        }
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }
}
