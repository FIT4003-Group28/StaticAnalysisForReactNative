package defpackage;

import android.view.View;
import com.google.android.apps.gmm.directions.appwidget.CreateDirectionsShortcutActivity;
/* compiled from: PG */
/* renamed from: qem  reason: default package */
/* loaded from: classes7.dex */
public final class qem implements View.OnClickListener {
    final /* synthetic */ CreateDirectionsShortcutActivity a;

    public qem(CreateDirectionsShortcutActivity createDirectionsShortcutActivity) {
        this.a = createDirectionsShortcutActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CreateDirectionsShortcutActivity createDirectionsShortcutActivity = this.a;
        if (createDirectionsShortcutActivity.r == null) {
            createDirectionsShortcutActivity.r = new qes();
        }
        gz b = this.a.g().b();
        b.C(16908290, this.a.r, "WIDGET_DESTINATION_PICKER_FRAGMENT");
        b.z("ACTIVITY");
        b.f();
        this.a.g().aq();
    }
}
