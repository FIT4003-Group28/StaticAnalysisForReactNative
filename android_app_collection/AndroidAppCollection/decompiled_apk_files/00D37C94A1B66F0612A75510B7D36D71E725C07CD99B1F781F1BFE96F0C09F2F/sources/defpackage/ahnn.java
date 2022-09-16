package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahnn  reason: default package */
/* loaded from: classes.dex */
public final class ahnn implements ahng {
    float a = 0.0f;
    final /* synthetic */ ahno b;

    public ahnn(ahno ahnoVar) {
        this.b = ahnoVar;
    }

    @Override // defpackage.ahng
    public final void a(float f, float f2) {
        float f3 = f2 / 2.0f;
        this.b.b.n(0.0f, f3 - this.a, 0.0f);
        this.b.a.n(0.0f, f3 - this.a, 0.0f);
        this.a = f3;
    }
}
