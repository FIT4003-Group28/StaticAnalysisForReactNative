package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: auve  reason: default package */
/* loaded from: classes.dex */
public final class auve extends auje {
    private static final auix c = new auix(bvjk.jV, R.string.YOUR_FEEDBACK_NOTIFICATION_SETTINGS_TITLE, R.string.YOUR_FEEDBACK_NOTIFICATION_SETTINGS_SUMMARY, R.string.YOUR_FEEDBACK_NOTIFICATION_OPT_OUT_SETTINGS_SUMMARY, aufs.ENABLED, dtyg.m);
    private static final auix d = new auix(bvjk.jV, R.string.YOUR_FEEDBACK_NOTIFICATION_SETTINGS_TITLE, R.string.YOUR_FEEDBACK_NOTIFICATION_SETTINGS_SUMMARY, R.string.YOUR_FEEDBACK_NOTIFICATION_OPT_OUT_SETTINGS_SUMMARY, aufs.INBOX_ONLY, dtyg.m);
    private final dxio<btwr> e;

    public auve(dxio<btwr> dxioVar) {
        super(aujd.d(dpyv.IN_APP_SURVEY.dm).a());
        this.e = dxioVar;
    }

    @Override // defpackage.aujb
    @dzsi
    public final auix b() {
        int a = dkmc.a(this.e.a().a().getInAppSurveyNotificationParameters().b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        return i != 1 ? i != 2 ? super.b() : c : d;
    }

    @Override // defpackage.aujb
    public final boolean f() {
        return true;
    }

    @Override // defpackage.auje
    @dzsi
    public final dkhd y(btvo btvoVar) {
        dkhd dkhdVar = btvoVar.getInAppSurveyNotificationParameters().a;
        return dkhdVar == null ? dkhd.h : dkhdVar;
    }
}
