package defpackage;
/* compiled from: PG */
/* renamed from: bmbc  reason: default package */
/* loaded from: classes3.dex */
final class bmbc implements dbsl<dglo> {
    @Override // defpackage.dbsl
    public final /* bridge */ /* synthetic */ boolean a(dglo dgloVar) {
        dglo dgloVar2 = dgloVar;
        int i = dgloVar2.a;
        if ((i & 2) == 0 || (i & 4) == 0) {
            return false;
        }
        dglu dgluVar = dgloVar2.d;
        if (dgluVar == null) {
            dgluVar = dglu.e;
        }
        int a = dglw.a(dgluVar.d);
        if (a == 0 || a != 2) {
            return false;
        }
        dglu dgluVar2 = dgloVar2.d;
        if (dgluVar2 == null) {
            dgluVar2 = dglu.e;
        }
        if (((dgluVar2.b == 3 ? (dgkw) dgluVar2.c : dgkw.f).a & 2) == 0 || (dgloVar2.a & 16) == 0) {
            return false;
        }
        dglg dglgVar = dgloVar2.f;
        if (dglgVar == null) {
            dglgVar = dglg.c;
        }
        return dglgVar.a == 1;
    }
}
