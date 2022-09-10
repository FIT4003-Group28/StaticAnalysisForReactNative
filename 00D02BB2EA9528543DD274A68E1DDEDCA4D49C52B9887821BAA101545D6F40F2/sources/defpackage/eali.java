package defpackage;
/* compiled from: PG */
/* renamed from: eali  reason: default package */
/* loaded from: classes6.dex */
final class eali implements Runnable {
    final /* synthetic */ eamc a;

    public eali(eamc eamcVar) {
        this.a = eamcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eamc eamcVar = this.a;
        eamcVar.e.add(eamcVar.l);
        this.a.i();
    }
}
