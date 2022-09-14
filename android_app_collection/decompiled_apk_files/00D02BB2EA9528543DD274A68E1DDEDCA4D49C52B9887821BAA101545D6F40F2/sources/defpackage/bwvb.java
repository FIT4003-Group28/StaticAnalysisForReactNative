package defpackage;
/* compiled from: PG */
/* renamed from: bwvb  reason: default package */
/* loaded from: classes4.dex */
final class bwvb implements Runnable {
    final /* synthetic */ dftb a;
    final /* synthetic */ bwvd b;

    public bwvb(bwvd bwvdVar, dftb dftbVar) {
        this.b = bwvdVar;
        this.a = dftbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            bwvd bwvdVar = this.b;
            if (!bwvdVar.a) {
                bwvdVar.b.e.e(this.a, bwvdVar);
                dhjw dhjwVar = this.b.b.i;
                dhjz dhjzVar = this.a.c;
                if (dhjzVar == null) {
                    dhjzVar = dhjz.e;
                }
                if (dhjwVar.c) {
                    dhjwVar.bF();
                    dhjwVar.c = false;
                }
                dhjx dhjxVar = (dhjx) dhjwVar.b;
                dhjx dhjxVar2 = dhjx.f;
                dhjzVar.getClass();
                dhjxVar.b = dhjzVar;
                dhjxVar.a |= 1;
                this.b.b.b.a();
            }
        }
    }
}
