package defpackage;
/* compiled from: PG */
/* renamed from: crbs  reason: default package */
/* loaded from: classes5.dex */
public final class crbs<T> extends btrh<T> {
    private final int d;

    public crbs(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            ((crbr) this.a).l = ((crhp) obj).b();
            return;
        }
        crbr crbrVar = (crbr) this.a;
        brcp brcpVar = (brcp) obj;
        synchronized (crbrVar.i) {
            int a = daqo.a(brcpVar.a.c);
            if (a == 0) {
                a = 1;
            }
            crbrVar.g(a);
            if (crbrVar.l) {
                if (a == 3) {
                    crbrVar.g.n(crbrVar.h.g().d(cjtd.a(dtxs.r)), new cjte(deaf.INPUT_VOICE), cjtd.a(dtxs.r));
                } else if (a == 2) {
                    crbrVar.g.n(crbrVar.h.g().d(cjtd.a(dtxs.q)), new cjte(deaf.INPUT_VOICE), cjtd.a(dtxs.q));
                }
            }
        }
    }
}
