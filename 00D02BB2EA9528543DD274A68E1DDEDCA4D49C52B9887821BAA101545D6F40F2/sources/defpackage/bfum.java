package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfum  reason: default package */
/* loaded from: classes3.dex */
public class bfum implements bful, bega {
    private final bvsx a;
    private final Context b;
    private final bvvw c;
    private cjtd d = cjtd.b;
    private dbsg<dnod> e = dbpy.a;

    public bfum(Activity activity, bvvw bvvwVar) {
        this.a = new bvsx(activity.getResources());
        this.b = activity;
        this.c = bvvwVar;
    }

    @Override // defpackage.bful
    @dzsi
    public CharSequence a() {
        if (this.e.a() && !this.e.b().a.isEmpty() && !this.e.b().b.isEmpty()) {
            bvsu c = this.a.c(R.string.INSIGHTS_LURE_PLACEHOLDER);
            bvsv a = this.a.a(this.e.b().b);
            a.l(ibm.y().b(this.b));
            c.a(this.a.a(this.e.b().a), a);
            return c.c();
        }
        return null;
    }

    @Override // defpackage.bful
    public jic b() {
        return new jic(this.e.a() ? this.e.b().c : null, ckqc.FULLY_QUALIFIED, 2131231183);
    }

    @Override // defpackage.bful
    public cqkl c() {
        if (this.e.a()) {
            bvvw bvvwVar = this.c;
            bvxn bZ = bvxu.A.bZ();
            String str = this.e.b().d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bvxu bvxuVar = (bvxu) bZ.b;
            str.getClass();
            bvxuVar.a |= 1;
            bvxuVar.b = str;
            dkyw bZ2 = dkyx.f.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dkyx.b((dkyx) bZ2.b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bvxu bvxuVar2 = (bvxu) bZ.b;
            dkyx bK = bZ2.bK();
            bK.getClass();
            bvxuVar2.j = bK;
            bvxuVar2.a |= 256;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bvxu bvxuVar3 = (bvxu) bZ.b;
            int i = bvxuVar3.a | 4;
            bvxuVar3.a = i;
            bvxuVar3.d = false;
            bvxuVar3.a = i | 16;
            bvxuVar3.f = 1;
            bvxu.b(bvxuVar3);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bvxu bvxuVar4 = (bvxu) bZ.b;
            bvxuVar4.a |= 512;
            bvxuVar4.k = true;
            bvvwVar.k(bZ.bK(), null, dtxr.cs);
        }
        return cqkl.a;
    }

    @Override // defpackage.bful
    public cjtd d() {
        return this.d;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        if (c == null) {
            u();
            return;
        }
        dbsg<dnng> bS = c.bS();
        if (!bS.a() || (bS.b().a & 268435456) == 0) {
            u();
            return;
        }
        dnod dnodVar = bS.b().m;
        if (dnodVar == null) {
            dnodVar = dnod.e;
        }
        this.e = dbsg.i(dnodVar);
        cjta c2 = cjtd.c(c.bY());
        c2.d = dtxr.cr;
        this.d = c2.a();
        this.c.i(this.e.b().d);
    }

    @Override // defpackage.bega
    public void u() {
        this.e = dbpy.a;
        this.d = cjtd.b;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(this.e.a());
    }
}
