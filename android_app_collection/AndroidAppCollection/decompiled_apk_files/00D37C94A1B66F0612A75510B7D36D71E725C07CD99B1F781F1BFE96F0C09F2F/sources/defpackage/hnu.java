package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelEditModel;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelItemEditModel;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.video.preview.VideoWithPreviewView;
import com.google.android.libraries.video.trim.VideoTrimView;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioCrossFadeView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioTrackView;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.libraries.youtube.edit.preview.EditableVideoControllerView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LightweightCameraEndpointOuterClass$LightweightCameraEndpoint;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: hnu  reason: default package */
/* loaded from: classes3.dex */
public final class hnu extends hlh implements hvx, hoj, hof, hnf, hov, hoo, hmr, hmp, hol, hnj, hpg, acth, hkt, hno, htp {
    public boolean a;
    private EditableVideoControllerView aX;
    private ContextThemeWrapper aY;
    private apzg aZ;
    public acti ae;
    public hnw af;
    public hok ag;
    public hoi ah;
    public hni ai;
    public hoy aj;
    public hms ak;
    public hmq al;
    public hom am;
    public hnk an;
    public hpi ao;
    public htu ap;
    public hwq aq;
    public axnm ar;
    public axnm as;
    public axnm at;
    public axnm au;
    public azqb av;
    public final hnt aw = new hnt(this);
    public aacz ax;
    public AnimatorSet b;
    private apzg ba;
    private aula bb;
    private boolean bc;
    private boolean bd;
    private boolean be;
    private Bitmap bf;
    private axbm bg;
    public boolean c;
    ReelEditModel d;
    public akvm e;

    private final void bJ() {
        CharSequence text;
        hoi.d(this.ah.j, true != bl() ? 2131232820 : 2131232817);
        if (!this.c) {
            Context rb = rb();
            View view = this.ah.j;
            if (rb == null || view == null) {
                return;
            }
            if (bl()) {
                text = rb.getResources().getText(R.string.reel_edit_unmute_audio_button_text);
            } else {
                text = rb.getResources().getText(R.string.reel_edit_mute_audio_button_text);
            }
            view.setContentDescription(text);
        }
    }

    private static final Uri bK(RecordingInfo recordingInfo) {
        if (recordingInfo == null) {
            return null;
        }
        if (recordingInfo.c.startsWith("content:")) {
            return Uri.parse(recordingInfo.c);
        }
        return Uri.fromFile(new File(recordingInfo.c));
    }

    static final VideoMetaData bp(Context context, Uri uri, RecordingInfo recordingInfo) {
        if (recordingInfo.f) {
            vsh vshVar = new vsh();
            vshVar.b = true;
            vshVar.a = uri;
            vshVar.c = 0;
            vshVar.d = recordingInfo.a;
            vshVar.e = recordingInfo.b;
            vshVar.f = 0;
            vshVar.h = recordingInfo.d * 1000;
            vshVar.i = new long[]{0};
            vshVar.j = null;
            vshVar.k = false;
            return vshVar.a();
        }
        return vsa.a(context, uri);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (r0.h != false) goto L11;
     */
    @Override // defpackage.zwx, defpackage.dp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W() {
        /*
            r2 = this;
            aadd r0 = r2.aC
            arhd r0 = r0.a()
            int r1 = r0.b
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L16
            avvf r0 = r0.h
            if (r0 != 0) goto L12
            avvf r0 = defpackage.avvf.a
        L12:
            boolean r0 = r0.h
            if (r0 == 0) goto L19
        L16:
            r2.bb()
        L19:
            super.W()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hnu.W():void");
    }

    @Override // defpackage.zwx, defpackage.dp
    public final void Z(View view, Bundle bundle) {
        super.Z(view, bundle);
        bs(ampq.j(this.d.f().h()));
        hpi hpiVar = this.ao;
        if (hpiVar.m.q() != null) {
            hpiVar.m.q().c(hpiVar);
        }
        hqb.e(this.d.f().e(), rb(), this.ay);
        if (this.bg != null) {
            this.ay.q().a(this.bg);
            htu htuVar = this.ap;
            htuVar.c(Math.round((htuVar.b - htuVar.c) - this.bg.a()));
        }
        bJ();
    }

    @Override // defpackage.hkt
    public final void a(int i) {
        hnp hnpVar = (hnp) this.at.get();
        View S = ((hoa) this.ar.get()).a.e.n.S(i);
        hnpVar.e = i;
        zag.o(hnpVar.c, true);
        hnpVar.f = S;
        zaj zajVar = new zaj();
        zaj.c(zajVar, hnpVar.f, (View) hnpVar.c.getParent());
        int i2 = zajVar.a.left;
        int i3 = zajVar.a.right;
        int dimensionPixelSize = hnpVar.a.getResources().getDimensionPixelSize(R.dimen.reel_edit_delete_button_size);
        int i4 = zajVar.a.top;
        int dimensionPixelSize2 = hnpVar.a.getResources().getDimensionPixelSize(R.dimen.reel_edit_delete_button_size);
        zgd.t(hnpVar.d, zgd.b(zgd.i(((i2 + i3) - dimensionPixelSize) / 2), zgd.p((i4 - dimensionPixelSize2) - hnpVar.a.getResources().getDimensionPixelSize(R.dimen.reel_edit_delete_button_margin_bottom))), FrameLayout.LayoutParams.class);
        hnpVar.b.postDelayed(hnpVar.g, 5000L);
    }

    @Override // defpackage.zwx
    protected final View aE() {
        return this.ak.b;
    }

    @Override // defpackage.zwx
    protected final View aG() {
        return this.ah.j;
    }

    @Override // defpackage.zwx
    protected final View aI() {
        return this.ah.m;
    }

    @Override // defpackage.zwx
    protected final View aJ() {
        return this.ag.c;
    }

    @Override // defpackage.hvx
    public final void aK(boolean z) {
        if (z) {
            aY();
        } else {
            be();
        }
    }

    @Override // defpackage.zwx
    protected final View aL() {
        return this.ah.i;
    }

    @Override // defpackage.zwx
    protected final View aM() {
        return this.ag.b;
    }

    public final ReelItemEditModel aN(RecordingInfo recordingInfo, VideoMetaData videoMetaData, int i) {
        vqq vqqVar = new vqq();
        vqqVar.a = videoMetaData;
        vqqVar.b(this.aO);
        vqr a = vqqVar.a();
        if (i > 0 || videoMetaData.g > this.aO) {
            long j = this.aO;
            a.E(i * j, (i + 1) * j);
        }
        aZ(a);
        hon g = ReelItemEditModel.g();
        g.d(recordingInfo);
        g.f(videoMetaData);
        g.b(a.a);
        g.e(String.valueOf(i));
        return g.a();
    }

    @Override // defpackage.zwx
    public final VideoMetaData aO(Context context, Uri uri) {
        return bp(context, uri, this.d.g());
    }

    @Override // defpackage.zwx
    protected final VideoWithPreviewView aP() {
        return this.ag.d;
    }

    @Override // defpackage.zwx
    protected final VideoTrimView aQ() {
        return this.am.b;
    }

    @Override // defpackage.zwx
    protected final AudioCrossFadeView aR() {
        return this.ak.d;
    }

    @Override // defpackage.zwx
    protected final AudioTrackView aS() {
        return this.ak.c;
    }

    @Override // defpackage.zwx
    protected final ChooseFilterView aT() {
        hnk hnkVar = this.an;
        if (hnkVar != null) {
            return hnkVar.b;
        }
        return null;
    }

    @Override // defpackage.zwx
    protected final EditableVideoControllerView aU() {
        return this.aX;
    }

    @Override // defpackage.htp
    public final arag aV() {
        aopc aopcVar = (aopc) arag.a.createBuilder();
        String string = rb().getString(R.string.reel_sticker_usage_limit_description);
        aopcVar.copyOnWrite();
        arag aragVar = (arag) aopcVar.instance;
        string.getClass();
        aragVar.b |= 1;
        aragVar.d = string;
        return (arag) aopcVar.mo39build();
    }

    public final void aW() {
        bs(ampq.j(this.d.f().h()));
        hqb.e(this.d.f().e(), rb(), this.ay);
        aT().h(this.d.f().h().p());
        bJ();
    }

    @Override // defpackage.hol
    public final void aX() {
        this.am.d();
        be();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aY() {
        hoi hoiVar = this.ah;
        if (hoiVar.u) {
            if (hoiVar.w) {
                hoiVar.g.setVisibility(8);
            } else {
                hqb.d(hoiVar);
            }
            hoiVar.u = false;
        }
        if (this.d.d().size() > 1) {
            ((hoa) this.ar.get()).d();
        } else {
            this.ai.g();
        }
    }

    @Override // defpackage.zwx
    protected final void aZ(vqr vqrVar) {
        double d;
        double d2;
        double d3;
        apzg apzgVar = this.aZ;
        if (apzgVar == null || !apzgVar.qn(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint)) {
            return;
        }
        if (!vqrVar.L() && vqrVar.b.g > (((LightweightCameraEndpointOuterClass$LightweightCameraEndpoint) this.aZ.qm(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint)).c + 1) * 1000000) {
            hqs.j(mJ(), R.string.reel_gallery_video_too_long_not_support_trim);
            this.af.s();
        }
        double k = vqrVar.b.k();
        double j = vqrVar.b.j();
        Double.isNaN(k);
        Double.isNaN(j);
        double d4 = k / j;
        double d5 = 0.0d;
        if (Math.abs((-0.5625d) + d4) < 0.01d) {
            d = 0.0d;
            d2 = 0.0d;
            d3 = 0.0d;
        } else if (d4 > 0.5625d) {
            Double.isNaN(j);
            Double.isNaN(k);
            Double.isNaN(k);
            d2 = ((k - (j * 0.5625d)) / 2.0d) / k;
            d3 = d2;
            d = 0.0d;
        } else {
            Double.isNaN(k);
            Double.isNaN(j);
            Double.isNaN(j);
            d = ((j - (k / 0.5625d)) / 2.0d) / j;
            d2 = 0.0d;
            d3 = 0.0d;
            d5 = d;
        }
        vqrVar.A(d5, d);
        vqrVar.z(d2, d3);
    }

    @Override // defpackage.hkt
    public final void b(int i) {
        hpq hpqVar = (hpq) this.av.get();
        hpqVar.b = hpqVar.a.b(asny.LATENCY_ACTION_REEL_SELECT_SEGMENT);
        bb();
        hnx b = this.d.b();
        b.b(i);
        this.d = b.a();
        ((hoa) this.ar.get()).a.d(this.d, (hkx) this.as.get());
        aW();
        hpq hpqVar2 = (hpq) this.av.get();
        acvg acvgVar = hpqVar2.b;
        if (acvgVar == null) {
            return;
        }
        acvgVar.c("aft");
        hpqVar2.b = null;
    }

    @Override // defpackage.hpg
    public final void ba(int i, final TextView textView, final AnimatorSet animatorSet) {
        ChooseFilterView aT = aT();
        final zuk c = aT == null ? null : aT.c();
        if (aT == null || c == null) {
            return;
        }
        if (i == 3) {
            c.j();
            gtd.d(this.ae, c.c, actj.UPLOAD_VIDEO_EDITING_SWIPE_TO_CHANGE_EFFECT);
        } else if (i != 1) {
            return;
        } else {
            c.k();
            gtd.d(this.ae, c.c, actj.UPLOAD_VIDEO_EDITING_SWIPE_TO_CHANGE_EFFECT);
        }
        mJ().runOnUiThread(new Runnable() { // from class: hns
            @Override // java.lang.Runnable
            public final void run() {
                hnu hnuVar = hnu.this;
                TextView textView2 = textView;
                zuk zukVar = c;
                AnimatorSet animatorSet2 = animatorSet;
                AnimatorSet animatorSet3 = hnuVar.b;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                }
                textView2.setText(zukVar.f());
                animatorSet2.start();
                hnuVar.b = animatorSet2;
            }
        });
    }

    public final void bb() {
        String e = this.d.f().e();
        zqv q = this.ay.q();
        ampq a = q == null ? amon.a : q.j(ampq.j(new File("reel_effects", e).getPath())).a();
        ReelEditModel reelEditModel = this.d;
        boolean z = false;
        if (a.h()) {
            Iterator it = ((axbw) a.c()).e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                axbk i = ((axbm) it.next()).i();
                if ((i.c == 10 ? (axck) i.d : axck.a).d) {
                    z = true;
                    break;
                }
            }
        }
        if (reelEditModel.f().f() != z) {
            hon a2 = reelEditModel.f().a();
            a2.c(z);
            ReelItemEditModel a3 = a2.a();
            ArrayList arrayList = new ArrayList(reelEditModel.d());
            arrayList.set(reelEditModel.a(), a3);
            hnx b = reelEditModel.b();
            b.c(arrayList);
            reelEditModel = b.a();
        }
        this.d = reelEditModel;
    }

    @Override // defpackage.zwx
    protected final void bc() {
        this.an.b.setBackgroundColor(zhn.j(this.aY, R.attr.reelEditChooseFilterBackground).orElse(0));
    }

    public final void bd(boolean z, boolean z2, boolean z3) {
        this.bc = z;
        this.bd = z2;
        this.be = z3;
    }

    public final void be() {
        hoi hoiVar = this.ah;
        if (!hoiVar.u) {
            if (hoiVar.w) {
                hoiVar.g.setVisibility(0);
            } else {
                hqb.d(hoiVar);
            }
            hoiVar.u = true;
        }
        if (this.d.d().size() > 1) {
            ((hoa) this.ar.get()).g();
        } else {
            this.ai.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zwx
    public final void bf() {
        hms hmsVar = this.ak;
        AudioCrossFadeView audioCrossFadeView = hmsVar.d;
        audioCrossFadeView.c.setProgressDrawable(audioCrossFadeView.getResources().getDrawable(R.drawable.audio_swap_cross_fade_progress_bar_white));
        hmsVar.d.setVisibility(0);
        hmsVar.d.e = -1275068417;
        hmsVar.c.e.b.setColor(0);
        hmsVar.c.b.setColor(0);
        AudioTrackView audioTrackView = hmsVar.c;
        audioTrackView.g = false;
        audioTrackView.h = true;
        String str = null;
        hmsVar.d.findViewById(R.id.audio_swap_cross_fade_view_container).setBackground(null);
        AudioCrossFadeView audioCrossFadeView2 = hmsVar.d;
        float dimension = hmsVar.a.getResources().getDimension(R.dimen.reel_edit_audio_cross_fade_text_size);
        audioCrossFadeView2.a.setTextSize(0, dimension);
        audioCrossFadeView2.b.setTextSize(0, dimension);
        int dimension2 = (int) hmsVar.a.getResources().getDimension(R.dimen.reel_edit_audio_cross_fade_text_left_right_margin);
        AudioCrossFadeView audioCrossFadeView3 = hmsVar.d;
        audioCrossFadeView3.d(audioCrossFadeView3.a, dimension2, dimension2);
        audioCrossFadeView3.d(audioCrossFadeView3.b, dimension2, dimension2);
        hms hmsVar2 = this.ak;
        Track track = this.aI.h;
        String obj = track == null ? null : track.b.toString();
        Track track2 = this.aI.h;
        if (track2 != null) {
            str = track2.a.toString();
        }
        if (!hmsVar2.j) {
            hqb.d(hmsVar2);
            hmsVar2.j = true;
        }
        hmsVar2.f.setText(obj);
        hmsVar2.e.setText(str);
        aY();
    }

    public final void bg() {
        if (this.d.d().size() > 1) {
            ((hoa) this.ar.get()).g();
            this.ai.g();
            return;
        }
        ((hoa) this.ar.get()).d();
        this.ai.k();
    }

    @Override // defpackage.zwx
    protected final void bh() {
        znr znrVar;
        if (aT().c() == null) {
            return;
        }
        View aI = aI();
        int i = 2131232388;
        if (aT().c().q() && (znrVar = this.aT) != null && znrVar.a(avxv.EFFECTS_FEATURE_DOT_ON_FILTER_ICON)) {
            i = 2131231450;
        }
        if (aI instanceof ImageButton) {
            ((ImageButton) aI).setImageResource(i);
        } else if (!(aI instanceof EditorButtonView)) {
        } else {
            ((EditorButtonView) aI).a(i);
        }
    }

    public final void bi(ReelEditModel reelEditModel) {
        this.d = reelEditModel;
        ((hoa) this.ar.get()).a.d(reelEditModel, (hkx) this.as.get());
    }

    @Override // defpackage.zwx
    protected final void bj(int i) {
    }

    @Override // defpackage.htp
    public final boolean bk() {
        ReelEditModel reelEditModel = this.d;
        for (int i = 0; i < reelEditModel.d().size(); i++) {
            if (i != reelEditModel.a() && ((ReelItemEditModel) reelEditModel.d().get(i)).f()) {
                return false;
            }
        }
        return true;
    }

    public final boolean bl() {
        vqr br = br();
        if (br == null) {
            return false;
        }
        return br.F();
    }

    @Override // defpackage.zwx
    protected final boolean bm() {
        return true;
    }

    @Override // defpackage.zwx
    protected final boolean bn() {
        return !aQ().v;
    }

    @Override // defpackage.hpg
    public final boolean bo() {
        return !this.am.d && !this.ak.j && !this.an.d && !this.al.c && !this.aj.i;
    }

    @Override // defpackage.hkt
    public final void c(int i, int i2) {
        ReelEditModel reelEditModel = this.d;
        amuk d = reelEditModel.d();
        if (i >= 0 && i < d.size() && i2 >= 0 && i2 < d.size() && i != i2) {
            ArrayList arrayList = new ArrayList(d);
            Collections.swap(arrayList, i, i2);
            int a = reelEditModel.a();
            if (a == i) {
                i = i2;
            } else if (a != i2) {
                i = a;
            }
            hnx b = reelEditModel.b();
            b.c(arrayList);
            b.b(i);
            reelEditModel = b.a();
        }
        bi(reelEditModel);
    }

    @Override // defpackage.hmp
    public final void d() {
        br().v(!bl());
        bJ();
        be();
    }

    @Override // defpackage.hmr
    public final void e() {
        this.ak.d();
        be();
    }

    @Override // defpackage.hnj
    public final void h() {
        this.an.d();
        be();
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        if (bundle != null) {
            bd(bundle.getBoolean("TEXT_ENABLED"), bundle.getBoolean("ADVANCED_TEXT_ENABLED"), bundle.getBoolean("TEXT_ROUNDED_CORNERS_ENABLED"));
            this.a = bundle.getBoolean("CAN_REQUEST_VIDEO_EFFECTS_STATE");
        }
    }

    @Override // defpackage.zwx, defpackage.dp
    public final void mR() {
        hpi hpiVar = this.ao;
        if (hpiVar.m.q() != null) {
            hpiVar.m.q().d(hpiVar);
        }
        hvz hvzVar = hpiVar.e.n;
        if (hvzVar != null) {
            hvzVar.a.cancel();
            hvzVar.cancel(true);
        }
        super.mR();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x09fc  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0a04  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0ae3  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0af7  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0b15 A[LOOP:1: B:279:0x0b0f->B:281:0x0b15, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0b36  */
    @Override // defpackage.dp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mc(android.view.LayoutInflater r22, android.view.ViewGroup r23, android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 2937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hnu.mc(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.dp
    public final void my() {
        hpi hpiVar = this.ao;
        if (hpiVar.i.getVisibility() == 0) {
            hvy hvyVar = hpiVar.e;
            hvyVar.k.setText((CharSequence) null);
            hvyVar.k.setTextSize(2, 36.0f);
            hvyVar.j.setVisibility(8);
        }
        super.my();
    }

    @Override // defpackage.acth
    public final acti oi() {
        return this.ae;
    }

    @Override // defpackage.zwx, defpackage.dp
    public final void oz(Bundle bundle) {
        super.oz(bundle);
        bundle.putBoolean("TEXT_ENABLED", this.bc);
        bundle.putBoolean("ADVANCED_TEXT_ENABLED", this.bd);
        bundle.putBoolean("TEXT_ROUNDED_CORNERS_ENABLED", this.be);
        bundle.putBoolean("CAN_REQUEST_VIDEO_EFFECTS_STATE", this.a);
        bundle.putParcelable("REEL_MODEL", this.d);
    }

    @Override // defpackage.zwx
    protected final int q() {
        return R.fraction.reel_edit_fragment_max_video_height;
    }
}
