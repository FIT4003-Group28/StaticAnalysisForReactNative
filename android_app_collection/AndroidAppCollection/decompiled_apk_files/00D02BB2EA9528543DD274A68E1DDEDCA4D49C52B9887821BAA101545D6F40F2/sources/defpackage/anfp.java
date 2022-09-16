package defpackage;

import android.app.Activity;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: anfp  reason: default package */
/* loaded from: classes2.dex */
final class anfp implements awnl {
    private final aoge a;

    public anfp(aoge aogeVar) {
        this.a = aogeVar;
    }

    @Override // defpackage.awnl
    public final awnn a() {
        return awnn.UDC_CONSENT;
    }

    @Override // defpackage.awnl
    public final void b(Activity activity, int i, Intent intent) {
        if (i == -1) {
            anft.j(activity, this.a);
        }
    }
}
