package defpackage;
/* compiled from: PG */
/* renamed from: vuk  reason: default package */
/* loaded from: classes7.dex */
public class vuk {
    public float a;
    public float b;
    public float c;

    public final void a(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public float b(float f) {
        float f2 = this.a;
        float f3 = this.b;
        return (f2 * (f - f3)) / (this.c - f3);
    }
}
