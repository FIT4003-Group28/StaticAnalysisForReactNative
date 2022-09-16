package com.google.android.apps.youtube.app.search.voice;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class VoiceSearchActivityV2 extends lcf implements akdz, ldh, leb, lcn {
    private static final PermissionDescriptor[] u = {new PermissionDescriptor(2, actj.VOICE_SEARCH_APPROVE_MICROPHONE_BUTTON, actj.VOICE_SEARCH_DENY_MICROPHONE_BUTTON)};
    private lbx A;
    private lek B;
    private boolean C;
    private boolean D;
    private ViewGroup E;
    private int F;
    private String G;
    private String H;
    private byte[] I;

    /* renamed from: J  reason: collision with root package name */
    private lda f151J;
    public Handler b;
    public eo c;
    public akea d;
    public led e;
    public lel f;
    public acvh g;
    public aadd h;
    public acti i;
    public gfu j;
    public yni k;
    public lbs l;
    public ldb m;
    public axxo n;
    public afvn o;
    lec p;
    public View q;
    public lco r;
    public aacz s;
    public akdy t;
    private boolean v;
    private boolean w;
    private gfs x;
    private String y;
    private ConnectivitySlimStatusBarController z;

    private final void k() {
        if (!isFinishing()) {
            finish();
        }
    }

    private final void l(dp dpVar, String str) {
        dp f = this.c.f(this.y);
        dpVar.getClass();
        zgh.m(str);
        ex l = this.c.l();
        if (f != null && f.ap() && !f.equals(dpVar)) {
            l.l(f);
        }
        this.q.setVisibility(0);
        if (!dpVar.ap()) {
            l.q(R.id.fragment_container, dpVar, str);
        } else if (dpVar.G) {
            l.n(dpVar);
        }
        l.i = 4099;
        l.a();
        this.y = str;
    }

    @Override // defpackage.lcn
    public final void a() {
        this.b.post(new ldt(this));
    }

    @Override // defpackage.akdz
    public final void aI() {
        k();
    }

    @Override // defpackage.akdz
    public final void aJ() {
        this.v = false;
        this.q.setVisibility(8);
        this.b.post(new ldt(this, 2));
    }

    @Override // defpackage.ldh
    public final void b() {
        this.p.n();
    }

    @Override // defpackage.ldh
    public final void c(String str, String str2) {
        lda ldaVar = this.f151J;
        ldaVar.d.setText(str);
        ldaVar.d.requestLayout();
        this.p.k();
        j(str2);
    }

    @Override // defpackage.leb
    public final void f() {
        Intent intent = getIntent();
        intent.putExtra("AssistantCsn", this.i.k());
        setResult(1, intent);
        k();
    }

    @Override // defpackage.leb
    public final void g(byte[] bArr) {
        if (eog.z(this.h) && this.g.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
            this.g.t("voz_rqf", asny.LATENCY_ACTION_VOICE_ASSISTANT);
        }
        Intent intent = getIntent();
        intent.putExtra("RecognizedText", bArr);
        intent.putExtra("AssistantCsn", this.i.k());
        intent.putExtra("SearchboxStats", this.I);
        setResult(-1, intent);
        this.p.j();
        k();
    }

    @Override // defpackage.leb
    public final void h() {
        setVisible(false);
        this.D = true;
        Intent intent = getIntent();
        intent.putExtra("RegularVoiceSearch", true);
        setResult(-1, intent);
        k();
    }

    public final void i() {
        this.i.n(new acte(actj.VOICE_SEARCH_MIC_BUTTON));
        if (eog.z(this.h) && this.g.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
            this.g.t("voz_vp", asny.LATENCY_ACTION_VOICE_ASSISTANT);
        }
        if (eog.au(this.s)) {
            ylx.n(this, this.p.b(), new lds(this), new lds(this, 1));
        } else {
            j("");
        }
    }

    public final void j(String str) {
        this.p.g(str, this.I, this.H);
        lec lecVar = this.p;
        if (!lecVar.o) {
            lecVar.d();
        } else if (!this.w) {
        } else {
            this.w = false;
            lecVar.n();
        }
    }

    @Override // defpackage.oa, defpackage.dt, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.B.s();
        this.p.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.x = this.j.a();
        gfs gfsVar = gfs.LIGHT;
        int ordinal = this.x.ordinal();
        if (ordinal == 0) {
            setTheme(2132083904);
        } else if (ordinal == 1) {
            setTheme(2132083889);
        }
        setContentView(R.layout.voice_search_activity);
        View rootView = findViewById(16908290).getRootView();
        eo supportFragmentManager = getSupportFragmentManager();
        this.c = supportFragmentManager;
        if (bundle != null) {
            akea akeaVar = (akea) supportFragmentManager.g(bundle, "permission_request_fragment");
            this.d = akeaVar;
            if (akeaVar != null && (!TextUtils.equals(this.y, "PERMISSION_REQUEST_FRAGMENT") || !akdr.f(this, u))) {
                ex l = this.c.l();
                l.l(this.d);
                l.a();
            }
        }
        this.q = findViewById(R.id.fragment_container);
        this.E = (ViewGroup) findViewById(R.id.bottom_container);
        lbx h = lxh.h(this);
        this.A = h;
        ConnectivitySlimStatusBarController a = this.l.a(this, h);
        this.z = a;
        a.g(this.E);
        this.F = getIntent().getIntExtra("ParentVeType", 0);
        this.G = getIntent().getStringExtra("ParentCSN");
        this.H = getIntent().getStringExtra("searchEndpointParams");
        this.I = getIntent().getByteArrayExtra("SearchboxStats");
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopa createBuilder = atnp.a.createBuilder();
        int i = this.F;
        createBuilder.copyOnWrite();
        atnp atnpVar = (atnp) createBuilder.instance;
        atnpVar.b |= 2;
        atnpVar.d = i;
        String str = this.G;
        if (str != null) {
            createBuilder.copyOnWrite();
            atnp atnpVar2 = (atnp) createBuilder.instance;
            atnpVar2.b |= 1;
            atnpVar2.c = str;
        }
        aopcVar.e(atno.b, (atnp) createBuilder.mo39build());
        this.i.d(acuo.a(22678), (apzg) aopcVar.mo39build(), null);
        lel lelVar = this.f;
        acti actiVar = this.i;
        Context context = (Context) lelVar.a.get();
        context.getClass();
        rootView.getClass();
        actiVar.getClass();
        lek lekVar = new lek(context, rootView, actiVar);
        this.B = lekVar;
        lekVar.s();
        this.p = this.e.a(this, this.B, this.z, this.b, this.i, this.g);
        getOnBackPressedDispatcher().a(this.p.a());
        ldb ldbVar = this.m;
        LinearLayout linearLayout = (LinearLayout) rootView.findViewById(R.id.voice_language_button);
        acti actiVar2 = this.i;
        eo eoVar = this.c;
        lec lecVar = this.p;
        aacz aaczVar = (aacz) ldbVar.a.get();
        aaczVar.getClass();
        lcw lcwVar = (lcw) ldbVar.b.get();
        lcwVar.getClass();
        apwt apwtVar = (apwt) ldbVar.c.get();
        apwtVar.getClass();
        akge akgeVar = (akge) ldbVar.d.get();
        akgeVar.getClass();
        linearLayout.getClass();
        actiVar2.getClass();
        eoVar.getClass();
        lecVar.getClass();
        this.f151J = new lda(aaczVar, lcwVar, apwtVar, akgeVar, this, linearLayout, actiVar2, eoVar, lecVar, null, null, null, null);
        this.w = true;
    }

    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public final void onDestroy() {
        this.p.o();
        this.i.t();
        ConnectivitySlimStatusBarController connectivitySlimStatusBarController = this.z;
        if (connectivitySlimStatusBarController != null) {
            connectivitySlimStatusBarController.i();
        }
        this.b.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override // defpackage.dt, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.D) {
            overridePendingTransition(0, 0);
            this.D = false;
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        if (this.x != this.j.a()) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new ldt(this, 1));
        }
    }

    @Override // defpackage.dt, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.k.g(this.p);
        this.z.m(true);
        if (ake.c(this, "android.permission.RECORD_AUDIO") != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                PermissionDescriptor[] permissionDescriptorArr = u;
                if (akdr.f(this, permissionDescriptorArr)) {
                    if (this.v) {
                        return;
                    }
                    if (this.d == null) {
                        akdy akdyVar = this.t;
                        akdyVar.e(permissionDescriptorArr);
                        akdyVar.a = acuo.a(69076);
                        akdyVar.b = acuo.b(69077);
                        akdyVar.c = acuo.b(69078);
                        akdyVar.d = acuo.b(69079);
                        akdyVar.b(R.string.vs_permission_allow_access_description);
                        akdyVar.c(R.string.vs_permission_open_settings_description);
                        akdyVar.e = R.string.permission_fragment_title;
                        this.d = akdyVar.a();
                    }
                    this.d.aF(this);
                    this.d.aG(new ack(this, 2132083889));
                    l(this.d, "PERMISSION_REQUEST_FRAGMENT");
                    this.v = true;
                    return;
                }
            }
            k();
        } else if (this.p.p()) {
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            ayqi.c((AtomicReference) this.n.b().an(false).S(new ldk(atomicBoolean, 2)));
            if (!atomicBoolean.get() || !this.o.t()) {
                i();
                return;
            }
            lco o = lco.o();
            this.r = o;
            o.c = this;
            l(o, "VAA_CONSENT_FRAGMENT");
        } else {
            h();
        }
    }

    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.k.m(this.p);
        if (!this.C) {
            k();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.C = z;
    }
}
