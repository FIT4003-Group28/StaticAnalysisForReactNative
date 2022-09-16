package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ui.DspSeekBar;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ui.MusicWaveformView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.player.ui.PlayerView;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: hhc  reason: default package */
/* loaded from: classes3.dex */
public final class hhc extends zxr implements View.OnClickListener, hga {
    hfz A;
    final SeekBar.OnSeekBarChangeListener B;
    public actj C;
    private final eo E;
    private final hew F;
    private final View G;
    private final TextView H;
    private final PlayerView I;

    /* renamed from: J  reason: collision with root package name */
    private aypg f208J;
    private hha K;
    private apzg L;
    private boolean M;
    private DspSeekBar N;
    private final hgz O;
    public final Context a;
    public final Executor b;
    public final ajmu c;
    public final ajmy d;
    public final hfn e;
    public final hkl f;
    public final hey g;
    public final ImageView h;
    public final int i;
    public final Handler j;
    public final TextView k;
    public final SeekBar l;
    public final MusicWaveformView m;
    public final boolean n;
    public hfx o;
    public final boolean p;
    public final hgc q;
    public ImageView r;
    public View s;
    public long t;
    public long u;
    public long v;
    public gyq w;
    public final acti x;
    public String y;
    public hez z;

    public hhc(Context context, Executor executor, acti actiVar, hfn hfnVar, hew hewVar, ajmy ajmyVar, hkl hklVar, eo eoVar, hey heyVar) {
        super(context, eoVar, actiVar, true, true);
        View inflate;
        ajmt a = ajmu.a();
        a.b(R.drawable.ic_music_note);
        this.c = a.a();
        this.a = context;
        this.b = executor;
        this.F = hewVar;
        this.d = ajmyVar;
        this.e = hfnVar;
        this.f = hklVar;
        this.E = eoVar;
        boolean i = hklVar.i();
        this.n = i;
        this.x = actiVar;
        this.g = heyVar;
        F(context.getResources().getString(R.string.music_scrubber_controller_close_button_text));
        if (i) {
            inflate = LayoutInflater.from(context).inflate(R.layout.music_scrubber_overlay_layout, (ViewGroup) null);
        } else {
            inflate = LayoutInflater.from(context).inflate(R.layout.music_scrubber_layout, (ViewGroup) null);
        }
        this.G = inflate;
        this.h = (ImageView) inflate.findViewById(R.id.shorts_music_album_art_view);
        if (i) {
            inflate.findViewById(R.id.shorts_change_sound_container).setOnClickListener(new View.OnClickListener() { // from class: hgq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    hgc hgcVar;
                    hhc hhcVar = hhc.this;
                    hhcVar.g.a(hhcVar.x, actj.SHORTS_CREATION_AUDIO_SCRUBBER_CHANGE_SOUND);
                    if (!hhcVar.n || (hgcVar = hhcVar.q) == null || !hgcVar.at()) {
                        return;
                    }
                    hhcVar.q.dismiss();
                }
            });
        }
        this.i = (int) context.getResources().getDimension(R.dimen.camera_music_album_art_size);
        this.H = (TextView) inflate.findViewById(R.id.play_position_text);
        this.k = (TextView) inflate.findViewById(R.id.audio_duration_text);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.play_progress_bar_view_stub);
        auuw auuwVar = hklVar.a.a().z;
        if ((auuwVar == null ? auuw.a : auuwVar).t) {
            viewStub.setLayoutResource(R.layout.music_scrubber_dsp_seekbar);
        } else {
            viewStub.setLayoutResource(R.layout.music_scrubber_seekbar);
        }
        viewStub.inflate();
        SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.play_progress_bar);
        this.l = seekBar;
        if (seekBar instanceof DspSeekBar) {
            this.N = (DspSeekBar) seekBar;
            hfz hfzVar = new hfz();
            this.A = hfzVar;
            this.N.a = hfzVar;
            this.r = (ImageView) inflate.findViewById(R.id.waveform_boundary_image);
            this.B = new hgw(this);
        } else {
            this.B = new hgy(this);
        }
        seekBar.setOnSeekBarChangeListener(this.B);
        seekBar.setAccessibilityDelegate(new hhb(this));
        MusicWaveformView musicWaveformView = (MusicWaveformView) inflate.findViewById(R.id.waveform_view);
        this.m = musicWaveformView;
        musicWaveformView.h = this;
        this.j = new Handler(Looper.getMainLooper());
        if (i) {
            if (hklVar.e()) {
                ((YouTubeTextView) inflate.findViewById(R.id.shorts_change_music)).setText(R.string.change_sound_option);
            }
            hgz hgzVar = new hgz(this);
            this.O = hgzVar;
            boolean e = hklVar.e();
            hgc hgcVar = new hgc();
            Bundle bundle = new Bundle();
            bundle.putBoolean("OverlayDialogFragment.enableMusicToSoundRename", e);
            hgcVar.ae(bundle);
            this.q = hgcVar;
            hgcVar.af = inflate;
            if (hgcVar.ae) {
                hgcVar.aE();
            }
            hgcVar.ah = hgzVar;
        } else {
            this.O = null;
            this.q = null;
        }
        this.p = ((Boolean) hklVar.b.a.a.V(axwv.g).B().aw()).booleanValue();
        this.I = (PlayerView) inflate.findViewById(R.id.scrubber_player_view);
    }

    private final long J(long j) {
        return L(j) ? Math.max(this.v - this.u, 0L) : j;
    }

    private final void K(long j) {
        ylr.c();
        TextView textView = this.H;
        if (textView != null) {
            textView.setText(vqw.f(this.a, j, false));
        }
    }

    private final boolean L(long j) {
        return j >= this.v - this.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final asjj w(long j) {
        aopa createBuilder = asjj.a.createBuilder();
        aopa createBuilder2 = asjz.a.createBuilder();
        aopa createBuilder3 = asjw.a.createBuilder();
        createBuilder3.copyOnWrite();
        asjw asjwVar = (asjw) createBuilder3.instance;
        asjwVar.b |= 1;
        asjwVar.c = j;
        asjw asjwVar2 = (asjw) createBuilder3.mo39build();
        createBuilder2.copyOnWrite();
        asjz asjzVar = (asjz) createBuilder2.instance;
        asjwVar2.getClass();
        asjzVar.e = asjwVar2;
        asjzVar.b |= 8;
        asjz asjzVar2 = (asjz) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        asjj asjjVar = (asjj) createBuilder.instance;
        asjzVar2.getClass();
        asjjVar.B = asjzVar2;
        asjjVar.c |= 262144;
        return (asjj) createBuilder.mo39build();
    }

    @Override // defpackage.zxr
    protected final View a() {
        return this.G;
    }

    @Override // defpackage.zxr
    protected final CharSequence b() {
        return this.a.getResources().getString(R.string.music_scrubber_controller_title);
    }

    @Override // defpackage.zxr, defpackage.zxy
    public final void f() {
        m();
        super.f();
    }

    @Override // defpackage.zxr, defpackage.zxy
    public final void g() {
        super.g();
        q();
    }

    @Override // defpackage.zxr, defpackage.zxy
    public final void k() {
        n();
    }

    @Override // defpackage.zxr, defpackage.zxy
    public final void l() {
        o();
    }

    @Override // defpackage.hga
    public final void lW() {
        hfx hfxVar;
        if (this.n) {
            hgc hgcVar = this.q;
            if (hgcVar != null) {
                hgcVar.n(false);
            }
        } else {
            B(false);
        }
        this.j.removeCallbacksAndMessages(null);
        hfz hfzVar = this.A;
        if (hfzVar != null) {
            hfzVar.d = null;
        }
        if (!this.p || (hfxVar = this.o) == null) {
            return;
        }
        hfxVar.e();
    }

    @Override // defpackage.hga
    public final void lX() {
        this.w.a(actj.SHORTS_CREATION_AUDIO_SCRUBBER_WAVEFORM).f();
        if (this.n) {
            hgc hgcVar = this.q;
            if (hgcVar != null) {
                hgcVar.n(true);
            }
        } else {
            B(true);
        }
        if (this.A != null) {
            MusicWaveformView musicWaveformView = this.m;
            long j = this.t;
            hhd hhdVar = musicWaveformView.a;
            if (amuk.o(hhdVar.c).contains(Integer.valueOf((int) (((float) j) / hhdVar.e)))) {
                ampq a = this.A.a(this.t);
                if (a.h()) {
                    gyo a2 = this.w.a(actj.SHORTS_CREATION_AUDIO_SCRUBBER_DSP_ANNOTATION);
                    a2.a = w(((Long) a.c()).longValue());
                    a2.b();
                    this.A.d = (Long) a.c();
                    this.t = ((Long) a.c()).longValue();
                }
            }
        }
        j(this.t);
        this.b.execute(new hgt(this, 3));
    }

    @Override // defpackage.hga
    public final boolean lY(long j) {
        long J2 = J(j);
        K(J2);
        s(J2);
        this.t = J2;
        return L(j);
    }

    public final void m() {
        hfx hfxVar;
        if (this.n) {
            this.w.c(acuo.a(127991)).a();
            this.w.b(acuo.b(22156)).b();
        }
        if (this.p && (hfxVar = this.o) != null) {
            hfxVar.b();
        } else {
            if (!this.M) {
                this.F.f(false);
                this.F.g(true);
            }
            if (!this.M) {
                this.e.i(this.t);
            }
        }
        hha hhaVar = this.K;
        if (hhaVar != null) {
            hhaVar.a();
        }
        this.w.a(actj.SHORTS_CREATION_AUDIO_SCRUBBER_DISMISS).b();
    }

    public final void o() {
        hfx hfxVar;
        this.l.setProgress((int) this.t);
        if (this.p && (hfxVar = this.o) != null) {
            hfxVar.c();
        } else if (!this.M) {
            this.F.g(false);
            this.F.e(1.0f);
            this.F.f(true);
            this.F.i();
        }
        this.b.execute(new hgt(this, 3));
        hha hhaVar = this.K;
        if (hhaVar != null) {
            hhaVar.b();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.s) {
            actj actjVar = this.C;
            if (actjVar != null) {
                this.w.a(actjVar).b();
            }
            if (this.n) {
                hgc hgcVar = this.q;
                if (hgcVar == null || hgcVar.at()) {
                    return;
                }
                this.q.qw(this.E, "OverlayDialogFragment");
            } else if (I()) {
            } else {
                G();
            }
        }
    }

    public final void p(View view, long j, long j2, hha hhaVar, gyq gyqVar, actj actjVar, boolean z, hez hezVar, hfx hfxVar, apzg apzgVar) {
        PlayerView playerView;
        this.u = j2;
        this.m.b(j, j2, this.G.findViewById(R.id.waveform_boundary_image));
        view.getClass();
        this.s = view;
        view.setOnClickListener(this);
        this.K = hhaVar;
        this.C = actjVar;
        this.M = z;
        this.z = hezVar;
        this.o = hfxVar;
        if (this.n) {
            this.w = new gyq(this.x);
            hgc hgcVar = this.q;
            if (hgcVar != null) {
                hgcVar.ag = hfxVar.g();
            }
        } else {
            gyqVar.getClass();
            this.w = gyqVar;
        }
        if (this.f.f() && (playerView = this.I) != null) {
            hfxVar.f(playerView);
        }
        boolean z2 = true;
        if (!z && !hezVar.equals(this.F) && !hezVar.equals(hfxVar)) {
            z2 = false;
        }
        aqxo.p(z2);
        this.f208J = this.e.b().as(new ayqb() { // from class: hgs
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                final hhc hhcVar = hhc.this;
                ampq ampqVar = (ampq) obj;
                if (ampqVar.h()) {
                    ShortsCreationSelectedTrack shortsCreationSelectedTrack = (ShortsCreationSelectedTrack) ampqVar.c();
                    String k = shortsCreationSelectedTrack.k();
                    if (!k.equals(hhcVar.y)) {
                        hhcVar.y = k;
                        hhcVar.b.execute(new hgt(hhcVar));
                        hhcVar.t = shortsCreationSelectedTrack.a();
                        avhn h = shortsCreationSelectedTrack.h();
                        int i = hhcVar.i;
                        hhcVar.d.i(hhcVar.h, akel.r(h, i, i), hhcVar.c);
                        if (hhcVar.A != null) {
                            hhcVar.b.execute(new hgu(hhcVar, shortsCreationSelectedTrack, 1));
                        }
                    }
                    if (hhcVar.A != null && shortsCreationSelectedTrack.g() != null) {
                        hhcVar.b.execute(new hgu(hhcVar, shortsCreationSelectedTrack, 3));
                    }
                    if (!shortsCreationSelectedTrack.d().h()) {
                        return;
                    }
                    final long longValue = ((Long) shortsCreationSelectedTrack.d().c()).longValue();
                    final ampq e = shortsCreationSelectedTrack.e();
                    if (longValue == hhcVar.v) {
                        return;
                    }
                    hhcVar.v = longValue;
                    hhcVar.b.execute(new Runnable() { // from class: hgr
                        @Override // java.lang.Runnable
                        public final void run() {
                            amuk o;
                            hhc hhcVar2 = hhc.this;
                            ampq ampqVar2 = e;
                            long j3 = longValue;
                            if (!ampqVar2.h() || !hhcVar2.f.k()) {
                                hhcVar2.m.a(j3);
                                hhcVar2.w.a(actj.SHORTS_CREATION_AUDIO_SCRUBBER_PLACEHOLDER_WAVEFORM).e();
                            } else {
                                MusicWaveformView musicWaveformView = hhcVar2.m;
                                byte[] bArr = (byte[]) ampqVar2.c();
                                hfz hfzVar = hhcVar2.A;
                                if (hfzVar == null) {
                                    o = amuk.q();
                                } else {
                                    o = amuk.o(hfzVar.a);
                                }
                                musicWaveformView.c(j3, bArr, o);
                                hhcVar2.w.a(actj.SHORTS_CREATION_AUDIO_SCRUBBER_REAL_WAVEFORM).e();
                            }
                            hhcVar2.k.setText(vqw.f(hhcVar2.a, j3, false));
                            hhcVar2.u(hhcVar2.t);
                            hhcVar2.s.setVisibility(0);
                            if (j3 < hhcVar2.u) {
                                hhcVar2.s.setEnabled(false);
                            } else {
                                hhcVar2.s.setEnabled(true);
                            }
                            hhcVar2.l.setMax((int) j3);
                        }
                    });
                    hhcVar.w.a(hhcVar.C).e();
                    return;
                }
                hhcVar.v = 0L;
                hhcVar.y = null;
                hhcVar.b.execute(new hgt(hhcVar, 1));
                hhcVar.w.a(hhcVar.C).d();
            }
        });
        this.L = gyq.d(gyqVar.a, apzgVar, actjVar != null ? actjVar.II : 2);
    }

    public final void q() {
        if (this.n) {
            gyp c = this.w.c(acuo.a(127991));
            c.a = this.L;
            c.b();
            this.w.b(acuo.b(22156)).a();
        }
        if (this.A != null) {
            ShortsCreationSelectedTrack a = this.e.a();
            if (a == null || a.g() == null || auup.a.equals(a.g())) {
                this.b.execute(new hgt(this, 2));
            } else {
                this.b.execute(new hgu(this, a));
                if (a.d().h()) {
                    this.b.execute(new hgu(this, a, 2));
                }
            }
        }
        gyo a2 = this.w.a(actj.SHORTS_CREATION_AUDIO_SCRUBBER_TIMELINE);
        a2.h(true);
        a2.a();
        gyo a3 = this.w.a(actj.SHORTS_CREATION_AUDIO_SCRUBBER_DSP_ANNOTATION);
        a3.h(true);
        a3.a();
        gyo a4 = this.w.a(actj.SHORTS_CREATION_AUDIO_SCRUBBER_WAVEFORM);
        a4.h(true);
        a4.a();
        gyo a5 = this.w.a(actj.SHORTS_CREATION_AUDIO_SCRUBBER_DISMISS);
        a5.h(true);
        a5.a();
    }

    public final void r() {
        aypg aypgVar = this.f208J;
        if (aypgVar != null && !aypgVar.e()) {
            ayqi.c((AtomicReference) this.f208J);
        }
        this.z = null;
    }

    public final void s(long j) {
        ylr.c();
        SeekBar seekBar = this.l;
        if (seekBar != null) {
            seekBar.setProgress((int) j);
        }
    }

    public final void t(long j) {
        long J2 = J(j);
        u(J2);
        this.t = J2;
    }

    public final void u(long j) {
        K(j);
        this.m.e(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v() {
        hfx hfxVar;
        ylr.c();
        hez hezVar = this.z;
        if (hezVar == null) {
            return;
        }
        long j = hezVar.j();
        if (this.p && (hfxVar = this.o) != null) {
            hfxVar.d(this.u);
        } else {
            long j2 = this.t;
            if (j >= this.u + j2 && !this.M) {
                this.F.c(j2);
            }
        }
        MusicWaveformView musicWaveformView = this.m;
        musicWaveformView.e = Math.max(((float) j) / musicWaveformView.a.e, musicWaveformView.d);
        musicWaveformView.invalidate();
        this.j.postDelayed(new hgt(this, 3), 60L);
    }

    public final void j(long j) {
        hfx hfxVar;
        if (this.p && (hfxVar = this.o) != null) {
            hfxVar.a(this.t);
        } else if (!this.M) {
            this.F.c(j);
        } else {
            this.e.i(j);
        }
    }

    public final void n() {
        hfx hfxVar;
        if (this.p && (hfxVar = this.o) != null) {
            hfxVar.e();
        } else if (!this.M) {
            this.F.b();
        }
        this.j.removeCallbacksAndMessages(null);
    }
}
