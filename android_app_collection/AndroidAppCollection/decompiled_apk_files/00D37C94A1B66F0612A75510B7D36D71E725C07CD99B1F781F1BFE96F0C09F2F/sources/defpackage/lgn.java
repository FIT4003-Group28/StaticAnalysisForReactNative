package defpackage;

import com.google.android.apps.youtube.app.livechat.settings.LiveChatFragment;
import com.google.android.apps.youtube.app.settings.AboutPrefsFragment;
import com.google.android.apps.youtube.app.settings.AutoplayPrefsFragment;
import com.google.android.apps.youtube.app.settings.BillingsAndPaymentsPrefsFragment;
import com.google.android.apps.youtube.app.settings.GeneralPrefsFragment;
import com.google.android.apps.youtube.app.settings.NotificationPrefsFragment;
import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;
import com.google.android.apps.youtube.app.settings.PrivacyPrefsFragment;
import com.google.android.apps.youtube.app.settings.ThirdPartyPrefsFragment;
import com.google.android.apps.youtube.app.settings.datasaving.DataSavingPrefsFragment;
import com.google.android.apps.youtube.app.settings.videoquality.VideoQualityPrefsFragment;
import java.util.AbstractMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: lgn  reason: default package */
/* loaded from: classes3.dex */
public final class lgn {
    public static final Map a;

    static {
        amum h = amup.h();
        h.d(a(10009, AboutPrefsFragment.class));
        h.d(a(10014, OfflinePrefsFragment.class));
        h.d(a(10001, NotificationPrefsFragment.class));
        h.d(a(10029, PrivacyPrefsFragment.class));
        h.d(a(10034, LiveChatFragment.class));
        h.d(a(10048, BillingsAndPaymentsPrefsFragment.class));
        h.d(a(10050, GeneralPrefsFragment.class));
        h.d(a(10058, AutoplayPrefsFragment.class));
        h.d(a(10039, ThirdPartyPrefsFragment.class));
        h.d(a(10100, VideoQualityPrefsFragment.class));
        h.d(a(10113, DataSavingPrefsFragment.class));
        a = h.b();
    }

    private static Map.Entry a(int i, Class cls) {
        return new AbstractMap.SimpleImmutableEntry(String.valueOf(i - 1), cls.getName());
    }
}
