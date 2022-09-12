package defpackage;

import android.app.Activity;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: axtw  reason: default package */
/* loaded from: classes3.dex */
final class axtw implements awnl {
    private final axuc a;

    public axtw(axuc axucVar) {
        this.a = axucVar;
    }

    @Override // defpackage.awnl
    public final awnn a() {
        return awnn.ALIAS_SETTING_ENABLE_SEARCH_HISTORY;
    }

    @Override // defpackage.awnl
    public final void b(Activity activity, int i, Intent intent) {
        axub a = this.a.a(activity);
        if (a != null) {
            if (i == -1) {
                a.a(null);
            } else {
                a.b();
            }
        }
    }
}
