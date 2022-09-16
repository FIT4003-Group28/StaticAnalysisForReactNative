package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.AudioRecord;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: lcs  reason: default package */
/* loaded from: classes3.dex */
public final class lcs implements ViewTreeObserver.OnGlobalLayoutListener {
    static final actj a = actj.VOICE_SEARCH_APPROVE_MICROPHONE_BUTTON;
    static final actj b = actj.VOICE_SEARCH_DENY_MICROPHONE_BUTTON;
    static final actj c = actj.VOICE_SEARCH_PERMA_DENY_MICROPHONE_BUTTON;
    private final akdr A;
    private final let B;
    private final nxh C;
    private final boolean D;
    private final String E;
    private byte[] F;
    private Intent G;
    private final apx H;
    public final acvh d;
    public final axwo e;
    public final dp f;
    public final Activity g;
    public final int h;
    public final int i;
    public String j;
    public int k;
    public boolean l;
    public boolean m;
    public BottomSheetBehavior n;
    public aypg o;
    public boolean p;
    public final aacz q;
    private final aadd r;
    private final akjb s;
    private final lbl t;
    private final akho u;
    private final akhn v;
    private final acti w;
    private final laz x;
    private final airr y;
    private AudioRecord z;

    public lcs(acvh acvhVar, aacz aaczVar, aadd aaddVar, akjb akjbVar, lbl lblVar, akho akhoVar, akhn akhnVar, airr airrVar, akdr akdrVar, let letVar, nxh nxhVar, axwo axwoVar, dp dpVar, laz lazVar, String str, acti actiVar, int i, int i2, boolean z) {
        f fVar = new f() { // from class: com.google.android.apps.youtube.app.search.voice.VoiceInputController$1
            @Override // defpackage.f, defpackage.g
            public final void kG(apy apyVar) {
                lcs lcsVar = lcs.this;
                lcsVar.p = lcsVar.g();
                lcs.this.f.O.getViewTreeObserver().addOnGlobalLayoutListener(lcs.this);
            }

            @Override // defpackage.f, defpackage.g
            public final /* synthetic */ void lc(apy apyVar) {
            }

            @Override // defpackage.f, defpackage.g
            public final void ld(apy apyVar) {
                aypg aypgVar = lcs.this.o;
                if (aypgVar != null) {
                    ayqi.c((AtomicReference) aypgVar);
                }
            }

            @Override // defpackage.g
            public final /* synthetic */ void nA(apy apyVar) {
            }

            @Override // defpackage.g
            public final void nv(apy apyVar) {
                lcs.this.f.O.getViewTreeObserver().removeOnGlobalLayoutListener(lcs.this);
            }

            @Override // defpackage.f, defpackage.g
            public final /* synthetic */ void nz(apy apyVar) {
            }
        };
        this.H = fVar;
        this.d = acvhVar;
        this.q = aaczVar;
        this.r = aaddVar;
        this.s = akjbVar;
        this.t = lblVar;
        this.u = akhoVar;
        this.v = akhnVar;
        this.f = dpVar;
        this.g = dpVar.mJ();
        this.x = lazVar;
        this.E = str;
        this.w = actiVar;
        this.y = airrVar;
        this.A = akdrVar;
        this.B = letVar;
        this.C = nxhVar;
        this.h = i;
        this.i = i2;
        this.D = z;
        this.e = axwoVar;
        akhoVar.g();
        if (eog.aZ(aaczVar)) {
            dpVar.X.c(fVar);
        }
    }

    private final Intent h() {
        Intent intent;
        if (eog.A(this.r)) {
            this.z = this.s.a();
        }
        if (j()) {
            intent = new Intent(this.g, this.B.a).addFlags(131072);
        } else {
            intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        }
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
        intent.addFlags(262144);
        return intent;
    }

    private final void i(Intent intent) {
        if (this.f.mL().e(this.h) != null) {
            return;
        }
        if (g()) {
            zag.h(this.g);
            this.G = intent;
            return;
        }
        if (this.C.f()) {
            this.C.h(0);
        }
        this.f.O.findViewById(this.h).setVisibility(0);
        if (this.i > 0) {
            this.f.O.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: lcp
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    lcs lcsVar = lcs.this;
                    DisplayMetrics displayMetrics = lcsVar.g.getResources().getDisplayMetrics();
                    int i9 = zew.i(displayMetrics, 270);
                    View findViewById = view.findViewById(lcsVar.h);
                    findViewById.getLayoutParams().height = i9 + ((((i4 - i2) - zew.i(displayMetrics, 8)) - i9) % zew.i(displayMetrics, lcsVar.i));
                    if (!findViewById.isInLayout()) {
                        findViewById.requestLayout();
                    }
                }
            });
        }
        Bundle extras = intent.getExtras();
        leh lehVar = new leh();
        lehVar.ae(extras);
        ex l = this.f.mL().l();
        l.p(this.h, lehVar);
        if (((Boolean) this.e.a().y(false).aE().e(0).aw()).booleanValue()) {
            l.d();
        } else {
            l.a();
        }
        this.n.E(3);
        this.n.w(new lcr(this, lehVar));
        ayos C = lehVar.ag.C();
        aypg aypgVar = this.o;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
        }
        this.o = C.T(new lcq(this, 1), new lcq(this));
    }

    private final boolean j() {
        return eog.A(this.r) && !this.l && !zdg.f(this.g);
    }

    public final void a(int i, String[] strArr, int[] iArr) {
        if (i == 1) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                if (!akdr.a(this.g, strArr, iArr).isEmpty()) {
                    this.w.H(3, new acte(c), null);
                    d();
                    return;
                }
                this.w.H(3, new acte(b), null);
                return;
            }
            this.w.H(3, new acte(a), null);
            d();
        }
    }

    public final void b(Intent intent) {
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
        byte[] byteArrayExtra = intent.getByteArrayExtra("RecognizedText");
        boolean booleanExtra = intent.getBooleanExtra("RegularVoiceSearch", false);
        String stringExtra = intent.getStringExtra("AssistantCsn");
        if (stringArrayListExtra != null && !stringArrayListExtra.isEmpty()) {
            if (eog.z(this.r) && this.d.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
                this.d.t("voz_mf", asny.LATENCY_ACTION_VOICE_ASSISTANT);
            }
            laz lazVar = this.x;
            if (lazVar == null) {
                return;
            }
            lazVar.a(stringArrayListExtra.get(0), this.F, this.j, actj.SEARCH_BAR_MIC_BUTTON.II);
        } else if (byteArrayExtra == null) {
            if (booleanExtra) {
                this.l = true;
                d();
                return;
            }
            this.d.l(asny.LATENCY_ACTION_VOICE_ASSISTANT);
        } else if (this.x == null) {
        } else {
            byte[] bArr = this.F;
            if (bArr == null || bArr.length == 0) {
                this.F = intent.getByteArrayExtra("SearchboxStats");
            }
            this.x.b(byteArrayExtra, stringExtra, this.F);
        }
    }

    public final void c(byte[] bArr) {
        this.F = bArr;
        this.w.H(3, new acte(actj.SEARCH_BAR_MIC_BUTTON), null);
        if (eog.z(this.r)) {
            this.d.s(asny.LATENCY_ACTION_VOICE_ASSISTANT);
        }
        if (eog.A(this.r) && ake.c(this.g, "android.permission.RECORD_AUDIO") != 0) {
            try {
                for (String str : this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 4096).requestedPermissions) {
                    if (str.contains("android.permission.RECORD_AUDIO")) {
                        this.w.n(new acte(a));
                        this.w.n(new acte(b));
                        this.w.n(new acte(c));
                        this.A.d(new String[]{"android.permission.RECORD_AUDIO"});
                        this.f.ab(new String[]{"android.permission.RECORD_AUDIO"}, 1);
                        return;
                    }
                }
                afus.b(2, 32, "Permission not declared in manifest: android.permission.RECORD_AUDIO");
            } catch (PackageManager.NameNotFoundException e) {
                zep.o("VoiceInputController", "PackageInfo not found", e);
            }
            this.l = true;
        }
        d();
    }

    public final void d() {
        if (eog.z(this.r) && this.d.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
            this.d.t("voz_ms", asny.LATENCY_ACTION_VOICE_ASSISTANT);
        }
        Intent h = h();
        if (this.F == null) {
            this.u.f();
            akib a2 = this.t.a();
            this.u.l = a2.j();
            this.u.m = a2.b();
            this.u.n = this.v.b();
            this.F = this.u.a(a2.f()).toByteArray();
        }
        if (j()) {
            h.putExtra("SearchboxStats", this.F);
            AudioRecord audioRecord = this.z;
            if (audioRecord != null) {
                h.putExtra("MicSampleRate", audioRecord.getSampleRate());
                h.putExtra("MicAudioFormatEncoding", this.z.getAudioFormat());
                h.putExtra("MicChannelConfig", this.z.getChannelConfiguration());
            }
            h.putExtra("ParentCSN", this.j);
            h.putExtra("ParentVeType", this.k);
            h.putExtra("searchEndpointParams", this.E);
            h.putExtra("disableHalfPlateSuggestions", this.D);
        }
        airr airrVar = this.y;
        if (airrVar != null) {
            airrVar.a();
        }
        if (!j() || !eog.aZ(this.q) || this.m || this.h == 0) {
            this.f.startActivityForResult(h, 1000);
        } else {
            i(h);
        }
    }

    public final boolean e() {
        return h().resolveActivity(this.g.getPackageManager()) != null;
    }

    public final boolean f() {
        BottomSheetBehavior bottomSheetBehavior = this.n;
        return bottomSheetBehavior != null && bottomSheetBehavior.t == 3;
    }

    public final boolean g() {
        mb s = lj.s(this.f.O);
        if (s != null) {
            return s.y(8);
        }
        return false;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean g = g();
        if (g != this.p) {
            this.p = g;
            if (g) {
                if (!f()) {
                    return;
                }
                this.n.E(5);
                return;
            }
            Intent intent = this.G;
            if (intent == null) {
                return;
            }
            i(intent);
            this.G = null;
        }
    }
}
