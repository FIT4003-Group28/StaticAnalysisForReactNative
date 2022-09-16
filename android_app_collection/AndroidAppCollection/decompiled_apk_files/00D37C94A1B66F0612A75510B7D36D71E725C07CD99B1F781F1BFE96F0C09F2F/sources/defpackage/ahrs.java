package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahrs  reason: default package */
/* loaded from: classes.dex */
public final class ahrs {
    public ahot a;
    public ahrl b;
    public ahrv c;
    public ahrw d;
    public ahrw e;
    public ahrx f;
    public ahru g;
    public ahru h;
    public ahru i;
    public ahru j;
    private final ahrz k;

    public ahrs(ahrz ahrzVar, ahot ahotVar) {
        this.k = ahrzVar;
        this.a = ahotVar;
        d();
    }

    public final azqb a() {
        return new ahrq(this, 1);
    }

    public final azqb b() {
        return new ahrq(this);
    }

    public final azqb c() {
        return new ahrq(this, 2);
    }

    public final void d() {
        this.b = new ahrl(this.k);
        ahrz ahrzVar = this.k;
        this.f = new ahrx(ahrzVar.a(R.raw.gl_fixed_texture_program_vert), ahrzVar.a(R.raw.gl_fixed_texture_program_frag));
        this.c = new ahrv(this.k);
        this.e = new ahrw(this.k, true, this.a.a());
        this.d = new ahrw(this.k, false, this.a.a());
        this.g = new ahru(this.k, false, this.a.a());
        this.h = new ahru(this.k, true, this.a.a());
        this.i = new ahru(this.k, false, this.a.a(), null);
        this.j = new ahru(this.k, true, this.a.a(), null);
    }

    public final void e() {
        this.b.i();
        this.f.i();
        this.c.i();
        this.d.i();
        this.e.i();
        this.g.i();
        this.h.i();
        this.i.i();
        this.j.i();
    }

    public final azqb f(int i) {
        return new ahrr(this, i, 1);
    }

    public final azqb g(int i) {
        return new ahrr(this, i, 2);
    }
}
