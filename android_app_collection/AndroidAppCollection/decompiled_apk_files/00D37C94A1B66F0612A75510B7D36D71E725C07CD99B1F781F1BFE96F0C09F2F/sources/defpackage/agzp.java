package defpackage;

import android.content.SharedPreferences;
import com.google.android.libraries.youtube.offline.transfer.service.OfflineTransferService;
/* compiled from: PG */
/* renamed from: agzp  reason: default package */
/* loaded from: classes.dex */
public final class agzp implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ OfflineTransferService a;

    public agzp(OfflineTransferService offlineTransferService) {
        this.a = offlineTransferService;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals(agks.WIFI_POLICY_STRING) || str.equals(agks.DOWNLOAD_NETWORK_PREFERENCE)) {
            this.a.q();
        }
    }
}
