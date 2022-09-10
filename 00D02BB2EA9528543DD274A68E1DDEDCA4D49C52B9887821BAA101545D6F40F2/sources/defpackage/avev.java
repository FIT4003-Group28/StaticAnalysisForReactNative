package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: avev  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class avev implements defg {
    static final defg a = new avev();

    private avev() {
    }

    @Override // defpackage.defg
    public final dehn a(Object obj) {
        dlor dlorVar = (dlor) obj;
        int a2 = dloq.a(dlorVar.b);
        if (a2 == 0 || a2 != 2) {
            int a3 = dloq.a(dlorVar.b);
            if (a3 == 0) {
                a3 = 1;
            }
            throw new avlo(awmj.b(a3));
        }
        return deha.a(null);
    }
}
