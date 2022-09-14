package defpackage;
/* compiled from: PG */
/* renamed from: blpb  reason: default package */
/* loaded from: classes3.dex */
final class blpb implements akey {
    final /* synthetic */ blvw a;
    final /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;
    final /* synthetic */ akqi e;
    final /* synthetic */ blpk f;
    final /* synthetic */ blpf g;
    final /* synthetic */ int h;

    public blpb(blpf blpfVar, blvw blvwVar, boolean z, String str, boolean z2, akqi akqiVar, blpk blpkVar, int i) {
        this.g = blpfVar;
        this.a = blvwVar;
        this.b = z;
        this.c = str;
        this.d = z2;
        this.e = akqiVar;
        this.f = blpkVar;
        this.h = i;
    }

    @Override // defpackage.akey
    public final void a(boolean z) {
        this.g.q(this.a, this.b, this.c, this.d, this.e, true, this.f, this.h);
    }

    @Override // defpackage.akey
    public final void b() {
    }
}
