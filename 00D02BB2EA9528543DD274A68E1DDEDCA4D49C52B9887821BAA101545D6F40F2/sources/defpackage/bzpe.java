package defpackage;

import android.accounts.Account;
import android.app.Activity;
/* compiled from: PG */
/* renamed from: bzpe  reason: default package */
/* loaded from: classes.dex */
public final class bzpe {
    private final Activity a;
    private final dxio<akfa> b;

    public bzpe(Activity activity, dxio<akfa> dxioVar) {
        this.a = activity;
        this.b = dxioVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbsg<cpdv> a() {
        Account m = this.b.a().m();
        return m == null ? dbpy.a : dbsg.i(cpdo.a(this.a, new cpdn(m)));
    }
}
