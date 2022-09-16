package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bepu  reason: default package */
/* loaded from: classes3.dex */
public class bepu extends bgze {
    private final Resources e;
    private final beid f;
    private final dxio<beii> g;
    private final bwrs<ilo> h;
    private final bvrb i;
    private final bwrs<bvrt<benb>> j;
    private cqss k;
    private String l;
    private String m;
    private cjtd n;
    private bept o;
    private String p;
    @dzsi
    private String q;
    @dzsi
    private cjtd r;

    public bepu(Resources resources, cqhn cqhnVar, dxio<beii> dxioVar, bvrb bvrbVar, bwrs<bvrt<benb>> bwrsVar, beid beidVar, cqkp cqkpVar, bwrs<ilo> bwrsVar2, bept beptVar) {
        super(cqkpVar);
        this.k = ibm.g();
        this.l = "";
        this.m = "";
        this.n = cjtd.b;
        this.p = "";
        dbsk.l(true);
        this.e = resources;
        this.g = dxioVar;
        this.i = bvrbVar;
        this.j = bwrsVar;
        this.f = beidVar;
        this.h = bwrsVar2;
        this.o = beptVar;
        q(bwrsVar2, resources, beptVar);
    }

    private final void q(bwrs<ilo> bwrsVar, Resources resources, bept beptVar) {
        ilo c = bwrsVar.c();
        cjtd bZ = c == null ? null : c.bZ();
        bept beptVar2 = bept.TURN_ON;
        int ordinal = beptVar.ordinal();
        if (ordinal == 0) {
            this.k = ibm.g();
            this.l = resources.getString(R.string.MERCHANT_PANEL_CALLS_ONBOARDING_TURN_ON);
            this.m = resources.getString(R.string.MERCHANT_PANEL_CALLS_ONBOARDING_TURN_ON_CONTENT_DESCRIPTION);
            cjta c2 = cjtd.c(bZ);
            c2.d = dtxv.aT;
            this.n = c2.a();
            this.q = null;
            this.r = null;
            this.p = resources.getString(R.string.MERCHANT_PANEL_CALLS_TURN_ON);
        } else if (ordinal != 1) {
        } else {
            this.k = ibm.u();
            this.l = resources.getString(R.string.MERCHANT_PANEL_CALLS_SETTINGS_BUTTON);
            this.m = resources.getString(R.string.MERCHANT_PANEL_CALLS_SETTINGS);
            cjta c3 = cjtd.c(bZ);
            c3.d = dtxv.aV;
            this.n = c3.a();
            this.q = resources.getString(R.string.MERCHANT_PANEL_CALLS_OKAY);
            cjta c4 = cjtd.c(bZ);
            c4.d = dtxv.aU;
            this.r = c4.a();
            this.p = resources.getString(R.string.MERCHANT_PANEL_CALLS_TURNED_ON);
        }
    }

    public void a(bept beptVar) {
        if (!this.o.equals(beptVar)) {
            this.o = beptVar;
            q(this.h, this.e, beptVar);
        }
    }

    @Override // defpackage.bgyr
    public String b() {
        return this.p;
    }

    @Override // defpackage.bgyr
    public String c() {
        return this.l;
    }

    @Override // defpackage.bgyr
    public String d() {
        return this.m;
    }

    @Override // defpackage.bgyr
    public cjtd e() {
        return this.n;
    }

    @Override // defpackage.bgyr
    public cqkl f() {
        bept beptVar = bept.TURN_ON;
        int ordinal = this.o.ordinal();
        if (ordinal == 0) {
            this.f.b(this.h);
            return cqkl.a;
        } else if (ordinal != 1) {
            return cqkl.a;
        } else {
            this.g.a().e(this.h, this.j);
            return cqkl.a;
        }
    }

    @Override // defpackage.bgze, defpackage.bgyr
    @dzsi
    public String g() {
        return this.q;
    }

    @Override // defpackage.bgze, defpackage.bgyr
    @dzsi
    public cjtd h() {
        return this.r;
    }

    @Override // defpackage.bgze, defpackage.bgyr
    public cqkl i() {
        bept beptVar = bept.TURN_ON;
        int ordinal = this.o.ordinal();
        if (ordinal != 0 && ordinal == 1) {
            p();
            return cqkl.a;
        }
        return cqkl.a;
    }

    @Override // defpackage.bgze, defpackage.bgyr
    public Boolean j() {
        return Boolean.valueOf(this.o == bept.TURNED_ON);
    }

    @Override // defpackage.bgyr
    public cqss k() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bgze
    public final void l(View view) {
        view.setTranslationY(0.0f);
        cqkx.p(this);
        this.i.b(new Runnable(this) { // from class: beps
            private final bepu a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cqkx.p(this.a.c);
            }
        }, bvrj.UI_THREAD);
    }
}
