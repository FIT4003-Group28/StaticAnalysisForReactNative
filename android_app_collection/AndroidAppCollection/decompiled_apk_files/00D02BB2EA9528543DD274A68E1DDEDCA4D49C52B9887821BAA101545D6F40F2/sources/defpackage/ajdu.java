package defpackage;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import com.google.android.apps.gmm.locationsharing.ui.sendkit.JourneySharingSendKitActivity;
import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
/* compiled from: PG */
/* renamed from: ajdu  reason: default package */
/* loaded from: classes2.dex */
public class ajdu implements ajdl, ajet, ajba, ajwe, ajvd {
    public final Context a;
    public final cjtd d;
    public final cjtd e;
    public int g;
    public final k h;
    @dzsi
    public View i;
    @dzsi
    public ajds j;
    private final ajwd k;
    private final ajbh l;
    private final cqhn m;
    private final ajwq n;
    private final ajdr o;
    private final bwfp p;
    private final ajus q;
    private final String r;
    private final btlu s;
    private final dbsg<Profile> t;
    private final boolean u;
    private final boolean v;
    private final ajah w;
    private final ajbm x;
    private boolean y;
    @dzsi
    private ajbb z;
    public final ViewTreeObserver.OnDrawListener b = new ajdm(this);
    public final e c = new e() { // from class: com.google.android.apps.gmm.locationsharing.modui.shares.CreateSharesFlowViewModelImpl$2
        @Override // defpackage.f
        public final void a(m mVar) {
            View view = ajdu.this.i;
            if (view != null) {
                view.getViewTreeObserver().addOnDrawListener(ajdu.this.b);
            }
        }

        @Override // defpackage.f
        public final void b(m mVar) {
        }

        @Override // defpackage.f
        public final void c(m mVar) {
        }

        @Override // defpackage.f
        public final void d(m mVar) {
        }

        @Override // defpackage.f
        public final void e(m mVar) {
        }

        @Override // defpackage.f
        public final void f(m mVar) {
            View view = ajdu.this.i;
            if (view != null) {
                view.getViewTreeObserver().removeOnDrawListener(ajdu.this.b);
            }
        }
    };
    public boolean f = false;

    public ajdu(cqat cqatVar, cqhn cqhnVar, ajus ajusVar, Context context, bwfp bwfpVar, ajdr ajdrVar, String str, btlu btluVar, ajwq ajwqVar, dbsg<Profile> dbsgVar, CharSequence charSequence, boolean z, boolean z2, k kVar) {
        ajve ajveVar;
        this.o = ajdrVar;
        this.n = ajwqVar;
        this.a = context;
        this.m = cqhnVar;
        this.p = bwfpVar;
        this.q = ajusVar;
        this.r = str;
        this.s = btluVar;
        this.t = dbsgVar;
        this.u = z;
        this.v = z2;
        this.h = kVar;
        if (z2) {
            this.d = cjtd.a(dtxu.fD);
            this.e = cjtd.a(dtxu.fH);
        } else if (dbsgVar.a()) {
            this.d = cjtd.a(dtxu.eJ);
            this.e = cjtd.a(dtxu.eQ);
        } else {
            this.d = cjtd.a(dtxu.du);
            this.e = cjtd.a(dtxu.dD);
        }
        ajdn ajdnVar = new ajdn(this);
        if (!dbsgVar.a()) {
            ajveVar = new ajve(dtxu.dx, dtxu.dE, dtxu.dA, dtxu.dv, null);
        } else {
            ajveVar = new ajve(dtxu.eL, dtxu.eR, dtxu.eN, dtxu.eK, null);
        }
        this.k = new ajwd(context, cqatVar, false, cqhnVar, true, ajdnVar, ajveVar);
        this.l = new ajdo(this, ajdrVar, dbsgVar);
        this.w = new ajdp(ajdrVar, z2, dbsgVar);
        this.x = new ajdq(charSequence, ajdrVar, z2, dbsgVar);
    }

    @Override // defpackage.ajba
    public void a(@dzsi SendKitPickerResult sendKitPickerResult) {
        ajdr ajdrVar = this.o;
        fd fdVar = (fd) ajdrVar;
        if (!fdVar.U()) {
            return;
        }
        ajcr ajcrVar = (ajcr) ajdrVar;
        if (ajcrVar.aV() || ajcrVar.g != 0) {
            return;
        }
        btlu btluVar = ajcrVar.b;
        dbsk.s(btluVar);
        Context H = fdVar.H();
        String str = btluVar.d;
        dbsk.s(str);
        String t = btluVar.t();
        dbsk.s(t);
        ajcrVar.aB.a().p(fdVar, JourneySharingSendKitActivity.o(H, str, t, false, false, 1, dbsg.j(sendKitPickerResult)), awnn.LOCATION_SHARING_SENDKIT.ordinal(), 2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ajyk, ajdr] */
    @Override // defpackage.ajba
    public void b(czha czhaVar, Runnable runnable) {
        ?? r0 = this.o;
        ajcr ajcrVar = (ajcr) r0;
        if (ajcrVar.aV()) {
            return;
        }
        ajcrVar.ah = czhaVar;
        ajcrVar.ai = runnable;
        ajdu ajduVar = ajcrVar.ad;
        dbsk.s(ajduVar);
        ajcrVar.ak = ajye.aJ((fd) r0, r0, ajduVar.q().c().booleanValue());
        ajcrVar.ak.aK();
    }

    @Override // defpackage.ajba
    public void c(SendKitPickerResult sendKitPickerResult) {
        this.o.i(sendKitPickerResult);
    }

    @Override // defpackage.ajba
    public void d() {
        ((ajcr) this.o).aU();
    }

    @Override // defpackage.ajdl
    public ajwm e() {
        return this.n;
    }

    @Override // defpackage.ajdl
    public Boolean f() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.ajvd
    public void g(ResolveInfo resolveInfo) {
        this.o.g(resolveInfo);
    }

    @Override // defpackage.ajdl
    public cqtv h() {
        return cqrp.d(jmj.e(this.a, this.g));
    }

    @Override // defpackage.ajdl
    public ajet i() {
        return this;
    }

    @Override // defpackage.ajdl
    public ajah j() {
        return this.w;
    }

    @Override // defpackage.ajdl
    public ajbm k() {
        return this.x;
    }

    @Override // defpackage.ajet
    public Boolean l() {
        return Boolean.valueOf(this.u);
    }

    @Override // defpackage.ajet
    public Boolean m() {
        boolean z = true;
        if (n().booleanValue() && !this.y) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ajet
    public Boolean n() {
        return Boolean.valueOf(!this.t.a());
    }

    @Override // defpackage.ajet
    public cqkl o() {
        this.y = true;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.ajet
    public ajbh p() {
        return this.l;
    }

    @Override // defpackage.ajet
    public ajwa q() {
        return this.k;
    }

    @Override // defpackage.ajet
    public ajao r() {
        if (this.z == null) {
            this.z = new ajbb(this.p, this, this, this, this.m, this.a, this.q, this.r, this.s, !this.t.a(), this.d, this.e, this.v ? dtxu.fB : dtxu.dt);
        }
        return this.z;
    }

    @Override // defpackage.ajet
    public String s() {
        if (this.k.c().booleanValue()) {
            return this.k.j();
        }
        return this.k.h();
    }

    @Override // defpackage.ajwe
    public boolean t(String str) {
        return this.o.ac(str);
    }

    @Override // defpackage.ajwe
    public void u(String[] strArr, int i, ajxy ajxyVar) {
        ajdr ajdrVar = this.o;
        ajcr ajcrVar = (ajcr) ajdrVar;
        if (ajcrVar.aV()) {
            return;
        }
        ajcrVar.aj = ajxyVar;
        ((fd) ajdrVar).aa(strArr, 1234);
    }

    public void v() {
        ajwd ajwdVar = this.k;
        if (ajwdVar != null) {
            cqkx.p(ajwdVar);
        }
    }

    public void w(View view, ajds ajdsVar) {
        View view2 = this.i;
        if (view2 != null) {
            view2.getViewTreeObserver().removeOnDrawListener(this.b);
        }
        this.i = view;
        this.j = ajdsVar;
        if (this.h.c().a(j.CREATED)) {
            view.getViewTreeObserver().addOnDrawListener(this.b);
        }
    }

    public final void x() {
        ajbb ajbbVar = this.z;
        if (ajbbVar != null) {
            ajwd ajwdVar = this.k;
            dbsk.s(ajwdVar);
            ajbbVar.e(!ajwdVar.c().booleanValue());
        }
        cqkx.p(this);
    }
}
