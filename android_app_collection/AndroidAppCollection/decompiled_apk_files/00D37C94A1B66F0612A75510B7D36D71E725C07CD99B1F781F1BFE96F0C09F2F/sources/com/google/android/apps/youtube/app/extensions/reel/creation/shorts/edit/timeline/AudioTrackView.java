package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ui.MusicWaveformView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AudioTrackView extends hbw implements hga {
    public gzf a;
    public hkl b;
    public gyq c;
    public final TextView d;
    public final ImageView e;
    MusicWaveformView f;
    public long g;
    public long h;
    private final int i;
    private final LinearLayout j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final float o;
    private int p;
    private long q;
    private long r;
    private ampq s;

    public AudioTrackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final int i(long j) {
        return (int) (((((float) j) / ((float) this.a.b())) * this.p) + this.i);
    }

    public final void c(long j, long j2, ampq ampqVar) {
        this.r = j2;
        this.s = ampqVar;
        MusicWaveformView musicWaveformView = this.f;
        musicWaveformView.d(0.0f, 0.0f, musicWaveformView.getWidth());
        int height = this.f.getHeight();
        float f = this.o;
        MusicWaveformView musicWaveformView2 = this.f;
        int i = this.n;
        hhd hhdVar = musicWaveformView2.a;
        hhdVar.g = i;
        hhdVar.f = (int) (height - f);
        long j3 = this.h;
        musicWaveformView2.b(j3, j3, this);
        if (ampqVar == null || !ampqVar.h()) {
            this.f.a(j2);
        } else {
            this.f.c(j2, (byte[]) ampqVar.c(), amuk.q());
        }
        this.q = j;
        this.f.e(j);
    }

    @Override // defpackage.hga
    public final void lW() {
    }

    @Override // defpackage.hga
    public final void lX() {
    }

    @Override // defpackage.hga
    public final boolean lY(long j) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int i5 = this.i;
        this.p = (width - i5) - i5;
        this.j.layout(i(0L), getPaddingTop(), i(this.h), getHeight() - getPaddingBottom());
        ImageView imageView = this.e;
        int i6 = this.k;
        int i7 = this.m + i6;
        imageView.layout(i6, i6, i7, i7);
        int height = this.j.getHeight();
        int lineHeight = this.d.getLineHeight();
        int i8 = this.k;
        int i9 = ((((height / 2) - lineHeight) - i8) / 2) + i8;
        this.d.layout(this.e.getRight() + this.k, i9, this.j.getWidth() - this.k, this.d.getLineHeight() + i9);
        int height2 = this.j.getHeight();
        int i10 = this.l;
        int height3 = (this.j.getHeight() / 2) - this.l;
        this.f.layout(0, (this.j.getHeight() / 2) + this.l, this.j.getWidth(), (height2 / 2) + i10 + height3 + height3);
        c(this.q, this.r, this.s);
        gyq gyqVar = this.c;
        if (gyqVar != null) {
            gyo a = gyqVar.a(actj.SHORTS_CREATION_EDITOR_TIMELINE_EDITOR_AUDIO_TRACK);
            a.h(true);
            a.a();
        }
    }

    public AudioTrackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = 0;
        this.g = this.b.b();
        this.h = this.b.b();
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        this.j = linearLayout;
        addView(linearLayout);
        linearLayout.setBackgroundColor(resources.getColor(R.color.timeline_audio_track_default_color));
        linearLayout.setBackground(resources.getDrawable(R.drawable.audio_track_shape));
        linearLayout.setClipToOutline(true);
        linearLayout.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        linearLayout.addView(imageView);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setMinLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setIncludeFontPadding(false);
        linearLayout.addView(textView);
        MusicWaveformView musicWaveformView = new MusicWaveformView(context);
        this.f = musicWaveformView;
        linearLayout.addView(musicWaveformView);
        this.f.setEnabled(false);
        this.f.h = this;
        this.i = akf.a(context, R.drawable.ic_timeline_track_left_handle).getIntrinsicWidth();
        this.k = (int) getResources().getDimension(R.dimen.audio_track_container_padding);
        this.l = (int) getResources().getDimension(R.dimen.audio_track_waveform_padding);
        this.m = (int) getResources().getDimension(R.dimen.audio_track_thumbnail_size);
        this.o = context.getResources().getDimension(R.dimen.camera_music_waveform_stroke_width);
        this.n = (int) context.getResources().getDimension(R.dimen.audio_track_background_radius);
    }
}
