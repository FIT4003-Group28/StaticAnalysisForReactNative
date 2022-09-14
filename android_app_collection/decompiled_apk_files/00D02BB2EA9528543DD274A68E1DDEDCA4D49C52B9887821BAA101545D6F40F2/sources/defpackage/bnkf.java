package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gmm.base.webcontent.WebContentWebViewCallbacks;
/* compiled from: PG */
/* renamed from: bnkf  reason: default package */
/* loaded from: classes3.dex */
public class bnkf implements bnkd {
    private static final dcqe c = dcqe.c("bnkf");
    private static final cjtd d;
    public final bvvq a;
    private final Context f;
    private final bnjj g;
    private final View.OnAttachStateChangeListener e = new bnke(this);
    private Boolean h = false;
    private cjtd i = d;
    public dbsg<Integer> b = dbpy.a;

    static {
        cjta b = cjtd.b();
        b.d = dtxy.mQ;
        d = b.a();
    }

    public bnkf(Context context, cqhn cqhnVar, bvvq bvvqVar, bnjj bnjjVar) {
        this.f = context;
        this.a = bvvqVar;
        this.g = bnjjVar;
    }

    @Override // defpackage.bnkd
    public View.OnAttachStateChangeListener a() {
        return this.e;
    }

    @Override // defpackage.bnkd
    public Boolean b() {
        return Boolean.valueOf(this.b.a());
    }

    @Override // defpackage.bnkd
    public Integer c() {
        return this.b.c(0);
    }

    @Override // defpackage.bnkd
    public cjtd d() {
        return this.i;
    }

    public void e() {
        this.h = false;
        this.g.a();
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        dbsg dbsgVar;
        ilo c2 = bwrsVar.c();
        if (c2 == null) {
            bvoo.h("Placemark should not be null", new Object[0]);
            return;
        }
        if ((c2.h().d & 16777216) != 0) {
            dvzh dvzhVar = c2.h().bp;
            if (dvzhVar == null) {
                dvzhVar = dvzh.b;
            }
            dbsgVar = dbsg.i(dvzhVar.a);
        } else {
            dbsgVar = dbpy.a;
        }
        if (!dbsgVar.a()) {
            return;
        }
        bvvr e = bvvs.e();
        String str = (String) dbsgVar.b();
        bvxn bZ = bvxu.A.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ.b;
        str.getClass();
        int i = bvxuVar.a | 1;
        bvxuVar.a = i;
        bvxuVar.b = str;
        bvxuVar.a = i | 4;
        bvxuVar.d = false;
        bvxu.b(bvxuVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ.b;
        bvxuVar2.a |= 8;
        bvxuVar2.e = true;
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
        bvxu bvxuVar3 = (bvxu) bZ.b;
        dkyx bK = bZ2.bK();
        bK.getClass();
        bvxuVar3.j = bK;
        bvxuVar3.a |= 256;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar4 = (bvxu) bZ.b;
        int i2 = bvxuVar4.a | 131072;
        bvxuVar4.a = i2;
        bvxuVar4.s = true;
        bvxuVar4.a = i2 | 16;
        bvxuVar4.f = 1;
        bvxp f = bvoa.f(ibm.a(), this.f);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar5 = (bvxu) bZ.b;
        f.getClass();
        bvxuVar5.x = f;
        int i3 = bvxuVar5.a | 4194304;
        bvxuVar5.a = i3;
        int i4 = i3 | 512;
        bvxuVar5.a = i4;
        bvxuVar5.k = false;
        bvxuVar5.a = i4 | 64;
        bvxuVar5.h = "aGMM.PlaceWebContent";
        bvxq bZ3 = bvxt.c.bZ();
        bvxr bZ4 = bvxs.d.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        bvxs bvxsVar = (bvxs) bZ4.b;
        int i5 = bvxsVar.a | 1;
        bvxsVar.a = i5;
        bvxsVar.b = "cs";
        bvxsVar.a = i5 | 2;
        bvxsVar.c = "1";
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        bvxt bvxtVar = (bvxt) bZ3.b;
        bvxs bK2 = bZ4.bK();
        bK2.getClass();
        bvxtVar.b = bK2;
        bvxtVar.a = 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar6 = (bvxu) bZ.b;
        bvxt bK3 = bZ3.bK();
        bK3.getClass();
        bvxuVar6.w = bK3;
        bvxuVar6.a |= 2097152;
        e.b(bZ.bK());
        bvvn bvvnVar = (bvvn) e;
        bvvnVar.b = new WebContentWebViewCallbacks();
        bvvnVar.a = job.class;
        this.a.a(e.a(), dtxy.mQ);
        this.h = true;
        cjta c3 = cjtd.c(c2.bZ());
        c3.d = dtxy.mQ;
        this.i = c3.a();
    }

    @Override // defpackage.bega
    public void u() {
        this.h = false;
        this.i = d;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return this.h;
    }
}
