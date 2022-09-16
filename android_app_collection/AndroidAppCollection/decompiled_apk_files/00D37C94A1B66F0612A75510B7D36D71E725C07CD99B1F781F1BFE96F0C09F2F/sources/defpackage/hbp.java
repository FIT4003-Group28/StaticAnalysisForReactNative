package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.AudioTrackView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hbp  reason: default package */
/* loaded from: classes3.dex */
public final class hbp implements ajru, yyr {
    private final AudioTrackView a;
    private final ajnj b;

    public hbp(ajmy ajmyVar, ViewGroup viewGroup) {
        AudioTrackView audioTrackView = (AudioTrackView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.audio_track, viewGroup, false);
        this.a = audioTrackView;
        this.b = new ajnj(ajmyVar, audioTrackView.e);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.yyr
    public final void d(ImageView imageView) {
        afus.b(2, 6, "[ShortsCreation][Android][Edit]Failure while loading thumbnail.");
    }

    @Override // defpackage.yyr
    public final void e(ImageView imageView) {
    }

    @Override // defpackage.yyr
    public final void f(ImageView imageView) {
    }

    @Override // defpackage.yyr
    public final void g() {
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        ShortsCreationSelectedTrack shortsCreationSelectedTrack = ((hbr) obj).a;
        avhn h = shortsCreationSelectedTrack.h();
        if (h != null) {
            this.b.m(h, true, false, this);
        }
        String j = shortsCreationSelectedTrack.j();
        if (j != null) {
            this.a.d.setText(j);
        }
        if (shortsCreationSelectedTrack.d().h()) {
            long longValue = ((Long) shortsCreationSelectedTrack.d().c()).longValue();
            long min = Math.min(15000L, longValue);
            AudioTrackView audioTrackView = this.a;
            long b = audioTrackView.a.b();
            if (b > 0) {
                audioTrackView.g = b;
            }
            audioTrackView.h = Math.min(min, audioTrackView.g);
            this.a.c(shortsCreationSelectedTrack.a(), longValue, shortsCreationSelectedTrack.e());
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
