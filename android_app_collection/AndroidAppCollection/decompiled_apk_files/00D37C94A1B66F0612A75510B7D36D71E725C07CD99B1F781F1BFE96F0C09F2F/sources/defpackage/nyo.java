package defpackage;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nyo  reason: default package */
/* loaded from: classes3.dex */
public final class nyo extends nyr {
    public final Rect b;
    public boolean c;
    private final float k;
    private final float l;
    private final int m;
    private int n;

    public nyo(Context context, nxe nxeVar, nxe nxeVar2, int i, aadd aaddVar) {
        super(nxeVar, nxeVar2);
        float f;
        float f2;
        float f3;
        arhd a = aaddVar.a();
        asxp asxpVar = a.e;
        if (((asxpVar == null ? asxp.a : asxpVar).g & 1024) != 0) {
            asxp asxpVar2 = a.e;
            f = (asxpVar2 == null ? asxp.a : asxpVar2).aI;
        } else {
            f = 1.25f;
        }
        arhd a2 = aaddVar.a();
        asxp asxpVar3 = a2.e;
        if (((asxpVar3 == null ? asxp.a : asxpVar3).g & 2048) != 0) {
            asxp asxpVar4 = a2.e;
            f2 = (asxpVar4 == null ? asxp.a : asxpVar4).aJ;
        } else {
            f2 = 1.0f;
        }
        arhd a3 = aaddVar.a();
        asxp asxpVar5 = a3.e;
        if (((asxpVar5 == null ? asxp.a : asxpVar5).g & 4096) != 0) {
            asxp asxpVar6 = a3.e;
            f3 = (asxpVar6 == null ? asxp.a : asxpVar6).aK;
        } else {
            f3 = 1.0f;
        }
        this.k = f3;
        this.n = i;
        this.l = Math.min(f, (f2 * 0.15f) + 1.0f);
        this.b = new Rect();
        this.m = ake.d(context, R.color.yt_black2);
        b();
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final ampq I() {
        return ampq.j(Integer.valueOf(this.m));
    }

    @Override // defpackage.nyr
    public final void b() {
        int i;
        nxe nxeVar = this.d;
        nxeVar.getClass();
        this.h.set(nxeVar.r());
        this.i.set(this.d.u());
        this.g.set(this.d.v());
        this.f.set(this.d.t());
        this.j.set(this.d.s());
        etk.k(this.d.v(), this.l, this.g);
        float f = this.k;
        if (f != 1.0f) {
            this.g.offset(0, this.b.top - ((int) ((((this.l - 1.0f) * this.n) / 2.0f) * f)));
        }
        if (!this.c) {
            i = this.b.top;
        } else {
            int i2 = this.b.top;
            i = i2 + i2;
        }
        this.f.set(this.g);
        this.h.offset(0, i);
        this.i.offset(0, i);
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final float l() {
        return 1.0f;
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final float m() {
        return 0.0f;
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final float n() {
        return 0.0f;
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final float p() {
        return 1.0f;
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final void z(int i, int i2) {
        this.n = i2;
        b();
    }
}
