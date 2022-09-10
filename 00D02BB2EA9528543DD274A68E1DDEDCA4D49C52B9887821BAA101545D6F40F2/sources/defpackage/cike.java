package defpackage;

import com.google.android.apps.maps.R;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cike  reason: default package */
/* loaded from: classes4.dex */
public class cike extends cibj implements cika {
    public final baal a;
    public chyu b;
    private final chyy c;
    private final bnju d;
    private final chrx e;
    private final chxl f;
    @dzsi
    private final chvs g;

    public cike(chyy chyyVar, bnjv bnjvVar, final begg beggVar, chrx chrxVar, chxl chxlVar, baal baalVar, @dzsi chvs chvsVar) {
        super(chxlVar);
        this.b = chyu.VISIBLE;
        this.c = chyyVar;
        this.e = chrxVar;
        this.f = chxlVar;
        this.a = baalVar;
        this.g = chvsVar;
        chvsVar.getClass();
        drdg drdgVar = chvsVar.d;
        drdgVar = drdgVar == null ? drdg.q : drdgVar;
        ily ilyVar = new ily();
        ilyVar.w(drdgVar);
        if (baalVar.z() != null) {
            baak z = baalVar.z();
            dbsk.s(z);
            ilyVar.q(z.b());
            baak z2 = baalVar.z();
            dbsk.s(z2);
            ilyVar.j(z2.a());
        }
        ilo d = ilyVar.d();
        final begj begjVar = new begj();
        begjVar.n = true;
        begjVar.c(false);
        begjVar.c = jjn.EXPANDED;
        begjVar.b(d);
        bnjs a = bnjvVar.a(d);
        a.a = new bnjt(beggVar, begjVar) { // from class: cikb
            private final begg a;
            private final begj b;

            {
                this.a = beggVar;
                this.b = begjVar;
            }

            @Override // defpackage.bnjt
            public final void a(cjqm cjqmVar) {
                this.a.n(this.b, false, null);
            }
        };
        if (baalVar.j() != null) {
            a.p = baalVar.j();
        }
        this.d = a.a();
    }

    @Override // defpackage.chyv
    public chyu a() {
        return this.b;
    }

    @Override // defpackage.chyv
    public boolean b() {
        return chys.b(this);
    }

    @Override // defpackage.chyv
    public chyw c() {
        return chyw.UPDATE_LIST_ITEM;
    }

    @Override // defpackage.chyv
    public List d() {
        return dcdc.e();
    }

    public boolean equals(@dzsi Object obj) {
        return cidc.a(this, obj, new cidd(this) { // from class: cikd
            private final cike a;

            {
                this.a = this;
            }

            @Override // defpackage.cidd
            public final boolean a(Object obj2) {
                return this.a.a.p(((cike) obj2).a);
            }
        });
    }

    @Override // defpackage.cika
    public cqkl f() {
        if (this.g != null && !this.c.a()) {
            this.e.V(this.a, new bvqg(this) { // from class: cikc
                private final cike a;

                {
                    this.a = this;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    cike cikeVar = this.a;
                    if (!((baal) obj).c().isEmpty()) {
                        cikeVar.b = chyu.COMPLETED;
                    }
                }
            });
            return cqkl.a;
        }
        return cqkl.a;
    }

    @Override // defpackage.cika
    public cqkl g() {
        if (this.c.a()) {
            return cqkl.a;
        }
        if (this.g != null) {
            this.b = chyu.DISMISSED;
            chrx chrxVar = this.e;
            chxr chxrVar = this.f.b;
            if (chxrVar == null) {
                chxrVar = chxr.e;
            }
            chvs chvsVar = this.g;
            dbsk.s(chvsVar);
            dpvc dpvcVar = chvsVar.e;
            if (dpvcVar == null) {
                dpvcVar = dpvc.c;
            }
            chrxVar.ao(chxrVar, dpvcVar, 6);
        }
        return cqkl.a;
    }

    @Override // defpackage.cika
    public cqsn h() {
        Object[] objArr = new Object[2];
        objArr[0] = this.d.g();
        dpot dpotVar = this.f.e;
        if (dpotVar == null) {
            dpotVar = dpot.m;
        }
        objArr[1] = dpotVar.f;
        return new cqvf(R.string.ADD_LIST_ITEM_NOTE_TASK_ADD_NOTE_CONTENT_DESCRIPTION, objArr);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.a(), chxj.ADD_LIST_ITEM_NOTE});
    }

    @Override // defpackage.cika
    public cqsn i() {
        Object[] objArr = new Object[2];
        objArr[0] = this.d.g();
        dpot dpotVar = this.f.e;
        if (dpotVar == null) {
            dpotVar = dpot.m;
        }
        objArr[1] = dpotVar.f;
        return new cqvf(R.string.ADD_LIST_ITEM_NOTE_TASK_SKIP_CONTENT_DESCRIPTION, objArr);
    }

    @Override // defpackage.cika
    @dzsi
    public izx j() {
        return null;
    }

    @Override // defpackage.cika
    /* renamed from: k */
    public bnju e() {
        return this.d;
    }
}
