package defpackage;

import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bxze  reason: default package */
/* loaded from: classes4.dex */
public class bxze implements bxxr {
    public final bxyt a;
    public List<cqix<?>> b = new ArrayList();
    private final bxtv c;
    private final Executor d;

    public bxze(bxtv bxtvVar, bxyu bxyuVar, bxzr bxzrVar, Executor executor) {
        this.c = bxtvVar;
        this.a = bxyuVar.a(bxzrVar, bxym.FULL_PAGE);
        this.d = executor;
    }

    @Override // defpackage.bxxr
    public List<cqix<?>> a() {
        return this.b;
    }

    public void b() {
        deha.q(this.c.b(), bvqj.b(new bvqg(this) { // from class: bxzd
            private final bxze a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                List<cqix<?>> a;
                bxys[] values;
                int c;
                bxys bxysVar;
                dptb dptbVar;
                dptb dptbVar2;
                dptg dptgVar;
                bxze bxzeVar = this.a;
                bxyt bxytVar = bxzeVar.a;
                dcdc<dpte> q = dcdc.q(dcft.i((dcdc) obj, bxyr.a));
                aim aimVar = new aim();
                eapg s = bvtb.s(bxytVar.b.b());
                int i = 0;
                for (dpte dpteVar : q) {
                    if (dpteVar.e <= 0 || (c = bxyt.c(dpteVar, s)) < 0) {
                        bxysVar = null;
                    } else if (c == 0) {
                        bxysVar = bxys.TODAY;
                    } else if (c == 1) {
                        bxysVar = bxys.YESTERDAY;
                    } else if (c < 7) {
                        bxysVar = bxys.THIS_WEEK;
                    } else if (c < 14) {
                        bxysVar = bxys.LAST_WEEK;
                    } else {
                        bxysVar = bxys.PREVIOUS;
                    }
                    if (bxysVar != null) {
                        if (aimVar.get(bxysVar) == null) {
                            aimVar.put(bxysVar, new ArrayList());
                        }
                        bxzr bxzrVar = bxytVar.d;
                        bxyl e = bxyn.e();
                        e.c(i);
                        e.b(dpteVar);
                        ((bxxv) e).a = null;
                        e.d(bxytVar.c);
                        dbsg<bxxq> a2 = bxzrVar.a(e.a());
                        if (a2.a()) {
                            ((List) aimVar.get(bxysVar)).add(a2.b());
                            i++;
                        }
                    } else {
                        bxys bxysVar2 = bxys.TODAY;
                        int a3 = dptd.a(dpteVar.b);
                        int i2 = a3 - 1;
                        if (a3 == 0) {
                            throw null;
                        }
                        if (i2 == 0) {
                            if (dpteVar.b == 4) {
                                dptgVar = (dptg) dpteVar.c;
                            } else {
                                dptgVar = dptg.q;
                            }
                            if (String.valueOf(dptgVar.c).length() == 0) {
                                new String("PLACE: ");
                            }
                        } else if (i2 == 1) {
                            if (dpteVar.b == 6) {
                                dptbVar2 = (dptb) dpteVar.c;
                            } else {
                                dptbVar2 = dptb.e;
                            }
                            if (String.valueOf(dptbVar2.c).length() == 0) {
                                new String("SEARCH: ");
                            }
                        } else if (i2 == 2) {
                            if (dpteVar.b == 6) {
                                dptbVar = (dptb) dpteVar.c;
                            } else {
                                dptbVar = dptb.e;
                            }
                            if (String.valueOf(dptbVar.c).length() == 0) {
                                new String("EXPERIENCE: ");
                            }
                        }
                    }
                }
                cqiv cqivVar = new cqiv();
                if (!aimVar.isEmpty()) {
                    for (bxys bxysVar3 : bxys.values()) {
                        List list = (List) aimVar.get(bxysVar3);
                        if (list != null && !list.isEmpty()) {
                            bxqz bxqzVar = new bxqz();
                            int ordinal = bxysVar3.ordinal();
                            cqivVar.a(bxqzVar, new iyb(bxytVar.a.getString(ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? R.string.PREVIOUS_SEARCHES_TITLE : R.string.LAST_WEEK_TITLE : R.string.THIS_WEEK_TITLE : R.string.YESTERDAY : R.string.TODAY)));
                            cqivVar.f(bxyt.b(), list);
                        }
                    }
                    a = cqivVar.a;
                } else {
                    a = bxytVar.a(null, q, null, null);
                }
                bxzeVar.b = a;
                cqkx.p(bxzeVar);
            }
        }), this.d);
    }
}
