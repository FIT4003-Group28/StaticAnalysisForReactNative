package defpackage;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: nwd  reason: default package */
/* loaded from: classes3.dex */
public final class nwd extends nwq implements fqi {
    private final Context a;
    private final fqj b;
    private final Rect c = new Rect();
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private int f;
    private int g;

    public nwd(Context context, fqj fqjVar) {
        this.a = context;
        this.b = fqjVar;
    }

    @Override // defpackage.fqi
    public final void a() {
        z(this.f, this.g);
    }

    @Override // defpackage.nxe
    public final float l() {
        return 0.0f;
    }

    @Override // defpackage.nxe
    public final float m() {
        return 1.0f;
    }

    @Override // defpackage.nxe
    public final float n() {
        return 1.0f;
    }

    @Override // defpackage.nxe
    public final float o() {
        return 1.0f;
    }

    @Override // defpackage.nxe
    public final float p() {
        return 0.0f;
    }

    @Override // defpackage.nxe
    public final float q() {
        return 0.0f;
    }

    @Override // defpackage.nxe
    public final Rect r() {
        return u;
    }

    @Override // defpackage.nxe
    public final Rect s() {
        return this.c;
    }

    @Override // defpackage.nxe
    public final Rect t() {
        return this.d;
    }

    @Override // defpackage.nxe
    public final Rect u() {
        return u;
    }

    @Override // defpackage.nxe
    public final Rect v() {
        return this.e;
    }

    @Override // defpackage.nxe
    public final void x() {
        this.b.a(this);
    }

    @Override // defpackage.nxe
    public final void y() {
        this.b.b(this);
    }

    @Override // defpackage.nxe
    public final void z(int i, int i2) {
        this.f = i;
        this.g = i2;
        int max = Math.max((int) (i * (true != zew.w(this.a) ? 0.4f : 0.35f)), zew.i(this.a.getResources().getDisplayMetrics(), 240));
        int i3 = (int) (max / 1.777f);
        this.c.set(0, 0, max, this.a.getResources().getDimensionPixelSize(R.dimen.floaty_box_controls_height) + i3);
        this.d.set(0, 0, this.c.width(), i3);
        etk.l(1.777f, this.d, this.e);
        int width = i - this.c.width();
        int height = (i2 + this.b.a) - this.c.height();
        this.c.offset(width, height);
        this.d.offset(width, height);
        this.e.offset(width, height);
        J();
    }
}
