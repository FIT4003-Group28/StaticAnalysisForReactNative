package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: nlf  reason: default package */
/* loaded from: classes7.dex */
public final class nlf<T> extends btrh<T> {
    private final int d;

    public nlf(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        crqd crqdVar = null;
        if (i == 0) {
            nld nldVar = (nld) this.a;
            crhp crhpVar = (crhp) obj;
            nle nleVar = nldVar.a;
            nleVar.j = nleVar.i;
            if (crhpVar.f()) {
                crqdVar = crhpVar.g();
            }
            nleVar.i = crqdVar;
            nle nleVar2 = nldVar.a;
            if (nleVar2.i == null && nleVar2.j == null) {
                return;
            }
            nleVar2.a();
        } else if (i != 1) {
            nld nldVar2 = (nld) this.a;
            GmmLocation a = ((amqo) obj).a();
            if (a == null) {
                return;
            }
            nle nleVar3 = nldVar2.a;
            nleVar3.f = a;
            dcdc<azva> dcdcVar = nleVar3.g;
            if (dcdcVar == null) {
                return;
            }
            dbsk.s(dcdcVar);
            nleVar3.h(dcdcVar);
            nldVar2.a.g = null;
        } else {
            nld nldVar3 = (nld) this.a;
            int i2 = nle.n;
            if (!((azre) obj).c()) {
                return;
            }
            nle nleVar4 = nldVar3.a;
            if (nleVar4.f == null) {
                nleVar4.g = nleVar4.b.n();
            } else {
                nleVar4.h(nleVar4.b.n());
            }
        }
    }
}
