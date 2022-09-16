package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: nye  reason: default package */
/* loaded from: classes3.dex */
final class nye extends nyr {
    private final float b;
    private final int c;
    private int k;

    public /* synthetic */ nye(Context context, nxe nxeVar, nxe nxeVar2, float f, int i) {
        super(nxeVar, nxeVar2);
        this.c = ake.d(context, R.color.yt_black2);
        this.b = f;
        this.k = i;
        b();
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final ampq I() {
        return ampq.j(Integer.valueOf(this.c));
    }

    @Override // defpackage.nyr
    public final void b() {
        nxe nxeVar = this.d;
        nxeVar.getClass();
        this.e.getClass();
        etk.k(nxeVar.v(), 0.95f, this.g);
        this.g.offset(0, (int) (this.k * this.b));
        this.f.set(this.g);
        this.h.set(this.e.r());
        this.h.offsetTo(this.f.left, this.f.bottom);
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final float l() {
        return 0.0f;
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
    public final float o() {
        return 0.0f;
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final float p() {
        return 1.0f;
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final float q() {
        return 0.0f;
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final void z(int i, int i2) {
        this.k = i2;
        b();
    }
}
