package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jkb  reason: default package */
/* loaded from: classes3.dex */
public class jkb {
    public final Resources a;
    public final OfflineArrowView b;

    /* JADX INFO: Access modifiers changed from: protected */
    public jkb(OfflineArrowView offlineArrowView, View.OnClickListener onClickListener) {
        this.b = offlineArrowView;
        offlineArrowView.setOnClickListener(onClickListener);
        this.a = offlineArrowView.getResources();
    }

    public final void a() {
        this.b.setVisibility(0);
        this.b.setEnabled(true);
    }

    public final void b(boolean z) {
        this.b.setContentDescription(this.a.getString(true != z ? R.string.accessibility_offline_button_cannot_save : R.string.accessibility_offline_button_save));
    }

    public final void c() {
        a();
        OfflineArrowView offlineArrowView = this.b;
        offlineArrowView.b(offlineArrowView.m);
        this.b.k();
    }
}
