package defpackage;
/* compiled from: PG */
/* renamed from: cjv  reason: default package */
/* loaded from: classes2.dex */
final class cjv {
    private boolean a;
    private boolean b;
    private boolean c;

    private final boolean e() {
        return (this.c || this.b) && this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a() {
        this.b = false;
        this.a = false;
        this.c = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean b() {
        this.b = true;
        return e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean c() {
        this.c = true;
        return e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean d() {
        this.a = true;
        return e();
    }
}
