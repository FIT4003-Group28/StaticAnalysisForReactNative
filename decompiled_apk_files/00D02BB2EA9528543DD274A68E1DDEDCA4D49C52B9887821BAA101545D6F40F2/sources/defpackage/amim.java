package defpackage;
/* compiled from: PG */
/* renamed from: amim  reason: default package */
/* loaded from: classes.dex */
final class amim {
    public final crzo<Boolean> a = new crzo<>(false);
    private boolean b;
    private boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a() {
        this.c = true;
        this.b = false;
        this.a.b(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean b(boolean z) {
        this.c = false;
        this.b = !z;
        this.a.b(Boolean.valueOf(d()));
        return d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c() {
        this.b = true;
        this.a.b(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean d() {
        boolean z;
        if (!this.b) {
            if (!this.c) {
                z = true;
            }
        }
        z = false;
        return z;
    }
}
