package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: blxt  reason: default package */
/* loaded from: classes3.dex */
public class blxt implements izu {
    public final ff a;
    public final anhg b;
    public final bvrb c;
    private final bvsx d;
    private final blzf e;
    @dzsi
    private cqfc h;
    private blzm g = blzm.NONE;
    private boolean f = true;

    public blxt(ff ffVar, anhg anhgVar, bvrb bvrbVar, blzf blzfVar) {
        this.a = ffVar;
        this.d = new bvsx(ffVar.getResources());
        this.e = blzfVar;
        this.b = anhgVar;
        this.c = bvrbVar;
    }

    @Override // defpackage.izu
    @dzsi
    public cqfc a() {
        return this.h;
    }

    @Override // defpackage.izu
    public cqkl b() {
        return d();
    }

    @Override // defpackage.izu
    public cqkl c() {
        this.e.b.P();
        return cqkl.a;
    }

    @Override // defpackage.izu
    public cqkl d() {
        this.e.o(dvrh.EXIT);
        return cqkl.a;
    }

    @Override // defpackage.izu
    public Boolean e() {
        return true;
    }

    @Override // defpackage.izu
    public Boolean f() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.izu
    @dzsi
    public cjtd g() {
        return null;
    }

    @Override // defpackage.izu
    @dzsi
    public cjtd h() {
        return null;
    }

    @Override // defpackage.izu
    @dzsi
    public cjtd i() {
        return cjtd.a(dtxz.l);
    }

    @Override // defpackage.izu
    @dzsi
    public cjtd j() {
        if (f().booleanValue()) {
            return cjtd.a(dtxz.m);
        }
        return cjtd.a(dtxz.n);
    }

    @Override // defpackage.izu
    public Boolean k() {
        return false;
    }

    @Override // defpackage.izu
    public Integer l() {
        return 0;
    }

    @Override // defpackage.izu
    public CharSequence m() {
        return this.a.getString(R.string.RIDDLER_HAVENT_BEEN_HERE_OOPS_HEADER);
    }

    @Override // defpackage.izu
    public CharSequence n() {
        bvsu c = this.d.c(R.string.RIDDLER_HAVENT_BEEN_HERE_OOPS_MESSAGE_TIMELINE_LINK);
        bvsu c2 = this.d.c(R.string.RIDDLER_TIMELINE_AS_LINK);
        c2.k(new blxq(this, this.a.getResources().getColor(R.color.gmm_blue)));
        c.a(c2);
        return c.c();
    }

    @Override // defpackage.izu
    public Integer o() {
        return Integer.valueOf((int) R.string.RIDDLER_FULL_SCREEN_MORE_QUESTIONS);
    }

    @Override // defpackage.izu
    public Integer p() {
        return Integer.valueOf((int) R.string.DONE);
    }

    @Override // defpackage.izu
    @dzsi
    public iyy q() {
        return null;
    }

    @Override // defpackage.izu
    public Boolean r() {
        return false;
    }

    @Override // defpackage.izu
    @dzsi
    public cjtd s() {
        return null;
    }

    @Override // defpackage.izu
    public Boolean t() {
        return Boolean.valueOf(czue.a(this.a));
    }

    @Override // defpackage.izu
    public cqkl u() {
        if (t().booleanValue()) {
            y();
        }
        return cqkl.a;
    }

    public void v(boolean z) {
        this.f = z;
    }

    public void w(blzm blzmVar) {
        this.g = blzmVar;
        this.h = blzn.a(this.a, blzmVar);
    }

    public boolean x() {
        return this.g != blzm.NONE;
    }

    public final void y() {
        this.a.g().l(new blxs(this));
        this.e.o(dvrh.TIMELINE_LINK);
    }
}
