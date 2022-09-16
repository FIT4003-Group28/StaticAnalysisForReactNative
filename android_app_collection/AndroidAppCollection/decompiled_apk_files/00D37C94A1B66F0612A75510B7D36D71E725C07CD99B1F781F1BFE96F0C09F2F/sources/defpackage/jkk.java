package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jkk  reason: default package */
/* loaded from: classes3.dex */
public final class jkk {
    public final OfflineArrowView a;
    private final Resources b;

    public jkk(OfflineArrowView offlineArrowView, View.OnClickListener onClickListener) {
        this.a = offlineArrowView;
        this.b = offlineArrowView.getResources();
        offlineArrowView.setOnClickListener(onClickListener);
    }

    public final void a() {
        this.a.setVisibility(8);
    }

    public final void b() {
        this.a.setVisibility(0);
        this.a.setEnabled(true);
    }

    public final void c(int i) {
        this.a.setContentDescription(this.b.getString(i));
    }

    public final void d() {
        b();
        this.a.e();
        this.a.k();
    }

    public final void e() {
        b();
        this.a.e();
        OfflineArrowView offlineArrowView = this.a;
        offlineArrowView.a(zhn.f(offlineArrowView.getContext(), R.attr.ytIconDisabled));
    }
}
