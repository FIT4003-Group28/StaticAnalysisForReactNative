package defpackage;

import java.io.IOException;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: bvzk  reason: default package */
/* loaded from: classes4.dex */
public final class bvzk extends bvwn<dmdz> {
    private final bvyk b;

    public bvzk(bvyk bvykVar) {
        super(dmdz.c);
        this.b = bvykVar;
    }

    @Override // defpackage.bvwn
    public final /* bridge */ /* synthetic */ void a(dmdz dmdzVar) {
        try {
            dspd dspdVar = dmdzVar.a;
            dsqa c = dsqa.c();
            dmni dmniVar = dmni.f;
            try {
                dspj s = dspdVar.s();
                dsqw dsqwVar = (dsqw) dmniVar.cu(4);
                try {
                    try {
                        dstc b = dsst.a.b(dsqwVar);
                        b.f(dsqwVar, dspk.n(s), c);
                        b.j(dsqwVar);
                        try {
                            s.b(0);
                            dsqw.cv(dsqwVar);
                            final dmni dmniVar2 = (dmni) dsqwVar;
                            final bvyk bvykVar = this.b;
                            bvrj.UI_THREAD.c();
                            dehn d = deha.d(new Callable(bvykVar, dmniVar2) { // from class: bvyh
                                private final bvyk a;
                                private final dmni b;

                                {
                                    this.a = bvykVar;
                                    this.b = dmniVar2;
                                }

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    bvyk bvykVar2 = this.a;
                                    return alay.b(this.b, bvykVar2.a, new bvyj(bvykVar2), 2);
                                }
                            }, bvykVar.b);
                            bvykVar.a();
                            deig d2 = deig.d();
                            d2.p(deew.h(d, new bvyi(bvykVar, d2), bvykVar.c));
                            bvykVar.f = d2;
                        } catch (dsrm e) {
                            throw e;
                        }
                    } catch (RuntimeException e2) {
                        if (!(e2.getCause() instanceof dsrm)) {
                            throw e2;
                        }
                        throw ((dsrm) e2.getCause());
                    }
                } catch (IOException e3) {
                    if (!(e3.getCause() instanceof dsrm)) {
                        throw new dsrm(e3.getMessage());
                    }
                    throw ((dsrm) e3.getCause());
                }
            } catch (dsrm e4) {
                throw e4;
            }
        } catch (dsrm e5) {
            bvwi c2 = bvwj.c();
            c2.b(drtc.INVALID_ARGUMENT);
            bvwj a = c2.a();
            a.initCause(e5);
            throw a;
        }
    }
}
