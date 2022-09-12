package defpackage;
/* compiled from: PG */
/* renamed from: byu  reason: default package */
/* loaded from: classes.dex */
public final class byu {
    private final cjk<btw, String> a = new cjk<>(1000);
    private final my<byt> b = cjx.a(10, new bys());

    public final String a(btw btwVar) {
        String f;
        synchronized (this.a) {
            f = this.a.f(btwVar);
        }
        if (f == null) {
            byt a = this.b.a();
            cjn.b(a);
            try {
                btwVar.a(a.a);
                byte[] digest = a.a.digest();
                synchronized (cjp.b) {
                    char[] cArr = cjp.b;
                    for (int i = 0; i < digest.length; i++) {
                        int i2 = digest[i] & 255;
                        int i3 = i + i;
                        cArr[i3] = cjp.a[i2 >>> 4];
                        cArr[i3 + 1] = cjp.a[i2 & 15];
                    }
                    f = new String(cArr);
                }
            } finally {
                this.b.b(a);
            }
        }
        synchronized (this.a) {
            this.a.g(btwVar, f);
        }
        return f;
    }
}
