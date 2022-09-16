package defpackage;

import com.google.android.exoplayer2.Format;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: prs  reason: default package */
/* loaded from: classes4.dex */
public final class prs implements bab {
    public Format a;
    private final int b;
    private final int c;
    private final Format d;
    private final azd e = new azd();
    private bab f;
    private long g;

    public prs(int i, int i2, Format format) {
        this.b = i;
        this.c = i2;
        this.d = format;
    }

    @Override // defpackage.bab
    public final /* synthetic */ int a(ast astVar, int i, boolean z) {
        return iy.d(this, astVar, i, z);
    }

    @Override // defpackage.bab
    public final /* synthetic */ void c(pwu pwuVar, int i) {
        iy.e(this, pwuVar, i);
    }

    @Override // defpackage.bab
    public final void d(pwu pwuVar, int i, int i2) {
        bab babVar = this.f;
        int i3 = pxi.a;
        babVar.c(pwuVar, i);
    }

    @Override // defpackage.bab
    public final void e(long j, int i, int i2, int i3, baa baaVar) {
        long j2 = this.g;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.f = this.e;
        }
        bab babVar = this.f;
        int i4 = pxi.a;
        babVar.e(j, i, i2, i3, baaVar);
    }

    @Override // defpackage.bab
    public final int f(ast astVar, int i, boolean z) {
        bab babVar = this.f;
        int i2 = pxi.a;
        return babVar.a(astVar, i, z);
    }

    public final void g(prv prvVar, long j) {
        if (prvVar == null) {
            this.f = this.e;
            return;
        }
        this.g = j;
        bab a = prvVar.a(this.b, this.c);
        this.f = a;
        Format format = this.a;
        if (format == null) {
            return;
        }
        a.rx(format);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0128  */
    @Override // defpackage.bab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rx(com.google.android.exoplayer2.Format r22) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prs.rx(com.google.android.exoplayer2.Format):void");
    }
}
