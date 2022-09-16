package defpackage;

import com.google.android.libraries.youtube.mdx.smartremote.DpadView;
/* compiled from: PG */
/* renamed from: adru  reason: default package */
/* loaded from: classes.dex */
public final class adru implements Runnable {
    final /* synthetic */ DpadView a;

    public adru(DpadView dpadView) {
        this.a = dpadView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DpadView dpadView = this.a;
        if (dpadView.a != null) {
            dpadView.performClick();
            DpadView dpadView2 = this.a;
            dpadView2.c.postDelayed(dpadView2.d, 250L);
        }
    }
}
