package defpackage;

import android.os.Message;
import android.view.View;
import android.view.ViewConfiguration;
/* compiled from: PG */
/* renamed from: itv  reason: default package */
/* loaded from: classes6.dex */
final class itv implements View.OnClickListener {
    final /* synthetic */ iub a;

    public itv(iub iubVar) {
        this.a = iubVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.c.removeCallbacksAndMessages(null);
        Message obtain = Message.obtain();
        obtain.obj = view;
        this.a.c.sendMessageDelayed(obtain, ViewConfiguration.getPressedStateDuration());
    }
}
