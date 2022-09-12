package defpackage;
/* compiled from: PG */
/* renamed from: cscf  reason: default package */
/* loaded from: classes5.dex */
public class cscf {
    public float b;
    public float c;
    public float d;
    public boolean e;
    protected float f;
    protected float g;

    public cscf(float f) {
        g(f);
        this.e = true;
    }

    public void a(float f) {
        if (f != this.b) {
            this.b = f;
            this.e = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(float f, float f2) {
        float f3 = this.d + (f * f2);
        this.d = f3;
        this.c += f3 * f2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float c() {
        return this.b - this.c;
    }

    public final void e(float f) {
        this.c = f;
        this.b = f;
        this.d = 0.0f;
        this.e = true;
    }

    public final void f(long j) {
        if (!this.e) {
            b((this.f * c()) - (this.g * this.d), ((float) Math.min(j, 50L)) / 1000.0f);
            float abs = Math.abs(c());
            float abs2 = Math.abs(this.d);
            boolean z = false;
            if (abs < 0.001f && abs2 < 0.001f) {
                z = true;
            }
            this.e = z;
            if (!z) {
                return;
            }
            this.c = this.b;
            this.d = 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(float f) {
        this.f = f;
        this.g = (float) (Math.sqrt(f) * 1.7999999523162842d);
    }
}
