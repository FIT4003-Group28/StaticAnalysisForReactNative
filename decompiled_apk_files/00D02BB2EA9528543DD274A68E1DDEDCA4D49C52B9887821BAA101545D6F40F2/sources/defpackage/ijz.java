package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ijz  reason: default package */
/* loaded from: classes6.dex */
public final class ijz {
    public final iki a;
    public final ikt b;

    public ijz(iki ikiVar, ikt iktVar) {
        this.a = ikiVar;
        this.b = iktVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        float a;
        iki ikiVar = this.a;
        int i2 = ikiVar.f;
        int i3 = ikiVar.e;
        int i4 = i2 - i3;
        float abs = i4 == 0 ? 0.0f : Math.abs(decl.h(i, i3, i2) - this.a.e) / i4;
        if (bvox.a(this.a)) {
            a = this.b.b() - (this.b.c() * abs);
        } else {
            a = this.b.a() + (this.b.c() * abs);
        }
        return (int) a;
    }
}
