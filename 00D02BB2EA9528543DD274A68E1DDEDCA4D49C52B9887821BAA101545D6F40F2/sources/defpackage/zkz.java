package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: zkz  reason: default package */
/* loaded from: classes7.dex */
public class zkz extends acoi implements zcm {
    public static final dcqe b = dcqe.c("zkz");
    public final zce c = zkd.a();
    public boolean d;
    private final List<zku> e;
    private final zqj f;
    private final qfp g;

    public zkz(cqhn cqhnVar, qfr qfrVar, List<zku> list, zqj zqjVar) {
        this.e = list;
        this.f = zqjVar;
        qfp qfpVar = new qfp(this) { // from class: zkw
            private final zkz a;

            {
                this.a = this;
            }

            @Override // defpackage.qfp
            public final void a() {
                zkz zkzVar = this.a;
                zkzVar.c.d(3000L);
                cqkx.p(zkzVar);
            }

            @Override // defpackage.qfp
            public final void b() {
            }

            @Override // defpackage.qfp
            public final void c() {
            }
        };
        this.g = qfpVar;
        qfrVar.a(qfpVar);
    }

    @Override // defpackage.zcm
    public Integer a(View view) {
        View findViewById = view.findViewById(this.f.a().V().intValue());
        if (findViewById == null) {
            bvoo.h("header view was not found in view hierarchy", new Object[0]);
            return 0;
        }
        View a = cqhu.a(view, vhr.a);
        if (a == null) {
            bvoo.h("tab strip was not found in view hierarchy", new Object[0]);
            return 0;
        }
        return Integer.valueOf(findViewById.getMeasuredHeight() + a.getMeasuredHeight());
    }

    @Override // defpackage.zcm
    public zce c() {
        return this.c;
    }

    @Override // defpackage.zcm
    public Boolean e() {
        amsq amsqVar = this.e.get(Os().intValue()).c;
        boolean z = true;
        if (amsqVar != amsq.DOCKLESS_BIKESHARING && amsqVar != amsq.DOCKED_BIKESHARING) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zds
    public Boolean f() {
        return Boolean.valueOf(this.f.a().M() != zfn.INFO_SHEET_HEADER_FULLY_EXPANDED);
    }

    @Override // defpackage.zds
    public List<zdr> g() {
        return dchl.k(this.e, dbrq.a);
    }

    @Override // defpackage.zds
    public cqix<?> h() {
        return cqgr.fT(vjc.e(), this.f);
    }

    @Override // defpackage.zcm
    /* renamed from: i */
    public zqj d() {
        return this.f;
    }
}
