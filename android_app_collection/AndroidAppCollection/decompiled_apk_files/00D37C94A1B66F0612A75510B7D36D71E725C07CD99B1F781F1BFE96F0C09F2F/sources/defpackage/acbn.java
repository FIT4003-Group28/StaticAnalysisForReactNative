package defpackage;
/* compiled from: PG */
/* renamed from: acbn  reason: default package */
/* loaded from: classes.dex */
final class acbn implements Runnable {
    final /* synthetic */ acbo a;

    public acbn(acbo acboVar) {
        this.a = acboVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acbo acboVar = this.a;
        acboVar.f(acboVar.b);
    }
}
