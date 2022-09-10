package defpackage;
/* compiled from: PG */
/* renamed from: alyp  reason: default package */
/* loaded from: classes.dex */
public final class alyp {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"data:", "http:", "https:"};

    public static String a(String str, boolean z, int i, @dzsi dmue dmueVar) {
        if (!z || dmueVar == null) {
            return str;
        }
        String[] strArr = b;
        for (int i2 = 0; i2 < 3; i2++) {
            if (str.startsWith(strArr[i2])) {
                return str;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (dmueVar.u()) {
            sb.append(dmueVar.t());
        }
        if (i < dmueVar.r()) {
            sb.append(dmueVar.s(i));
        }
        sb.append(str);
        if (dmueVar.w()) {
            sb.append(dmueVar.v());
        }
        return sb.toString();
    }
}
