package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
/* compiled from: PG */
/* renamed from: aiop  reason: default package */
/* loaded from: classes.dex */
public final class aiop implements aiou {
    public final Activity a;
    public final aion b;
    protected String c;
    protected String d;
    protected auag e;
    public AlertDialog f;

    public aiop(Activity activity, aion aionVar) {
        this.a = activity;
        this.b = aionVar;
    }

    @Override // defpackage.aiou
    public final Activity a() {
        return this.a;
    }

    @Override // defpackage.aiou
    public final void b() {
        AlertDialog alertDialog;
        if (!this.a.isFinishing() && !this.a.isDestroyed() && (alertDialog = this.f) != null && alertDialog.isShowing()) {
            this.f.cancel();
        }
        this.f = null;
    }
}
