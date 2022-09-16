package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azdg  reason: default package */
/* loaded from: classes2.dex */
public final class azdg extends AtomicReference implements ayod {
    private static final long serialVersionUID = -3051469169682093892L;
    final azdh a;

    public azdg(azdh azdhVar) {
        this.a = azdhVar;
    }

    @Override // defpackage.ayod
    public final void b(Throwable th) {
        azdh azdhVar = this.a;
        if (azom.e(azdhVar.c, th)) {
            int i = azdhVar.k;
            azdhVar.f.qr();
            azdhVar.j = 0;
            azdhVar.f();
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.ayod
    public final void sh(Object obj) {
        azdh azdhVar = this.a;
        azdhVar.i = obj;
        azdhVar.j = 2;
        azdhVar.f();
    }

    @Override // defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.i(this, aypgVar);
    }

    @Override // defpackage.ayod
    public final void sm() {
        azdh azdhVar = this.a;
        azdhVar.j = 0;
        azdhVar.f();
    }
}
