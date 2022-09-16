package defpackage;

import android.app.Activity;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: aosn  reason: default package */
/* loaded from: classes2.dex */
final class aosn implements awnl {
    @dzsi
    public final transient cjqp a;
    @dzsi
    public transient cjql b;
    @dzsi
    public transient cjql c;
    @dzsi
    private final transient cjqy d;
    @dzsi
    private final transient baje e;

    public aosn(cjqy cjqyVar, cjqp cjqpVar, baje bajeVar) {
        this.d = cjqyVar;
        this.a = cjqpVar;
        this.e = bajeVar;
    }

    @Override // defpackage.awnl
    public final awnn a() {
        return awnn.UDC_CONSENT;
    }

    @Override // defpackage.awnl
    public final void b(Activity activity, int i, Intent intent) {
        cjql cjqlVar;
        if (i == -1) {
            this.e.a();
            i = -1;
        }
        cjqy cjqyVar = this.d;
        cjql cjqlVar2 = this.b;
        if (cjqlVar2 == null || (cjqlVar = this.c) == null) {
            return;
        }
        if (i == -1) {
            cjqyVar.j(cjqlVar2, cjtd.a(dtyc.ao));
        } else if (i != 0) {
        } else {
            cjqyVar.j(cjqlVar, cjtd.a(dtyc.an));
        }
    }
}
