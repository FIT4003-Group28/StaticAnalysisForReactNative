package defpackage;

import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.ProfileId;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cyas  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cyas implements dbrn {
    static final dbrn a = new cyas();

    private cyas() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cych cychVar = (cych) obj;
        dccx F = dcdc.F();
        cyey e = Email.e();
        e.f(cychVar.a);
        F.g(e.i());
        if (cychVar.c == cycg.SUCCESS_LOGGED_IN) {
            cygk d = ProfileId.d();
            d.e(cychVar.d);
            F.g(d.i());
        }
        return F.f();
    }
}
