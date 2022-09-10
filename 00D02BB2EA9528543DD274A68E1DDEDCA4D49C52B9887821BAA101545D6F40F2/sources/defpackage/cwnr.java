package defpackage;

import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$ApiNotConnectedException;
/* renamed from: cwnr  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cwnr implements defg {
    static final defg a = new cwnr();

    private cwnr() {
    }

    @Override // defpackage.defg
    public final dehn a(Object obj) {
        cnob cnobVar = (cnob) obj;
        int i = cwnw.a;
        if (cnobVar.a() == 17) {
            return deha.b(new MdiNotAvailableException$ApiNotConnectedException());
        }
        return deha.b(cnobVar);
    }
}
