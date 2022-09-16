package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aitq  reason: default package */
/* loaded from: classes.dex */
public final class aitq implements Runnable {
    final /* synthetic */ aits a;

    public aitq(aits aitsVar) {
        this.a = aitsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aits aitsVar = this.a;
        ylr.b();
        aaww a = aitsVar.a.a();
        a.k = aitsVar.b;
        a.b = aitsVar.d.c;
        a.k(aitsVar.e);
        a.t(aitsVar.f);
        a.c = aitsVar.h;
        try {
            arzf b = aitsVar.a.b(a);
            aitsVar.h++;
            if ((b.b & 2) == 0) {
                aitsVar.f(null, 7);
                return;
            }
            asaa asaaVar = b.d;
            if (asaaVar == null) {
                asaaVar = asaa.a;
            }
            if (aijr.i(asaaVar)) {
                aitsVar.e();
                return;
            }
            int cj = awwc.cj(asaaVar.c);
            if (cj == 0 || cj != 2) {
                aitsVar.d(new aikd(9, true, asaaVar.d), asaaVar, false);
            } else {
                aitsVar.f(null, 7);
            }
        } catch (aart e) {
            aitsVar.f(e, 8);
        }
    }
}
