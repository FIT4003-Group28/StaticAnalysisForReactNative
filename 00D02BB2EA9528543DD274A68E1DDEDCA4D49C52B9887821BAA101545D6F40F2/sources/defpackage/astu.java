package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: astu  reason: default package */
/* loaded from: classes2.dex */
public class astu extends ivw implements asuo, bzod {
    private final asmn c;
    private final btvo d;
    private final aufc e;
    private final Executor f;
    private final bzmm g;
    private final bzoe h;
    private final boolean i;
    private boolean j;
    private dqvj k;
    private boolean l;
    private final Context m;
    private final crzp<aufb> n;

    public astu(asmn asmnVar, Context context, btvo btvoVar, akfa akfaVar, aufc aufcVar, Executor executor, dzsj<ckrp> dzsjVar, bzmm bzmmVar, bzoe bzoeVar) {
        super(context, ivu.FIXED, jaq.NO_TINT_DAY_NIGHT_ON_WHITE, cqrt.g(2131231736, ibl.s()), context.getString(R.string.MENU_SEARCH_ENROUTE), null, false, R.id.nav_search_fab_button, R(context) ? ivv.MEDIUM : ivv.FULL);
        this.l = false;
        this.n = new astt(this);
        this.m = context;
        this.c = asmnVar;
        this.g = bzmmVar;
        this.d = btvoVar;
        this.e = aufcVar;
        this.f = executor;
        this.h = bzoeVar;
        bzoeVar.g(this);
        this.i = astk.a(context, btvoVar, akfaVar, dzsjVar, null, null);
        if (!R(context)) {
            G(iup.c(R.raw.ic_search_black_32dp, ibl.s()));
        }
    }

    private static boolean R(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp <= 360;
    }

    private final boolean S() {
        return vxx.d(this.k, this.d);
    }

    @Override // defpackage.ivw, defpackage.jar
    public Boolean A() {
        return Boolean.valueOf(S());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [bzoe, bzml] */
    public void N() {
        bzmm bzmmVar = this.g;
        ?? r1 = this.h;
        r1.h();
        bzmmVar.a(r1);
    }

    @Override // defpackage.ivw
    protected final boolean NE() {
        return false;
    }

    public void O(boolean z) {
        if (this.l != z) {
            this.l = z;
            P();
        }
    }

    public final void P() {
        jaq jaqVar;
        if (this.e.b()) {
            jaqVar = jaq.MOD_GREY_ON_NIGHTBLACK_WITH_WHITE_SHADOW;
        } else if (this.l) {
            jaqVar = jaq.MOD_GREY_ON_DARK_GREY_WITH_WHITE_SHADOW;
        } else {
            jaqVar = jaq.NO_TINT_ON_WHITE_WITH_GREY_SHADOW;
        }
        D(jaqVar);
        cqkx.p(this);
    }

    public void Q() {
        K(R(this.m) ? ivv.MEDIUM : ivv.FULL);
    }

    @Override // defpackage.jar
    public cqkl a(cjqm cjqmVar) {
        if (!this.j) {
            return cqkl.a;
        }
        this.h.m(false);
        this.c.m();
        return cqkl.a;
    }

    @Override // defpackage.ivw, defpackage.jar
    public Boolean b() {
        return false;
    }

    @Override // defpackage.ivw, defpackage.jar
    public cqkl c() {
        return cqkl.a;
    }

    @Override // defpackage.bzod
    public Boolean g() {
        return Boolean.valueOf(S());
    }

    public void h() {
        this.j = true;
        this.h.n();
        this.e.i().a(this.n, this.f);
        P();
    }

    public void i() {
        this.j = false;
        this.h.o();
        this.e.i().c(this.n);
    }

    public void j(dqvj dqvjVar) {
        if (dqvjVar != this.k) {
            this.k = dqvjVar;
            cqkx.p(this);
        }
    }

    @Override // defpackage.asuo
    public bzoe k() {
        return this.h;
    }

    @Override // defpackage.bzod
    public Boolean l() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.ivw, defpackage.jar
    public cjtd z() {
        if (S()) {
            return cjtd.a(dtyb.at);
        }
        return cjtd.a(dtxw.di);
    }
}
