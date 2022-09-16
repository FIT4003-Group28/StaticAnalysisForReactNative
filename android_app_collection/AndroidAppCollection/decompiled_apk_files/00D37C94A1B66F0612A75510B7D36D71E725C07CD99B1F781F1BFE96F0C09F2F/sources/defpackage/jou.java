package defpackage;

import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
/* compiled from: PG */
/* renamed from: jou  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jou implements ylv {
    private final /* synthetic */ int v;
    public static final /* synthetic */ jou u = new jou(20);
    public static final /* synthetic */ jou t = new jou(19);
    public static final /* synthetic */ jou s = new jou(18);
    public static final /* synthetic */ jou r = new jou(17);
    public static final /* synthetic */ jou q = new jou(16);
    public static final /* synthetic */ jou p = new jou(15);
    public static final /* synthetic */ jou o = new jou(14);
    public static final /* synthetic */ jou n = new jou(13);
    public static final /* synthetic */ jou m = new jou(12);
    public static final /* synthetic */ jou l = new jou(11);
    public static final /* synthetic */ jou k = new jou(10);
    public static final /* synthetic */ jou j = new jou(9);
    public static final /* synthetic */ jou i = new jou(8);
    public static final /* synthetic */ jou h = new jou(7);
    public static final /* synthetic */ jou g = new jou(6);
    public static final /* synthetic */ jou f = new jou(5);
    public static final /* synthetic */ jou e = new jou(4);
    public static final /* synthetic */ jou d = new jou(3);
    public static final /* synthetic */ jou c = new jou(2);
    public static final /* synthetic */ jou b = new jou(1);
    public static final /* synthetic */ jou a = new jou();

    private /* synthetic */ jou() {
    }

    private /* synthetic */ jou(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ylv
    public final void b(Throwable th) {
        switch (this.v) {
            case 0:
                zep.d("Failed to check if the video is an Error State using the DownloadStateChecker.", th);
                return;
            case 1:
                zep.d("Failed to update offline last client video playback position sync time millis.", th);
                return;
            case 2:
                zep.d("Failed to determine the display state of the video using the DownloadStateChecker.", th);
                return;
            case 3:
                zep.d("Failed to check if the video is an Error State using the CompositeDownloadStateChecker.", th);
                return;
            case 4:
                zep.d("Failed to determine the display state of the video using the CompositeDownloadStateChecker.", th);
                return;
            case 5:
                zep.d("Failed to get the PlaybackDataEntity and OfflineVideoPolicy from MainVideoEntity.", th);
                return;
            case 6:
                zep.d("Failed to get the PlaybackDataEntity and OfflineVideoPolicy from YtMainDownloadedVideoEntity.", th);
                return;
            case 7:
                jrx.b(th);
                return;
            case 8:
                zep.d("Failed to load autonav store.", th);
                return;
            case 9:
                zep.l("Error updating autonav setting.");
                return;
            case 10:
                zep.l("Error updating autonav toggle user edu triggers remaining.");
                return;
            case 11:
                zep.d("Failed to update WatchStorageSchema for DTTS Edu triggers.", th);
                return;
            case 12:
                zep.b("Error refreshing accessibility settings");
                return;
            case 13:
                zep.d("Failed to update number of player controls open trigger suggested action dismissals.", th);
                return;
            case 14:
                zep.d("Failed to update snap zoom EDU data to store.", th);
                return;
            case 15:
                zep.d("Error occurred getting HistoryPausedState", th);
                return;
            case 16:
                zep.d("Failed to store cross device offline device name.", th);
                return;
            case 17:
                zep.d("Failed to store cross device offline device state.", th);
                return;
            case 18:
                zep.n("Failed to load get_settings response", th);
                return;
            case 19:
                SettingsDataAccess.k(th);
                return;
            default:
                zep.d("Failed to persist video quality setting last written time", th);
                return;
        }
    }

    @Override // defpackage.zdt
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.v) {
            case 0:
                zep.d("Failed to check if the video is an Error State using the DownloadStateChecker.", (Throwable) obj);
                return;
            case 1:
                zep.d("Failed to update offline last client video playback position sync time millis.", (Throwable) obj);
                return;
            case 2:
                zep.d("Failed to determine the display state of the video using the DownloadStateChecker.", (Throwable) obj);
                return;
            case 3:
                zep.d("Failed to check if the video is an Error State using the CompositeDownloadStateChecker.", (Throwable) obj);
                return;
            case 4:
                zep.d("Failed to determine the display state of the video using the CompositeDownloadStateChecker.", (Throwable) obj);
                return;
            case 5:
                zep.d("Failed to get the PlaybackDataEntity and OfflineVideoPolicy from MainVideoEntity.", (Throwable) obj);
                return;
            case 6:
                zep.d("Failed to get the PlaybackDataEntity and OfflineVideoPolicy from YtMainDownloadedVideoEntity.", (Throwable) obj);
                return;
            case 7:
                jrx.b((Throwable) obj);
                return;
            case 8:
                zep.d("Failed to load autonav store.", (Throwable) obj);
                return;
            case 9:
                Throwable th = (Throwable) obj;
                zep.l("Error updating autonav setting.");
                return;
            case 10:
                Throwable th2 = (Throwable) obj;
                zep.l("Error updating autonav toggle user edu triggers remaining.");
                return;
            case 11:
                zep.d("Failed to update WatchStorageSchema for DTTS Edu triggers.", (Throwable) obj);
                return;
            case 12:
                Throwable th3 = (Throwable) obj;
                zep.b("Error refreshing accessibility settings");
                return;
            case 13:
                zep.d("Failed to update number of player controls open trigger suggested action dismissals.", (Throwable) obj);
                return;
            case 14:
                zep.d("Failed to update snap zoom EDU data to store.", (Throwable) obj);
                return;
            case 15:
                zep.d("Error occurred getting HistoryPausedState", (Throwable) obj);
                return;
            case 16:
                zep.d("Failed to store cross device offline device name.", (Throwable) obj);
                return;
            case 17:
                zep.d("Failed to store cross device offline device state.", (Throwable) obj);
                return;
            case 18:
                zep.n("Failed to load get_settings response", (Throwable) obj);
                return;
            case 19:
                SettingsDataAccess.k((Throwable) obj);
                return;
            default:
                zep.d("Failed to persist video quality setting last written time", (Throwable) obj);
                return;
        }
    }
}
