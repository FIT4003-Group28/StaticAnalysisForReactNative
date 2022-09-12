package defpackage;
/* compiled from: PG */
/* renamed from: aqxw  reason: default package */
/* loaded from: classes.dex */
public final class aqxw {
    @dzsi
    Runnable a = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a() {
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
            this.a = null;
        }
    }
}
