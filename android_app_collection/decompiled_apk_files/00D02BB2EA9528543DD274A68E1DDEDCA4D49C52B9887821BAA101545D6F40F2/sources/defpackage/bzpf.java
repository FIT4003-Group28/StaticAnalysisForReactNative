package defpackage;

import android.app.Activity;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: bzpf  reason: default package */
/* loaded from: classes4.dex */
final class bzpf implements awnl {
    public awnn a = awnn.UNKNOWN;
    @dzsi
    private final transient awnl b;
    private final int[] c;

    public bzpf(awnl awnlVar, int[] iArr) {
        this.b = awnlVar;
        this.c = iArr;
    }

    @Override // defpackage.awnl
    public final awnn a() {
        return this.a;
    }

    @Override // defpackage.awnl
    public final void b(Activity activity, int i, Intent intent) {
        if (i == -1) {
            if (decl.d(this.c, bzqb.WEB_AND_APP_ACTIVITY.d)) {
                ((anib) btsr.a(anib.class)).qq().c(true, 2);
            }
            i = -1;
        }
        awnl awnlVar = this.b;
        if (awnlVar != null) {
            awnlVar.b(activity, i, intent);
        }
    }
}
