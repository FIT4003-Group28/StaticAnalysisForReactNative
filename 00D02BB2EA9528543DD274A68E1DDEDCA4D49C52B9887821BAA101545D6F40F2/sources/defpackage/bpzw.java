package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bpzw  reason: default package */
/* loaded from: classes4.dex */
class bpzw extends ivn {
    final /* synthetic */ bpzx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpzw(bpzx bpzxVar, Activity activity) {
        super(activity.getString(R.string.MISSING_ROAD_DETAILS_TITLE), 2, null, activity.getString(R.string.REPORT_MAP_ISSUE_SUBMIT), cjtd.a(dtya.cq), cjtd.a(dtya.cr), false, false, true, true);
        this.a = bpzxVar;
    }

    @Override // defpackage.ivn, defpackage.jbk
    public jib NC() {
        jhz e = super.NC().e();
        e.x = true;
        return e.b();
    }

    @Override // defpackage.ivn
    public void a() {
        if (!this.a.c.b()) {
            return;
        }
        jmw.d(this.a.b, new Runnable(this) { // from class: bpzu
            private final bpzw a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bpzx bpzxVar = this.a.a;
                bpzxVar.g.b(bpzxVar.i());
            }
        });
    }

    @Override // defpackage.ivn, defpackage.jbh
    public void b(cjqm cjqmVar) {
        if (!this.a.c.b()) {
            return;
        }
        jmw.d(this.a.b, new Runnable(this) { // from class: bpzv
            private final bpzw a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bpzx bpzxVar = this.a.a;
                bptn bptnVar = bpzxVar.h;
                bpyh bpyhVar = bpzxVar.a;
                bqgw bqgwVar = bpzxVar.d;
                ArrayList a = dchl.a();
                bpyh.c(a);
                String c = bqgwVar.b.c();
                if (!dbsj.d(c)) {
                    dner bZ = dnet.h.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dnet dnetVar = (dnet) bZ.b;
                    dnetVar.a |= 1;
                    dnetVar.b = 1;
                    dneu bZ2 = dnfe.p.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dnfe dnfeVar = (dnfe) bZ2.b;
                    c.getClass();
                    dnfeVar.a |= 2;
                    dnfeVar.c = c;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dnet dnetVar2 = (dnet) bZ.b;
                    dnfe bK = bZ2.bK();
                    bK.getClass();
                    dnetVar2.d = bK;
                    dnetVar2.a |= 4;
                    a.add(bZ.bK());
                }
                List<akqq> f = bqgwVar.f();
                if (f.isEmpty()) {
                    bvoo.h("Location or path for the missing road is required.", new Object[0]);
                } else if (f.size() == 1) {
                    dner bZ3 = dnet.h.bZ();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dnet dnetVar3 = (dnet) bZ3.b;
                    dnetVar3.a |= 1;
                    dnetVar3.b = 5;
                    dneu bZ4 = dnfe.p.bZ();
                    dnoh g = f.get(0).g();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dnfe dnfeVar2 = (dnfe) bZ4.b;
                    g.getClass();
                    dnfeVar2.e = g;
                    dnfeVar2.a |= 8;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dnet dnetVar4 = (dnet) bZ3.b;
                    dnfe bK2 = bZ4.bK();
                    bK2.getClass();
                    dnetVar4.d = bK2;
                    dnetVar4.a |= 4;
                    doru bZ5 = dorz.f.bZ();
                    dory doryVar = dory.UNSPECIFIED;
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dorz dorzVar = (dorz) bZ5.b;
                    dorzVar.b = doryVar.i;
                    dorzVar.a |= 1;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dnet dnetVar5 = (dnet) bZ3.b;
                    dorz bK3 = bZ5.bK();
                    bK3.getClass();
                    dnetVar5.e = bK3;
                    dnetVar5.a |= 8;
                    a.add(bZ3.bK());
                } else {
                    dner bZ6 = dnet.h.bZ();
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    dnet dnetVar6 = (dnet) bZ6.b;
                    dnetVar6.a |= 1;
                    dnetVar6.b = 6;
                    dneu bZ7 = dnfe.p.bZ();
                    douc g2 = bpyh.g(f);
                    if (bZ7.c) {
                        bZ7.bF();
                        bZ7.c = false;
                    }
                    dnfe dnfeVar3 = (dnfe) bZ7.b;
                    doud bK4 = g2.bK();
                    bK4.getClass();
                    dnfeVar3.f = bK4;
                    dnfeVar3.a |= 16;
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    dnet dnetVar7 = (dnet) bZ6.b;
                    dnfe bK5 = bZ7.bK();
                    bK5.getClass();
                    dnetVar7.d = bK5;
                    dnetVar7.a |= 4;
                    doru bZ8 = dorz.f.bZ();
                    dory doryVar2 = dory.USER_PROVIDED;
                    if (bZ8.c) {
                        bZ8.bF();
                        bZ8.c = false;
                    }
                    dorz dorzVar2 = (dorz) bZ8.b;
                    dorzVar2.b = doryVar2.i;
                    dorzVar2.a |= 1;
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    dnet dnetVar8 = (dnet) bZ6.b;
                    dorz bK6 = bZ8.bK();
                    bK6.getClass();
                    dnetVar8.e = bK6;
                    dnetVar8.a |= 8;
                    a.add(bZ6.bK());
                }
                int i = bqgwVar.f;
                if (i == 0) {
                    throw null;
                }
                if (i != 1) {
                    dner bZ9 = dnet.h.bZ();
                    if (bZ9.c) {
                        bZ9.bF();
                        bZ9.c = false;
                    }
                    dnet dnetVar9 = (dnet) bZ9.b;
                    dnetVar9.a |= 1;
                    dnetVar9.b = 47;
                    dneu bZ10 = dnfe.p.bZ();
                    int i2 = bqgwVar.f;
                    if (bZ10.c) {
                        bZ10.bF();
                        bZ10.c = false;
                    }
                    dnfe dnfeVar4 = (dnfe) bZ10.b;
                    int i3 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    }
                    dnfeVar4.j = i3;
                    dnfeVar4.a |= 512;
                    if (bZ9.c) {
                        bZ9.bF();
                        bZ9.c = false;
                    }
                    dnet dnetVar10 = (dnet) bZ9.b;
                    dnfe bK7 = bZ10.bK();
                    bK7.getClass();
                    dnetVar10.d = bK7;
                    dnetVar10.a |= 4;
                    a.add(bZ9.bK());
                }
                bpyh.d(a, bqgwVar.e);
                dwgy bZ11 = dwgz.h.bZ();
                doaq bZ12 = doar.c.bZ();
                dniw bZ13 = dniz.f.bZ();
                bZ13.a(a);
                if (bZ12.c) {
                    bZ12.bF();
                    bZ12.c = false;
                }
                doar doarVar = (doar) bZ12.b;
                dniz bK8 = bZ13.bK();
                bK8.getClass();
                doarVar.b = bK8;
                doarVar.a |= 1;
                if (bZ11.c) {
                    bZ11.bF();
                    bZ11.c = false;
                }
                dwgz dwgzVar = (dwgz) bZ11.b;
                doar bK9 = bZ12.bK();
                bK9.getClass();
                dwgzVar.b = bK9;
                dwgzVar.a |= 1;
                dnqe e = bpyh.e(bpyhVar.b.a(), bpyhVar.c, bqgwVar.d());
                if (bZ11.c) {
                    bZ11.bF();
                    bZ11.c = false;
                }
                dwgz dwgzVar2 = (dwgz) bZ11.b;
                e.getClass();
                dwgzVar2.c = e;
                dwgzVar2.a |= 2;
                dngm f2 = bpyhVar.f();
                if (bZ11.c) {
                    bZ11.bF();
                    bZ11.c = false;
                }
                dwgz dwgzVar3 = (dwgz) bZ11.b;
                f2.getClass();
                dwgzVar3.d = f2;
                dwgzVar3.a |= 4;
                djgw a2 = chiw.a();
                if (bZ11.c) {
                    bZ11.bF();
                    bZ11.c = false;
                }
                dwgz dwgzVar4 = (dwgz) bZ11.b;
                a2.getClass();
                dwgzVar4.e = a2;
                dwgzVar4.a |= 8;
                bptnVar.a(bZ11.bK(), true);
            }
        });
    }
}
