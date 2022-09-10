package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aibm  reason: default package */
/* loaded from: classes2.dex */
public final class aibm implements degu<dhnt> {
    final /* synthetic */ dcdc a;
    final /* synthetic */ btlu b;
    final /* synthetic */ aibo c;

    public aibm(aibo aiboVar, dcdc dcdcVar, btlu btluVar) {
        this.c = aiboVar;
        this.a = dcdcVar;
        this.b = btluVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dhnt dhntVar) {
        dcdc dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            aibo aiboVar = this.c;
            aiboVar.h.a(new aihp(new eapd(aiboVar.i.b()), (dqzv) dcdcVar.get(i)), dbsg.i(this.b));
        }
    }
}
