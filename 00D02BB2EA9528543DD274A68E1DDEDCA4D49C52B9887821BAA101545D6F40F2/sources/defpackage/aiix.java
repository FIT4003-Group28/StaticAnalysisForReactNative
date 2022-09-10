package defpackage;
/* compiled from: PG */
/* renamed from: aiix  reason: default package */
/* loaded from: classes2.dex */
final class aiix implements Runnable {
    final /* synthetic */ ajjk a;
    final /* synthetic */ aiiy b;

    public aiix(aiiy aiiyVar, ajjk ajjkVar) {
        this.b = aiiyVar;
        this.a = ajjkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a != null) {
            long b = this.b.a.d.b() - aija.a;
            for (ajji ajjiVar : this.a.a) {
                dobx dobxVar = ajjiVar.c;
                if (dobxVar == null) {
                    dobxVar = dobx.d;
                }
                if ((dobxVar.a & 1) == 0 || (ajjiVar.a & 4) == 0) {
                    this.b.a.f = true;
                } else if (ajjiVar.d >= b) {
                    String str = ajjiVar.b;
                    dobx dobxVar2 = ajjiVar.c;
                    if (dobxVar2 == null) {
                        dobxVar2 = dobx.d;
                    }
                    this.b.a.d(str).n(dobxVar2.b, ajjiVar);
                } else {
                    this.b.a.f = true;
                }
            }
        }
        this.b.a.g.j(null);
    }
}
