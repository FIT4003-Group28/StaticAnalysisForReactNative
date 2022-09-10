package defpackage;
/* compiled from: PG */
/* renamed from: btse  reason: default package */
/* loaded from: classes4.dex */
public final class btse implements cpcf<Void> {
    final /* synthetic */ Runnable a;
    final /* synthetic */ btsf b;

    public btse(btsf btsfVar, Runnable runnable) {
        this.b = btsfVar;
        this.a = runnable;
    }

    @Override // defpackage.cpcf
    public final void a(cpcq<Void> cpcqVar) {
        this.b.d.a(cpcqVar);
        this.a.run();
    }
}
