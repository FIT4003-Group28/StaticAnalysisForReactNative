package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bwpz  reason: default package */
/* loaded from: classes4.dex */
public class bwpz implements bwoh {
    public final Activity a;
    private final cqat b;
    private final bwqd c;
    private final bwqb d;
    @dzsi
    private bwoi f;
    private final List<bwqc> e = new ArrayList();
    private final aim<bwpy, List<bwqc>> g = new aim<>();
    private cqiv h = new cqiv();

    public bwpz(cqat cqatVar, Activity activity, bwqd bwqdVar, bwqb bwqbVar) {
        this.b = cqatVar;
        this.a = activity;
        this.c = bwqdVar;
        this.d = bwqbVar;
    }

    private static eapg e(long j) {
        eaou k;
        TimeZone timeZone = TimeZone.getDefault();
        try {
            k = eaou.l(timeZone);
        } catch (IllegalArgumentException unused) {
            k = eaou.k(timeZone.getOffset(j));
        }
        return new eapg(j, k);
    }

    @Override // defpackage.bwoh
    @dzsi
    public cjtd a() {
        return null;
    }

    @Override // defpackage.bwoh
    @dzsi
    public bwoi b() {
        return this.f;
    }

    @Override // defpackage.bwoh
    public List<cqix<?>> c() {
        return this.h.a;
    }

    public void d(nxn nxnVar, List<cjys> list) {
        bwpy[] values;
        int i;
        dbsk.b(nxnVar.c.b == 1, "RecentHistoryCardViewModelImpl should only be used with OdelayCard with ModuleData.ModuleType.SEARCH_RECENT.");
        for (cjys cjysVar : list) {
            if (cjysVar instanceof cjzs) {
                for (bwns bwnsVar : ((cjzs) cjysVar).f) {
                    dtkx dtkxVar = bwnsVar.b;
                    if (dtkxVar == null) {
                        dtkxVar = dtkx.e;
                    }
                    if ((dtkxVar.a & 1) != 0) {
                        dtkx dtkxVar2 = bwnsVar.b;
                        if (dtkxVar2 == null) {
                            dtkxVar2 = dtkx.e;
                        }
                        dtku dtkuVar = dtkxVar2.b;
                        if (dtkuVar == null) {
                            dtkuVar = dtku.p;
                        }
                        dtkf dtkfVar = dtkuVar.b;
                        if (dtkfVar == null) {
                            dtkfVar = dtkf.n;
                        }
                        dtkf dtkfVar2 = dtkfVar;
                        if (dtkfVar2.l != 4887) {
                            List<bwqc> list2 = this.e;
                            bwqd bwqdVar = this.c;
                            long j = bwnsVar.c;
                            String str = cjysVar.d;
                            dvnp dvnpVar = cjysVar.e;
                            dtid dtidVar = nxnVar.b;
                            bwqd.a(dtkfVar2, 1);
                            dxio a = ((dxjh) bwqdVar.a).a();
                            bwqd.a(a, 6);
                            list2.add(new bwqc(dtkfVar2, j, str, dvnpVar, dtidVar, a));
                        } else {
                            bwqb bwqbVar = this.d;
                            String str2 = cjysVar.d;
                            dvnp dvnpVar2 = cjysVar.e;
                            dtid dtidVar2 = nxnVar.b;
                            bwqb.a(dtkfVar2, 1);
                            dxio a2 = ((dxjh) bwqbVar.a).a();
                            bwqb.a(a2, 5);
                            this.f = new bwqa(dtkfVar2, str2, dvnpVar2, dtidVar2, a2);
                        }
                    }
                }
            }
        }
        this.g.clear();
        eapg e = e(this.b.b());
        for (bwqc bwqcVar : this.e) {
            bwpy bwpyVar = null;
            if (bwqcVar.f() > 0 && (i = eaov.c(e(TimeUnit.MICROSECONDS.toMillis(bwqcVar.f())), e).p) >= 0) {
                if (i == 0) {
                    bwpyVar = bwpy.TODAY;
                } else if (i == 1) {
                    bwpyVar = bwpy.YESTERDAY;
                } else if (i < 7) {
                    bwpyVar = bwpy.THIS_WEEK;
                } else if (i < 14) {
                    bwpyVar = bwpy.LAST_WEEK;
                } else {
                    bwpyVar = bwpy.PREVIOUS;
                }
            }
            if (bwpyVar != null) {
                if (this.g.get(bwpyVar) == null) {
                    this.g.put(bwpyVar, new ArrayList());
                }
                this.g.get(bwpyVar).add(bwqcVar);
            } else {
                bwqcVar.a();
            }
        }
        cqiv cqivVar = new cqiv();
        if (!this.g.isEmpty()) {
            boolean z = false;
            for (bwpy bwpyVar2 : bwpy.values()) {
                List<bwqc> list3 = this.g.get(bwpyVar2);
                if (list3 != null && !list3.isEmpty()) {
                    if (z) {
                        cqivVar.a(new gvd(), this);
                    }
                    bwmo bwmoVar = new bwmo();
                    int ordinal = bwpyVar2.ordinal();
                    cqivVar.a(bwmoVar, new bwpx(this, ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? R.string.PREVIOUS_SEARCHES : R.string.LAST_WEEK_LABEL : R.string.THIS_WEEK_LABEL : R.string.YESTERDAY : R.string.TODAY));
                    gva.b(cqivVar, list3, new bwml(), new gvd());
                    z = true;
                }
            }
        } else {
            gva.b(cqivVar, this.e, new bwml(), new gvd());
        }
        this.h = cqivVar;
    }
}
