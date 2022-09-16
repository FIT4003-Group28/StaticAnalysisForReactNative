package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dek  reason: default package */
/* loaded from: classes3.dex */
public final class dek implements dfh {
    final /* synthetic */ den a;

    public dek(den denVar) {
        this.a = denVar;
    }

    @Override // defpackage.dfh
    public final void a(dfg dfgVar) {
        this.a.e.remove(dfgVar);
    }

    @Override // defpackage.dfh
    public final void b(dfg dfgVar) {
        this.a.e.remove(dfgVar);
    }

    @Override // defpackage.dfh
    public final void c(dfg dfgVar) {
        this.a.e.add(dfgVar);
    }

    @Override // defpackage.dfh
    public final boolean d(dfg dfgVar) {
        return true;
    }
}
