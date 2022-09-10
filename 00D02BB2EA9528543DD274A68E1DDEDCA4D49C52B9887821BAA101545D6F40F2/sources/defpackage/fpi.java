package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fpi  reason: default package */
/* loaded from: classes6.dex */
public final class fpi<T> implements dzsj<T> {
    final /* synthetic */ fpj a;
    private final int b;

    public fpi(fpj fpjVar, int i) {
        this.a = fpjVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return (T) dbsg.i(this.a.a.bn());
            }
            if (i == 2) {
                return (T) dbsg.i(this.a.a.eW.qC());
            }
            if (i == 3) {
                return (T) this.a.b();
            }
            fpj fpjVar = this.a;
            akox ap = fpjVar.a.ap();
            ftt fttVar = fpjVar.a;
            rb rbVar = fttVar.a;
            Executor sU = fttVar.eW.a.sU();
            dxjg.e(sU);
            return (T) new bynx(ap, rbVar, sU);
        }
        return (T) dbsg.i(this.a.a.wc());
    }
}
