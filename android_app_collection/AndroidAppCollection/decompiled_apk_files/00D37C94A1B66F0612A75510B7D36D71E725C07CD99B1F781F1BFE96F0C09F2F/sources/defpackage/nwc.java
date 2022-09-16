package defpackage;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: nwc  reason: default package */
/* loaded from: classes3.dex */
public final class nwc extends nwq implements aiza, fqi, ynl {
    private final aizb a;
    private final fqj b;
    private final yni c;
    private final airw d;
    private final Context j;
    private final int k;
    private final aacz n;
    private final aypf e = new aypf();
    private final Rect f = new Rect();
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    private float l = 2.4f;
    private float m = 1.777f;

    public nwc(Context context, aizb aizbVar, fqj fqjVar, yni yniVar, airw airwVar, aacz aaczVar) {
        this.j = context;
        this.a = aizbVar;
        this.b = fqjVar;
        this.c = yniVar;
        this.d = airwVar;
        this.n = aaczVar;
        this.k = context.getResources().getDimensionPixelSize(R.dimen.floaty_bar_max_width);
    }

    private final int c() {
        return this.j.getResources().getDimensionPixelSize(R.dimen.floaty_bar_height);
    }

    private final void e(boolean z) {
        this.l = true != z ? 2.4f : 1.777f;
        h();
    }

    private final void g(float f) {
        this.m = f;
        h();
    }

    private final void h() {
        int c = c();
        int round = Math.round(this.l * c());
        int width = this.f.width();
        int height = this.f.height();
        int i = this.b.a;
        int min = (width - Math.min(width, this.k)) / 2;
        int i2 = (height + i) - c;
        int i3 = c + i2;
        this.h.set(min, i2, round + min, i3);
        etk.l(this.m, this.h, this.g);
        this.i.set(min, i2, width - min, i3);
        J();
    }

    @Override // defpackage.fqi
    public final void a() {
        h();
    }

    public final void b(ahhw ahhwVar) {
        aika c = ahhwVar.c();
        if (c.h()) {
            e(true);
        } else if (!c.c(aika.READY)) {
        } else {
            e(false);
        }
    }

    @Override // defpackage.aiza
    public final void d(int i, int i2) {
        float f = 1.777f;
        if (i2 > 0 && i > 0) {
            f = i / i2;
        }
        g(f);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                b((ahhw) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhw.class};
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
        return this.i;
    }

    @Override // defpackage.nxe
    public final Rect t() {
        return this.h;
    }

    @Override // defpackage.nxe
    public final Rect u() {
        return u;
    }

    @Override // defpackage.nxe
    public final Rect v() {
        return this.g;
    }

    @Override // defpackage.nxe
    public final void x() {
        this.a.a(this);
        this.b.a(this);
        float f = this.a.a;
        if (f == 0.0d) {
            f = 1.777f;
        }
        g(f);
        if (eog.aq(this.n)) {
            this.e.c();
            this.e.g(this.d.G().b.Z(new ayqb() { // from class: nwb
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    nwc.this.b((ahhw) obj);
                }
            }));
            return;
        }
        this.c.g(this);
    }

    @Override // defpackage.nxe
    public final void y() {
        this.a.c(this);
        this.b.b(this);
        if (eog.aq(this.n)) {
            this.e.c();
        } else {
            this.c.m(this);
        }
    }

    @Override // defpackage.nxe
    public final void z(int i, int i2) {
        this.f.set(0, 0, i, i2);
        h();
    }
}
