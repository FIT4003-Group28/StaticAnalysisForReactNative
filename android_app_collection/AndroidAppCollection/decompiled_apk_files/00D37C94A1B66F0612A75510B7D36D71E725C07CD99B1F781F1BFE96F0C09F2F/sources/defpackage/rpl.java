package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rpl  reason: default package */
/* loaded from: classes4.dex */
public final class rpl implements rpr {
    final /* synthetic */ rpn a;

    public rpl(rpn rpnVar) {
        this.a = rpnVar;
    }

    @Override // defpackage.rpr
    public final void a(String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.a.aH().g(new rpk(this, str, bundle));
            return;
        }
        rlx rlxVar = this.a.i;
        if (rlxVar == null) {
            return;
        }
        rlxVar.aG().c.b("AppId not known when logging event", "_err");
    }
}
