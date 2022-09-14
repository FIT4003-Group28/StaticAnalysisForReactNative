package defpackage;

import android.app.Activity;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: bjgx  reason: default package */
/* loaded from: classes3.dex */
final class bjgx implements awnl {
    private final bjgt a;
    private final String b;

    public bjgx(bjgt bjgtVar, String str) {
        this.a = bjgtVar;
        this.b = str;
    }

    @Override // defpackage.awnl
    public final awnn a() {
        return awnn.REPORT_ABUSE;
    }

    @Override // defpackage.awnl
    public final void b(Activity activity, int i, Intent intent) {
        if (i == -1 && intent != null && intent.getBooleanExtra("report_submitted", false)) {
            bjgt bjgtVar = this.a;
            bjgtVar.a.add(this.b);
        }
    }
}
