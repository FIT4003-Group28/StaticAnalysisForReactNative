package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ealt  reason: default package */
/* loaded from: classes6.dex */
public final class ealt implements eamd {
    final /* synthetic */ ealy a;

    public ealt(ealy ealyVar) {
        this.a = ealyVar;
    }

    @Override // defpackage.eamd
    public final void a() {
        if (this.a.d.f.compareAndSet(1, 4)) {
            ealy ealyVar = this.a;
            eamm eammVar = ealyVar.a;
            eamc eamcVar = ealyVar.d;
            eammVar.onResponseStarted(eamcVar, eamcVar.n);
        }
    }
}
