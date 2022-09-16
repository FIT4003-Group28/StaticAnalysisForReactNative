package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.libraries.video.preview.VideoWithPreviewView;
import com.google.android.libraries.video.trim.VideoTrimView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioCrossFadeView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioTrackView;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.libraries.youtube.edit.preview.EditableVideoControllerView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: zxb  reason: default package */
/* loaded from: classes4.dex */
public final class zxb extends zwy implements View.OnClickListener, ViewTreeObserver.OnScrollChangedListener, vqm, vug, zxg, zua {
    public ScrollView a;
    private ImageButton ae;
    private EditableVideoControllerView af;
    private VideoTrimView ag;
    private AudioTrackView ah;
    private ImageButton ai;
    private AudioCrossFadeView aj;
    private ChooseFilterView ak;
    private View al;
    private View am;
    private int an = -1;
    private float b;
    private View c;
    private VideoWithPreviewView d;
    private ImageButton e;

    private final void o() {
        View view = this.O;
        if (view == null) {
            return;
        }
        view.postDelayed(new zxa(this), 0L);
    }

    @Override // defpackage.zwy, defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        this.b = activity.getResources().getDimension(R.dimen.upload_edit_video_fragment_scroll_play_threshold);
    }

    @Override // defpackage.zwx
    protected final View aG() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zwx
    public final View aI() {
        return this.ae;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zwx
    public final View aJ() {
        return this.am;
    }

    @Override // defpackage.zwx
    protected final View aM() {
        return this.al;
    }

    @Override // defpackage.zwx
    protected final VideoWithPreviewView aP() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zwx
    public final VideoTrimView aQ() {
        return this.ag;
    }

    @Override // defpackage.zwx
    protected final AudioCrossFadeView aR() {
        return this.aj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zwx
    public final AudioTrackView aS() {
        return this.ah;
    }

    @Override // defpackage.zwx
    protected final ChooseFilterView aT() {
        return this.ak;
    }

    @Override // defpackage.zwx
    protected final EditableVideoControllerView aU() {
        return this.af;
    }

    @Override // defpackage.zwx
    protected final void bE(boolean z, boolean z2, int i, int i2, int i3) {
        AudioCrossFadeView audioCrossFadeView = this.aj;
        int i4 = 8;
        if (z && !z2) {
            i4 = 0;
        }
        audioCrossFadeView.setVisibility(i4);
        this.aj.setPadding(i, 0, i2 + i3, 0);
    }

    @Override // defpackage.zwx
    protected final void bF() {
        ImageButton imageButton = this.e;
        if (imageButton instanceof ImageButton) {
            imageButton.setImageResource(2131231338);
        }
    }

    @Override // defpackage.zwx
    protected final void bG(int i) {
        this.ah.setPadding(0, 0, i, 0);
    }

    @Override // defpackage.zwx
    protected final void bc() {
        this.ak.setBackgroundColor(rh().getColor(R.color.upload_edit_choose_filter_view_background));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zwx
    public final void bh() {
        znr znrVar;
        ImageButton imageButton = this.ae;
        if (imageButton instanceof ImageButton) {
            int i = 2131231448;
            if (this.ak.c().q() && (znrVar = this.aT) != null && znrVar.a(avxv.EFFECTS_FEATURE_DOT_ON_FILTER_ICON)) {
                i = 2131231449;
            }
            imageButton.setImageResource(i);
        }
    }

    @Override // defpackage.zwx
    protected final boolean bn() {
        return false;
    }

    @Override // defpackage.zwx
    protected final ImageButton bq() {
        return this.ai;
    }

    @Override // defpackage.zwx
    protected final void bu(Throwable th) {
        String valueOf = String.valueOf(zxq.d(th));
        afus.c(2, 6, valueOf.length() != 0 ? "youtubeUploadExoPlayerPreview::".concat(valueOf) : new String("youtubeUploadExoPlayerPreview::"), th);
    }

    @Override // defpackage.zua
    public final void g() {
        this.ae.sendAccessibilityEvent(8);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.upload_edit_video_fragment, viewGroup, false);
        inflate.setWillNotDraw(false);
        inflate.setBackgroundColor(-16777216);
        View findViewById = inflate.findViewById(R.id.video_view_container);
        this.c = findViewById;
        findViewById.setOnClickListener(this);
        VideoWithPreviewView videoWithPreviewView = (VideoWithPreviewView) inflate.findViewById(R.id.video_view);
        this.d = videoWithPreviewView;
        videoWithPreviewView.setOnClickListener(this);
        this.al = inflate.findViewById(R.id.video_loading_indicator);
        this.am = inflate.findViewById(R.id.effect_pending_indicator);
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.audio_swap_button);
        this.e = imageButton;
        imageButton.setOnClickListener(this);
        ImageButton imageButton2 = (ImageButton) inflate.findViewById(R.id.choose_filter_button);
        this.ae = imageButton2;
        imageButton2.setOnClickListener(this);
        this.af = (EditableVideoControllerView) inflate.findViewById(R.id.editable_video_controller);
        VideoTrimView videoTrimView = (VideoTrimView) inflate.findViewById(R.id.video_trim);
        this.ag = videoTrimView;
        videoTrimView.j = new vqi(rb(), inflate);
        vqi vqiVar = videoTrimView.j;
        if (vqiVar != null) {
            vqiVar.d = videoTrimView.a;
        }
        this.ah = (AudioTrackView) inflate.findViewById(R.id.audio_track);
        ImageButton imageButton3 = (ImageButton) inflate.findViewById(R.id.audio_mixer_button);
        this.ai = imageButton3;
        imageButton3.setOnClickListener(this);
        this.aj = (AudioCrossFadeView) inflate.findViewById(R.id.audio_cross_fade);
        ChooseFilterView chooseFilterView = (ChooseFilterView) inflate.findViewById(R.id.choose_filter_view);
        this.ak = chooseFilterView;
        zgd.t(chooseFilterView.c, zgd.j(80), LinearLayout.LayoutParams.class);
        this.ak.j(this);
        return inflate;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        vtr vtrVar;
        ScrollView scrollView = this.a;
        if (scrollView == null) {
            return;
        }
        int scrollY = scrollView.getScrollY();
        if (scrollY != this.an) {
            this.an = scrollY;
            if (scrollY == 0) {
                o();
                scrollY = 0;
            }
        }
        if (Math.abs(scrollY - this.d.getTop()) <= this.b || (vtrVar = this.aI.f) == null) {
            return;
        }
        vtrVar.l(false);
    }

    @Override // defpackage.zwx
    protected final int q() {
        return R.fraction.upload_edit_video_fragment_max_video_height;
    }

    @Override // defpackage.zwx, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != this.c && view != this.d) {
            super.onClick(view);
            return;
        }
        ScrollView scrollView = this.a;
        if (scrollView == null) {
            return;
        }
        int scrollY = scrollView.getScrollY();
        if (scrollY != this.d.getTop()) {
            ScrollView scrollView2 = this.a;
            scrollView2.smoothScrollTo(scrollView2.getScrollX(), this.d.getTop());
            o();
        }
        if (Math.abs(scrollY - this.d.getTop()) >= this.b) {
            return;
        }
        this.af.p();
    }
}
