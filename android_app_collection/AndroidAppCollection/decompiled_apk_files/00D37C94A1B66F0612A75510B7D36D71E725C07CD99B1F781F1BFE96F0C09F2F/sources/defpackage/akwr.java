package defpackage;
/* compiled from: PG */
/* renamed from: akwr  reason: default package */
/* loaded from: classes.dex */
public final class akwr implements azqb {
    private final yme a;
    private volatile avff b;

    public akwr(yme ymeVar) {
        this.a = ymeVar;
    }

    private final synchronized avff b() {
        if (this.b == null) {
            this.b = this.a.d();
        }
        return this.b;
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final avff get() {
        return this.b != null ? this.b : b();
    }
}
