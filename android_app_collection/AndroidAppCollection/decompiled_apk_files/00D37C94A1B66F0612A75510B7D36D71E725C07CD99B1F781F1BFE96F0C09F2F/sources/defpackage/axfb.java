package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: axfb  reason: default package */
/* loaded from: classes2.dex */
final class axfb extends FrameLayout {
    final /* synthetic */ axfc a;
    private Configuration b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axfb(axfc axfcVar, Context context) {
        super(context);
        this.a = axfcVar;
        this.b = new Configuration(context.getResources().getConfiguration());
    }

    private final void a(Configuration configuration) {
        int diff = configuration.diff(this.b);
        if ((diff & 4096) == 0 && (diff & 128) == 0) {
            return;
        }
        this.b = new Configuration(configuration);
        axfc axfcVar = this.a;
        axfcVar.c(axfcVar.p);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(this.a.a.getResources().getConfiguration());
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(configuration);
    }
}
