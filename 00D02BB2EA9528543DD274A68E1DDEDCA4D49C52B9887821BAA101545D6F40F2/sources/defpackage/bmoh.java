package defpackage;
/* compiled from: PG */
/* renamed from: bmoh  reason: default package */
/* loaded from: classes3.dex */
final class bmoh implements bmof {
    final /* synthetic */ cqkp a;
    final /* synthetic */ bmoi b;

    public bmoh(bmoi bmoiVar, cqkp cqkpVar) {
        this.b = bmoiVar;
        this.a = cqkpVar;
    }

    @Override // defpackage.bmof
    public final void a(Object obj) {
    }

    @Override // defpackage.bmof
    public final cqkl b(Object obj) {
        bmoi bmoiVar = this.b;
        if (!bmoiVar.a) {
            bmoiVar.a = ((bruv) this.a).c((ckgz) obj).booleanValue();
        }
        return cqkl.a;
    }
}
