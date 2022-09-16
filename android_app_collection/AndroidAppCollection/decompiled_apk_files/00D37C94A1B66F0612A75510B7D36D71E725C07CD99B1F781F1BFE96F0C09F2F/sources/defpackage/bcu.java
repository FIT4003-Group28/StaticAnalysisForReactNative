package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: bcu  reason: default package */
/* loaded from: classes2.dex */
public final class bcu implements aze {
    private final Format a;
    private bab c;
    private int e;
    private long f;
    private int g;
    private int h;
    private final pwu b = new pwu(9);
    private int d = 0;

    public bcu(Format format) {
        this.a = format;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
        r10.d = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
        return -1;
     */
    @Override // defpackage.aze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(defpackage.azf r11, defpackage.azv r12) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcu.d(azf, azv):int");
    }

    @Override // defpackage.aze
    public final void e(azh azhVar) {
        azhVar.ry(new azx(-9223372036854775807L));
        bab pT = azhVar.pT(0, 3);
        this.c = pT;
        pT.rx(this.a);
        azhVar.b();
    }

    @Override // defpackage.aze
    public final void f() {
    }

    @Override // defpackage.aze
    public final void g(long j, long j2) {
        this.d = 0;
    }

    @Override // defpackage.aze
    public final boolean h(azf azfVar) {
        this.b.C(8);
        azfVar.j(this.b.a, 0, 8);
        return this.b.d() == 1380139777;
    }
}
