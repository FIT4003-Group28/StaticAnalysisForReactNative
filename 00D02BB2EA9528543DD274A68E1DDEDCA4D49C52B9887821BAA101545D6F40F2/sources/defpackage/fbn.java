package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fbn  reason: default package */
/* loaded from: classes6.dex */
final class fbn<T> implements dzsj<T> {
    final /* synthetic */ fbo a;
    private final int b;

    public fbn(fbo fboVar, int i) {
        this.a = fboVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [T, bvdu, bvds] */
    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                fbo fboVar = this.a;
                gga wk = fboVar.b.wk();
                Executor sU = fboVar.b.eW.a.sU();
                dxjg.e(sU);
                return (T) new cctx(wk, sU, fboVar.b.kr(), fboVar.b.aB());
            }
            fbo fboVar2 = this.a;
            Executor sU2 = fboVar2.b.eW.a.sU();
            dxjg.e(sU2);
            return (T) new ccrf(sU2, new cctt(fboVar2.b.wk()));
        }
        fbo fboVar3 = this.a;
        T t = (T) fboVar3.a;
        if (t != null) {
            return t;
        }
        dxio c = dxjc.c(fboVar3.b.eW.h());
        bvrb tn = fboVar3.b.eW.a.tn();
        dxjg.e(tn);
        ?? r1 = (T) new bvdu(new bvdt(c, tn));
        fboVar3.a = r1;
        return r1;
    }
}
