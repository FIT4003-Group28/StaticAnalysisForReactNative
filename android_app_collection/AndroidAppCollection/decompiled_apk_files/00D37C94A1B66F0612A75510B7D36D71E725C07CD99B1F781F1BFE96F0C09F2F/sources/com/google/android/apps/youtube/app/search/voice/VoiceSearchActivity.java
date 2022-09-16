package com.google.android.apps.youtube.app.search.voice;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioRecord;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.libraries.youtube.search.voice.MicrophoneView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.youtube.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class VoiceSearchActivity extends lcd implements akdz, ldh, lcn, ynl {
    public static final /* synthetic */ int ae = 0;
    private static final PermissionDescriptor[] af = {new PermissionDescriptor(2, actj.VOICE_SEARCH_APPROVE_MICROPHONE_BUTTON, actj.VOICE_SEARCH_DENY_MICROPHONE_BUTTON)};
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
    public TextView f150J;
    public TextView K;
    public boolean L;
    public boolean M;
    public boolean N;
    public LinearLayout O;
    public ImageView P;
    public View R;
    public byte[] S;
    public ImageView T;
    public lco U;
    AudioRecord V;
    public boolean W;
    public boolean X;
    public aurq Y;
    public aacz aa;
    public akdy ab;
    public acgf ac;
    public apwt ad;
    private boolean ag;
    private ImageView ah;
    private boolean ai;
    private SoundPool aj;
    private int ak;
    private gfs al;
    private String am;
    private lbx an;
    private boolean ao;
    private boolean ap;
    private RelativeLayout aq;
    private ViewGroup ar;
    private int as;
    private String at;
    private String au;
    private eym av;
    private int aw;
    private int ax;
    private int ay;
    private lcv az;
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
    public int m = 0;
    public List Q = Collections.emptyList();
    public final Interpolator Z = kt.o(0.05f, 0.0f, 0.0f, 1.0f);

    private final Boolean r() {
        return Boolean.valueOf(getResources().getConfiguration().screenHeightDp >= 400);
    }

    private final String s() {
        String x = apwt.x();
        String a = this.ad.a();
        if (x.isEmpty() || a.isEmpty()) {
            return "en-US";
        }
        StringBuilder sb = new StringBuilder(x.length() + 1 + String.valueOf(a).length());
        sb.append(x);
        sb.append("-");
        sb.append(a);
        return sb.toString();
    }

    private final void t() {
        int dimension;
        float dimension2;
        int dimensionPixelSize;
        int dimension3;
        int i;
        int i2;
        float dimensionPixelSize2;
        float dimensionPixelSize3;
        int dimensionPixelSize4;
        float f;
        float f2;
        Resources resources = getResources();
        int dimension4 = (int) resources.getDimension(R.dimen.text_layout_margin_start_end_bottom);
        if (zew.y(this)) {
            if (zew.w(this)) {
                i = resources.getDimensionPixelSize(R.dimen.microphone_view_margin_bottom_tablet_land);
                f = 0.22f;
                f2 = 0.2f;
            } else {
                i = resources.getDimensionPixelSize(R.dimen.microphone_view_margin_bottom_tablet);
                f = 0.24f;
                f2 = 0.1f;
            }
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.state_text_margin_bottom_tablet);
            this.R.setOnApplyWindowInsetsListener(new ldo(this));
            i2 = (int) (f * (zew.j(this) - this.m));
            dimension3 = (int) (f2 * zew.l(this));
        } else {
            if (r().booleanValue()) {
                dimension = (int) resources.getDimension(R.dimen.microphone_view_margin_bottom);
                dimension2 = resources.getDimension(R.dimen.text_layout_margin_top);
            } else {
                dimension = (int) resources.getDimension(R.dimen.microphone_view_margin_bottom_land);
                dimension2 = resources.getDimension(R.dimen.text_layout_margin_top_land);
            }
            int i3 = (int) dimension2;
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.state_text_margin_bottom);
            dimension3 = (int) resources.getDimension(R.dimen.text_layout_margin_start_end_bottom);
            i = dimension;
            i2 = i3;
        }
        zgd.t(this.c, zgd.m(0, 0, 0, i), ViewGroup.MarginLayoutParams.class);
        zgd.t(this.aq, zgd.m(dimension3, i2, dimension3, dimension4), ViewGroup.MarginLayoutParams.class);
        zgd.t(this.G, zgd.m(0, 0, 0, dimensionPixelSize), ViewGroup.MarginLayoutParams.class);
        Resources resources2 = getResources();
        if (zew.y(this)) {
            dimensionPixelSize2 = resources2.getDimensionPixelSize(R.dimen.voice_search_small_text_size_tablet);
            dimensionPixelSize3 = resources2.getDimensionPixelSize(R.dimen.voice_search_large_text_size_tablet);
            dimensionPixelSize4 = resources2.getDimensionPixelSize(R.dimen.voice_search_large_text_line_spacing_extra_tablet);
        } else {
            dimensionPixelSize2 = resources2.getDimensionPixelSize(R.dimen.voice_search_small_text_size);
            dimensionPixelSize3 = resources2.getDimensionPixelSize(R.dimen.voice_search_large_text_size);
            dimensionPixelSize4 = resources2.getDimensionPixelSize(R.dimen.voice_search_large_text_line_spacing_extra);
        }
        float f3 = dimensionPixelSize4;
        this.G.setTextSize(0, dimensionPixelSize3);
        this.G.setLineSpacing(f3, 1.0f);
        this.d.setTextSize(0, dimensionPixelSize3);
        this.d.setLineSpacing(f3, 1.0f);
        this.F.setTextSize(0, dimensionPixelSize3);
        this.F.setLineSpacing(f3, 1.0f);
        this.I.setTextSize(0, dimensionPixelSize2);
        this.f150J.setTextSize(0, dimensionPixelSize2);
        this.H.setTextSize(0, dimensionPixelSize2);
    }

    private final void u() {
        setVisible(false);
        this.ap = true;
        Intent intent = getIntent();
        intent.putExtra("RegularVoiceSearch", true);
        setResult(-1, intent);
        h();
    }

    private final void v(dp dpVar, String str) {
        dp f = this.j.f(this.am);
        dpVar.getClass();
        zgh.m(str);
        ex l = this.j.l();
        if (f != null && f.ap() && !f.equals(dpVar)) {
            l.l(f);
        }
        this.R.setVisibility(0);
        if (!dpVar.ap()) {
            l.q(R.id.fragment_container, dpVar, str);
        } else if (dpVar.G) {
            l.n(dpVar);
        }
        l.i = 4099;
        l.a();
        this.am = str;
    }

    @Override // defpackage.lcn
    public final void a() {
        this.b.post(new ldl(this));
    }

    @Override // defpackage.akdz
    public final void aI() {
        h();
    }

    @Override // defpackage.akdz
    public final void aJ() {
        this.ag = false;
        this.R.setVisibility(8);
        this.b.post(new ldl(this, 3));
    }

    @Override // defpackage.ldh
    public final void b() {
        this.H.setVisibility(4);
        this.I.setVisibility(8);
        m();
    }

    @Override // defpackage.ldh
    public final void c(String str, String str2) {
        this.K.setText(str);
        this.K.requestLayout();
        akiq akiqVar = this.i;
        if (akiqVar != null) {
            akiqVar.a();
            this.i = null;
        }
        o(str2);
    }

    public final void g() {
        int i = 0;
        if (!r().booleanValue()) {
            if (!Boolean.valueOf(getResources().getConfiguration().screenWidthDp >= 400).booleanValue()) {
                return;
            }
        }
        if (!this.Q.isEmpty()) {
            StringBuilder sb = new StringBuilder(getResources().getString(R.string.try_saying_text));
            if (r().booleanValue()) {
                sb.append("\n\n''");
            } else {
                sb.append("\n''");
            }
            sb.append((String) this.Q.get(0));
            sb.append("''");
            this.f150J.setText(sb);
            StringBuilder sb2 = new StringBuilder();
            for (String str : this.Q) {
                i++;
                sb2.append("''");
                sb2.append(str);
                sb2.append("''");
                if (i >= 3) {
                    break;
                }
                sb2.append("\n\n");
            }
            this.I.setText(sb2);
        }
    }

    public final void h() {
        if (!isFinishing()) {
            finish();
        }
    }

    public final void i(int i) {
        SoundPool soundPool = this.aj;
        if (soundPool != null) {
            soundPool.play(i, 1.0f, 1.0f, 0, 0, 1.0f);
        }
    }

    public final void j() {
        this.h = false;
        this.L = false;
        this.M = false;
        akiq akiqVar = this.i;
        if (akiqVar != null) {
            akiqVar.c();
        }
        l();
    }

    public final void k() {
        this.h = false;
        this.L = false;
        this.M = false;
        akiq akiqVar = this.i;
        if (akiqVar != null) {
            akiqVar.c();
        }
        this.H.setVisibility(0);
        this.d.setVisibility(8);
        this.F.setVisibility(8);
        this.f150J.setVisibility(8);
        this.I.setVisibility(8);
        this.G.setText(getResources().getText(R.string.you_are_offline));
        this.G.setVisibility(0);
        this.c.setVisibility(8);
        this.c.e();
        if (p()) {
            this.T.animate().alpha(0.0f).setDuration(200L).setInterpolator(this.Z);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                boolean a = ((ypy) obj).a();
                this.X = a;
                this.C.m(!a);
                if (this.X) {
                    this.b.removeCallbacks(this.E);
                    this.G.setText(getResources().getText(R.string.you_are_online));
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
        this.H.setVisibility(0);
        this.G.setVisibility(0);
        this.d.setVisibility(8);
        this.F.setVisibility(8);
        this.f150J.setVisibility(8);
        this.I.setVisibility(8);
        this.c.setEnabled(true);
        this.c.setVisibility(0);
        this.c.e();
        if (p()) {
            this.T.animate().alpha(0.0f).setDuration(200L).setInterpolator(this.Z);
        }
        if (!this.X) {
            this.G.setText(getResources().getText(R.string.you_are_offline));
            this.c.setEnabled(false);
        } else if (!this.W) {
            this.G.setText(getResources().getText(R.string.didnt_hear_that));
        } else if (!amps.e(this.I.getText().toString())) {
            this.G.setText(getResources().getText(R.string.try_saying_text));
            this.I.setVisibility(0);
        } else {
            this.G.setText(getResources().getText(R.string.try_again_text));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void m() {
        char c;
        CharSequence text;
        InputStream openRawResource;
        byte[] bArr;
        this.h = true;
        char c2 = 0;
        this.N = false;
        this.W = false;
        this.d.setVisibility(8);
        this.d.setText("");
        this.F.setText("");
        this.c.setEnabled(true);
        this.c.setVisibility(0);
        TextView textView = this.G;
        String str = (String) this.A.a.a.V(axxk.l).B().aw();
        switch (str.hashCode()) {
            case -2140931533:
                if (str.equals("start_speaking_transliterated_hindi")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -2088435442:
                if (str.equals("speak_into_the_phone")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -107484659:
                if (str.equals("start_speaking")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 358371414:
                if (str.equals("try_saying_something")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            text = getResources().getText(R.string.start_speaking);
        } else if (c == 1) {
            text = getResources().getText(R.string.speak_into_the_phone);
        } else if (c == 2) {
            text = getResources().getText(R.string.start_speaking_transliterated_hindi);
        } else if (c == 3) {
            text = getResources().getText(R.string.try_saying_something_transliterated_hindi);
        } else {
            text = getResources().getText(R.string.listening);
        }
        textView.setText(text);
        this.G.setVisibility(0);
        akiq akiqVar = this.i;
        if (akiqVar == null || !akiqVar.f()) {
            u();
        } else {
            i(this.ak);
            this.c.h(q());
        }
        if (p() && this.h) {
            this.T.animate().alpha(1.0f).setDuration(200L).setInterpolator(this.Z);
            String str2 = (String) this.A.c().j().W();
            this.al = this.u.a();
            if (str2.hashCode() != -2134659376 || !str2.equals("speaking")) {
                c2 = 65535;
            }
            if (c2 == 0) {
                if (this.al == gfs.DARK) {
                    openRawResource = getResources().openRawResource(2131231241);
                } else {
                    openRawResource = getResources().openRawResource(2131231242);
                }
            } else if (this.al == gfs.DARK) {
                openRawResource = getResources().openRawResource(2131231243);
            } else {
                openRawResource = getResources().openRawResource(2131231244);
            }
            try {
                bArr = anek.c(openRawResource);
            } catch (IOException e) {
                zep.d("Error converting speaking gif asset to byte array", e);
                bArr = null;
            }
            if (bArr == null) {
                return;
            }
            try {
                this.T.setImageDrawable(this.av.b(bArr));
            } catch (zhy e2) {
                zep.d("Error downloading or decoding speaking gif asset.", e2);
            }
        }
    }

    public final void n() {
        this.p.n(new acte(actj.VOICE_SEARCH_MIC_BUTTON));
        if (eog.z(this.o) && this.n.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
            this.n.t("voz_vp", asny.LATENCY_ACTION_VOICE_ASSISTANT);
        }
        if (eog.au(this.aa)) {
            ylx.n(this, anlz.x(this.ac.d(), 300L, TimeUnit.MILLISECONDS, this.y), new ldn(this, 3), new ldn(this, 2));
        } else {
            o("");
        }
    }

    public final void o(String str) {
        String str2;
        boolean z;
        boolean z2 = true;
        if (str.isEmpty()) {
            str2 = s();
            z = false;
        } else {
            str2 = str;
            z = true;
        }
        if (this.D == null) {
            this.D = new ldq(this);
        }
        ldp ldpVar = new ldp(this);
        if (this.i == null) {
            akir a = this.q.a(this.D, ldpVar, this.ay, str2, this.S, eog.bi(this.o), this.aw, this.ax, this.au, s());
            a.D = eog.bj(this.o);
            a.x = eog.h(this.o);
            a.c(eog.i(this.o));
            a.z = eog.q(this.o);
            a.u = eog.T(this.o);
            if (!eog.au(this.aa) || !z) {
                z2 = false;
            }
            a.w = z2;
            a.b(ampq.j(eog.s(this.o)));
            a.B = eog.o(this.o);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            ayqi.c((AtomicReference) this.A.a().an(false).S(new ldk(atomicBoolean)));
            a.v = atomicBoolean.get();
            this.i = a.a();
        }
        if (!this.X) {
            k();
        } else if (!this.ai) {
        } else {
            this.ai = false;
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

    @Override // defpackage.oa, defpackage.dt, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        t();
        g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SoundPool soundPool = new SoundPool(5, 3, 0);
        this.aj = soundPool;
        this.ak = soundPool.load(this, R.raw.open, 0);
        this.e = this.aj.load(this, R.raw.success, 0);
        this.f = this.aj.load(this, R.raw.no_input, 0);
        this.g = this.aj.load(this, R.raw.failure, 0);
        this.al = this.u.a();
        gfs gfsVar = gfs.LIGHT;
        int ordinal = this.al.ordinal();
        if (ordinal == 0) {
            setTheme(2132083904);
        } else if (ordinal == 1) {
            setTheme(2132083889);
        }
        setContentView(R.layout.voice_search_activity);
        eo supportFragmentManager = getSupportFragmentManager();
        this.j = supportFragmentManager;
        if (bundle != null) {
            akea akeaVar = (akea) supportFragmentManager.g(bundle, "permission_request_fragment");
            this.k = akeaVar;
            if (akeaVar != null && (!TextUtils.equals(this.am, "PERMISSION_REQUEST_FRAGMENT") || !akdr.f(this, af))) {
                ex l = this.j.l();
                l.l(this.k);
                l.a();
            }
        }
        this.R = findViewById(R.id.fragment_container);
        ImageView imageView = (ImageView) findViewById(R.id.back_button);
        this.ah = imageView;
        imageView.setOnClickListener(new ldm(this, 1));
        MicrophoneView microphoneView = (MicrophoneView) findViewById(R.id.microphone_container);
        this.c = microphoneView;
        ((FloatingActionButton) microphoneView.findViewById(R.id.disabled_microphone)).setImageDrawable(zag.f(this.c.getContext(), 2131233438, R.attr.ytTextPrimary));
        ((FloatingActionButton) this.c.findViewById(R.id.enabled_microphone)).setImageResource(2131233268);
        this.c.setOnClickListener(new ldm(this));
        this.G = (TextView) findViewById(R.id.state_text_view);
        this.d = (TextView) findViewById(R.id.stable_recognized_text);
        this.F = (TextView) findViewById(R.id.unstable_recognized_text);
        this.H = (TextView) findViewById(R.id.error_text);
        this.I = (TextView) findViewById(R.id.error_voice_tips);
        this.f150J = (TextView) findViewById(R.id.listening_voice_tips_text);
        this.aq = (RelativeLayout) findViewById(R.id.voice_text_container);
        this.ar = (ViewGroup) findViewById(R.id.bottom_container);
        this.K = (TextView) findViewById(R.id.voice_language);
        this.O = (LinearLayout) findViewById(R.id.voice_language_button);
        this.P = (ImageView) findViewById(R.id.voice_language_icon);
        this.T = (ImageView) findViewById(R.id.speaking_gif);
        this.av = new eym(this);
        lbx h = lxh.h(this);
        this.an = h;
        ConnectivitySlimStatusBarController a = this.w.a(this, h);
        this.C = a;
        a.g(this.ar);
        this.X = this.t.o();
        this.E = new ldl(this, 2);
        if (eog.au(this.aa)) {
            lcv a2 = this.x.a(s());
            this.az = a2;
            ylx.n(this, a2.a(), new ldn(this, 4), new ldn(this, 1));
        }
        this.ay = getIntent().getIntExtra("MicSampleRate", 16000);
        this.aw = getIntent().getIntExtra("MicAudioFormatEncoding", 2);
        this.ax = getIntent().getIntExtra("MicChannelConfig", 16);
        t();
        g();
        this.as = getIntent().getIntExtra("ParentVeType", 0);
        this.at = getIntent().getStringExtra("ParentCSN");
        this.au = getIntent().getStringExtra("searchEndpointParams");
        this.S = getIntent().getByteArrayExtra("SearchboxStats");
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopa createBuilder = atnp.a.createBuilder();
        int i = this.as;
        createBuilder.copyOnWrite();
        atnp atnpVar = (atnp) createBuilder.instance;
        atnpVar.b = 2 | atnpVar.b;
        atnpVar.d = i;
        String str = this.at;
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
        this.ai = true;
    }

    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public final void onDestroy() {
        this.h = false;
        SoundPool soundPool = this.aj;
        if (soundPool != null) {
            soundPool.release();
            this.aj = null;
        }
        akiq akiqVar = this.i;
        if (akiqVar != null) {
            akiqVar.a();
            this.i = null;
        }
        this.D = null;
        this.c.setOnClickListener(null);
        this.ah.setOnClickListener(null);
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
        if (this.ap) {
            overridePendingTransition(0, 0);
            this.ap = false;
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        if (this.al != this.u.a()) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new ldl(this, 1));
        }
    }

    @Override // defpackage.dt, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.v.g(this);
        this.C.m(true);
        if (ake.c(this, "android.permission.RECORD_AUDIO") != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                PermissionDescriptor[] permissionDescriptorArr = af;
                if (akdr.f(this, permissionDescriptorArr)) {
                    if (this.ag) {
                        return;
                    }
                    if (this.k == null) {
                        akdy akdyVar = this.ab;
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
                    v(this.k, "PERMISSION_REQUEST_FRAGMENT");
                    this.ag = true;
                    return;
                }
            }
            h();
            return;
        }
        AudioRecord a = this.r.a();
        this.V = a;
        if (a != null) {
            this.aw = a.getAudioFormat();
            this.ax = this.V.getChannelConfiguration();
            this.ay = this.V.getSampleRate();
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            ayqi.c((AtomicReference) this.A.b().an(false).S(new ldk(atomicBoolean)));
            if (!atomicBoolean.get() || !this.B.t()) {
                n();
                return;
            }
            lco o = lco.o();
            this.U = o;
            o.c = this;
            v(o, "VAA_CONSENT_FRAGMENT");
            return;
        }
        u();
    }

    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.v.m(this);
        if (!this.ao) {
            h();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.ao = z;
    }

    public final boolean p() {
        return !((String) this.A.c().j().W()).isEmpty();
    }

    public final boolean q() {
        return ((String) this.A.c().j().W()).equals("waves_no_mic_animation");
    }
}
