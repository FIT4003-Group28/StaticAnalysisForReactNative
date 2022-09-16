package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: awbo  reason: default package */
/* loaded from: classes3.dex */
public class awbo implements awbm {
    private final ff a;
    private final avij b;
    private final avyx c;
    private final bvjj d;
    private final akfa e;
    private boolean f = true;
    private final away g;
    private final dxio<awnv> h;
    private final avzh i;
    private final avzp j;

    public awbo(ff ffVar, avij avijVar, bvjj bvjjVar, akfa akfaVar, avyx avyxVar, cqhn cqhnVar, away awayVar, dxio<awnv> dxioVar, avzh avzhVar, avzp avzpVar) {
        this.a = ffVar;
        this.b = avijVar;
        this.d = bvjjVar;
        this.e = akfaVar;
        this.c = avyxVar;
        this.g = awayVar;
        this.h = dxioVar;
        this.i = avzhVar;
        this.j = avzpVar;
    }

    @Override // defpackage.awbm
    public Boolean a() {
        return Boolean.valueOf(this.b.q());
    }

    @Override // defpackage.awbm
    public cqkl b() {
        if (!this.f) {
            return cqkl.a;
        }
        this.f = false;
        dltm a = this.i.a();
        this.i.b();
        this.h.a().f();
        this.d.T(bvjk.ey, this.e.j(), true);
        if (a != null) {
            final avij avijVar = this.b;
            dspd dspdVar = a.b;
            avijVar.getClass();
            avijVar.n(dspdVar, new avif(avijVar) { // from class: awbn
                private final avij a;

                {
                    this.a = avijVar;
                }

                @Override // defpackage.avif
                public final void a() {
                    this.a.h();
                }
            });
            this.g.f();
        }
        return cqkl.a;
    }

    @Override // defpackage.awbm
    public cqkl c() {
        if (!this.f) {
            return cqkl.a;
        }
        this.f = false;
        cqkx.p(this);
        this.i.b();
        this.g.g();
        this.h.a().f();
        return cqkl.a;
    }

    @Override // defpackage.awbm
    public cqkl d() {
        if (!this.f) {
            return cqkl.a;
        }
        this.f = false;
        cqkx.p(this);
        this.d.S(bvjk.ew, true);
        this.g.g();
        this.h.a().f();
        return cqkl.a;
    }

    @Override // defpackage.awbm
    public CharSequence e() {
        return this.a.getString(R.string.OFFLINE_ONBOARDING_TITLE_MAPS_IS_FASTER_WORKS_OFFLINE);
    }

    @Override // defpackage.awbm
    public CharSequence f() {
        long j;
        if (this.i.a() != null) {
            dltm a = this.i.a();
            dbsk.s(a);
            avzp avzpVar = this.j;
            long j2 = a.i;
            dlug dlugVar = a.c;
            if (dlugVar == null) {
                dlugVar = dlug.c;
            }
            j = avzpVar.e(j2, dlugVar);
        } else {
            j = this.c.c;
        }
        return this.a.getString(R.string.OFFLINE_ONBOARDING_EXPLANATION_FULL_SANS_AVAILABLE_SPACE, new Object[]{Long.valueOf(j)});
    }
}
