package defpackage;

import android.app.Activity;
import android.view.View;
/* compiled from: PG */
/* renamed from: awtw  reason: default package */
/* loaded from: classes3.dex */
final class awtw implements View.OnClickListener {
    final /* synthetic */ Activity a;

    public awtw(Activity activity) {
        this.a = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jmw.d(this.a, null);
        this.a.onBackPressed();
    }
}
