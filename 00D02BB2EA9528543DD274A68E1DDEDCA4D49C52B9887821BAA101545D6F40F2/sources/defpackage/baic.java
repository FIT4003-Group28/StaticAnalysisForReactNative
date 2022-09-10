package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: baic  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class baic implements dbsl {
    static final dbsl a = new baic();

    private baic() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dgkw dgkwVar;
        dglo dgloVar = (dglo) obj;
        dbrl<baig> dbrlVar = baig.a;
        dglu dgluVar = dgloVar.d;
        if (dgluVar == null) {
            dgluVar = dglu.e;
        }
        int a2 = dglw.a(dgluVar.d);
        if (a2 != 0 && a2 == 2) {
            dglu dgluVar2 = dgloVar.d;
            if (dgluVar2 == null) {
                dgluVar2 = dglu.e;
            }
            if (dgluVar2.b == 3) {
                dgkwVar = (dgkw) dgluVar2.c;
            } else {
                dgkwVar = dgkw.f;
            }
            return dgkwVar.b;
        }
        return false;
    }
}
