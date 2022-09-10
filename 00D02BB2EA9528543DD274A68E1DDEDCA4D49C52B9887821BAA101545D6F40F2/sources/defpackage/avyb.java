package defpackage;

import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avyb  reason: default package */
/* loaded from: classes3.dex */
public class avyb implements avvp {
    public final cjqy b;
    public final avik c;
    public final avzl d;
    private final ges f;
    private final cjqq g;
    private final away h;
    private final jib i;
    private static final cjtd e = cjtd.a(dtxx.bb);
    public static final cjtd a = cjtd.a(dtxx.ax);

    public avyb(fd fdVar, Executor executor, cjqy cjqyVar, cjqq cjqqVar, avik avikVar, away awayVar, avzm avzmVar, dlug dlugVar) {
        this.f = (ges) fdVar;
        this.b = cjqyVar;
        this.g = cjqqVar;
        this.c = avikVar;
        this.d = avzmVar.a(dlugVar);
        this.h = awayVar;
        jhz jhzVar = new jhz();
        jhzVar.a = fdVar.Rp(R.string.OFFLINE_DYNAMIC_PADDING_DISPLAY_REGION_NAME);
        jhzVar.f(new jmn(fdVar.getClass()));
        jhm jhmVar = new jhm();
        jhmVar.a = fdVar.Rp(R.string.OFFLINE_MENU_RENAME_AREA);
        jhmVar.b = fdVar.Rp(R.string.OFFLINE_MENU_RENAME_AREA);
        jhmVar.h = 1;
        jhmVar.n = false;
        jhmVar.f = e;
        jhmVar.c = cqrt.f(2131231613);
        jhzVar.c(jhmVar.c());
        this.i = jhzVar.b();
    }

    @Override // defpackage.avvp
    public jbk a() {
        return new iyl(this.i);
    }

    @Override // defpackage.avvp
    @dzsi
    public akqs b() {
        return this.d.c();
    }

    @Override // defpackage.avvp
    public dcdc<akqs> c() {
        return this.d.b();
    }

    @Override // defpackage.avvp
    public cqtd d() {
        return cqrt.f(2131232822);
    }

    @Override // defpackage.avvp
    public CharSequence e() {
        boolean z = this.f.aD;
        return "";
    }

    @Override // defpackage.avvp
    public CharSequence f() {
        return this.f.Rp(R.string.OFFLINE_MENU_UPDATE_AREA);
    }

    @Override // defpackage.avvp
    public CharSequence g() {
        return this.f.Rp(R.string.OFFLINE_MENU_DELETE_AREA);
    }

    @Override // defpackage.avvp
    public cqkl h() {
        return cqkl.a;
    }

    @Override // defpackage.avvp
    public cqkl i() {
        return cqkl.a;
    }

    @Override // defpackage.avvp
    public cqkl j() {
        return cqkl.a;
    }

    @Override // defpackage.avvp
    public Boolean k() {
        return false;
    }

    @Override // defpackage.avvp
    public Boolean l() {
        return false;
    }

    @Override // defpackage.avvp
    public Boolean m() {
        return false;
    }

    @Override // defpackage.avvp
    public Boolean n() {
        return false;
    }

    @Override // defpackage.avvp
    public Boolean o() {
        return false;
    }

    @Override // defpackage.avvp
    public cjtd p() {
        return cjtd.a(dtxx.av);
    }

    @Override // defpackage.avvp
    public cqkl q() {
        final cjql d = this.g.g().d(a);
        this.h.b(new Runnable(this, d) { // from class: avya
            private final avyb a;
            private final cjql b;

            {
                this.a = this;
                this.b = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                avyb avybVar = this.a;
                avybVar.b.j(this.b, avyb.a);
                avybVar.c.n(avybVar.d.a);
            }
        });
        gn gnVar = this.f.A;
        dbsk.s(gnVar);
        gnVar.g(null, 1);
        return cqkl.a;
    }

    @Override // defpackage.avvp
    public Boolean r() {
        return false;
    }

    @Override // defpackage.avvp
    public void s() {
    }

    @Override // defpackage.avvp
    public void t() {
    }
}
