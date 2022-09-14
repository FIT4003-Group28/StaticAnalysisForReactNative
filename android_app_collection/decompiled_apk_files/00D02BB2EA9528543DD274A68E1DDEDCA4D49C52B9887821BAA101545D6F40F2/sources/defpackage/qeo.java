package defpackage;

import android.view.View;
import com.google.android.apps.gmm.directions.appwidget.CreateDirectionsShortcutActivity;
/* compiled from: PG */
/* renamed from: qeo  reason: default package */
/* loaded from: classes7.dex */
public final class qeo implements View.OnClickListener {
    final /* synthetic */ CreateDirectionsShortcutActivity a;

    public qeo(CreateDirectionsShortcutActivity createDirectionsShortcutActivity) {
        this.a = createDirectionsShortcutActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CreateDirectionsShortcutActivity createDirectionsShortcutActivity = this.a;
        cjql cjqlVar = createDirectionsShortcutActivity.G;
        if (cjqlVar != null) {
            createDirectionsShortcutActivity.y.n(cjqlVar, new cjte(deaf.TAP), cjtd.a(dtxn.dg));
        }
        this.a.finish();
    }
}
