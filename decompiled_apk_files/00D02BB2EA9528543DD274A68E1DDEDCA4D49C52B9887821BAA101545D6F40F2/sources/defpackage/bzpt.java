package defpackage;

import android.app.Activity;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: bzpt  reason: default package */
/* loaded from: classes4.dex */
public final class bzpt implements awnl {
    public final awnn a;
    public transient ania b;
    @dzsi
    private final transient awnl c;

    public bzpt(awnl awnlVar) {
        this.c = awnlVar;
        awnn a = awnlVar.a();
        this.a = a == null ? awnn.UNKNOWN : a;
    }

    @Override // defpackage.awnl
    public final awnn a() {
        return this.a;
    }

    @Override // defpackage.awnl
    public final void b(Activity activity, int i, Intent intent) {
        ((bzpd) btsq.c(bzpd.class, activity)).xF(this);
        if (i == -1) {
            this.b.c(true, 2);
            i = -1;
        }
        this.c.b(activity, i, intent);
    }
}
