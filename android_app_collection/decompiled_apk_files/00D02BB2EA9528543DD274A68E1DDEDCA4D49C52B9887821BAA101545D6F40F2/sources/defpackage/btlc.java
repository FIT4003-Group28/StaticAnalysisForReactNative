package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.settings.preference.NotificationSettingsSwitchPreference;
/* compiled from: PG */
/* renamed from: btlc  reason: default package */
/* loaded from: classes4.dex */
public final class btlc {
    private final dzsj<auhi> a;

    public btlc(dzsj<auhi> dzsjVar) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final NotificationSettingsSwitchPreference a(Context context, aujb aujbVar) {
        auhi a = this.a.a();
        b(a, 1);
        b(context, 2);
        b(aujbVar, 3);
        return new NotificationSettingsSwitchPreference(a, context, aujbVar);
    }
}
