package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import com.google.android.libraries.video.editablevideo.EditableVideoEdits;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.video.preview.VideoWithPreviewView;
import com.google.android.libraries.video.trim.VideoTrimView;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioCrossFadeView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioTrackView;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.libraries.youtube.edit.preview.EditableVideoControllerView;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.youtube.R;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: zwx  reason: default package */
/* loaded from: classes4.dex */
public abstract class zwx extends dp implements View.OnClickListener, vqm, vug, zxg {
    public SharedPreferences aA;
    public znk aB;
    public aadd aC;
    public ajmr aD;
    public azqb aE;
    public Handler aF;
    public boolean aG;
    public Uri aH;
    public zxh aI;
    public ArrayList aJ;
    public acti aK;
    public zwm aL;
    public boolean aM;
    public long aO;
    public boolean aQ;
    public boolean aS;
    private boolean af;
    private boolean ag;
    private zjw ah;
    public File az;
    private boolean b;
    private boolean c;
    private vvp d;
    private zky e;
    private final Object a = new Object();
    private vqp ae = vqp.a;
    public boolean aN = false;
    public int aP = 0;
    public zsk aW = null;
    public int aR = 1;
    private long ai = -1;
    private Track aj = null;
    public znr aT = null;
    public znq aU = null;
    public asjj aV = null;
    public final zqw ay = new zqw() { // from class: zwp
        @Override // defpackage.zqw
        public final zqv q() {
            return zwx.this.aI.b.b();
        }
    };

    private final void a() {
        this.c = false;
        if (aS() != null) {
            aS().d();
            aK();
        }
    }

    private final void aK() {
        Track track = this.aI.h;
        boolean z = this.ae.c;
        AudioTrackView aS = aS();
        ImageButton bq = bq();
        aR();
        int i = 8;
        aS.setVisibility((track == null || (this.c && !z)) ? 8 : 0);
        if (bq != null) {
            if (track != null && !z) {
                i = 0;
            }
            bq.setVisibility(i);
            bq.setImageResource(true != this.c ? R.drawable.audio_swap_mix_button : R.drawable.audio_swap_mix_done_button);
        }
        int intrinsicWidth = akf.a(mJ(), R.drawable.trim_handle_left).getIntrinsicWidth() / 2;
        int dimensionPixelSize = rh().getDimensionPixelSize(R.dimen.upload_edit_video_fragment_mixer_button_width);
        int i2 = true != z ? intrinsicWidth : 0;
        int i3 = (z || track == null) ? 0 : dimensionPixelSize - intrinsicWidth;
        bj(i3);
        bG(i3);
        bE(this.c, z, intrinsicWidth, i3, i2);
    }

    private final boolean aN(actj actjVar) {
        acti actiVar = this.aK;
        if (actiVar == null || actjVar == null) {
            return false;
        }
        actiVar.H(3, new acte(actjVar), this.aV);
        return true;
    }

    private final void d(actj actjVar) {
        acti actiVar = this.aK;
        if (actiVar == null || actjVar == null) {
            return;
        }
        actiVar.n(new acte(actjVar));
        this.aK.w(new acte(actjVar), this.aV);
    }

    private final void n(boolean z) {
        aqxo.y(this.aM);
        if (z != this.c) {
            this.c = z;
            aK();
        }
    }

    private final void o(boolean z, boolean z2) {
        aqxo.y(this.aI.p());
        ChooseFilterView aT = aT();
        if (z != aT.f) {
            aT.l(z2);
        }
    }

    private final void p(Uri uri) {
        oui otfVar;
        if (aS() != null) {
            zkx zkxVar = this.e.a;
            zkxVar.k = this.aQ;
            dt mJ = mJ();
            if (!uri.equals(zkxVar.a)) {
                zkxVar.a = uri;
                otb otbVar = zkxVar.b;
                if (otbVar != null) {
                    otbVar.i(zkxVar.c);
                    zkxVar.b.n();
                    zkxVar.b.h();
                }
                zkxVar.b = osz.b();
                zkxVar.h = 0L;
                zkxVar.i = 0;
                zkxVar.j = 0;
                zkxVar.g = 0;
                try {
                    zkxVar.e.close();
                } catch (IOException e) {
                    zep.d("Error closing DataOutputStream", e);
                }
                zkxVar.d.reset();
                zkxVar.e = new DataOutputStream(zkxVar.e);
                if (zkxVar.k) {
                    otfVar = new oxx(uri, new pbq(mJ, pcx.l(mJ, "AudioMPEG")), new pbo(65536), 1310720, new oxq[0]);
                } else {
                    otfVar = new otf(mJ, uri);
                }
                vri vriVar = new vri(otfVar);
                vriVar.a = zkxVar;
                zkxVar.b.e(zkxVar.c);
                zkxVar.b.g(vriVar);
                zkxVar.b.l(true);
            }
            AudioTrackView aS = aS();
            vqr vqrVar = this.aI.d;
            vqp vqpVar = this.ae;
            aS.f = zkxVar;
            aS.d();
            aS.c = vqrVar;
            vqrVar.q(aS);
            aS.d = vqpVar;
            aS.d.f(aS);
            aS.e = new zku(zkxVar, vqrVar, vqpVar, aS.getResources());
            aS.e.setCallback(aS);
            aS.a.a = vqrVar;
            aS.requestLayout();
            this.c = false;
            aK();
        }
    }

    @Override // defpackage.vqm
    public final void H() {
    }

    @Override // defpackage.vqm
    public final void J() {
        if (mJ() != null) {
            aK();
        }
    }

    @Override // defpackage.dp
    public final void S(int i, int i2, Intent intent) {
        super.S(i, i2, intent);
        if (i == 15911 && i2 == -1) {
            Parcelable parcelableExtra = intent.getParcelableExtra("audio_track");
            parcelableExtra.getClass();
            by((Track) parcelableExtra);
            bf();
        }
    }

    @Override // defpackage.dp
    public void W() {
        super.W();
        aU().n(null);
        this.aI.f();
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        this.aI.g();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        mJ().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float fraction = rh().getFraction(q(), displayMetrics.heightPixels, displayMetrics.heightPixels);
        VideoWithPreviewView aP = aP();
        int i = (int) fraction;
        if (aP.m != i) {
            aP.m = i;
            aP.p();
        }
        if (!this.aM || aG() == null) {
            return;
        }
        aG().setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f4  */
    @Override // defpackage.dp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Z(android.view.View r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zwx.Z(android.view.View, android.os.Bundle):void");
    }

    protected View aE() {
        return null;
    }

    @Override // defpackage.vug
    public final void aF(boolean z) {
        if (z) {
            mJ().getWindow().addFlags(128);
            return;
        }
        mJ().getWindow().clearFlags(128);
        if (!bn()) {
            return;
        }
        aU().p();
    }

    protected View aG() {
        throw null;
    }

    @Override // defpackage.zxg
    public final void aH(osx osxVar) {
        zep.d("Unable to play video", osxVar);
        d(actj.UPLOAD_VIDEO_EDITING_VIDEO_PREVIEW_ERROR);
        bu(osxVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public View aI() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract View aJ();

    protected View aL() {
        return null;
    }

    protected abstract View aM();

    protected VideoMetaData aO(Context context, Uri uri) {
        return vsa.a(context, uri);
    }

    protected abstract VideoWithPreviewView aP();

    /* JADX INFO: Access modifiers changed from: protected */
    public VideoTrimView aQ() {
        throw null;
    }

    protected AudioCrossFadeView aR() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AudioTrackView aS() {
        throw null;
    }

    protected abstract ChooseFilterView aT();

    protected abstract EditableVideoControllerView aU();

    /* JADX INFO: Access modifiers changed from: protected */
    public void aZ(vqr vqrVar) {
    }

    public final void bA(znr znrVar) {
        znrVar.getClass();
        this.aT = znrVar;
    }

    public final void bB(znq znqVar) {
        znqVar.getClass();
        this.aU = znqVar;
    }

    public final void bC(long j) {
        this.aO = Math.max(0L, j);
    }

    public final void bD(final String str) {
        aqxo.y(bH());
        aqxo.y(this.aI != null);
        final ChooseFilterView aT = aT();
        aT.getClass();
        bw(new Runnable() { // from class: zwr
            @Override // java.lang.Runnable
            public final void run() {
                zwm zwmVar;
                zwx zwxVar = zwx.this;
                ChooseFilterView chooseFilterView = aT;
                String str2 = str;
                if (chooseFilterView.c() != null) {
                    return;
                }
                znr znrVar = zwxVar.aT;
                chooseFilterView.e(zwxVar.aJ, zwxVar.aJ(), znrVar != null && znrVar.a(avxv.EFFECTS_FEATURE_DOT_ON_EFFECT_THUMBNAIL), false, zwxVar.aB, zwxVar);
                znq znqVar = zwxVar.aU;
                if (znqVar != null) {
                    zuk c = chooseFilterView.c();
                    c.getClass();
                    ((zsn) znqVar).d = c;
                }
                chooseFilterView.c().registerObserver(new zww(zwxVar, chooseFilterView));
                zwxVar.aI.b.l(zwxVar.aW, chooseFilterView.c());
                acti actiVar = zwxVar.aK;
                if (actiVar != null && (zwmVar = zwxVar.aL) != null) {
                    chooseFilterView.m(actiVar, zwmVar);
                }
                if (str2 != null) {
                    chooseFilterView.h(str2);
                }
                zwxVar.bh();
            }
        });
    }

    protected void bE(boolean z, boolean z2, int i, int i2, int i3) {
    }

    protected void bF() {
    }

    protected void bG(int i) {
    }

    public final boolean bH() {
        ArrayList arrayList = this.aJ;
        return (arrayList == null || arrayList.isEmpty() || this.aW == null) ? false : true;
    }

    public final void bI(zsk zskVar, ArrayList arrayList) {
        zxh zxhVar;
        vqr vqrVar;
        boolean z = true;
        aqxo.y(this.aW == null);
        if (this.aJ != null) {
            z = false;
        }
        aqxo.y(z);
        synchronized (this.a) {
            zskVar.getClass();
            this.aW = zskVar;
            this.aJ = arrayList;
            if (aT() != null && (zxhVar = this.aI) != null && zxhVar.p() && (vqrVar = this.aI.d) != null) {
                bD(vqrVar.p());
            }
        }
    }

    protected void bc() {
        throw null;
    }

    protected void bf() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void bh() {
        throw null;
    }

    protected void bj(int i) {
        VideoTrimView aQ = aQ();
        int dimensionPixelSize = rh().getDimensionPixelSize(R.dimen.video_trim_view_padding);
        if (aQ != null) {
            aQ.setPadding(0, dimensionPixelSize, i, 0);
        }
    }

    protected boolean bm() {
        return false;
    }

    protected abstract boolean bn();

    protected ImageButton bq() {
        return null;
    }

    public final vqr br() {
        return this.aI.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void bs(final ampq ampqVar) {
        final boolean z;
        final boolean z2;
        zxh zxhVar;
        VideoMetaData videoMetaData = ampqVar.h() ? ((vqr) ampqVar.c()).b : null;
        final vvl a = videoMetaData != null ? this.d.a(videoMetaData) : null;
        VideoTrimView aQ = aQ();
        final boolean z3 = true;
        if (ampqVar.h()) {
            this.ae.h(this);
            long j = videoMetaData.g;
            vqp vqpVar = new vqp(j, j);
            this.ae = vqpVar;
            vqpVar.f(this);
            if (aQ != null) {
                aQ.p((vqr) ampqVar.c(), a, this.ae);
                if (aL() == null) {
                    z = true;
                    zxhVar = this.aI;
                    if (zxhVar != null || !zxhVar.p()) {
                        z2 = false;
                    } else {
                        d(actj.UPLOAD_VIDEO_EDITING_VIDEO_EFFECTS_BUTTON);
                        z2 = true;
                    }
                    d(actj.UPLOAD_VIDEO_EDITING_TRIM_VIEW);
                }
            }
            z = false;
            zxhVar = this.aI;
            if (zxhVar != null) {
            }
            z2 = false;
            d(actj.UPLOAD_VIDEO_EDITING_TRIM_VIEW);
        } else {
            if (aQ != null) {
                aQ.p(null, null, vqp.a);
            }
            z = false;
            z2 = false;
        }
        if (this.aI.h == null) {
            z3 = false;
        }
        d(actj.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_BUTTON);
        d(actj.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_VOLUME);
        AudioCrossFadeView aR = aR();
        if (aR != null) {
            vqr vqrVar = (vqr) ampqVar.f();
            vqr vqrVar2 = aR.d;
            if (vqrVar2 != null) {
                vqrVar2.u(aR);
            }
            aR.d = vqrVar;
            if (vqrVar != null) {
                aR.c.setProgress(Math.round(vqrVar.e() * 100.0f));
                vqrVar.q(aR);
            }
        }
        aU().o((vqr) ampqVar.f());
        synchronized (this.a) {
            bw(new Runnable() { // from class: zws
                @Override // java.lang.Runnable
                public final void run() {
                    zwx zwxVar = zwx.this;
                    ampq ampqVar2 = ampqVar;
                    String str = null;
                    zwxVar.aI.n((vqr) ampqVar2.f(), ampqVar2.h() ? ((vqr) ampqVar2.c()).b.a : null, a);
                    if (!zwxVar.aI.p() || !zwxVar.bH()) {
                        return;
                    }
                    if (ampqVar2.h()) {
                        str = ((vqr) ampqVar2.c()).p();
                    }
                    zwxVar.bD(str);
                }
            });
        }
        bw(new Runnable() { // from class: zwt
            @Override // java.lang.Runnable
            public final void run() {
                zwx zwxVar = zwx.this;
                boolean z4 = z;
                boolean z5 = z2;
                boolean z6 = z3;
                VideoTrimView aQ2 = zwxVar.aQ();
                int i = 8;
                if (aQ2 != null) {
                    aQ2.setVisibility(true != z4 ? 8 : 0);
                }
                if (zwxVar.aI() != null) {
                    zwxVar.aI().setVisibility(true != z5 ? 4 : 0);
                }
                AudioTrackView aS = zwxVar.aS();
                if (aS != null) {
                    if (true == z6) {
                        i = 0;
                    }
                    aS.setVisibility(i);
                }
            }
        });
    }

    public final void bt(Uri uri, EditableVideoEdits editableVideoEdits, VideoMetaData videoMetaData) {
        vqr vqrVar;
        if (this.b) {
            zep.l("Unable to SetVideo after Fragment.onDestroyView");
            return;
        }
        final VideoMetaData videoMetaData2 = null;
        if (editableVideoEdits != null && videoMetaData != null) {
            vqrVar = new vqr(editableVideoEdits, videoMetaData);
        } else if (editableVideoEdits != null) {
            vqrVar = new vqr(editableVideoEdits, aO(rb(), uri));
        } else if (uri != null) {
            Context rb = rb();
            long j = this.aO;
            vqq vqqVar = new vqq();
            vqqVar.a = aO(rb, uri);
            vqqVar.b(j);
            vqrVar = vqqVar.a();
            d(actj.UPLOAD_VIDEO_EDITING_VIDEO_PREVIEW);
        } else {
            vqrVar = null;
        }
        if (vqrVar != null) {
            aZ(vqrVar);
        }
        if (vqrVar != null) {
            videoMetaData2 = vqrVar.b;
        }
        if (this.ag && videoMetaData2 != null && videoMetaData == null) {
            this.aF.post(new Runnable() { // from class: zwq
                /* JADX WARN: Removed duplicated region for block: B:37:0x006d A[Catch: IOException -> 0x0071, TRY_LEAVE, TryCatch #4 {IOException -> 0x0071, blocks: (B:35:0x0068, B:37:0x006d), top: B:43:0x0068 }] */
                /* JADX WARN: Removed duplicated region for block: B:43:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r7 = this;
                        java.lang.String r0 = "Failed to close output stream."
                        zwx r1 = defpackage.zwx.this
                        com.google.android.libraries.video.media.VideoMetaData r2 = r2
                        defpackage.ylr.b()
                        java.io.File r3 = new java.io.File
                        java.io.File r4 = r1.az
                        java.lang.String r5 = "video_meta_data.raw"
                        r3.<init>(r4, r5)
                        r4 = 0
                        java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
                        r5.<init>(r3)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
                        java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
                        r3.<init>(r5)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
                        android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
                        r6 = 0
                        r2.writeToParcel(r4, r6)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
                        byte[] r2 = r4.marshall()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
                        r4.recycle()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
                        r3.write(r2)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
                        r3.flush()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
                        r2 = 1
                        r1.aS = r2     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
                        r3.close()     // Catch: java.io.IOException -> L3c
                        r5.close()     // Catch: java.io.IOException -> L3c
                        return
                    L3c:
                        defpackage.zep.b(r0)
                        return
                    L40:
                        r1 = move-exception
                        goto L65
                    L42:
                        r1 = move-exception
                        goto L48
                    L44:
                        r1 = move-exception
                        goto L66
                    L46:
                        r1 = move-exception
                        r3 = r4
                    L48:
                        r4 = r5
                        goto L4f
                    L4a:
                        r1 = move-exception
                        r5 = r4
                        goto L66
                    L4d:
                        r1 = move-exception
                        r3 = r4
                    L4f:
                        java.lang.String r2 = "Serialization Save Error: "
                        defpackage.zep.d(r2, r1)     // Catch: java.lang.Throwable -> L63
                        if (r3 == 0) goto L59
                        r3.close()     // Catch: java.io.IOException -> L5f
                    L59:
                        if (r4 == 0) goto L62
                        r4.close()     // Catch: java.io.IOException -> L5f
                        return
                    L5f:
                        defpackage.zep.b(r0)
                    L62:
                        return
                    L63:
                        r1 = move-exception
                        r5 = r4
                    L65:
                        r4 = r3
                    L66:
                        if (r4 == 0) goto L6b
                        r4.close()     // Catch: java.io.IOException -> L71
                    L6b:
                        if (r5 == 0) goto L74
                        r5.close()     // Catch: java.io.IOException -> L71
                        goto L74
                    L71:
                        defpackage.zep.b(r0)
                    L74:
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.zwq.run():void");
                }
            });
        }
        bs(ampq.i(vqrVar));
    }

    protected void bu(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void bv(IOException iOException) {
        zep.d("Failed to open video", iOException);
        String valueOf = String.valueOf(zxq.d(iOException));
        afus.c(1, 9, valueOf.length() != 0 ? "youtubeBaseEditParse::".concat(valueOf) : new String("youtubeBaseEditParse::"), iOException);
        Toast.makeText(rb(), (int) R.string.video_editor_fail_open_video, 1).show();
        mJ().finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void bw(Runnable runnable) {
        dt mJ = mJ();
        if (mJ != null) {
            mJ.runOnUiThread(runnable);
        }
    }

    public final void bx() {
        Intent intent = (Intent) this.aE.get();
        acti actiVar = this.aK;
        if (actiVar != null && actiVar.c() != null) {
            InteractionLoggingScreen c = this.aK.c();
            intent.putExtra("parent_csn", c.a);
            intent.putExtra("parent_ve_type", c.f);
        }
        intent.putExtra("extractor_sample_source", this.aQ);
        intent.putExtra("sunset_banner_enabled", this.aN);
        startActivityForResult(intent, 15911);
    }

    public final void by(Track track) {
        float f;
        Uri uri;
        if (akzj.f(track, this.aI.h)) {
            return;
        }
        zxh zxhVar = this.aI;
        if (!akzj.f(track, zxhVar.h)) {
            Track track2 = zxhVar.h;
            zxhVar.h = track;
            long j = 0;
            zxhVar.d.w(0L);
            Track track3 = zxhVar.h;
            if (track3 != null) {
                uri = track3.d;
                f = track2 == null ? 0.3f : zxhVar.d.e();
                j = zxhVar.d.g();
            } else {
                f = 0.0f;
                uri = null;
            }
            zxhVar.d.x(uri);
            zxhVar.d.y(f);
            zxhVar.d.w(j);
        }
        this.af = false;
        bF();
        if (track == null) {
            a();
            return;
        }
        if (this.aI.p()) {
            o(false, true);
        }
        p(track.d);
    }

    public final void bz(acti actiVar) {
        actiVar.getClass();
        this.aK = actiVar;
    }

    @Override // defpackage.dp
    public void mR() {
        super.mR();
        VideoTrimView aQ = aQ();
        if (aQ != null) {
            aQ.p(null, null, vqp.a);
            vqp vqpVar = aQ.q;
            if (vqpVar != null) {
                vqpVar.h(aQ);
            }
        }
        AudioTrackView aS = aS();
        if (aS != null) {
            aS.d();
        }
        vqp vqpVar2 = this.ae;
        if (vqpVar2 != null) {
            vqpVar2.h(this);
        }
        EditableVideoControllerView aU = aU();
        aU.j(this);
        aU.o(null);
        zxh zxhVar = this.aI;
        zxhVar.g = null;
        zxhVar.o();
        this.aF.post(new zwu(this, 1));
        this.b = true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == aG()) {
            aN(actj.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_BUTTON);
            if (this.aI.h != null) {
                zjw zjwVar = this.ah;
                if (zjwVar != null) {
                    AlertDialog alertDialog = zjwVar.b;
                    if (alertDialog != null) {
                        alertDialog.dismiss();
                        zjwVar.b = null;
                    }
                    this.ah = null;
                }
                zjw zjwVar2 = new zjw(mJ(), this.aD, this.aI.h, new zwu(this), new zwu(this, 2, null));
                this.ah = zjwVar2;
                zjwVar2.b.show();
                return;
            }
            bx();
        } else if (view == aI()) {
            aN(actj.UPLOAD_VIDEO_EDITING_VIDEO_EFFECTS_BUTTON);
            if (aT().c() != null) {
                ylx.o(this, aT().c().d(), zbx.d, new zdt() { // from class: zwo
                    @Override // defpackage.zdt
                    public final void a(Object obj) {
                        zwx zwxVar = zwx.this;
                        Integer num = (Integer) obj;
                        if (num == null || num.intValue() <= 0) {
                            return;
                        }
                        View aI = zwxVar.aI();
                        Context context = aI.getContext();
                        if (!zdg.e(context)) {
                            return;
                        }
                        zdg.c(context, aI, context.getString(R.string.a11y_new_effect_available_indicator));
                    }
                });
                bh();
            }
            aT().k();
        } else if (view != bq()) {
        } else {
            if (!this.af && aN(actj.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_VOLUME)) {
                this.af = true;
            }
            n(!this.c);
        }
    }

    @Override // defpackage.dp
    public void oz(Bundle bundle) {
        bundle.putInt("max_hardware_decoders", this.aR);
        bundle.putBoolean("extractor_sample_source_enabled", this.aQ);
        bundle.putLong("max_video_duration_us", this.aO);
        bundle.putParcelable("video_uri", this.aI.c);
        vqr vqrVar = this.aI.d;
        VideoMetaData videoMetaData = null;
        bundle.putParcelable("editable_video_edits", vqrVar != null ? vqrVar.a : null);
        if (!this.ag) {
            vqr vqrVar2 = this.aI.d;
            if (vqrVar2 != null) {
                videoMetaData = vqrVar2.b;
            }
            bundle.putParcelable("video_meta_data", videoMetaData);
        }
        bundle.putLong("playback_position", this.aI.e());
        bundle.putBoolean("audio_mixer_button_click_logged", this.af);
        bundle.putBoolean("audio_swap_enabled", this.aM);
        bundle.putParcelable("audio_swap_track", this.aI.h);
        bundle.putBoolean("audio_cross_fade_visible", this.c);
        boolean z = false;
        if (aE() != null && aE().getVisibility() == 0) {
            z = true;
        }
        bundle.putBoolean("audio_panel_visible", z);
        bundle.putInt("video_filter_pipeline", this.aP);
        bundle.putBoolean("video_filters_view_visible", aT().f);
        bundle.putBoolean("video_meta_data_saved_to_disk", this.aS);
    }

    protected abstract int q();

    @Override // defpackage.vqm
    public final void r(vqp vqpVar) {
    }

    @Override // defpackage.zxg
    public final void s() {
        by(null);
        Toast.makeText(mJ(), rh().getString(R.string.upload_edit_video_fragment_audio_swap_error), 1).show();
    }
}
