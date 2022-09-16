package defpackage;

import android.app.Activity;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: nwv  reason: default package */
/* loaded from: classes7.dex */
public final class nwv implements awnl {
    @dzsi
    private final transient nxa a;

    public nwv(@dzsi nxa nxaVar) {
        this.a = nxaVar;
    }

    @Override // defpackage.awnl
    public final awnn a() {
        return awnn.ODELAY_ENABLE_SEARCH_HISTORY;
    }

    @Override // defpackage.awnl
    public final void b(Activity activity, int i, Intent intent) {
        nxa nxaVar;
        if (i != -1 || (nxaVar = this.a) == null) {
            return;
        }
        nxaVar.c();
    }
}
