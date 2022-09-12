package defpackage;
/* compiled from: PG */
/* renamed from: asii  reason: default package */
/* loaded from: classes.dex */
public final class asii<T> extends btrh<T> {
    private final int d;

    public asii(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            asif asifVar = (asif) this.a;
            awnt awntVar = (awnt) obj;
            if (asifVar.a.i != asig.WAIT_FOR_OOB_COMPLETE) {
                return;
            }
            asifVar.a.i = asig.WAIT_FOR_PREREQUISITE_DIALOGS;
            asih asihVar = asifVar.a;
            if (!asihVar.g) {
                return;
            }
            asihVar.m();
        } else if (i != 1) {
            final asif asifVar2 = (asif) this.a;
            asin asinVar = (asin) obj;
            asifVar2.a.d.b(new Runnable(asifVar2) { // from class: asie
                private final asif a;

                {
                    this.a = asifVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    asif asifVar3 = this.a;
                    asifVar3.a.c.a();
                    asih asihVar2 = asifVar3.a;
                    if (asihVar2.f && asihVar2.k()) {
                        asih asihVar3 = asifVar3.a;
                        if (asihVar3.g) {
                            asihVar3.r();
                        } else {
                            asihVar3.s();
                        }
                    }
                }
            }, bvrj.UI_THREAD);
        } else {
            asif asifVar3 = (asif) this.a;
            asih asihVar2 = asifVar3.a;
            asihVar2.h = (crhp) obj;
            if (!asihVar2.f || !asihVar2.g) {
                return;
            }
            asihVar2.l();
            asifVar3.a.q();
        }
    }
}
