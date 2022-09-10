package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pvj  reason: default package */
/* loaded from: classes7.dex */
public final class pvj implements Runnable {
    final /* synthetic */ pvk a;

    public pvj(pvk pvkVar) {
        this.a = pvkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pvk pvkVar = this.a;
        if (!pvkVar.s || !pvkVar.c.s()) {
            return;
        }
        this.a.y();
        this.a.x();
    }
}
