package defpackage;
/* compiled from: PG */
/* renamed from: cmi  reason: default package */
/* loaded from: classes2.dex */
public final class cmi {
    private final cuz a = new cuz(1000);
    private final jk b = cvk.b(10, new cmg());

    public final String a(chy chyVar) {
        String str;
        synchronized (this.a) {
            str = (String) this.a.f(chyVar);
        }
        if (str == null) {
            cmh cmhVar = (cmh) this.b.a();
            hy.N(cmhVar);
            try {
                chyVar.a(cmhVar.a);
                byte[] digest = cmhVar.a.digest();
                synchronized (cvd.b) {
                    char[] cArr = cvd.b;
                    for (int i = 0; i < digest.length; i++) {
                        int i2 = digest[i] & 255;
                        int i3 = i + i;
                        cArr[i3] = cvd.a[i2 >>> 4];
                        cArr[i3 + 1] = cvd.a[i2 & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                this.b.b(cmhVar);
            }
        }
        synchronized (this.a) {
            this.a.g(chyVar, str);
        }
        return str;
    }
}
