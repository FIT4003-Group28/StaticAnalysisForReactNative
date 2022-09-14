package defpackage;

import android.app.Application;
import com.google.android.apps.maps.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: crfe  reason: default package */
/* loaded from: classes5.dex */
public final class crfe {
    private static final dcqe f = dcqe.c("crfe");
    public final Application a;
    public final crfc b;
    public final HashMap<amut, Integer> c = new HashMap<>();
    public final Set<amut> d = new HashSet();
    @dzsi
    public dowa e;
    private final cqat g;

    public crfe(Application application, crfc crfcVar, cqat cqatVar) {
        this.a = application;
        this.b = crfcVar;
        this.g = cqatVar;
    }

    @dzsi
    public final crfj a(amut amutVar, long j, int i, @dzsi amvw amvwVar) {
        Integer num = this.c.get(amutVar);
        if (num != null) {
            int intValue = num.intValue();
            float intValue2 = num.intValue() * 0.4f;
            float intValue3 = i - num.intValue();
            if (intValue3 >= (-(intValue * 0.2f)) && intValue3 <= intValue2) {
                i = num.intValue();
            }
        }
        return k(j, amutVar, amvwVar, i);
    }

    public final String b(int i) {
        return c(i, R.string.DA_SPEECH_YOU_SHOULD_GET_THERE_BY);
    }

    public final String c(int i, int i2) {
        return this.a.getString(i2, new Object[]{bvtb.i(this.a, i + (this.g.b() / 1000))});
    }

    public final crfj d(int i) {
        return crfj.d(crfi.OTHER, this.a.getString(R.string.DA_SPEECH_YOU_SHOULD_ARRIVE_IN, new Object[]{bvtb.e(this.a.getResources(), i, bvsz.EXTENDED).toString()}));
    }

    public final crfj e(int i) {
        return crfj.d(crfi.OTHER, this.a.getString(i));
    }

    public final void f() {
        this.c.clear();
        this.d.clear();
    }

    public final crfj g(String str) {
        return crfj.d(crfi.OTHER, str);
    }

    public final synchronized void h() {
        f();
    }

    public final crfj i(int i, List<dotj> list, int i2, @dzsi String str) {
        StringBuilder sb = new StringBuilder();
        for (dotj dotjVar : list) {
            if (!sb.toString().isEmpty()) {
                sb.append(" ");
            }
            int a = doti.a(dotjVar.b);
            if (a == 0 || a != 2 || i2 == -1) {
                int a2 = doti.a(dotjVar.b);
                if (a2 == 0 || a2 != 4 || i2 == -1) {
                    int a3 = doti.a(dotjVar.b);
                    if (a3 == 0 || a3 != 3 || str == null) {
                        sb.append(dotjVar.a);
                    } else {
                        sb.append(str);
                    }
                } else {
                    sb.append(c(i2, R.string.DA_SPEECH_YOU_WILL_NOW_ARRIVE_AT));
                }
            } else {
                sb.append(b(i2));
            }
        }
        return crfj.b(crfi.OTHER, sb.toString(), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085 A[RETURN] */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.crfj j(defpackage.cray r19, @defpackage.dzsi defpackage.amut r20) {
        /*
            r18 = this;
            r0 = r19
            amuo r1 = r0.b
            r2 = 0
            if (r1 == 0) goto L47
            int r3 = r0.e
            r4 = -1
            if (r3 == r4) goto L47
            if (r20 != 0) goto L21
            java.util.List<amut> r3 = r1.D
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L21
            java.util.List<amut> r1 = r1.D
            r3 = 0
            java.lang.Object r1 = r1.get(r3)
            amut r1 = (defpackage.amut) r1
            r4 = r1
            goto L23
        L21:
            r4 = r20
        L23:
            if (r4 == 0) goto L47
            int r7 = r0.e
            amvw r1 = r0.n
            if (r1 != 0) goto L3b
            amub r1 = r0.a
            long r8 = r1.W
            r10 = 0
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 0
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            amvw r1 = defpackage.amvw.i(r8, r10, r12, r14, r16)
        L3b:
            r8 = r1
            amub r1 = r0.a
            long r5 = r1.W
            r3 = r18
            crfj r1 = r3.a(r4, r5, r7, r8)
            goto L48
        L47:
            r1 = r2
        L48:
            if (r1 != 0) goto L85
            amuo r0 = r0.b
            if (r0 != 0) goto L4f
            goto L84
        L4f:
            amut r0 = r0.a()
            if (r0 == 0) goto L84
            java.util.List r1 = r0.c()
            java.util.Iterator r1 = r1.iterator()
        L5d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L84
            java.lang.Object r3 = r1.next()
            amuw r3 = (defpackage.amuw) r3
            boolean r4 = r3.a()
            if (r4 == 0) goto L5d
            amul r1 = r3.b()
            if (r1 == 0) goto L84
            java.lang.String r2 = r1.a
            java.util.List<amsv> r3 = r1.b
            amsv r3 = defpackage.amsv.b(r3)
            dspd r1 = r1.c
            crfj r0 = defpackage.crfj.a(r0, r2, r3, r1)
            return r0
        L84:
            return r2
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crfe.j(cray, amut):crfj");
    }

    @dzsi
    public final crfj k(long j, amut amutVar, @dzsi amvw amvwVar, int i) {
        dbsi a;
        String str;
        boolean z;
        dspd dspdVar = null;
        if (amvwVar == null) {
            return null;
        }
        List<amuw> c = amutVar.c();
        int i2 = amutVar.a().l;
        Iterator<amuw> it = c.iterator();
        double d = 0.0d;
        amuw amuwVar = null;
        while (true) {
            if (!it.hasNext()) {
                a = dbsi.a(amuwVar, Double.valueOf(d));
                break;
            }
            amuw next = it.next();
            if (!amvwVar.a || !next.d) {
                double c2 = amvwVar.c(j, i2 - next.a, i2 - next.b);
                if (c2 >= 0.98d) {
                    a = dbsi.a(next, Double.valueOf(c2));
                    break;
                } else if (!next.d && c2 > d) {
                    d = c2;
                    amuwVar = next;
                }
            }
        }
        amuw amuwVar2 = (amuw) a.a;
        if (amuwVar2 == null) {
            return null;
        }
        amul b = amuwVar2.b();
        if (b != null) {
            String str2 = b.a;
            if (amuwVar2.a()) {
                crfc crfcVar = this.b;
                String replace = str2.replace("$IN_X_DISTANCE", crfc.a(crfcVar.b(crfcVar.b.b(this.e), true), i));
                str = replace;
                z = !str2.equals(replace);
            } else {
                str = str2;
                z = false;
            }
            crfg crfgVar = new crfg(str, amuwVar2, ((Double) a.b).doubleValue(), amvwVar);
            amsv b2 = amsv.b(b.b);
            if (!z) {
                dspdVar = b.c;
            }
            crfj a2 = crfj.a(amutVar, str, b2, dspdVar);
            a2.h = crfgVar;
            return a2;
        }
        bvoo.h("StepGuidanceWithDistance.SpokenText was null, this should never happen", new Object[0]);
        return null;
    }
}
