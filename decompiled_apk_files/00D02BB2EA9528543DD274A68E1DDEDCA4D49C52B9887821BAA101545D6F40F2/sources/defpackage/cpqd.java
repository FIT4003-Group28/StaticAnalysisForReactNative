package defpackage;
/* compiled from: PG */
/* renamed from: cpqd  reason: default package */
/* loaded from: classes5.dex */
public final class cpqd implements cppx {
    private final float a;

    public cpqd(float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        cpwl.c(z, "Margin percentage must be between 0.0 and 1.0");
        this.a = f;
    }

    @Override // defpackage.cppx
    public final int a(int i) {
        return (int) (i * this.a);
    }
}
