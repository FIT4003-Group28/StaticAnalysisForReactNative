package defpackage;
/* compiled from: PG */
/* renamed from: agqr  reason: default package */
/* loaded from: classes.dex */
public final class agqr implements agqi {
    private final int a;
    private final int b;

    public agqr(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.agqi
    public final int b() {
        return this.b;
    }

    @Override // defpackage.agqi
    public final boolean e() {
        return this.a == 0;
    }
}
