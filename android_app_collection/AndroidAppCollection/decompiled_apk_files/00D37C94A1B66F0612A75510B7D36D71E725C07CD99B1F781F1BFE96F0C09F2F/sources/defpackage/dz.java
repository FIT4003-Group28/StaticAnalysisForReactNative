package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
/* compiled from: PG */
/* renamed from: dz  reason: default package */
/* loaded from: classes3.dex */
public class dz extends dw {
    public final Activity b;
    public final Context c;
    public final Handler d;
    final eo e = new eo();

    public dz(Activity activity, Context context, Handler handler) {
        this.b = activity;
        this.c = context;
        this.d = handler;
    }

    @Override // defpackage.dw
    public View a(int i) {
        throw null;
    }

    @Override // defpackage.dw
    public boolean b() {
        throw null;
    }

    public void c() {
    }

    public final void e(Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        akd.c(this.c, intent, bundle);
    }
}
