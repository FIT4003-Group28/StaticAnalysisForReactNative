package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: clji  reason: default package */
/* loaded from: classes5.dex */
final class clji {
    private static final ddae c = ddae.e;
    private static final ddae d = ddae.d;
    private static final dbtm e = dbtm.a(';');
    public final byte[] a;
    public final String b;

    private clji(byte[] bArr, String str) {
        this.a = bArr;
        this.b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static clji a(String str) {
        if (str.startsWith("data:")) {
            int indexOf = str.indexOf(44);
            if (indexOf != -1) {
                String substring = str.substring(indexOf + 1);
                List<String> i = e.i(str.substring(5, indexOf));
                if (i.size() < 2) {
                    throw new cljh("Insufficient number of options for data URL");
                }
                String str2 = i.get(0);
                String str3 = i.get(1);
                if (str3.equals("base64")) {
                    try {
                        try {
                            return new clji(c.j(substring), str2);
                        } catch (IllegalArgumentException unused) {
                            return new clji(d.j(substring), str2);
                        }
                    } catch (IllegalArgumentException e2) {
                        throw new cljh(e2);
                    }
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 44);
                sb.append("Invalid encoding: ");
                sb.append(str3);
                sb.append(", only base64 is supported");
                throw new cljh(sb.toString());
            }
            throw new cljh("Comma not found in data URL");
        }
        throw new cljh("URL doesn't have the data scheme");
    }
}
