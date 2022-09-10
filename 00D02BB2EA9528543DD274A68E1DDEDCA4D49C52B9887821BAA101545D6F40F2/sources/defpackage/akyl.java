package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akyl  reason: default package */
/* loaded from: classes2.dex */
public final class akyl extends akyc {
    final /* synthetic */ akqs a;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;

    public akyl(akqs akqsVar, int i, int i2, int i3, int i4) {
        this.a = akqsVar;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    @Override // defpackage.akyc
    public final void a(akyb akybVar) {
        int i;
        int a = akybVar.a();
        int b = akybVar.b();
        boolean z = false;
        if (a != 0) {
            if (b == 0) {
                i = 0;
                dbsk.m(z, "Map size should not be 0. Most likely, layout has not yet occurred for the map view.");
                akyt.p(akybVar, this.b, this.c, this.a, a, i, this.d, this.e, this.f, this.g);
            }
            z = true;
        }
        i = b;
        dbsk.m(z, "Map size should not be 0. Most likely, layout has not yet occurred for the map view.");
        akyt.p(akybVar, this.b, this.c, this.a, a, i, this.d, this.e, this.f, this.g);
    }
}
