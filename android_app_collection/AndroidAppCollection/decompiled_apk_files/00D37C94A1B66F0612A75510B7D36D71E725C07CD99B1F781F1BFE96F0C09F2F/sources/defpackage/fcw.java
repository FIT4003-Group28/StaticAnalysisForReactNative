package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.google.android.libraries.backup.Backup;
import com.google.android.libraries.youtube.common.annotation.SubstringBackup;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: fcw  reason: default package */
/* loaded from: classes3.dex */
public final class fcw {
    @Backup
    public static final String OFFLINE_BUTTON_POOR_CONNECTIVITY_TOOLTIP_DISABLED = "offline_button_poor_connectivity_tooltip_disabled";
    @Backup
    public static final String OFFLINE_FIRST_ADD_TOOLTIP = "offline_first_add_tooltip";
    @Backup
    public static final String OFFLINE_LAST_CLIENT_VIDEO_PLAYBACK_POSITION_SYNC_TIME_MILLIS = "offline_last_client_video_playback_position_sync_time_millis";
    @Backup
    public static final String OFFLINE_LAST_SCHEDULED_AD_HOC_REFRESH_TIME_MILLIS = "offline_last_scheduled_ad_hoc_refresh_time_millis";
    @SubstringBackup
    public static final String OFFLINE_LAST_SCHEDULED_AD_HOC_REFRESH_TIME_MILLIS_FORMAT = "offline_last_scheduled_ad_hoc_refresh_time_millis_%d";
    @Backup
    public static final String OFFLINE_STREAM_SELECTION_DIALOG_REMEMBER_SETTING_CHECKED = "offline_stream_selection_dialog_remember_setting_checked";

    private fcw() {
    }

    public static PlayerResponseModel a(airr airrVar) {
        if (airrVar.n() != null) {
            return airrVar.n().c();
        }
        return null;
    }

    public static attp b(airr airrVar) {
        PlayerResponseModel a = a(airrVar);
        if (a != null) {
            return aijr.e(a.t());
        }
        return null;
    }

    public static final boolean c(airr airrVar) {
        return airrVar.n() != null;
    }

    public static void d(ajqm ajqmVar, ajqm ajqmVar2, aacz aaczVar) {
        boolean z;
        if (ajqmVar instanceof ajsm) {
            apyy b = aaczVar.b();
            asxj asxjVar = b.e;
            if (asxjVar == null) {
                asxjVar = asxj.a;
            }
            if ((asxjVar.e & 8192) != 0) {
                asxj asxjVar2 = b.e;
                if (asxjVar2 == null) {
                    asxjVar2 = asxj.a;
                }
                z = asxjVar2.af;
            } else {
                z = true;
            }
            if (!((ync) ajqmVar).isEmpty() || ajqmVar2.isEmpty()) {
                return;
            }
            Object c = ajqmVar2.c(0);
            if ((c instanceof apke) || (c instanceof apsv) || (c instanceof aspe) || (c instanceof apvj) || (c instanceof avoe) || (c instanceof avny) || (c instanceof aqbw) || (c instanceof aqav) || (c instanceof argq) || (c instanceof aujm) || (c instanceof ndj) || (c instanceof aqwj) || (c instanceof auov) || (c instanceof auyc) || (c instanceof auyi) || (c instanceof argv) || (c instanceof atfa) || (c instanceof aqcd)) {
                return;
            }
            if (((c instanceof ajhh) && !z) || (c instanceof apvm) || eog.bo(c)) {
                return;
            }
            ((ajsm) ajqmVar).add(fju.b());
        }
    }

    public static void e(ajmy ajmyVar, avhm avhmVar, int i, int i2, teb tebVar, tda tdaVar, Executor executor) {
        try {
            executor.execute(new ajkz(ajmyVar, avhmVar, i, i2, 1));
        } catch (RejectedExecutionException e) {
            tebVar.a(28, "Image preload rejected", tdaVar, e);
        }
    }

    public static void f(Drawable drawable, int i) {
        ((TransitionDrawable) drawable).reverseTransition(i);
    }

    public static void g(Drawable drawable) {
        ((TransitionDrawable) drawable).startTransition(200);
    }

    public static final void h(FileInputStream fileInputStream, FileOutputStream fileOutputStream) {
        FileChannel fileChannel;
        FileChannel channel;
        FileChannel fileChannel2 = null;
        try {
            channel = fileInputStream.getChannel();
        } catch (Throwable th) {
            th = th;
            fileChannel = null;
        }
        try {
            fileChannel2 = fileOutputStream.getChannel();
            fileChannel2.transferFrom(channel, 0L, channel.size());
            if (channel != null) {
                channel.close();
            }
            if (fileChannel2 == null) {
                return;
            }
            fileChannel2.close();
        } catch (Throwable th2) {
            th = th2;
            FileChannel fileChannel3 = fileChannel2;
            fileChannel2 = channel;
            fileChannel = fileChannel3;
            if (fileChannel2 != null) {
                fileChannel2.close();
            }
            if (fileChannel != null) {
                fileChannel.close();
            }
            throw th;
        }
    }

    public static String i(Context context, long j, long j2) {
        return context.getResources().getString(R.string.accessibility_trim_progress_time, zgt.z(context.getResources(), j(j)), zgt.z(context.getResources(), j(j2)));
    }

    public static String j(long j) {
        return zgh.i(TimeUnit.MILLISECONDS.toSeconds(j));
    }

    public static int[] k() {
        return new int[]{1, 2, 3};
    }
}
