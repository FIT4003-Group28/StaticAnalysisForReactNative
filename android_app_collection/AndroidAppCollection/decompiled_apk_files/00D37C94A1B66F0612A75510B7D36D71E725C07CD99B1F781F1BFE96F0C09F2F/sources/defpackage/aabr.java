package defpackage;
/* compiled from: PG */
/* renamed from: aabr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aabr implements ylv {
    public final /* synthetic */ aabt a;
    private final /* synthetic */ int b;

    public /* synthetic */ aabr(aabt aabtVar, int i) {
        this.b = i;
        this.a = aabtVar;
    }

    @Override // defpackage.zdt
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.b == 0) {
            b((Throwable) obj);
        } else {
            b((Throwable) obj);
        }
    }

    @Override // defpackage.ylv
    public final void b(Throwable th) {
        if (this.b == 0) {
            aabt aabtVar = this.a;
            zep.d("LogAttestationRequest failed with error.", th);
            aabtVar.b(7);
            return;
        }
        aabt aabtVar2 = this.a;
        zep.d("Request to get attestation challenge failed.", th);
        aabtVar2.b(2);
    }
}
