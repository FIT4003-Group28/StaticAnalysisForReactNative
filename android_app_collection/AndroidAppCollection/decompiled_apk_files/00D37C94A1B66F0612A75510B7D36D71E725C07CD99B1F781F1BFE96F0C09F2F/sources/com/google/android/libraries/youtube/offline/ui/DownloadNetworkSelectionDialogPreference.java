package com.google.android.libraries.youtube.offline.ui;

import android.app.AlertDialog;
import android.content.Context;
import androidx.preference.Preference;
import com.google.android.libraries.youtube.offline.ui.DownloadNetworkSelectionDialogPreference;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DownloadNetworkSelectionDialogPreference extends Preference {
    public static final amuk a = amuk.t(awuy.UNMETERED_WIFI, awuy.UNMETERED_WIFI_OR_UNMETERED_MOBILE, awuy.ANY);
    public static final /* synthetic */ int f = 0;
    public final Context b;
    public final dt c;
    public final agvq d;
    public final String e;
    private final int g;

    public DownloadNetworkSelectionDialogPreference(Context context, dt dtVar, agvq agvqVar, int i) {
        super(context);
        this.b = context;
        this.c = dtVar;
        this.d = agvqVar;
        this.g = i;
        this.e = "https://support.google.com/youtube/answer/6308116";
        I(agks.DOWNLOAD_NETWORK_PREFERENCE);
        Z();
        L(R.string.download_network_preference_title);
        this.o = new bjg() { // from class: ahbo
            @Override // defpackage.bjg
            public final boolean b(Preference preference) {
                DownloadNetworkSelectionDialogPreference downloadNetworkSelectionDialogPreference = DownloadNetworkSelectionDialogPreference.this;
                new AlertDialog.Builder(downloadNetworkSelectionDialogPreference.b).setTitle(R.string.download_network_preference_title).setSingleChoiceItems(R.array.download_network_preference_entries, DownloadNetworkSelectionDialogPreference.a.indexOf(downloadNetworkSelectionDialogPreference.d.w()), new ahbn(downloadNetworkSelectionDialogPreference)).setNegativeButton(R.string.download_network_preference_learn_more, new ahbn(downloadNetworkSelectionDialogPreference, 1)).setPositiveButton(R.string.cancel, gzj.j).create().show();
                return true;
            }
        };
        J(i);
        n(context.getResources().getStringArray(R.array.download_network_preference_summaries)[a.indexOf(agvqVar.w())]);
    }
}
