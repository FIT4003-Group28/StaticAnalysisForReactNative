package com.google.android.apps.youtube.app.search.voice;

import android.content.Intent;
import android.graphics.Point;
import android.media.AudioRecord;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchHalfPlateV0Activity;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.libraries.youtube.search.voice.MicrophoneView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.youtube.R;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class VoiceSearchHalfPlateV0Activity extends lci implements akdz, ldh, lcn, ynl {
    public static final /* synthetic */ int ab = 0;
    private static final PermissionDescriptor[] ac = {new PermissionDescriptor(2, actj.VOICE_SEARCH_APPROVE_MICROPHONE_BUTTON, actj.VOICE_SEARCH_DENY_MICROPHONE_BUTTON)};
    public axxo A;
    public afvn B;
    public ConnectivitySlimStatusBarController C;
    protected akip D;
    public Runnable E;
    public TextView F;
    public TextView G;
    public TextView H;
    public TextView I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f152J;
    public boolean K;
    public boolean L;
    public LinearLayout M;
    public ImageView N;
    public List O = Collections.emptyList();
    public View P;
    public byte[] Q;
    public Point R;
    public Point S;
    AudioRecord T;
    public boolean U;
    public boolean V;
    public aurq W;
    public aacz X;
    public akdy Y;
    public acgf Z;
    public apwt aa;
    private boolean ad;
    private ImageView ae;
    private boolean af;
    private SoundPool ag;
    private int ah;
    private gfs ai;
    private String aj;
    private lbx ak;
    private boolean al;
    private boolean am;
    private int an;
    private String ao;
    private String ap;
    private int aq;
    private int ar;
    private int as;
    private lcv at;
    public Handler b;
    public MicrophoneView c;
    public TextView d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public akiq i;
    public eo j;
    public akea k;
    public boolean l;
    public lco m;
    public acvh n;
    public aadd o;
    public acti p;
    public akis q;
    public akjb r;
    public aaqp s;
    public yrj t;
    public gfu u;
    public yni v;
    public lbs w;
    public lcw x;
    public ScheduledExecutorService y;
    public akge z;

    private final String p() {
        String x = apwt.x();
        String a = this.aa.a();
        if (x.isEmpty() || a.isEmpty()) {
            return "en-US";
        }
        StringBuilder sb = new StringBuilder(x.length() + 1 + String.valueOf(a).length());
        sb.append(x);
        sb.append("-");
        sb.append(a);
        return sb.toString();
    }

    private final void q() {
        setVisible(false);
        this.am = true;
        Intent intent = getIntent();
        intent.putExtra("RegularVoiceSearch", true);
        setResult(-1, intent);
        h();
    }

    private final void r(dp dpVar, String str) {
        dp f = this.j.f(this.aj);
        dpVar.getClass();
        zgh.m(str);
        ex l = this.j.l();
        if (f != null && f.ap() && !f.equals(dpVar)) {
            l.l(f);
        }
        this.P.setVisibility(0);
        if (!dpVar.ap()) {
            l.q(R.id.fragment_container, dpVar, str);
        } else if (dpVar.G) {
            l.n(dpVar);
        }
        l.i = 4099;
        l.a();
        this.aj = str;
    }

    private final boolean s() {
        return getIntent().getBooleanExtra("disableHalfPlateSuggestions", false);
    }

    @Override // defpackage.lcn
    public final void a() {
        this.b.post(new leo(this));
    }

    @Override // defpackage.akdz
    public final void aI() {
        h();
    }

    @Override // defpackage.akdz
    public final void aJ() {
        this.ad = false;
        this.P.setVisibility(8);
        this.b.post(new leo(this, 3));
    }

    @Override // defpackage.ldh
    public final void b() {
        m();
    }

    @Override // defpackage.ldh
    public final void c(String str, String str2) {
        this.I.setText(str);
        this.I.requestLayout();
        akiq akiqVar = this.i;
        if (akiqVar != null) {
            akiqVar.a();
            this.i = null;
        }
        o(str2);
    }

    public final void g() {
        if (!this.O.isEmpty()) {
            StringBuilder sb = new StringBuilder(getResources().getString(R.string.try_saying_text));
            sb.append(" ''");
            sb.append((String) this.O.get(0));
            sb.append("''");
            this.H.setText(sb);
        }
    }

    public final void h() {
        if (!isFinishing()) {
            finish();
        }
    }

    public final void i(int i) {
        SoundPool soundPool = this.ag;
        if (soundPool != null) {
            soundPool.play(i, 1.0f, 1.0f, 0, 0, 1.0f);
        }
    }

    public final void j() {
        this.h = false;
        this.f152J = false;
        this.K = false;
        akiq akiqVar = this.i;
        if (akiqVar != null) {
            akiqVar.c();
        }
        l();
    }

    public final void k() {
        this.h = false;
        this.f152J = false;
        this.K = false;
        akiq akiqVar = this.i;
        if (akiqVar != null) {
            akiqVar.c();
        }
        this.d.setVisibility(8);
        this.F.setVisibility(8);
        this.H.setVisibility(8);
        this.G.setText(getResources().getText(R.string.you_are_offline));
        this.G.setVisibility(0);
        this.c.setVisibility(8);
        this.c.e();
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                boolean a = ((ypy) obj).a();
                this.V = a;
                this.C.m(!a);
                if (this.V) {
                    this.b.removeCallbacks(this.E);
                    this.G.setText(getResources().getText(R.string.you_are_online_half_plate));
                    this.c.setEnabled(true);
                    this.c.setVisibility(0);
                    return null;
                } else if (this.h) {
                    this.b.postDelayed(this.E, 3000L);
                    return null;
                } else {
                    k();
                    return null;
                }
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ypy.class};
    }

    public final void l() {
        this.G.setVisibility(0);
        this.d.setVisibility(8);
        this.F.setVisibility(8);
        this.H.setVisibility(8);
        this.c.setEnabled(true);
        this.c.setVisibility(0);
        this.c.e();
        if (!this.V) {
            this.G.setText(getResources().getText(R.string.you_are_offline));
            this.c.setEnabled(false);
        } else if (!this.U) {
            this.G.setText(getResources().getText(R.string.didnt_hear_that_half_plate));
        } else {
            this.G.setText(getResources().getText(R.string.tap_microphone_to_retry));
        }
    }

    public final void m() {
        this.h = true;
        this.L = false;
        this.U = false;
        this.d.setVisibility(8);
        this.d.setText("");
        this.F.setText("");
        this.c.setEnabled(true);
        this.c.setVisibility(0);
        this.G.setText(getResources().getText(R.string.listening));
        this.G.setVisibility(0);
        akiq akiqVar = this.i;
        if (akiqVar == null || !akiqVar.f()) {
            q();
            return;
        }
        i(this.ah);
        this.c.g();
    }

    public final void n() {
        this.p.n(new acte(actj.VOICE_SEARCH_MIC_BUTTON));
        if (eog.z(this.o) && this.n.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
            this.n.t("voz_vp", asny.LATENCY_ACTION_VOICE_ASSISTANT);
        }
        if (eog.au(this.X)) {
            ylx.n(this, anlz.x(this.Z.d(), 300L, TimeUnit.MILLISECONDS, this.y), new len(this, 1), new len(this, 4));
        } else {
            o("");
        }
    }

    public final void o(String str) {
        String str2;
        boolean z;
        boolean z2 = true;
        if (str.isEmpty()) {
            str2 = p();
            z = false;
        } else {
            str2 = str;
            z = true;
        }
        if (this.D == null) {
            this.D = new les(this);
        }
        ler lerVar = new ler(this);
        if (this.i == null) {
            akir a = this.q.a(this.D, lerVar, this.as, str2, this.Q, eog.bi(this.o), this.aq, this.ar, this.ap, p());
            a.D = eog.bj(this.o);
            a.x = eog.h(this.o);
            a.c(eog.i(this.o));
            a.z = eog.q(this.o);
            a.u = eog.T(this.o);
            if (!eog.au(this.X) || !z) {
                z2 = false;
            }
            a.w = z2;
            a.b(ampq.j(eog.s(this.o)));
            a.B = eog.o(this.o);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            ayqi.c((AtomicReference) this.A.a().an(false).S(new ldk(atomicBoolean, 4)));
            a.v = atomicBoolean.get();
            this.i = a.a();
        }
        if (!this.V) {
            k();
        } else if (!this.af) {
        } else {
            this.af = false;
            m();
        }
    }

    @Override // defpackage.abp, android.app.Activity
    public final void onBackPressed() {
        this.p.H(3, new acte(actj.VOICE_SEARCH_CANCEL_BUTTON), null);
        Intent intent = getIntent();
        intent.putExtra("AssistantCsn", this.p.k());
        setResult(1, intent);
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SoundPool soundPool = new SoundPool(5, 3, 0);
        this.ag = soundPool;
        this.ah = soundPool.load(this, R.raw.open, 0);
        this.e = this.ag.load(this, R.raw.success, 0);
        this.f = this.ag.load(this, R.raw.no_input, 0);
        this.g = this.ag.load(this, R.raw.failure, 0);
        this.ai = this.u.a();
        gfs gfsVar = gfs.LIGHT;
        int ordinal = this.ai.ordinal();
        if (ordinal == 0) {
            setTheme(2132083903);
        } else if (ordinal == 1) {
            setTheme(2132083902);
        }
        setContentView(true != s() ? R.layout.voice_search_half_plate_v0_activity : R.layout.voice_search_half_plate_v0_disabled_suggestions_activity);
        this.j = getSupportFragmentManager();
        lj.X(getWindow().getDecorView(), new kj() { // from class: lem
            @Override // defpackage.kj
            public final mb a(View view, mb mbVar) {
                VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity = VoiceSearchHalfPlateV0Activity.this;
                int j = zew.j(voiceSearchHalfPlateV0Activity);
                int i = mbVar.g(7).c;
                int i2 = mbVar.g(7).e;
                DisplayMetrics displayMetrics = voiceSearchHalfPlateV0Activity.getResources().getDisplayMetrics();
                int i3 = zew.i(displayMetrics, 270);
                voiceSearchHalfPlateV0Activity.findViewById(R.id.half_plate).getLayoutParams().height = i3 + ((((j - i) - zew.i(displayMetrics, 8)) - i3) % zew.i(displayMetrics, 48)) + i2;
                return mb.a;
            }
        });
        if (bundle != null) {
            akea akeaVar = (akea) this.j.g(bundle, "permission_request_fragment");
            this.k = akeaVar;
            if (akeaVar != null && (!TextUtils.equals(this.aj, "PERMISSION_REQUEST_FRAGMENT") || !akdr.f(this, ac))) {
                ex l = this.j.l();
                l.l(this.k);
                l.a();
            }
        }
        this.P = findViewById(R.id.fragment_container);
        ImageView imageView = (ImageView) findViewById(R.id.back_button);
        this.ae = imageView;
        imageView.setOnClickListener(new lep(this, 1));
        MicrophoneView microphoneView = (MicrophoneView) findViewById(R.id.microphone_container);
        this.c = microphoneView;
        ((FloatingActionButton) microphoneView.findViewById(R.id.disabled_microphone)).setImageDrawable(zag.f(this.c.getContext(), 2131233438, R.attr.ytTextPrimary));
        ((FloatingActionButton) this.c.findViewById(R.id.enabled_microphone)).setImageResource(2131233268);
        this.c.setOnClickListener(new lep(this));
        this.G = (TextView) findViewById(R.id.state_text_view);
        this.d = (TextView) findViewById(R.id.stable_recognized_text);
        this.F = (TextView) findViewById(R.id.unstable_recognized_text);
        this.H = (TextView) findViewById(R.id.listening_voice_tips_text);
        this.I = (TextView) findViewById(R.id.voice_language);
        this.M = (LinearLayout) findViewById(R.id.voice_language_button);
        this.N = (ImageView) findViewById(R.id.voice_language_icon);
        if (!s()) {
            View findViewById = findViewById(R.id.above_half_plate_click_catcher);
            findViewById.setOnTouchListener(new View.OnTouchListener() { // from class: leq
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity = VoiceSearchHalfPlateV0Activity.this;
                    if (motionEvent.getAction() != 1 || voiceSearchHalfPlateV0Activity.S == null) {
                        if (motionEvent.getAction() == 0) {
                            voiceSearchHalfPlateV0Activity.S = new Point((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        }
                    } else {
                        voiceSearchHalfPlateV0Activity.R = new Point((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        int i = voiceSearchHalfPlateV0Activity.S.x;
                        int i2 = voiceSearchHalfPlateV0Activity.S.y;
                        if (zew.n(voiceSearchHalfPlateV0Activity.getResources().getDisplayMetrics(), (int) Math.hypot(voiceSearchHalfPlateV0Activity.R.x - i, voiceSearchHalfPlateV0Activity.R.y - i2)) > 20) {
                            return true;
                        }
                    }
                    return false;
                }
            });
            findViewById.setOnClickListener(new lep(this, 3));
        } else {
            findViewById(R.id.above_half_plate_click_catcher).setOnClickListener(new lep(this, 2));
        }
        lbx h = lxh.h(this);
        this.ak = h;
        this.C = this.w.a(this, h);
        this.C.g((ViewGroup) findViewById(R.id.bottom_container));
        this.V = this.t.o();
        this.E = new leo(this, 2);
        if (eog.au(this.X)) {
            lcv a = this.x.a(p());
            this.at = a;
            ylx.n(this, a.a(), new len(this), new len(this, 2));
        }
        this.as = getIntent().getIntExtra("MicSampleRate", 16000);
        this.aq = getIntent().getIntExtra("MicAudioFormatEncoding", 2);
        this.ar = getIntent().getIntExtra("MicChannelConfig", 16);
        g();
        this.an = getIntent().getIntExtra("ParentVeType", 0);
        this.ao = getIntent().getStringExtra("ParentCSN");
        this.ap = getIntent().getStringExtra("searchEndpointParams");
        this.Q = getIntent().getByteArrayExtra("SearchboxStats");
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopa createBuilder = atnp.a.createBuilder();
        int i = this.an;
        createBuilder.copyOnWrite();
        atnp atnpVar = (atnp) createBuilder.instance;
        atnpVar.b = 2 | atnpVar.b;
        atnpVar.d = i;
        String str = this.ao;
        if (str != null) {
            createBuilder.copyOnWrite();
            atnp atnpVar2 = (atnp) createBuilder.instance;
            atnpVar2.b |= 1;
            atnpVar2.c = str;
        }
        aopcVar.e(atno.b, (atnp) createBuilder.mo39build());
        this.p.d(acuo.a(22678), (apzg) aopcVar.mo39build(), null);
        this.p.n(new acte(actj.MOBILE_BACK_BUTTON));
        this.p.n(new acte(actj.VOICE_SEARCH_CANCEL_BUTTON));
        this.p.n(new acte(actj.VOICE_SEARCH_HALF_PLATE_SUGGESTIONS));
        this.af = true;
    }

    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public final void onDestroy() {
        this.h = false;
        SoundPool soundPool = this.ag;
        if (soundPool != null) {
            soundPool.release();
            this.ag = null;
        }
        akiq akiqVar = this.i;
        if (akiqVar != null) {
            akiqVar.a();
            this.i = null;
        }
        this.D = null;
        this.c.setOnClickListener(null);
        this.ae.setOnClickListener(null);
        this.p.t();
        ConnectivitySlimStatusBarController connectivitySlimStatusBarController = this.C;
        if (connectivitySlimStatusBarController != null) {
            connectivitySlimStatusBarController.i();
        }
        super.onDestroy();
    }

    @Override // defpackage.dt, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.am) {
            overridePendingTransition(0, 0);
            this.am = false;
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        if (this.ai != this.u.a()) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new leo(this, 1));
        }
    }

    @Override // defpackage.dt, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.v.g(this);
        this.C.m(true);
        if (ake.c(this, "android.permission.RECORD_AUDIO") != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                PermissionDescriptor[] permissionDescriptorArr = ac;
                if (akdr.f(this, permissionDescriptorArr)) {
                    if (this.ad) {
                        return;
                    }
                    if (this.k == null) {
                        akdy akdyVar = this.Y;
                        akdyVar.e(permissionDescriptorArr);
                        akdyVar.a = acuo.a(69076);
                        akdyVar.b = acuo.b(69077);
                        akdyVar.c = acuo.b(69078);
                        akdyVar.d = acuo.b(69079);
                        akdyVar.b(R.string.vs_permission_allow_access_description);
                        akdyVar.c(R.string.vs_permission_open_settings_description);
                        akdyVar.e = R.string.permission_fragment_title;
                        this.k = akdyVar.a();
                    }
                    this.k.aF(this);
                    this.k.aG(new ack(this, 2132083889));
                    r(this.k, "PERMISSION_REQUEST_FRAGMENT");
                    this.ad = true;
                    return;
                }
            }
            h();
            return;
        }
        AudioRecord a = this.r.a();
        this.T = a;
        if (a != null) {
            this.aq = a.getAudioFormat();
            this.ar = this.T.getChannelConfiguration();
            this.as = this.T.getSampleRate();
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            ayqi.c((AtomicReference) this.A.b().an(false).S(new ldk(atomicBoolean, 4)));
            if (!atomicBoolean.get() || !this.B.t()) {
                n();
                return;
            }
            lco o = lco.o();
            this.m = o;
            o.c = this;
            r(o, "VAA_CONSENT_FRAGMENT");
            return;
        }
        q();
    }

    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.v.m(this);
        if (!this.al) {
            h();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.al = z;
    }
}
