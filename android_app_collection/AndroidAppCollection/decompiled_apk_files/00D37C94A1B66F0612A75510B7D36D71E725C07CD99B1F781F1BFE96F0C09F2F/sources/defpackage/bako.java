package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bako  reason: default package */
/* loaded from: classes2.dex */
public final class bako implements bale, bala {
    protected final int a;
    protected final int b;
    private final bahp c;

    /* JADX INFO: Access modifiers changed from: protected */
    public bako(bahp bahpVar, int i, int i2) {
        this.c = bahpVar;
        i2 = i2 > 18 ? 18 : i2;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.bala
    public final int a() {
        return this.b;
    }

    @Override // defpackage.bale
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bala
    public final int c(bald baldVar, String str, int i) {
        bahn a = this.c.a(baldVar.a);
        int min = Math.min(this.b, str.length() - i);
        long e = a.p().e() * 10;
        long j = 0;
        int i2 = 0;
        while (i2 < min) {
            char charAt = str.charAt(i + i2);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            i2++;
            e /= 10;
            j += (charAt - '0') * e;
        }
        long j2 = j / 10;
        if (i2 != 0 && j2 <= 2147483647L) {
            baldVar.c(new balb(new bakb(bahp.y, bajz.a, a.p()), (int) j2));
            return i + i2;
        }
        return i ^ (-1);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4 A[Catch: IOException -> 0x00eb, LOOP:1: B:10:0x0026->B:53:0x00e4, LOOP_END, TryCatch #1 {IOException -> 0x00eb, blocks: (B:2:0x0000, B:3:0x0008, B:8:0x0018, B:9:0x001c, B:10:0x0026, B:30:0x0081, B:32:0x0088, B:34:0x00a2, B:36:0x00ac, B:38:0x00b2, B:42:0x00c0, B:45:0x00c9, B:46:0x00cd, B:49:0x00d5, B:51:0x00e0, B:35:0x00a8, B:53:0x00e4, B:54:0x00e8), top: B:59:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0088 A[SYNTHETIC] */
    @Override // defpackage.bale
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.StringBuffer r7, long r8, defpackage.bahl r10, int r11, defpackage.baht r12, java.util.Locale r13) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bako.d(java.lang.StringBuffer, long, bahl, int, baht, java.util.Locale):void");
    }
}
