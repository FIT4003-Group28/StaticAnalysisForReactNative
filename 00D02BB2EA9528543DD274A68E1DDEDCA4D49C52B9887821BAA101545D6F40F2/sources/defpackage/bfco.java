package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfco  reason: default package */
/* loaded from: classes3.dex */
public class bfco extends bfcb {
    public static final dcqe b = dcqe.c("bfco");
    public final Activity c;
    public final bfbb d;
    public final dxio<akfa> e;
    public final bvrb f;
    public final dxio<bzmm> g;
    public final bfcs h;
    final bwrs<ilo> i;
    @dzsi
    public baal j;
    public boolean k;
    public boolean l;
    private final bfaq m;
    private final akfc n;
    private final bexz o;
    private final bfby p;
    private final String q;
    private final bexy r;

    public bfco(Activity activity, beya beyaVar, bfaq bfaqVar, bfct bfctVar, bfbc bfbcVar, dxio<akfa> dxioVar, akfc akfcVar, dxio<bzmm> dxioVar2, bvrb bvrbVar, bwrs<ilo> bwrsVar, bfby bfbyVar, String str) {
        super(activity);
        bfcl bfclVar = new bfcl(this);
        this.r = bfclVar;
        this.k = true;
        this.l = true;
        this.c = activity;
        this.m = bfaqVar;
        bfbb a = bfbcVar.a(bfbyVar);
        this.d = a;
        this.e = dxioVar;
        this.n = akfcVar;
        this.f = bvrbVar;
        this.g = dxioVar2;
        this.i = bwrsVar;
        this.p = bfbyVar;
        this.q = str;
        bexz a2 = beyaVar.a(bfclVar);
        this.o = a2;
        a.t(bwrsVar);
        this.h = bfctVar.a(a, a2);
    }

    @Override // defpackage.bfcb, defpackage.jad
    public Boolean a() {
        return Boolean.valueOf(this.k);
    }

    @Override // defpackage.bfcb, defpackage.jad
    public cqkl c() {
        if (this.e.a().c()) {
            o();
        } else {
            this.n.k(new bfcm(this), null);
        }
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        bfby bfbyVar = this.p;
        bfbx bfbxVar = this.a ? bfbx.UNFOLLOW_BUTTON : bfbx.FOLLOW_BUTTON;
        ilo c = this.i.c();
        dbsk.s(c);
        return bfbz.b(bfbyVar, bfbxVar, c, dbsg.i(this.q));
    }

    @Override // defpackage.bfcb, defpackage.bfca
    public Boolean j() {
        bwrs<ilo> bwrsVar = this.i;
        boolean z = false;
        if (bwrsVar != null && this.m.b(bwrsVar) && !this.a) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfca
    public CharSequence k() {
        if (this.a) {
            Activity activity = this.c;
            ilo c = this.i.c();
            dbsk.s(c);
            return activity.getString(R.string.LOCAL_FOLLOW_BUTTON_POSITIVE_CONTENT_DESCRIPTION, new Object[]{c.n()});
        }
        Activity activity2 = this.c;
        ilo c2 = this.i.c();
        dbsk.s(c2);
        return activity2.getString(R.string.LOCAL_FOLLOW_BUTTON_NEGATIVE_CONTENT_DESCRIPTION, new Object[]{c2.n()});
    }

    public Boolean m() {
        return Boolean.valueOf(this.l);
    }

    @dzsi
    public cqtd n() {
        if (!this.a || !this.k || this.l) {
            return null;
        }
        return cqrt.i(b(), ibm.x());
    }

    public final void o() {
        bexz bexzVar;
        final boolean z = false;
        if (!this.k) {
            bvoo.h("Should not be able to click follow button if it's not enabled", new Object[0]);
        } else if (this.l) {
            bvoo.h("Should not be able to click follow before data fetch is complete", new Object[0]);
        } else if (this.j == null) {
            bvoo.h("placeItem should never be null after data fetch has been completed", new Object[0]);
        }
        baal baalVar = this.j;
        if (baalVar != null && (bexzVar = this.o) != null && (!this.a ? bexzVar.f(baalVar) : bexzVar.g(baalVar))) {
            z = true;
        }
        this.f.b(new Runnable(this, z) { // from class: bfci
            private final bfco a;
            private final boolean b;

            {
                this.a = this;
                this.b = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bfco bfcoVar = this.a;
                if (!this.b) {
                    Activity activity = bfcoVar.c;
                    cjxu.i(activity, activity.getString(R.string.LOCAL_FOLLOW_FAILURE_MESSAGE));
                    return;
                }
                if (bfcoVar.a) {
                    bfcoVar.a = false;
                } else {
                    if (!bfcoVar.g.a().a(bfcoVar.h) && bfcoVar.j().booleanValue()) {
                        bfcoVar.d.y(true);
                    }
                    bfcoVar.a = true;
                }
                cqkx.p(bfcoVar);
            }
        }, bvrj.UI_THREAD);
    }
}
