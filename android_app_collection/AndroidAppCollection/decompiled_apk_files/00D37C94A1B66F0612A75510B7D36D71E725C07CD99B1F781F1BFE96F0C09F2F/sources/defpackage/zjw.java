package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: zjw  reason: default package */
/* loaded from: classes4.dex */
public final class zjw {
    public final ajnj a;
    public AlertDialog b;

    public zjw(Context context, ajmr ajmrVar, Track track, Runnable runnable, Runnable runnable2) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.audio_swap_track_change_dialog, (ViewGroup) null);
        ((YouTubeTextView) inflate.findViewById(R.id.audio_swap_track_title)).setText(track.a);
        ((YouTubeTextView) inflate.findViewById(R.id.audio_swap_track_artist)).setText(track.b);
        ((YouTubeTextView) inflate.findViewById(R.id.audio_swap_track_duration)).setText(vqw.f(context, track.c, false));
        if (track.f != null) {
            ((YouTubeTextView) inflate.findViewById(R.id.audio_swap_track_category_name)).setText(track.f);
        }
        ajnj ajnjVar = new ajnj(ajmrVar, (ImageView) inflate.findViewById(R.id.audio_swap_track_cover));
        this.a = ajnjVar;
        ajnjVar.n();
        avhn avhnVar = track.e;
        if (avhnVar == null) {
            ajnjVar.e(R.drawable.audio_swap_track_not_loaded);
        } else {
            ajnjVar.l(avhnVar, new zjv(this));
        }
        ajnjVar.i(ImageView.ScaleType.CENTER_CROP);
        this.b = new AlertDialog.Builder(context).setCancelable(true).setPositiveButton(R.string.upload_edit_audio_swap_dialog_change_track, new zjt(runnable)).setNegativeButton(R.string.upload_edit_audio_swap_dialog_remove_track, new zjt(runnable2, 1)).setView(inflate).create();
        inflate.findViewById(R.id.audio_swap_change_dialog_close_button).setOnClickListener(new zju(this));
    }
}
