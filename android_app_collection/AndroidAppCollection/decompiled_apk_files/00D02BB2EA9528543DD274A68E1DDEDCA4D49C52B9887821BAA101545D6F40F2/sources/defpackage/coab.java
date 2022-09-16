package defpackage;
/* compiled from: PG */
/* renamed from: coab  reason: default package */
/* loaded from: classes5.dex */
final class coab implements Runnable {
    final /* synthetic */ coac a;

    public coab(coac coacVar) {
        this.a = coacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.e == null) {
            return;
        }
        coac coacVar = this.a;
        coad coadVar = coacVar.d;
        coadVar.b--;
        try {
            coacVar.e.f();
        } catch (Exception unused) {
        }
        this.a.e = null;
        this.a.d.e();
    }
}
