package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tp  reason: default package */
/* loaded from: classes4.dex */
public final class tp implements ss {
    final /* synthetic */ tq a;

    public tp(tq tqVar) {
        this.a = tqVar;
    }

    @Override // defpackage.ss
    public final void a(sf sfVar, boolean z) {
        if (sfVar instanceof tb) {
            sfVar.a().i(false);
        }
        ss ssVar = this.a.e;
        if (ssVar != null) {
            ssVar.a(sfVar, z);
        }
    }

    @Override // defpackage.ss
    public final boolean b(sf sfVar) {
        tq tqVar = this.a;
        if (sfVar == tqVar.c) {
            return false;
        }
        si siVar = ((tb) sfVar).k;
        ss ssVar = tqVar.e;
        if (ssVar == null) {
            return false;
        }
        return ssVar.b(sfVar);
    }
}
