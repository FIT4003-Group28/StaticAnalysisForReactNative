package defpackage;
/* compiled from: PG */
/* renamed from: cur  reason: default package */
/* loaded from: classes5.dex */
public final class cur<T> extends btrh<T> {
    public cur(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        dbsg dbsgVar;
        djie djieVar;
        int i;
        cuo cuoVar = (cuo) this.a;
        alim alimVar = (alim) obj;
        dhjx dhjxVar = alimVar.b;
        cvg cvgVar = cuoVar.g.l;
        if (cvgVar == null) {
            cvgVar = cvg.f;
        }
        cvf cvfVar = cvgVar.e;
        if (cvfVar == null) {
            cvfVar = cvf.d;
        }
        int i2 = cvfVar.a;
        if ((i2 & 1) == 0 || (i2 & 2) == 0 || (i = cvfVar.b) < 0 || i > 100) {
            dbsgVar = dbpy.a;
        } else {
            akqs m = akyx.m(dhjxVar);
            double a = akqo.a(m);
            double b = akqo.b(m);
            double d = i;
            akqq c = m.c();
            Double.isNaN(d);
            Double.isNaN(d);
            dbsgVar = dbsg.i(new akqs(c, (a * d) / 100.0d, (b * d) / 100.0d));
        }
        dcdc<dnpo> dcdcVar = alimVar.f;
        int size = dcdcVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            dnpo dnpoVar = dcdcVar.get(i3);
            int a2 = dnpl.a(dnpoVar.h);
            if (a2 == 0) {
                a2 = 1;
            }
            if ((a2 == 1 || a2 == 2 || a2 == 4) && ctz.a(new dsrh(dnpoVar.d, dnpo.e)) && (djieVar = cuoVar.c.get(dnpoVar.b)) != null) {
                djja djjaVar = djieVar.d;
                if (djjaVar == null) {
                    djjaVar = djja.e;
                }
                dpum dpumVar = djjaVar.a;
                if (dpumVar == null) {
                    dpumVar = dpum.d;
                }
                akqq f = akqq.f(dpumVar);
                if (!dbsgVar.a() || ((akqs) dbsgVar.b()).b(f)) {
                    cuoVar.d(djieVar.b);
                    cuoVar.b(djieVar);
                }
            }
        }
    }
}
