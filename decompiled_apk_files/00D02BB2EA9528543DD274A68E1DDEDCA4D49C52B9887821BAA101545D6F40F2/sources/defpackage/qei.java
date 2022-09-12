package defpackage;

import com.google.android.apps.gmm.directions.appwidget.CreateDirectionsShortcutActivity;
/* compiled from: PG */
/* renamed from: qei  reason: default package */
/* loaded from: classes7.dex */
public final class qei implements Runnable {
    final /* synthetic */ CreateDirectionsShortcutActivity a;

    public qei(CreateDirectionsShortcutActivity createDirectionsShortcutActivity) {
        this.a = createDirectionsShortcutActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.u.a();
    }
}
