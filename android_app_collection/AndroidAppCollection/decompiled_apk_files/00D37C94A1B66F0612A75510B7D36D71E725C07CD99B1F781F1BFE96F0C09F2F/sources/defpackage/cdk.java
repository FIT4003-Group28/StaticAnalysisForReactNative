package defpackage;
/* compiled from: PG */
/* renamed from: cdk  reason: default package */
/* loaded from: classes2.dex */
public final class cdk {
    public float a;
    public float b;

    public cdk() {
        this(1.0f, 1.0f);
    }

    public cdk(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        StringBuilder sb = new StringBuilder(31);
        sb.append(f);
        sb.append("x");
        sb.append(f2);
        return sb.toString();
    }
}
