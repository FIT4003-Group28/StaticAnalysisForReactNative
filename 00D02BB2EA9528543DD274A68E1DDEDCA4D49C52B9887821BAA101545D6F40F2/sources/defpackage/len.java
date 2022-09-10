package defpackage;
/* compiled from: PG */
/* renamed from: len  reason: default package */
/* loaded from: classes7.dex */
final class len implements Runnable {
    final /* synthetic */ les a;

    public len(les lesVar) {
        this.a = lesVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        les lesVar = this.a;
        if (!lesVar.s.a) {
            return;
        }
        lesVar.v();
    }
}
