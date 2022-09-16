package defpackage;
/* compiled from: PG */
/* renamed from: cko  reason: default package */
/* loaded from: classes2.dex */
public final class cko implements cku {
    public final boolean a;
    public final cku b;
    private final boolean c;
    private final chy d;
    private int e;
    private boolean f;
    private final cki g;

    public cko(cku ckuVar, boolean z, boolean z2, chy chyVar, cki ckiVar) {
        hy.N(ckuVar);
        this.b = ckuVar;
        this.a = z;
        this.c = z2;
        this.d = chyVar;
        hy.N(ckiVar);
        this.g = ckiVar;
    }

    @Override // defpackage.cku
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.cku
    public final Class b() {
        return this.b.b();
    }

    @Override // defpackage.cku
    public final Object c() {
        return this.b.c();
    }

    public final synchronized void d() {
        if (!this.f) {
            this.e++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    @Override // defpackage.cku
    public final synchronized void e() {
        if (this.e <= 0) {
            if (!this.f) {
                this.f = true;
                if (!this.c) {
                    return;
                }
                this.b.e();
                return;
            }
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
    }

    public final void f() {
        int i;
        synchronized (this) {
            int i2 = this.e;
            if (i2 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            i = i2 - 1;
            this.e = i;
        }
        if (i == 0) {
            this.g.c(this.d, this);
        }
    }

    public final synchronized String toString() {
        StringBuilder sb;
        boolean z = this.a;
        String valueOf = String.valueOf(this.g);
        String valueOf2 = String.valueOf(this.d);
        int i = this.e;
        boolean z2 = this.f;
        String valueOf3 = String.valueOf(this.b);
        int length = String.valueOf(valueOf).length();
        sb = new StringBuilder(length + 107 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("EngineResource{isMemoryCacheable=");
        sb.append(z);
        sb.append(", listener=");
        sb.append(valueOf);
        sb.append(", key=");
        sb.append(valueOf2);
        sb.append(", acquired=");
        sb.append(i);
        sb.append(", isRecycled=");
        sb.append(z2);
        sb.append(", resource=");
        sb.append(valueOf3);
        sb.append('}');
        return sb.toString();
    }
}
