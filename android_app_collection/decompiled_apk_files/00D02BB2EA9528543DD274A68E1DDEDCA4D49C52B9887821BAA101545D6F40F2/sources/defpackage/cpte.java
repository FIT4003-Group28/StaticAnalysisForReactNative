package defpackage;
/* compiled from: PG */
/* renamed from: cpte  reason: default package */
/* loaded from: classes5.dex */
public final class cpte implements cppj {
    final /* synthetic */ float a;

    public cpte(float f) {
        this.a = f;
    }

    @Override // defpackage.cppj
    public final float a(float f) {
        return Math.min(this.a, f / 3.0f);
    }
}
