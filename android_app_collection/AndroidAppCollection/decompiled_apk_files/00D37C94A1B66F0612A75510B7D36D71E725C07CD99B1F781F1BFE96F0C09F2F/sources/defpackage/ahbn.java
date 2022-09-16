package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.youtube.offline.ui.DownloadNetworkSelectionDialogPreference;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahbn  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahbn implements DialogInterface.OnClickListener {
    public final /* synthetic */ DownloadNetworkSelectionDialogPreference a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahbn(DownloadNetworkSelectionDialogPreference downloadNetworkSelectionDialogPreference) {
        this.a = downloadNetworkSelectionDialogPreference;
    }

    public /* synthetic */ ahbn(DownloadNetworkSelectionDialogPreference downloadNetworkSelectionDialogPreference, int i) {
        this.b = i;
        this.a = downloadNetworkSelectionDialogPreference;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.b != 0) {
            DownloadNetworkSelectionDialogPreference downloadNetworkSelectionDialogPreference = this.a;
            if (downloadNetworkSelectionDialogPreference.c.isDestroyed()) {
                return;
            }
            downloadNetworkSelectionDialogPreference.c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(downloadNetworkSelectionDialogPreference.e)));
            return;
        }
        DownloadNetworkSelectionDialogPreference downloadNetworkSelectionDialogPreference2 = this.a;
        if (i < 0 || i >= ((amxx) DownloadNetworkSelectionDialogPreference.a).c) {
            return;
        }
        awuy awuyVar = (awuy) DownloadNetworkSelectionDialogPreference.a.get(i);
        downloadNetworkSelectionDialogPreference2.Q(awuyVar);
        ylx.n(downloadNetworkSelectionDialogPreference2.c, downloadNetworkSelectionDialogPreference2.d.t(awuyVar), aclb.l, ylx.b);
        downloadNetworkSelectionDialogPreference2.n(downloadNetworkSelectionDialogPreference2.b.getResources().getStringArray(R.array.download_network_preference_summaries)[i]);
        dialogInterface.dismiss();
    }
}
