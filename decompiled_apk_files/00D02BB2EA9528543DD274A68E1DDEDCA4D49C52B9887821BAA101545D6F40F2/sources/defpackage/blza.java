package defpackage;
/* compiled from: PG */
/* renamed from: blza  reason: default package */
/* loaded from: classes3.dex */
final class blza implements blwv {
    final /* synthetic */ blze a;

    public blza(blze blzeVar) {
        this.a = blzeVar;
    }

    @Override // defpackage.blwv
    public final void a() {
        this.a.f.p(3);
    }

    @Override // defpackage.blwv
    public final void b() {
        this.a.e = null;
    }

    @Override // defpackage.blwv
    public final void c(float f, float f2) {
        blze blzeVar = this.a;
        blzeVar.b = f;
        blzeVar.c = f2;
        blzeVar.f.p(1);
    }

    @Override // defpackage.blwv
    public final void d() {
        this.a.e = blzn.e();
        this.a.f.p(2);
    }

    @Override // defpackage.blwv
    public final void e() {
        blze blzeVar = this.a;
        blzeVar.b = 0.0f;
        blzeVar.c = 0.0f;
        if (blzeVar.d) {
            blzeVar.c();
        } else {
            blzeVar.b();
        }
    }
}
