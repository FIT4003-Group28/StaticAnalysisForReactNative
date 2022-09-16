package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akyp  reason: default package */
/* loaded from: classes2.dex */
public final class akyp extends akyc {
    final /* synthetic */ akqs a;
    final /* synthetic */ float d;
    final /* synthetic */ float e;

    public akyp(akqs akqsVar, float f, float f2) {
        this.a = akqsVar;
        this.d = f;
        this.e = f2;
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
                akyt.q(akybVar, this.b, this.c, this.a, a, i, 100, 100, 150, 100, this.d, this.e);
            }
            z = true;
        }
        i = b;
        dbsk.m(z, "Map size should not be 0. Most likely, layout has not yet occurred for the map view.");
        akyt.q(akybVar, this.b, this.c, this.a, a, i, 100, 100, 150, 100, this.d, this.e);
    }
}
