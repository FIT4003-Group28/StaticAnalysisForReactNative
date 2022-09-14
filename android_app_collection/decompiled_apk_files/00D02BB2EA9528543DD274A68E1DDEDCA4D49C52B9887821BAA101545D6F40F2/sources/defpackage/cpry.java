package defpackage;
/* compiled from: PG */
/* renamed from: cpry  reason: default package */
/* loaded from: classes5.dex */
public final class cpry<D> extends cprt<D> implements cppl {
    public float e;
    public float f;
    public float g;
    public float h;
    private float i;
    private float j;

    public cpry(D d, CharSequence charSequence) {
        super(d, charSequence);
    }

    public final void a(float f) {
        this.i = this.e;
        this.j = f;
    }

    public final void b(float f) {
        this.i = f;
        this.e = f;
    }

    public final void c(float f) {
        this.f = this.g;
        this.h = f;
    }

    @Override // defpackage.cppl
    public final void setAnimationPercent(float f) {
        this.e = cpqk.e(this.i, this.j, f);
        this.g = cpqk.e(this.f, this.h, f);
    }
}
