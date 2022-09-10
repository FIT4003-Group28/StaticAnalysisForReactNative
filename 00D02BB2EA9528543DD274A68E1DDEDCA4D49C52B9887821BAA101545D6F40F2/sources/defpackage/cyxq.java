package defpackage;

import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.SessionContext;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cyxq  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cyxq implements cygr {
    static final cygr a = new cyxq();

    private cyxq() {
    }

    @Override // defpackage.cygr
    public final cyff a(final cyff cyffVar, SessionContext sessionContext) {
        if (cyxu.a(cyffVar, sessionContext) == null) {
            return null;
        }
        if (!dyaq.e() || !dcft.m(sessionContext.b(), new dbsl(cyffVar) { // from class: cyxm
            private final cyff a;

            {
                this.a = cyffVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return ((ContactMethodField) obj).k().equals(this.a.k());
            }
        }).a()) {
            return cyffVar;
        }
        ((cyft) cyffVar).b().m = true;
        return cyffVar;
    }
}
