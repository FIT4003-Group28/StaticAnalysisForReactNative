package defpackage;
/* compiled from: PG */
/* renamed from: achg  reason: default package */
/* loaded from: classes.dex */
final class achg implements Runnable {
    final /* synthetic */ achh a;

    public achg(achh achhVar) {
        this.a = achhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        achh achhVar = this.a;
        if (!achhVar.f) {
            achhVar.g();
        }
    }
}
