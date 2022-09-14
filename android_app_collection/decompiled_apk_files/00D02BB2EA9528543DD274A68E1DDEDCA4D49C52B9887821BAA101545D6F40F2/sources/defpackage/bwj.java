package defpackage;
/* compiled from: PG */
/* renamed from: bwj  reason: default package */
/* loaded from: classes.dex */
final class bwj {
    private final byd a;
    private volatile bye b;

    public bwj(byd bydVar) {
        this.a = bydVar;
    }

    public final bye a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = this.a.a();
                }
                if (this.b == null) {
                    this.b = new byf();
                }
            }
        }
        return this.b;
    }
}
