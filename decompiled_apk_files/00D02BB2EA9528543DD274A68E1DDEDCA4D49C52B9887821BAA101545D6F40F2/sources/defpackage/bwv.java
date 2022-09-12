package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: bwv  reason: default package */
/* loaded from: classes.dex */
public final class bwv<Z> implements bxd<Z> {
    public final boolean a;
    private final boolean b;
    private final bxd<Z> c;
    private final bwu d;
    private final btw e;
    private int f;
    private boolean g;

    public bwv(bxd<Z> bxdVar, boolean z, boolean z2, btw btwVar, bwu bwuVar) {
        cjn.b(bxdVar);
        this.c = bxdVar;
        this.a = z;
        this.b = true;
        this.e = btwVar;
        cjn.b(bwuVar);
        this.d = bwuVar;
    }

    @Override // defpackage.bxd
    public final Class<Z> a() {
        return this.c.a();
    }

    @Override // defpackage.bxd
    public final Z b() {
        return this.c.b();
    }

    @Override // defpackage.bxd
    public final int c() {
        return this.c.c();
    }

    @Override // defpackage.bxd
    public final synchronized void d() {
        if (this.f <= 0) {
            if (!this.g) {
                this.g = true;
                this.c.d();
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    public final synchronized void e() {
        if (!this.g) {
            this.f++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    public final void f() {
        int i;
        synchronized (this) {
            int i2 = this.f;
            if (i2 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            i = i2 - 1;
            this.f = i;
        }
        if (i == 0) {
            this.d.c(this.e, this);
        }
    }

    public final synchronized String toString() {
        StringBuilder sb;
        boolean z = this.a;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        int i = this.f;
        boolean z2 = this.g;
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        sb = new StringBuilder(length + R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle + length2 + String.valueOf(valueOf3).length());
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
