package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wbu  reason: default package */
/* loaded from: classes7.dex */
public final class wbu implements wbw {
    public final Context a;
    public final bvjj b;
    private final wbl c;
    private final btvo d;
    private final cqhn e;
    private final qur f;
    private final Executor g;

    public wbu(wbl wblVar, Context context, btvo btvoVar, cqhn cqhnVar, qur qurVar, bvjj bvjjVar, Executor executor) {
        dbsk.l(true);
        this.c = wblVar;
        this.a = context;
        this.d = btvoVar;
        this.e = cqhnVar;
        this.f = qurVar;
        this.b = bvjjVar;
        this.g = executor;
    }

    public static wbr c(List<dbsg<wcn>> list, int i) {
        return (wbr) list.get(i).b();
    }

    private final boolean e() {
        return ((wbn) i()).a || this.b.m(bvjk.jJ, false);
    }

    private static boolean f(amvh amvhVar) {
        dpjs dpjsVar = dpjs.ENTITY_TYPE_MY_LOCATION;
        int ordinal = amvhVar.b.ordinal();
        return ordinal == 1 || ordinal == 2;
    }

    private final boolean g(@dzsi akqq akqqVar, @dzsi akqq akqqVar2) {
        return akqq.v(akqqVar, akqqVar2, ((wbn) i()).b);
    }

    @dzsi
    private static bvjk h(dpjs dpjsVar) {
        int ordinal = dpjsVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return bvjk.jI;
            }
            return null;
        }
        return bvjk.jH;
    }

    private final wbt i() {
        int i = 1;
        if ((this.d.getCommuteDrivingImmersiveParameters().a & 1) == 0) {
            duoq duoqVar = this.d.getDirectionsPageParameters().s;
            if (duoqVar == null) {
                duoqVar = duoq.d;
            }
            boolean z = duoqVar.a;
            int i2 = duoqVar.b;
            int a = duop.a(duoqVar.c);
            if (a == 0) {
                a = 1;
            }
            dpjs dpjsVar = dpjs.ENTITY_TYPE_MY_LOCATION;
            int i3 = a - 1;
            if (i3 == 1) {
                i = 2;
            } else if (i3 == 2) {
                i = 3;
            } else if (i3 == 3) {
                i = 4;
            }
            return new wbn(z, i2, i);
        }
        dkic dkicVar = this.d.getCommuteDrivingImmersiveParameters().b;
        if (dkicVar == null) {
            dkicVar = dkic.d;
        }
        boolean z2 = dkicVar.a;
        int i4 = dkicVar.b;
        int a2 = dkib.a(dkicVar.c);
        if (a2 != 0) {
            i = a2;
        }
        return new wbn(z2, i4, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    @Override // defpackage.wbw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.vum r11) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wbu.a(vum):void");
    }

    public final void b(amte amteVar, int i, boolean z) {
        amvh[] amvhVarArr = amteVar.c;
        int length = amvhVarArr.length;
        bvjk h = h(amvhVarArr[length - 1].b);
        if (h != null) {
            if (z) {
                ArrayList arrayList = new ArrayList(length);
                for (amvh amvhVar : amvhVarArr) {
                    akqq akqqVar = amvhVar.e;
                    if (akqqVar != null) {
                        arrayList.add(akqqVar.h());
                    }
                }
                wcl bZ = wcm.d.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                wcm wcmVar = (wcm) bZ.b;
                dsrj<dpum> dsrjVar = wcmVar.b;
                if (!dsrjVar.a()) {
                    wcmVar.b = dsqw.cl(dsrjVar);
                }
                dsod.bv(arrayList, wcmVar.b);
                dspd dspdVar = amteVar.a.m(i).a.v;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                wcm wcmVar2 = (wcm) bZ.b;
                dspdVar.getClass();
                wcmVar2.a |= 1;
                wcmVar2.c = dspdVar;
                this.b.al(h, bZ.bK());
                return;
            }
            this.b.P(h);
        }
    }

    @Override // defpackage.wbw
    public final dcdc<dbsg<wcn>> d(final amte amteVar, boolean z, final rfc rfcVar) {
        int i;
        boolean z2;
        wbp wbpVar;
        int a;
        int n = amteVar.a.n();
        final ArrayList arrayList = new ArrayList(Collections.nCopies(n, dbpy.a));
        if (e() && amteVar.i().z) {
            int i2 = 0;
            while (i2 < n) {
                amve m = amteVar.a.m(i2);
                if ((m.a.a & 4194304) != 0) {
                    dqvj c = dqvj.c(m.b().b);
                    if (c == null) {
                        c = dqvj.DRIVE;
                    }
                    if (c == dqvj.DRIVE) {
                        Iterator<dpik> it = m.y().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z2 = false;
                                break;
                            }
                            dpik next = it.next();
                            int a2 = dpii.a(next.a);
                            if (a2 != 0 && a2 == 2 && (a = dpig.a(next.b)) != 0 && a == 3) {
                                z2 = true;
                                break;
                            }
                        }
                        final int i3 = i2;
                        wbq wbqVar = new wbq(this, amteVar, i3, arrayList, rfcVar) { // from class: wbs
                            private final wbu a;
                            private final amte b;
                            private final int c;
                            private final List d;
                            private final rfc e;

                            {
                                this.a = this;
                                this.b = amteVar;
                                this.c = i3;
                                this.d = arrayList;
                                this.e = rfcVar;
                            }

                            @Override // defpackage.wbq
                            public final void a() {
                                wbu wbuVar = this.a;
                                amte amteVar2 = this.b;
                                int i4 = this.c;
                                List list = this.d;
                                rfc rfcVar2 = this.e;
                                boolean booleanValue = wbu.c(list, i4).d().booleanValue();
                                boolean z3 = !booleanValue;
                                wbuVar.b(amteVar2, i4, z3);
                                int i5 = 0;
                                while (true) {
                                    boolean z4 = true;
                                    if (i5 >= list.size()) {
                                        break;
                                    }
                                    if (((dbsg) list.get(i5)).a()) {
                                        wbr c2 = wbu.c(list, i5);
                                        if (i5 != i4 || !z3) {
                                            z4 = false;
                                        }
                                        c2.b(z4);
                                    }
                                    i5++;
                                }
                                bvjk bvjkVar = z3 ? bvjk.jK : bvjk.jL;
                                if (!wbuVar.b.m(bvjkVar, false)) {
                                    Toast.makeText(wbuVar.a, wbuVar.a.getString(true != booleanValue ? R.string.ROUTE_SAVED_TOAST : R.string.ROUTE_NO_LONGER_SAVED_TOAST), 0).show();
                                    wbuVar.b.S(bvjkVar, true);
                                }
                                cqkx.p(rfcVar2.a);
                            }
                        };
                        dpjs dpjsVar = dpjs.ENTITY_TYPE_MY_LOCATION;
                        int i4 = ((wbn) i()).c - 1;
                        if (i4 == 1) {
                            wbpVar = wbp.HEART;
                        } else if (i4 == 2) {
                            wbpVar = wbp.STAR;
                        } else if (i4 == 3) {
                            wbpVar = wbp.PIN;
                        } else {
                            wbpVar = wbp.HEART;
                        }
                        i = i2;
                        wbr wbrVar = new wbr(wbpVar, this.e, wbqVar, this.a.getResources(), z, z2, i);
                        arrayList.set(i, dbsg.i(wbrVar));
                        this.c.a.b(wbrVar, this.g);
                        if (z2 && !z) {
                            b(amteVar, i, true);
                        }
                        i2 = i + 1;
                    }
                }
                i = i2;
                i2 = i + 1;
            }
            return dcdc.r(arrayList);
        }
        return dcdc.r(arrayList);
    }
}
