package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import com.google.android.youtube.R;
import java.util.Observable;
import java.util.Observer;
/* compiled from: PG */
/* renamed from: zkq  reason: default package */
/* loaded from: classes4.dex */
public class zkq extends RelativeLayout implements Observer, View.OnClickListener {
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public ajnj f;
    public zkp g;
    public Track h;
    private final View i;
    private final ImageView j;
    private final View k;
    private final View l;
    private final zjy m;

    /* JADX INFO: Access modifiers changed from: protected */
    public zkq(Context context, zjy zjyVar, ajmr ajmrVar, int i) {
        super(context);
        this.m = zjyVar;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) this, true);
        inflate.setWillNotDraw(false);
        View findViewById = inflate.findViewById(R.id.audio_swap_track_preview);
        this.i = findViewById;
        this.j = (ImageView) inflate.findViewById(R.id.audio_swap_track_play_button);
        this.b = (TextView) inflate.findViewById(R.id.audio_swap_track_title);
        this.c = (TextView) inflate.findViewById(R.id.audio_swap_track_artist);
        this.d = (TextView) inflate.findViewById(R.id.audio_swap_track_duration);
        this.e = (TextView) inflate.findViewById(R.id.audio_swap_track_category_name);
        View findViewById2 = inflate.findViewById(R.id.audio_swap_track_track_info);
        this.l = findViewById2;
        View findViewById3 = inflate.findViewById(R.id.audio_swap_track_add_button);
        this.k = findViewById3;
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        findViewById3.setOnClickListener(this);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.audio_swap_track_cover);
        this.a = imageView;
        if (imageView != null) {
            this.f = new ajnj(ajmrVar, imageView);
            this.g = new zkp(this);
        }
    }

    public final void a() {
        this.j.setBackgroundResource(true != this.m.b(this.h) ? R.drawable.audio_swap_play_button : R.drawable.audio_swap_stop_button);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m.addObserver(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m.deleteObserver(this);
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (observable == this.m) {
            a();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        acti actiVar;
        if (view == this.i || view == this.l) {
            if (this.m.b(this.h)) {
                this.m.a(true);
                return;
            }
            zjy zjyVar = this.m;
            Track track = this.h;
            track.getClass();
            if (!zjyVar.c(track) || (actiVar = zjyVar.a) == null || ((acsx) actiVar).i == null) {
                return;
            }
            actiVar.H(3, new acte(actj.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_TRACK_START_PREVIEW_BUTTON), null);
        } else if (view != this.k || this.h == null) {
        } else {
            ((zko) getContext()).i(this.h);
        }
    }
}
