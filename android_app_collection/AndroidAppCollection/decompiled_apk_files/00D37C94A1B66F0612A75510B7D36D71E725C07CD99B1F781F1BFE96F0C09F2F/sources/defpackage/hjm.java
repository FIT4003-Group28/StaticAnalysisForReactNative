package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.CroppedVideoWithPreviewView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.ShortsVideoTrimView2;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.libraries.youtube.edit.preview.TrimVideoControllerView;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: hjm  reason: default package */
/* loaded from: classes3.dex */
public final class hjm extends hix implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, hje, vug, vuf, hja, zxg, hjx {
    public ShortsVideoTrimView2 a;
    public hfn aA;
    public hho aB;
    public gyn aD;
    private EditorButtonView aE;
    private TextView aF;
    private apzg aG;
    private aypg aI;
    public Switch ae;
    public TextView af;
    public gzu ag;
    public VideoMetaData ai;
    public boolean aj;
    public boolean ak;
    public boolean al;
    public int am;
    public int an;
    zxh ao;
    hjd ap;
    public Uri aq;
    public gyq ar;
    public hhq as;
    public acti at;
    public hjh au;
    public hjn av;
    public hjc aw;
    public hki ax;
    public hhl ay;
    public hkg az;
    public TrimVideoControllerView b;
    public YouTubeButton c;
    public YouTubeButton d;
    public View e;
    public int ah = 1;
    private long aH = -1;
    final vqs aC = new hjl(this);

    @Override // defpackage.dp
    public final void W() {
        super.W();
        TrimVideoControllerView trimVideoControllerView = this.b;
        if (trimVideoControllerView != null) {
            trimVideoControllerView.n(null);
        }
        zxh zxhVar = this.ao;
        if (zxhVar != null) {
            zxhVar.f();
        }
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        zxh zxhVar = this.ao;
        if (zxhVar != null) {
            zxhVar.g();
        }
    }

    @Override // defpackage.dp
    public final void Z(View view, Bundle bundle) {
        if (bundle != null) {
            this.an = bundle.getInt("max_video_duration_ms");
            this.aH = bundle.getLong("playback_position", -1L);
            this.ah = bundle.getInt("max_hardware_decoders");
            this.ak = bundle.getBoolean("segment_import_mode", false);
            this.al = bundle.getBoolean("pannable_crop_mode", false);
        }
        if (this.ak) {
            this.d.setVisibility(0);
            this.c.setVisibility(8);
        }
        this.b.e(this);
        this.b.e.add(this);
        this.b.i = new hjj(this);
        this.ao = new zxh(q(), this.b, null, this.aH, this.ah, true, 0);
        int o = o();
        this.aF.setText(rb().getResources().getQuantityString(R.plurals.trim_switch_edu_full_length_shorts, o, Integer.valueOf(o)));
        this.aI = this.ay.c().I(efx.s).as(new ayqb() { // from class: hjk
            /* JADX WARN: Removed duplicated region for block: B:32:0x011c A[Catch: IOException | IllegalStateException -> 0x01fa, IOException -> 0x01fc, TryCatch #2 {IOException | IllegalStateException -> 0x01fa, blocks: (B:6:0x004a, B:8:0x0052, B:9:0x0054, B:13:0x005e, B:15:0x0062, B:17:0x0086, B:19:0x0090, B:21:0x00c7, B:22:0x00c9, B:24:0x00e4, B:26:0x00ee, B:28:0x00f8, B:30:0x0113, B:32:0x011c, B:36:0x012e, B:42:0x0152, B:55:0x0197, B:57:0x01a3, B:58:0x01ba, B:60:0x01c3, B:63:0x01ca, B:65:0x01ce, B:66:0x01d6, B:67:0x01de, B:45:0x0159, B:47:0x015d, B:49:0x0161, B:51:0x0167, B:53:0x0171, B:54:0x0182, B:69:0x01ec, B:70:0x01f9, B:35:0x0128, B:37:0x0132, B:41:0x0144, B:40:0x0140), top: B:78:0x004a }] */
            /* JADX WARN: Removed duplicated region for block: B:37:0x0132 A[Catch: IOException | IllegalStateException -> 0x01fa, IOException -> 0x01fc, TryCatch #2 {IOException | IllegalStateException -> 0x01fa, blocks: (B:6:0x004a, B:8:0x0052, B:9:0x0054, B:13:0x005e, B:15:0x0062, B:17:0x0086, B:19:0x0090, B:21:0x00c7, B:22:0x00c9, B:24:0x00e4, B:26:0x00ee, B:28:0x00f8, B:30:0x0113, B:32:0x011c, B:36:0x012e, B:42:0x0152, B:55:0x0197, B:57:0x01a3, B:58:0x01ba, B:60:0x01c3, B:63:0x01ca, B:65:0x01ce, B:66:0x01d6, B:67:0x01de, B:45:0x0159, B:47:0x015d, B:49:0x0161, B:51:0x0167, B:53:0x0171, B:54:0x0182, B:69:0x01ec, B:70:0x01f9, B:35:0x0128, B:37:0x0132, B:41:0x0144, B:40:0x0140), top: B:78:0x004a }] */
            /* JADX WARN: Removed duplicated region for block: B:44:0x0158  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0159 A[Catch: IOException | IllegalStateException -> 0x01fa, IOException -> 0x01fc, TryCatch #2 {IOException | IllegalStateException -> 0x01fa, blocks: (B:6:0x004a, B:8:0x0052, B:9:0x0054, B:13:0x005e, B:15:0x0062, B:17:0x0086, B:19:0x0090, B:21:0x00c7, B:22:0x00c9, B:24:0x00e4, B:26:0x00ee, B:28:0x00f8, B:30:0x0113, B:32:0x011c, B:36:0x012e, B:42:0x0152, B:55:0x0197, B:57:0x01a3, B:58:0x01ba, B:60:0x01c3, B:63:0x01ca, B:65:0x01ce, B:66:0x01d6, B:67:0x01de, B:45:0x0159, B:47:0x015d, B:49:0x0161, B:51:0x0167, B:53:0x0171, B:54:0x0182, B:69:0x01ec, B:70:0x01f9, B:35:0x0128, B:37:0x0132, B:41:0x0144, B:40:0x0140), top: B:78:0x004a }] */
            /* JADX WARN: Removed duplicated region for block: B:57:0x01a3 A[Catch: IOException | IllegalStateException -> 0x01fa, IOException -> 0x01fc, TryCatch #2 {IOException | IllegalStateException -> 0x01fa, blocks: (B:6:0x004a, B:8:0x0052, B:9:0x0054, B:13:0x005e, B:15:0x0062, B:17:0x0086, B:19:0x0090, B:21:0x00c7, B:22:0x00c9, B:24:0x00e4, B:26:0x00ee, B:28:0x00f8, B:30:0x0113, B:32:0x011c, B:36:0x012e, B:42:0x0152, B:55:0x0197, B:57:0x01a3, B:58:0x01ba, B:60:0x01c3, B:63:0x01ca, B:65:0x01ce, B:66:0x01d6, B:67:0x01de, B:45:0x0159, B:47:0x015d, B:49:0x0161, B:51:0x0167, B:53:0x0171, B:54:0x0182, B:69:0x01ec, B:70:0x01f9, B:35:0x0128, B:37:0x0132, B:41:0x0144, B:40:0x0140), top: B:78:0x004a }] */
            /* JADX WARN: Removed duplicated region for block: B:65:0x01ce A[Catch: IOException | IllegalStateException -> 0x01fa, IOException -> 0x01fc, TryCatch #2 {IOException | IllegalStateException -> 0x01fa, blocks: (B:6:0x004a, B:8:0x0052, B:9:0x0054, B:13:0x005e, B:15:0x0062, B:17:0x0086, B:19:0x0090, B:21:0x00c7, B:22:0x00c9, B:24:0x00e4, B:26:0x00ee, B:28:0x00f8, B:30:0x0113, B:32:0x011c, B:36:0x012e, B:42:0x0152, B:55:0x0197, B:57:0x01a3, B:58:0x01ba, B:60:0x01c3, B:63:0x01ca, B:65:0x01ce, B:66:0x01d6, B:67:0x01de, B:45:0x0159, B:47:0x015d, B:49:0x0161, B:51:0x0167, B:53:0x0171, B:54:0x0182, B:69:0x01ec, B:70:0x01f9, B:35:0x0128, B:37:0x0132, B:41:0x0144, B:40:0x0140), top: B:78:0x004a }] */
            /* JADX WARN: Removed duplicated region for block: B:66:0x01d6 A[Catch: IOException | IllegalStateException -> 0x01fa, IOException -> 0x01fc, TryCatch #2 {IOException | IllegalStateException -> 0x01fa, blocks: (B:6:0x004a, B:8:0x0052, B:9:0x0054, B:13:0x005e, B:15:0x0062, B:17:0x0086, B:19:0x0090, B:21:0x00c7, B:22:0x00c9, B:24:0x00e4, B:26:0x00ee, B:28:0x00f8, B:30:0x0113, B:32:0x011c, B:36:0x012e, B:42:0x0152, B:55:0x0197, B:57:0x01a3, B:58:0x01ba, B:60:0x01c3, B:63:0x01ca, B:65:0x01ce, B:66:0x01d6, B:67:0x01de, B:45:0x0159, B:47:0x015d, B:49:0x0161, B:51:0x0167, B:53:0x0171, B:54:0x0182, B:69:0x01ec, B:70:0x01f9, B:35:0x0128, B:37:0x0132, B:41:0x0144, B:40:0x0140), top: B:78:0x004a }] */
            @Override // defpackage.ayqb
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r33) {
                /*
                    Method dump skipped, instructions count: 539
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.hjk.a(java.lang.Object):void");
            }
        });
        this.ap = new hjd(this.as, this.au, this.ar);
    }

    @Override // defpackage.hje
    public final void a(float f) {
        if (q().j()) {
            this.ar.a(actj.SHORTS_CREATION_TRIM_CROP_TOOL).f();
            CroppedVideoWithPreviewView q = q();
            if (q.d == 1 && q.a() < q.l) {
                float f2 = q.f();
                float h = q.h();
                float g = q.g();
                float a = q.a();
                if (h != 0.0f && g != 0.0f && a != 0.0f) {
                    float f3 = q.e + f;
                    q.e = f3;
                    float f4 = -f2;
                    float f5 = (q.a * h) - h;
                    float f6 = f5 + f2;
                    float f7 = f5 / 2.0f;
                    float f8 = f3 + f7;
                    if (f8 < f4) {
                        q.e = f4 - f7;
                        f8 = f4;
                    } else if (f8 > f6) {
                        q.e = f6 - f7;
                        f8 = f6;
                    }
                    float f9 = f6 - f2;
                    float f10 = f8 / f9;
                    q.b = f10;
                    float f11 = f4 / f9;
                    q.c = (f10 - f11) / ((f6 / f9) - f11);
                    q.i();
                }
            }
            if (this.aj) {
                zxh zxhVar = this.ao;
                vtr vtrVar = zxhVar.f;
                vtrVar.j(vtrVar.c() + 1);
                vtr vtrVar2 = zxhVar.f;
                vtrVar2.j(vtrVar2.c() - 1);
            }
            hjd hjdVar = this.ap;
            hjdVar.a(this.ao.d, hjdVar.b.c.c);
        }
    }

    public final void aE() {
        if (!this.ak) {
            if (q() != null) {
                q().setVisibility(4);
            }
            gzu gzuVar = this.ag;
            if (gzuVar == null) {
                return;
            }
            hes hesVar = (hes) gzuVar;
            hesVar.ai.d();
            hesVar.aK(gyq.d(hesVar.q(), hesVar.ao, 96638));
            return;
        }
        hes hesVar2 = (hes) this.ag;
        hesVar2.ai.d();
        hesVar2.aJ(true);
    }

    @Override // defpackage.vug
    public final void aF(boolean z) {
        dt mJ = mJ();
        if (z) {
            if (mJ == null) {
                return;
            }
            mJ.getWindow().addFlags(128);
            return;
        }
        if (mJ != null) {
            mJ.getWindow().clearFlags(128);
        }
        if (aQ()) {
            return;
        }
        TrimVideoControllerView trimVideoControllerView = this.b;
        if (trimVideoControllerView.h || this.a.z || this.aj) {
            return;
        }
        trimVideoControllerView.p();
    }

    @Override // defpackage.vuf
    public final void aG(long j) {
        this.a.v(j);
    }

    @Override // defpackage.zxg
    public final void aH(osx osxVar) {
        throw null;
    }

    public final void aI() {
        this.e.setVisibility(8);
        this.av.g();
        if (aM()) {
            aL();
        } else {
            aJ();
        }
        aK(true);
        this.ar.a(actj.SHORTS_CREATION_TRIM_TRIMMER).e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aJ() {
        vqr vqrVar = this.as.b;
        if (vqrVar == null) {
            return;
        }
        ShortsVideoTrimView2 shortsVideoTrimView2 = this.a;
        long n = vqrVar.n();
        if (shortsVideoTrimView2.u != null) {
            shortsVideoTrimView2.t(n);
        }
        ShortsVideoTrimView2 shortsVideoTrimView22 = this.a;
        long l = vqrVar.l();
        if (shortsVideoTrimView22.u != null) {
            shortsVideoTrimView22.u(l);
        }
        this.b.i();
    }

    public final void aK(boolean z) {
        String N;
        YouTubeButton youTubeButton = this.c;
        if (z) {
            N = N(R.string.shorts_a11y_continue_to_editor);
        } else {
            N = N(R.string.shorts_a11y_continue_to_upload);
        }
        youTubeButton.setContentDescription(N);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aL() {
        vqr vqrVar = this.ao.d;
        if (vqrVar != null) {
            this.as.b = vqrVar;
        }
    }

    public final boolean aM() {
        return this.as.b == null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean aN() {
        return this.a.m && aO();
    }

    final boolean aO() {
        return this.ai.a() <= 1.0f;
    }

    public final boolean aP() {
        return p() <= TimeUnit.MILLISECONDS.toMicros((long) this.an);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean aQ() {
        return this.b.u();
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        byte[] byteArray;
        super.mQ(bundle);
        Bundle bundle2 = this.m;
        if (bundle2 != null && (byteArray = bundle2.getByteArray("SHORTS_EDIT_VIDEO_ENDPOINT")) != null) {
            try {
                this.aG = (apzg) aopi.parseFrom(apzg.a, byteArray, aoos.b());
            } catch (aopx e) {
                zep.d("Error parsing navigation endpoint.", e);
            }
        }
        this.ar = new gyq(this.at);
    }

    @Override // defpackage.dp
    public final void mR() {
        super.mR();
        ShortsVideoTrimView2 shortsVideoTrimView2 = this.a;
        if (shortsVideoTrimView2 != null) {
            shortsVideoTrimView2.w(null, null, vqp.a);
            vqp vqpVar = shortsVideoTrimView2.t;
            if (vqpVar != null) {
                vqpVar.h(shortsVideoTrimView2);
            }
        }
        TrimVideoControllerView trimVideoControllerView = this.b;
        if (trimVideoControllerView != null) {
            trimVideoControllerView.j(this);
            trimVideoControllerView.e.remove(this);
            trimVideoControllerView.o(null);
        }
        zxh zxhVar = this.ao;
        if (zxhVar != null) {
            zxhVar.g = null;
            zxhVar.o();
        }
        aypg aypgVar = this.aI;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.shorts_trim_fragment_2, viewGroup, false);
        hjh hjhVar = this.au;
        hjhVar.b = this;
        hjhVar.c = (CroppedVideoWithPreviewView) inflate.findViewById(R.id.video_view);
        hjhVar.d = (FrameLayout) inflate.findViewById(R.id.preview_video_container);
        hjhVar.e = inflate.findViewById(R.id.video_preview_start_crop_overlay);
        hjhVar.f = inflate.findViewById(R.id.video_preview_end_crop_overlay);
        hjhVar.d.setOnTouchListener(hjhVar);
        hjhVar.d.setAccessibilityDelegate(new hjf(hjhVar));
        hjhVar.c.g = hjhVar;
        hjn hjnVar = this.av;
        hjnVar.a = inflate.findViewById(R.id.shorts_edit_video_trim_container);
        hjnVar.b = (ShortsVideoTrimView2) inflate.findViewById(R.id.shorts_edit_video_trim_view);
        hjnVar.e = (TrimVideoControllerView) inflate.findViewById(R.id.trim_video_controller);
        hjnVar.c = inflate.getContext().getResources().getDimension(R.dimen.shorts_edit_video_trim_height);
        hjnVar.d();
        ShortsVideoTrimView2 shortsVideoTrimView2 = this.av.b;
        this.a = shortsVideoTrimView2;
        shortsVideoTrimView2.a = this.ar;
        shortsVideoTrimView2.k = new vqi(rb(), inflate);
        vqi vqiVar = shortsVideoTrimView2.k;
        if (vqiVar != null) {
            vqiVar.d = shortsVideoTrimView2.c;
        }
        this.a.b = this;
        this.b = (TrimVideoControllerView) inflate.findViewById(R.id.trim_video_controller);
        this.b.f = (ImageView) inflate.findViewById(R.id.play_button);
        YouTubeButton youTubeButton = (YouTubeButton) inflate.findViewById(R.id.shorts_trim_next_button);
        this.c = youTubeButton;
        youTubeButton.setOnClickListener(this);
        YouTubeButton youTubeButton2 = (YouTubeButton) inflate.findViewById(R.id.shorts_trim_add_segment_button);
        this.d = youTubeButton2;
        youTubeButton2.setOnClickListener(this);
        EditorButtonView editorButtonView = (EditorButtonView) inflate.findViewById(R.id.shorts_trim_back);
        this.aE = editorButtonView;
        editorButtonView.setOnClickListener(this);
        this.e = inflate.findViewById(R.id.trim_to_short_container);
        Switch r4 = (Switch) inflate.findViewById(R.id.trim_to_short_switch);
        this.ae = r4;
        r4.setOnCheckedChangeListener(this);
        this.ae.setOnClickListener(new View.OnClickListener() { // from class: hji
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hjm.this.ar.a(actj.SHORTS_CREATION_TRIM_TRIMMER_TOGGLE).b();
            }
        });
        this.aF = (TextView) inflate.findViewById(R.id.trim_to_short_edu_text);
        this.af = (TextView) inflate.findViewById(R.id.segment_max_length_label);
        gyq gyqVar = this.ar;
        if (gyqVar != null) {
            gyp c = gyqVar.c(acuo.a(96659));
            c.a = this.aG;
            c.b();
            if (this.ak) {
                gyo a = this.ar.a(actj.SHORTS_CREATION_TRIM_ADD_BUTTON);
                a.h(true);
                a.a();
                this.ar.a(actj.SHORTS_CREATION_TRIM_CROP_TOOL).a();
            } else {
                gyo a2 = this.ar.a(actj.SHORTS_CREATION_NEXT_BUTTON);
                a2.h(true);
                a2.a();
            }
            gyo a3 = this.ar.a(actj.SHORTS_CREATION_DISMISS_BUTTON);
            a3.h(true);
            a3.a();
            gyo a4 = this.ar.a(actj.SHORTS_CREATION_TRIM_PLAY_BUTTON);
            a4.h(true);
            a4.a();
            this.ar.a(actj.SHORTS_CREATION_TRIM_SCRUBBER).a();
            this.ar.a(actj.SHORTS_CREATION_TRIM_TRIMMER).a();
            this.ar.a(actj.SHORTS_CREATION_TRIM_TRIMMER_TOGGLE).a();
            this.ar.a(actj.SHORTS_CREATION_GALLERY_CELL).a();
        }
        return inflate;
    }

    public final int o() {
        return (int) TimeUnit.MILLISECONDS.toSeconds(this.an);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton == this.ae) {
            if (z) {
                this.av.g();
                aK(true);
                aL();
                this.ar.a(actj.SHORTS_CREATION_TRIM_SCRUBBER).d();
                this.ar.a(actj.SHORTS_CREATION_TRIM_TRIMMER).e();
                return;
            }
            hjn hjnVar = this.av;
            hjnVar.d = false;
            hqb.d(hjnVar);
            aK(false);
            this.ar.a(actj.SHORTS_CREATION_TRIM_TRIMMER).d();
            this.ar.a(actj.SHORTS_CREATION_TRIM_SCRUBBER).e();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z = false;
        if (view == this.c) {
            if (aN() && (aP() || this.ae.isChecked())) {
                if (this.ag == null) {
                    return;
                }
                vqr vqrVar = this.as.b;
                if (vqrVar != null && vqrVar.K()) {
                    this.az.e(true);
                }
                ((hes) this.ag).aF(3);
                return;
            }
            aopa createBuilder = atnp.a.createBuilder();
            int i = actj.SHORTS_CREATION_NEXT_BUTTON.II;
            createBuilder.copyOnWrite();
            atnp atnpVar = (atnp) createBuilder.instance;
            atnpVar.b |= 2;
            atnpVar.d = i;
            InteractionLoggingScreen interactionLoggingScreen = ((acsx) this.at).i;
            if (interactionLoggingScreen != null) {
                String str = interactionLoggingScreen.a;
                createBuilder.copyOnWrite();
                atnp atnpVar2 = (atnp) createBuilder.instance;
                str.getClass();
                atnpVar2.b |= 1;
                atnpVar2.c = str;
            }
            this.az.e(false);
            Uri uri = this.aq;
            if (uri != null) {
                this.az.d(uri);
            }
            Uri d = zxi.d(this.ao.d);
            hkj a = hkk.a();
            a.c(avuk.UPLOAD_FLOW_SOURCE_YOUTUBE_APP_SHORTS_GALLERY);
            a.l = 2;
            a.b = d;
            a.c = (atnp) createBuilder.mo39build();
            if (p() <= gym.a && aO()) {
                z = true;
            }
            a.b(z);
            Uri uri2 = this.aq;
            if (uri2 != null) {
                a.a = uri2;
            }
            String str2 = this.az.e;
            if (str2 != null) {
                a.j = str2;
            }
            this.ax.a(a.a());
        } else if (view == this.d) {
            if (this.ar != null) {
                vqr vqrVar2 = this.ao.d;
                aopa createBuilder2 = asju.a.createBuilder();
                int k = vqrVar2.b.k();
                createBuilder2.copyOnWrite();
                asju asjuVar = (asju) createBuilder2.instance;
                asjuVar.b |= 1;
                asjuVar.c = k;
                int j = vqrVar2.b.j();
                createBuilder2.copyOnWrite();
                asju asjuVar2 = (asju) createBuilder2.instance;
                asjuVar2.b = 2 | asjuVar2.b;
                asjuVar2.d = j;
                if (vqrVar2.a() != 0.0d) {
                    double a2 = vqrVar2.a();
                    createBuilder2.copyOnWrite();
                    asju asjuVar3 = (asju) createBuilder2.instance;
                    asjuVar3.b |= 16;
                    asjuVar3.g = (float) a2;
                }
                if (vqrVar2.d() != 0.0d) {
                    double d2 = vqrVar2.d();
                    createBuilder2.copyOnWrite();
                    asju asjuVar4 = (asju) createBuilder2.instance;
                    asjuVar4.b |= 4;
                    asjuVar4.e = (float) d2;
                }
                if (vqrVar2.b() != 0.0d) {
                    double b = vqrVar2.b();
                    createBuilder2.copyOnWrite();
                    asju asjuVar5 = (asju) createBuilder2.instance;
                    asjuVar5.b |= 32;
                    asjuVar5.h = (float) b;
                }
                if (vqrVar2.c() != 0.0d) {
                    double c = vqrVar2.c();
                    createBuilder2.copyOnWrite();
                    asju asjuVar6 = (asju) createBuilder2.instance;
                    asjuVar6.b |= 8;
                    asjuVar6.f = (float) c;
                }
                asju asjuVar7 = (asju) createBuilder2.mo39build();
                aopa createBuilder3 = asjj.a.createBuilder();
                aopa createBuilder4 = asjz.a.createBuilder();
                createBuilder4.copyOnWrite();
                asjz asjzVar = (asjz) createBuilder4.instance;
                asjuVar7.getClass();
                asjzVar.d = asjuVar7;
                asjzVar.b |= 4;
                asjz asjzVar2 = (asjz) createBuilder4.mo39build();
                createBuilder3.copyOnWrite();
                asjj asjjVar = (asjj) createBuilder3.instance;
                asjzVar2.getClass();
                asjjVar.B = asjzVar2;
                asjjVar.c |= 262144;
                gyo a3 = this.ar.a(actj.SHORTS_CREATION_TRIM_ADD_BUTTON);
                a3.a = (asjj) createBuilder3.mo39build();
                a3.b();
            }
            gzu gzuVar = this.ag;
            if (gzuVar == null) {
                return;
            }
            hes hesVar = (hes) gzuVar;
            Toast.makeText(hesVar.at, "Add trimmed segment to project", 0).show();
            hesVar.ai.d();
            hesVar.aJ(true);
        } else if (view != this.aE) {
        } else {
            aE();
        }
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        bundle.putInt("max_hardware_decoders", this.ah);
        bundle.putInt("max_video_duration_ms", this.an);
        bundle.putLong("playback_position", this.ao.e());
        bundle.putBoolean("segment_import_mode", this.ak);
        bundle.putBoolean("pannable_crop_mode", this.al);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long p() {
        return this.a.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final CroppedVideoWithPreviewView q() {
        return this.au.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(boolean z) {
        this.b.f(z);
    }

    @Override // defpackage.zxg
    public final void s() {
    }
}
