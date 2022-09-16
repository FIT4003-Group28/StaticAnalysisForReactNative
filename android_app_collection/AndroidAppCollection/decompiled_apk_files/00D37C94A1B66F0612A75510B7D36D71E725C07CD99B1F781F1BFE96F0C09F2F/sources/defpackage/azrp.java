package defpackage;
/* compiled from: PG */
/* renamed from: azrp  reason: default package */
/* loaded from: classes2.dex */
public final class azrp {
    public static final Class a(azte azteVar) {
        String name;
        azteVar.getClass();
        Class a = ((azso) azteVar).a();
        if (a.isPrimitive() && (name = a.getName()) != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    return name.equals("double") ? Double.class : a;
                case 104431:
                    return name.equals("int") ? Integer.class : a;
                case 3039496:
                    return name.equals("byte") ? Byte.class : a;
                case 3052374:
                    return name.equals("char") ? Character.class : a;
                case 3327612:
                    return name.equals("long") ? Long.class : a;
                case 3625364:
                    return name.equals("void") ? Void.class : a;
                case 64711720:
                    return name.equals("boolean") ? Boolean.class : a;
                case 97526364:
                    return name.equals("float") ? Float.class : a;
                case 109413500:
                    return name.equals("short") ? Short.class : a;
                default:
                    return a;
            }
        }
        return a;
    }

    public static final int b(String str, int i, int i2, int i3) {
        return (int) c(str, i, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long c(java.lang.String r22, long r23, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azrp.c(java.lang.String, long, long, long):long");
    }

    public static final boolean d(String str) {
        String a = azyh.a(str);
        if (a == null) {
            return true;
        }
        return Boolean.parseBoolean(a);
    }

    public static /* synthetic */ int e(String str, int i, int i2, int i3, int i4) {
        int i5 = i2 | (((i4 & 4) != 0 ? 0 : 1) ^ 1);
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return b(str, i, i5, i3);
    }
}
