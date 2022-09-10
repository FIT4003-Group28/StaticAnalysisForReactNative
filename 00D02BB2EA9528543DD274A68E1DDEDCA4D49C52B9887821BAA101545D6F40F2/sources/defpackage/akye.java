package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akye  reason: default package */
/* loaded from: classes2.dex */
public final class akye extends akyc {
    final /* synthetic */ akrs a;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;

    public akye(akrs akrsVar, int i, int i2, int i3, int i4) {
        this.a = akrsVar;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    @Override // defpackage.akyc
    public final void a(akyb akybVar) {
        float f = this.a.d;
        akra akraVar = new akra();
        this.a.a(akraVar);
        akrs akrsVar = this.a;
        double max = Math.max(akrsVar.b / (akybVar.a() - (this.d + this.e)), akrsVar.c / (akybVar.b() - (this.f + this.g)));
        double B = akybVar.c().B() * 256.0f;
        Double.isNaN(max);
        Double.isNaN(B);
        float max2 = Math.max(-1.0f, 30.0f - ((float) (Math.log(max * B) / Math.log(2.0d))));
        int a = akybVar.a();
        int i = this.e;
        int i2 = this.d;
        int b = akybVar.b();
        int i3 = this.g;
        alae a2 = alae.a(((a - i) + i2) / 2, ((b - i3) + this.f) / 2, akybVar.a(), akybVar.b());
        alaa a3 = alad.a();
        a3.d(akraVar);
        a3.f = a2;
        a3.e = f;
        a3.c = max2;
        akybVar.d(a3.a(), this.b, this.c);
    }
}
