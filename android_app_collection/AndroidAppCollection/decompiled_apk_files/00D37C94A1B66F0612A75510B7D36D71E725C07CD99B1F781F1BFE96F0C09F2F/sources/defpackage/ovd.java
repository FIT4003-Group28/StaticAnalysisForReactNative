package defpackage;

import com.google.android.exoplayer.MediaFormat;
/* compiled from: PG */
/* renamed from: ovd  reason: default package */
/* loaded from: classes4.dex */
public class ovd implements oxr, oyf {
    private final oxq a;
    private boolean b;
    private ovc c;
    private boolean d;
    private int e;

    public ovd(oxq oxqVar) {
        this.a = oxqVar;
    }

    @Override // defpackage.oyf
    public final void d(MediaFormat mediaFormat) {
        this.c.d(mediaFormat);
    }

    public final void e(ovc ovcVar) {
        this.c = ovcVar;
        if (!this.b) {
            this.a.a(this);
            this.b = true;
            return;
        }
        this.a.d();
    }

    @Override // defpackage.oyf
    public final void f(pct pctVar, int i) {
        this.c.f(pctVar, i);
    }

    public void g(long j, int i, int i2, int i3, byte[] bArr) {
        this.c.g(j, i, i2, i3, bArr);
    }

    public final int i(oxn oxnVar) {
        int e = this.a.e(oxnVar, null);
        boolean z = true;
        if (e == 1) {
            z = false;
        }
        pce.d(z);
        return e;
    }

    @Override // defpackage.oyf
    public final int j(oxn oxnVar, int i, boolean z) {
        return this.c.j(oxnVar, i, z);
    }

    @Override // defpackage.oxr
    public final oyf pP(int i) {
        pce.d(!this.d || i == this.e);
        this.d = true;
        this.e = i;
        return this;
    }

    @Override // defpackage.oxr
    public final void pQ(owx owxVar) {
        this.c.b(owxVar);
    }

    @Override // defpackage.oxr
    public final void pR() {
        pce.d(this.d);
    }

    @Override // defpackage.oxr
    public final void pS(oye oyeVar) {
        this.c.c(oyeVar);
    }
}
