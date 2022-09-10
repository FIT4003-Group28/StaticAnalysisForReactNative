package defpackage;
/* compiled from: PG */
/* renamed from: ealj  reason: default package */
/* loaded from: classes6.dex */
final class ealj implements Runnable {
    final /* synthetic */ eamc a;

    public ealj(eamc eamcVar) {
        this.a = eamcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eamc eamcVar = this.a;
        eamcVar.l = eamcVar.o;
        eamcVar.o = null;
        eamcVar.i();
    }
}
