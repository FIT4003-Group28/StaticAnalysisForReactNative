package defpackage;

import android.content.DialogInterface;
import com.google.android.libraries.youtube.offline.ui.DownloadNetworkSelectionDialogPreference;
/* compiled from: PG */
/* renamed from: gzj  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gzj implements DialogInterface.OnClickListener {
    private final /* synthetic */ int m;
    public static final /* synthetic */ gzj l = new gzj(16);
    public static final /* synthetic */ gzj k = new gzj(15);
    public static final /* synthetic */ gzj j = new gzj(14);
    public static final /* synthetic */ gzj i = new gzj(13);
    public static final /* synthetic */ gzj h = new gzj(9);
    public static final /* synthetic */ gzj g = new gzj(7);
    public static final /* synthetic */ gzj f = new gzj(6);
    public static final /* synthetic */ gzj e = new gzj(5);
    public static final /* synthetic */ gzj d = new gzj(4);
    public static final /* synthetic */ gzj c = new gzj(2);
    public static final /* synthetic */ gzj b = new gzj(1);
    public static final /* synthetic */ gzj a = new gzj();

    private /* synthetic */ gzj() {
    }

    public /* synthetic */ gzj(int i2) {
        this.m = i2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        switch (this.m) {
            case 0:
                dialogInterface.dismiss();
                return;
            case 1:
                return;
            case 2:
                dialogInterface.dismiss();
                return;
            case 3:
                dialogInterface.dismiss();
                return;
            case 4:
                return;
            case 5:
                dialogInterface.dismiss();
                return;
            case 6:
                dialogInterface.dismiss();
                return;
            case 7:
                dialogInterface.dismiss();
                return;
            case 8:
                dialogInterface.cancel();
                return;
            case 9:
                dialogInterface.dismiss();
                return;
            case 10:
                dialogInterface.dismiss();
                return;
            case 11:
                dialogInterface.dismiss();
                return;
            case 12:
                dialogInterface.dismiss();
                return;
            case 13:
                dialogInterface.dismiss();
                return;
            case 14:
                int i3 = DownloadNetworkSelectionDialogPreference.f;
                dialogInterface.dismiss();
                return;
            case 15:
                dialogInterface.cancel();
                return;
            case 16:
            case 17:
                return;
            default:
                dialogInterface.cancel();
                return;
        }
    }
}
