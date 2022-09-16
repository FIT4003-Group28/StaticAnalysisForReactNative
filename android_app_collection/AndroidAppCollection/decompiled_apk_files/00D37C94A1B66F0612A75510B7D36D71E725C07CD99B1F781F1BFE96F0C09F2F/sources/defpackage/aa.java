package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aa  reason: default package */
/* loaded from: classes.dex */
public final class aa implements Runnable {
    final aps a;
    private final l b;
    private boolean c = false;

    public aa(l lVar, aps apsVar) {
        this.b = lVar;
        this.a = apsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.c) {
            this.b.d(this.a);
            this.c = true;
        }
    }
}
