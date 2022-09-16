package defpackage;

import android.app.Activity;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: aohz  reason: default package */
/* loaded from: classes2.dex */
final class aohz implements awnl {
    @dzsi
    public transient aohf a;

    private static void c(ddho ddhoVar) {
        ((cjqz) btsr.a(cjqz.class)).tr().i(cjtd.a(ddhoVar));
    }

    @Override // defpackage.awnl
    public final awnn a() {
        return awnn.UDC_CONSENT;
    }

    @Override // defpackage.awnl
    public final void b(Activity activity, int i, Intent intent) {
        if (i == -1) {
            c(dtyi.bs);
        } else if (i == 0) {
            c(dtyi.br);
        }
        aohf aohfVar = this.a;
        if (aohfVar != null) {
            aohfVar.a();
        }
    }
}
