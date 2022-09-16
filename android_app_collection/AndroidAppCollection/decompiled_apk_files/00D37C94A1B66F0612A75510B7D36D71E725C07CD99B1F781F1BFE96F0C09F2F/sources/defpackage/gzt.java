package defpackage;

import android.animation.AnimatorSet;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.ShortsEditCoordinatorLayout;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.ShortsEditToolButtonView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.ShortsPlayerView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.ShortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.youtube.R;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: gzt  reason: default package */
/* loaded from: classes3.dex */
public final class gzt extends gze implements acth, hah, zqw, hvx, hax, zmv {
    public acti a;
    public boolean aA;
    public gyq aB;
    public gyn aC;
    public zrg aD;
    private ShortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver aE;
    private View aF;
    private aypf aG;
    private View aH;
    private ShortsEditToolButtonView aK;
    private ShortsEditToolButtonView aL;
    private ChooseFilterView aM;
    private boolean aN;
    private gva aO;
    public Context ae;
    public hhc af;
    public hvy ag;
    public hay ah;
    public hdq ai;
    public hkg aj;
    public hgp ak;
    public azqb al;
    public ayor am;
    public hfw an;
    hgh ao;
    hgo ap;
    public apzg aq;
    public ShortsPlayerView ar;
    public View as;
    public ImageView at;
    public View au;
    public AnimatorSet aw;
    public gzs ax;
    public View ay;
    public boolean az;
    public hai b;
    public hkl c;
    public hci d;
    public hgi e;
    private boolean aI = true;
    public boolean av = false;
    private boolean aJ = false;

    @Override // defpackage.dp
    public final void W() {
        aypg aypgVar;
        super.W();
        hay hayVar = this.ah;
        hayVar.b = null;
        zqv a = hayVar.a();
        if (a != null) {
            a.d(hayVar);
            hayVar.c = (File) a.j(amon.a).b().f();
        }
        hgh hghVar = this.ao;
        if (hghVar != null) {
            hghVar.d();
        }
        hgo hgoVar = this.ap;
        if (hgoVar != null && (aypgVar = hgoVar.b) != null && !aypgVar.e()) {
            ayqi.c((AtomicReference) hgoVar.b);
        }
        boolean z = true;
        ((hap) this.al.get()).c(true);
        hai haiVar = this.b;
        pkl pklVar = haiVar.r;
        if (pklVar == null || pklVar.D()) {
            z = false;
        }
        haiVar.q = z;
        haiVar.e();
        if (haiVar.s != null) {
            haiVar.m(etg.j);
            zqq zqqVar = haiVar.s;
            if (zqqVar != null) {
                zqqVar.h();
            }
        }
        haiVar.v();
        aypg aypgVar2 = haiVar.k;
        if (aypgVar2 != null) {
            ayqi.c((AtomicReference) aypgVar2);
        }
        haiVar.E.a.f();
        ShortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver shortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver = this.aE;
        if (shortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver != null) {
            shortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver.b = false;
            this.aD.a.remove(shortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver);
        }
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        hai haiVar = this.b;
        zqq zqqVar = haiVar.s;
        if (zqqVar != null) {
            zqqVar.j();
        } else {
            haiVar.A();
        }
        if (!haiVar.q) {
            haiVar.f();
        }
        gyn gynVar = this.aC;
        acvg acvgVar = gynVar.d;
        if (acvgVar != null) {
            acvgVar.c("aft");
            gynVar.d = null;
        }
        ShortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver shortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver = this.aE;
        if (shortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver != null) {
            this.aD.a.add(shortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver);
            this.aE.b = true;
        }
        hay hayVar = this.ah;
        hayVar.b = this;
        zqv a = hayVar.a();
        if (a != null) {
            a.c(hayVar);
        }
        this.ay.setEnabled(true);
    }

    public final void aE() {
        this.aI = false;
        this.as.setVisibility(8);
        this.aF.setVisibility(8);
    }

    @Override // defpackage.hax
    public final void aF(final boolean z) {
        if (this.aJ == z) {
            return;
        }
        this.aJ = z;
        this.at.post(new Runnable() { // from class: gzo
            @Override // java.lang.Runnable
            public final void run() {
                gzt gztVar = gzt.this;
                boolean z2 = z;
                if (z2) {
                    gztVar.at.performHapticFeedback(1);
                }
                if (gztVar.au.getAnimation() != null && gztVar.au.getAnimation().hasStarted() && !gztVar.au.getAnimation().hasEnded()) {
                    gztVar.au.getAnimation().reset();
                }
                float f = true != z2 ? 1.0f : 1.1667f;
                gztVar.au.animate().scaleX(f).scaleY(f).setDuration(75L).start();
                TransitionDrawable transitionDrawable = (TransitionDrawable) gztVar.au.getBackground();
                if (z2) {
                    transitionDrawable.startTransition(75);
                    gztVar.a.H(3, new acte(acuo.b(39104)), null);
                    return;
                }
                transitionDrawable.reverseTransition(75);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aG() {
        gzu gzuVar;
        dp dpVar = this.C;
        if ((dpVar instanceof gzu) && (gzuVar = (gzu) dpVar) != null) {
            gzuVar.b();
        }
        if (aN()) {
            hai haiVar = this.b;
            hhp b = haiVar.f.b();
            if (b != null) {
                b.m();
                if (!b.c().h()) {
                    return;
                }
                haiVar.g.m((axcw) b.c().c());
                return;
            }
            haiVar.g.j();
        }
    }

    public final void aH() {
        ((hap) this.al.get()).c(true);
        this.a.H(3, new acte(acuo.b(96638)), null);
        if (aN()) {
            new AlertDialog.Builder(this.ae).setTitle(R.string.shorts_editor_discard_dialog_title).setMessage(R.string.shorts_editor_discard_dialog_text).setPositiveButton(R.string.shorts_editor_discard_dialog_yes, new DialogInterface.OnClickListener() { // from class: gzi
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    gzt.this.aG();
                }
            }).setNegativeButton(R.string.shorts_editor_discard_dialog_no, gzj.a).create().show();
        } else {
            aG();
        }
    }

    @Override // defpackage.hah
    public final void aI() {
        this.ay.setEnabled(true);
    }

    @Override // defpackage.hax
    public final void aJ(final boolean z, final boolean z2) {
        if (!z && this.aN) {
            gva gvaVar = this.aO;
            if (gvaVar.i > 0) {
                gvaVar.f.H(3, gvaVar.g, null);
            }
        }
        if (!this.az || !aO()) {
            this.at.post(new Runnable() { // from class: gzp
                @Override // java.lang.Runnable
                public final void run() {
                    gzt gztVar = gzt.this;
                    boolean z3 = z;
                    boolean z4 = z2;
                    if (z3) {
                        gztVar.aE();
                        ((hap) gztVar.al.get()).c(true);
                    } else {
                        gztVar.aL();
                    }
                    if (gztVar.av == z4) {
                        return;
                    }
                    gztVar.av = z4;
                    gztVar.aw = hqb.b(gztVar.ax, z4, gztVar.aw);
                }
            });
        }
    }

    @Override // defpackage.hvx
    public final void aK(boolean z) {
    }

    public final void aL() {
        this.aI = true;
        this.as.setVisibility(0);
        this.aF.setVisibility(0);
    }

    public final void aM(boolean z) {
        if (z) {
            aE();
        } else {
            aL();
        }
    }

    final boolean aN() {
        axcw axcwVar;
        if (this.c.g()) {
            hai haiVar = this.b;
            hhp b = haiVar.f.b();
            ampq c = b == null ? amon.a : b.c();
            ShortsCreationSelectedTrack a = haiVar.g.a();
            if (a == null ? c.h() : !((axcwVar = (axcw) c.f()) != null && axcwVar.c.equals(a.k()) && hhw.g(axcwVar) == a.a())) {
                return true;
            }
        }
        return (this.c.l() && !FilterMapTable$FilterDescriptor.h(this.b.t.g().b)) || this.ah.q();
    }

    public final boolean aO() {
        return !this.d.j();
    }

    @Override // defpackage.zmv
    public final void c() {
    }

    @Override // defpackage.zmv
    public final void e(float f, float f2) {
    }

    @Override // defpackage.dp
    public final void lJ(Bundle bundle) {
        super.lJ(bundle);
        View view = this.O;
        if (view == null) {
            return;
        }
        view.findViewById(R.id.shorts_edit_timeline_button).setVisibility(0);
        this.d.e(view, this.a);
        this.aG.d(this.d.c().as(new gzn(this, 1)));
        ((ShortsEditCoordinatorLayout) view).i = new zdt() { // from class: gzl
            @Override // defpackage.zdt
            public final void a(Object obj) {
                gzt gztVar = gzt.this;
                MotionEvent motionEvent = (MotionEvent) obj;
                if (motionEvent == null) {
                    return;
                }
                Rect rect = new Rect();
                gztVar.as.getGlobalVisibleRect(rect);
                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return;
                }
                ((hap) gztVar.al.get()).c(true);
            }
        };
        this.aG.d(((hap) this.al.get()).a().as(new gzn(this)));
    }

    @Override // defpackage.dp
    public final void mR() {
        pxt pxtVar;
        super.mR();
        this.af.r();
        hai haiVar = this.b;
        haiVar.v();
        aypg aypgVar = haiVar.k;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
        }
        haiVar.o = null;
        ShortsPlayerView shortsPlayerView = haiVar.n;
        if (shortsPlayerView.e != null) {
            shortsPlayerView.a.setSurfaceTextureListener(null);
            pkl pklVar = shortsPlayerView.e;
            if (pklVar != null) {
                pklVar.B(shortsPlayerView.l);
            }
            shortsPlayerView.e = null;
            shortsPlayerView.f = null;
        }
        pkl pklVar2 = haiVar.r;
        if (pklVar2 != null && (pxtVar = haiVar.B) != null) {
            pklVar2.M();
            if (pklVar2.o == pxtVar) {
                pkc d = pklVar2.c.d(pklVar2.d);
                d.f(7);
                d.e(null);
                d.d();
            }
        }
        pkl pklVar3 = haiVar.r;
        if (pklVar3 != null) {
            pklVar3.B(haiVar);
            haiVar.r.w();
            haiVar.r = null;
        }
        zqq zqqVar = haiVar.s;
        if (zqqVar != null) {
            zqqVar.h();
            haiVar.s.i();
            haiVar.s = null;
        }
        this.aG.qr();
        ShortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver shortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver = this.aE;
        if (shortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver != null) {
            shortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver.a = null;
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        zqq zqqVar;
        byte[] byteArray;
        this.aG = new aypf();
        Bundle bundle2 = this.m;
        if (bundle2 != null && (byteArray = bundle2.getByteArray("SHORTS_EDIT_VIDEO_COMMAND_KEY")) != null) {
            try {
                this.aq = (apzg) aopi.parseFrom(apzg.a, byteArray, aoos.b());
            } catch (aopx e) {
                zep.d("Error parsing navigation endpoint.", e);
            }
        }
        hkg hkgVar = this.aj;
        String str = hkgVar.e;
        String str2 = null;
        if (str != null) {
            if (hkgVar.f) {
                hkgVar.d.y(str, avul.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_ENTERED_SHORTS_EDIT);
            } else {
                hkgVar.c.d(str, null, avul.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_ENTERED_SHORTS_EDIT);
            }
        }
        this.a.d(acuo.a(96658), this.aq, null);
        this.a.n(new acte(acuo.b(96638)));
        this.a.n(new acte(acuo.b(96644)));
        if (this.c.g()) {
            this.a.n(new acte(acuo.b(106443)));
            ((acsx) this.a).D(new acte(acuo.b(106444)));
            ((acsx) this.a).D(new acte(acuo.b(115550)));
            ((acsx) this.a).D(new acte(acuo.b(115549)));
            if (this.c.h()) {
                ((acsx) this.a).D(new acte(acuo.b(106445)));
            }
        }
        this.a.n(new acte(acuo.b(109823)));
        if (this.c.l()) {
            this.a.n(new acte(acuo.b(119242)));
        }
        this.aB = new gyq(this.a);
        View inflate = layoutInflater.inflate(R.layout.shorts_edit_fragment_2, viewGroup, false);
        this.aF = inflate.findViewById(R.id.shorts_edit_top_bar_container);
        this.ar = (ShortsPlayerView) inflate.findViewById(R.id.shorts_edit_player_view);
        final hai haiVar = this.b;
        Context rb = rb();
        gyq gyqVar = this.aB;
        ShortsPlayerView shortsPlayerView = this.ar;
        haiVar.j = rb;
        haiVar.n = shortsPlayerView;
        haiVar.o = this;
        haiVar.v();
        if (haiVar.A.h()) {
            haiVar.p = new hbg();
            hbh hbhVar = new hbh(haiVar.p);
            gzv gzvVar = haiVar.D;
            Context context = haiVar.j;
            haiVar.r = gzv.a(context, new hbi(context, hbhVar), new hbd(hbhVar));
        } else {
            gzv gzvVar2 = haiVar.D;
            Context context2 = haiVar.j;
            haiVar.r = gzv.a(context2, new php(context2), new pvd(haiVar.j));
        }
        haiVar.r.N();
        haiVar.r.u(haiVar);
        haiVar.t.h(haiVar.i.b);
        haiVar.s = new zqq(haiVar.j, new zra() { // from class: haf
            @Override // defpackage.zra
            public final void a(SurfaceTexture surfaceTexture, int i) {
                final hai haiVar2 = hai.this;
                final Surface surface = new Surface(surfaceTexture);
                haiVar2.c.execute(new Runnable() { // from class: haa
                    @Override // java.lang.Runnable
                    public final void run() {
                        final hai haiVar3 = hai.this;
                        final Surface surface2 = surface;
                        haiVar3.m(new zdt() { // from class: hab
                            @Override // defpackage.zdt
                            public final void a(Object obj) {
                                hai haiVar4 = hai.this;
                                Surface surface3 = surface2;
                                pkl pklVar = (pkl) obj;
                                if (pklVar == null) {
                                    return;
                                }
                                pklVar.M();
                                pklVar.J(surface3);
                                pklVar.y(-1, -1);
                                haiVar4.A();
                            }
                        });
                    }
                });
            }
        }, null, false, haiVar.E, false);
        haiVar.s.y(haiVar.t);
        if (((Boolean) haiVar.A.b.a.a.V(axwv.b).B().aw()).booleanValue() && (zqqVar = haiVar.s) != null) {
            zqqVar.i.F = true;
        }
        zqq zqqVar2 = haiVar.s;
        if (zqqVar2 != null) {
            zqqVar2.j();
        }
        pkl pklVar = haiVar.r;
        zqq zqqVar3 = haiVar.s;
        hkl hklVar = haiVar.A;
        shortsPlayerView.e = pklVar;
        shortsPlayerView.f = zqqVar3;
        shortsPlayerView.i = gyqVar;
        shortsPlayerView.a.setSurfaceTextureListener(new gyv(shortsPlayerView));
        pkl pklVar2 = shortsPlayerView.e;
        if (pklVar2 != null) {
            pklVar2.u(shortsPlayerView.l);
        }
        shortsPlayerView.j = hklVar;
        boolean d = hklVar.d();
        shortsPlayerView.k = d;
        if (d) {
            shortsPlayerView.c.setVisibility(0);
        }
        hai haiVar2 = this.b;
        if (bundle != null) {
            if (bundle.containsKey("shorts_editor_preview_audio_balance") && bundle.containsKey("shorts_editor_preview_currently_playing_track_id")) {
                haiVar2.w = bundle.getFloat("shorts_editor_preview_audio_balance");
                haiVar2.x = bundle.getString("shorts_editor_preview_currently_playing_track_id");
            }
            if (bundle.containsKey("shorts_editor_selected_preset_effects") && (string = bundle.getString("shorts_editor_selected_preset_effects")) != null) {
                haiVar2.l().c(string);
            }
        }
        this.aE = new ShortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver(this.b);
        View findViewById = inflate.findViewById(R.id.shorts_post_button);
        this.ay = findViewById;
        findViewById.setVisibility(0);
        this.ay.setOnClickListener(new gzk(this, 1));
        EditorButtonView editorButtonView = (EditorButtonView) inflate.findViewById(R.id.shorts_edit_back);
        editorButtonView.b.getDrawable().setAutoMirrored(true);
        editorButtonView.setOnClickListener(new gzk(this));
        View findViewById2 = inflate.findViewById(R.id.shorts_edit_toolbar);
        this.as = findViewById2;
        findViewById2.setVisibility(0);
        if (this.c.e()) {
            ShortsEditToolButtonView shortsEditToolButtonView = (ShortsEditToolButtonView) this.as.findViewById(R.id.shorts_edit_music_picker_button);
            String N = N(R.string.shorts_editor_sound_label);
            shortsEditToolButtonView.b.setText(N);
            shortsEditToolButtonView.setContentDescription(N);
        }
        this.aH = inflate.findViewById(R.id.trash_container);
        ((acsx) this.a).D(new acte(acuo.b(39104)));
        this.a.n(new acte(acuo.b(116194)));
        this.a.n(new acte(acuo.b(116195)));
        ImageView imageView = (ImageView) this.aH.findViewById(R.id.trash_icon);
        this.at = imageView;
        imageView.setImageResource(2131232461);
        this.au = this.aH.findViewById(R.id.trash_bg);
        this.ax = new gzs(this.aH);
        ShortsEditToolButtonView shortsEditToolButtonView2 = (ShortsEditToolButtonView) inflate.findViewById(R.id.shorts_edit_text_button);
        this.aK = shortsEditToolButtonView2;
        shortsEditToolButtonView2.setVisibility(0);
        this.ag.g(inflate.findViewById(R.id.text_container), inflate.findViewById(R.id.edit_video_container), this.aK, true, true, false, this.a);
        this.ag.p = actj.SHORTS_ADD_TEXT_BUTTON;
        this.ag.q = actj.SHORTS_CREATION_EDITOR_TOOL_TIP_EDIT_BUTTON;
        this.ag.r = actj.SHORTS_ADD_TEXT_EDITOR_CONTROL;
        this.ag.g.n(new acte(actj.SHORTS_ADD_TEXT_EDITOR_DONE_BUTTON));
        hay hayVar = this.ah;
        hayVar.a = this;
        zqv a = hayVar.a();
        if (bundle != null && a != null) {
            if (bundle.containsKey("SHORTS_STATE_EVENT_FILE_PATH_KEY")) {
                str2 = bundle.getString("SHORTS_STATE_EVENT_FILE_PATH_KEY");
            }
            if (str2 != null) {
                new zqu(a, str2).execute(new Void[0]);
            }
        }
        aypf aypfVar = this.aG;
        ayoi X = this.ah.b().X(this.am);
        final ShortsEditToolButtonView shortsEditToolButtonView3 = this.aK;
        shortsEditToolButtonView3.getClass();
        aypfVar.d(X.as(new ayqb() { // from class: gzm
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ShortsEditToolButtonView.this.setEnabled(((Boolean) obj).booleanValue());
            }
        }));
        this.ar.setOnTouchListener(new gzr(this, this.ah, this.aH, this.b, this));
        this.aG.d(this.ag.c().as(new gzn(this)));
        if (this.c.l()) {
            ShortsEditToolButtonView shortsEditToolButtonView4 = (ShortsEditToolButtonView) inflate.findViewById(R.id.shorts_edit_preset_button);
            this.aL = shortsEditToolButtonView4;
            shortsEditToolButtonView4.setVisibility(0);
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(rb(), 2132083446);
            zse l = this.b.l();
            ChooseFilterView chooseFilterView = (ChooseFilterView) LayoutInflater.from(contextThemeWrapper).inflate(R.layout.choose_preset_bottom_sheet_layout, viewGroup, false);
            this.aM = chooseFilterView;
            chooseFilterView.f(l, this);
            TextView textView = (TextView) inflate.findViewById(R.id.swipe_effect_text_view);
            hdq hdqVar = this.ai;
            ShortsEditToolButtonView shortsEditToolButtonView5 = this.aL;
            hdqVar.a(this.ar, this.aM, textView, this.aB, amuk.r(this.aF), contextThemeWrapper);
            shortsEditToolButtonView5.getClass();
            hdqVar.e = shortsEditToolButtonView5;
            shortsEditToolButtonView5.setOnClickListener(hdqVar);
            l.a(new hdm(hdqVar, 2));
            hdqVar.k = l;
            hdqVar.i = actj.SHORTS_CREATION_EDITOR_CHANGE_FILTER_BUTTON;
        }
        this.az = this.c.c();
        boolean m = this.c.m();
        this.aA = m;
        if (m) {
            this.ah.p(axbo.PREVIEW_MODE_REGULAR);
        }
        this.aN = this.c.d();
        this.aO = new gva(this.ar.c, rh().getColor(R.color.shorts_edit_guideline_positional_color), rh().getColor(R.color.shorts_edit_guideline_rotational_color), actj.SHORTS_CREATION_EDITOR_GUIDELINES, this.a);
        if (this.aN) {
            aopa createBuilder = awzm.a.createBuilder();
            aopa createBuilder2 = awzn.a.createBuilder();
            boolean z = this.aN;
            createBuilder2.copyOnWrite();
            awzn awznVar = (awzn) createBuilder2.instance;
            awznVar.b |= 1;
            awznVar.c = z;
            int dimensionPixelOffset = this.ae.getResources().getDimensionPixelOffset(R.dimen.shorts_edit_guidelines_snapping_distance);
            createBuilder2.copyOnWrite();
            awzn awznVar2 = (awzn) createBuilder2.instance;
            awznVar2.b = 2 | awznVar2.b;
            awznVar2.d = dimensionPixelOffset;
            createBuilder.copyOnWrite();
            awzm awzmVar = (awzm) createBuilder.instance;
            awzn awznVar3 = (awzn) createBuilder2.mo39build();
            awznVar3.getClass();
            awzmVar.c = awznVar3;
            awzmVar.b |= 1;
            awzm awzmVar2 = (awzm) createBuilder.mo39build();
            zqv a2 = this.ah.a();
            if (a2 != null) {
                zpa zpaVar = a2.b;
                axao a3 = axat.a();
                axbp a4 = axbq.a();
                a4.copyOnWrite();
                axbq.c((axbq) a4.instance, awzmVar2);
                a3.copyOnWrite();
                ((axat) a3.instance).x((axbq) a4.mo39build());
                zpaVar.a.add((axat) a3.mo39build());
            }
        }
        return inflate;
    }

    @Override // defpackage.zmv
    public final void md() {
    }

    @Override // defpackage.zmv
    public final void me(int i) {
        if (!this.c.l() || !this.aI) {
            return;
        }
        this.ai.b(i);
    }

    @Override // defpackage.zmv
    public final void mj(float f) {
    }

    @Override // defpackage.acth
    public final acti oi() {
        return this.a;
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        File file;
        hay hayVar = this.ah;
        if (hayVar != null && (file = hayVar.c) != null) {
            bundle.putString("SHORTS_STATE_EVENT_FILE_PATH_KEY", file.getAbsolutePath());
        }
        hai haiVar = this.b;
        bundle.putFloat("shorts_editor_preview_audio_balance", haiVar.w);
        bundle.putString("shorts_editor_preview_currently_playing_track_id", haiVar.x);
        String str = haiVar.t.g().b;
        if (!FilterMapTable$FilterDescriptor.h(str)) {
            bundle.putString("shorts_editor_selected_preset_effects", str);
        }
    }

    @Override // defpackage.zqw
    public final zqv q() {
        return this.b.k();
    }

    @Override // defpackage.hax
    public final void r(final axan axanVar) {
        if (this.aN) {
            final gva gvaVar = this.aO;
            gvaVar.b.post(new Runnable() { // from class: guz
                @Override // java.lang.Runnable
                public final void run() {
                    Paint paint;
                    gva gvaVar2 = gva.this;
                    axan axanVar2 = axanVar;
                    if (gvaVar2.h == null) {
                        Bitmap createBitmap = Bitmap.createBitmap(gvaVar2.b.getWidth(), gvaVar2.b.getHeight(), gva.a);
                        gvaVar2.h = new Canvas(createBitmap);
                        gvaVar2.b.setImageBitmap(createBitmap);
                    }
                    Canvas canvas = gvaVar2.h;
                    canvas.getClass();
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    if (axanVar2.b.size() != 0) {
                        Iterator it = axanVar2.b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (!gva.a((axal) it.next())) {
                                afus.b(2, 6, "[ShortsCreation][Android][Guidelines]Invalid GuidelineData");
                                break;
                            }
                        }
                        int width = gvaVar2.b.getWidth();
                        int height = gvaVar2.b.getHeight();
                        for (axal axalVar : axanVar2.b) {
                            if (gva.a(axalVar)) {
                                int a = awwd.a(axalVar.d);
                                if (a == 0 || a != 8) {
                                    paint = gvaVar2.c;
                                } else {
                                    paint = gvaVar2.d;
                                }
                                axam axamVar = axalVar.b;
                                if (axamVar == null) {
                                    axamVar = axam.a;
                                }
                                axam axamVar2 = axalVar.c;
                                if (axamVar2 == null) {
                                    axamVar2 = axam.a;
                                }
                                float[] fArr = gvaVar2.e;
                                float f = width;
                                fArr[0] = axamVar.c * f;
                                float f2 = height;
                                fArr[1] = axamVar.d * f2;
                                fArr[2] = axamVar2.c * f;
                                fArr[3] = axamVar2.d * f2;
                                Canvas canvas2 = gvaVar2.h;
                                canvas2.getClass();
                                canvas2.drawLines(fArr, paint);
                                gvaVar2.f.n(gvaVar2.g);
                            }
                        }
                    }
                    if (axanVar2.b.size() > gvaVar2.i) {
                        gvaVar2.b.performHapticFeedback(1);
                    }
                    gvaVar2.i = axanVar2.b.size();
                }
            });
        }
    }

    @Override // defpackage.hax
    public final void s(axbm axbmVar) {
        axca axcaVar;
        if (!this.az || !aO()) {
            if (((hap) this.al.get()).b(axbmVar, this.ar)) {
                return;
            }
            this.ag.mt(axbmVar);
            return;
        }
        axbk i = axbmVar.i();
        if (i.c == 1) {
            axcaVar = (axca) i.d;
        } else {
            axcaVar = axca.a;
        }
        if (axcaVar.c.isEmpty()) {
            return;
        }
        this.b.e();
        this.d.i(axbmVar.e());
    }
}
