package defpackage;
/* compiled from: PG */
/* renamed from: brli  reason: default package */
/* loaded from: classes4.dex */
public final class brli<T> extends btrh<T> {
    public brli(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        brlh brlhVar = (brlh) this.a;
        crhp crhpVar = (crhp) obj;
        int i = brlhVar.v;
        if (crhpVar.d()) {
            brlhVar.v = 3;
            if (crhpVar.e().g) {
                brlhVar.p = true;
            } else if (brlhVar.p) {
                brlhVar.p = false;
                brlhVar.l(crhpVar);
                return;
            }
        } else {
            brlhVar.v = crhpVar.f() ? 4 : 2;
            brlhVar.p = false;
        }
        if (i != brlhVar.v || brlhVar.o + brlh.a < brlhVar.h.e()) {
            brlhVar.l(crhpVar);
        }
    }
}
