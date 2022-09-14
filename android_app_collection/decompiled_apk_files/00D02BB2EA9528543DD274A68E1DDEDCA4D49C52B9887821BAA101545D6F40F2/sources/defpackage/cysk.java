package defpackage;
/* compiled from: PG */
/* renamed from: cysk  reason: default package */
/* loaded from: classes5.dex */
public final class cysk {
    public static String a(dcdc<String> dcdcVar) {
        StringBuilder sb = new StringBuilder();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            String str = dcdcVar.get(i);
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(dbqa.a(str));
            sb.append("*");
        }
        return sb.toString();
    }
}
