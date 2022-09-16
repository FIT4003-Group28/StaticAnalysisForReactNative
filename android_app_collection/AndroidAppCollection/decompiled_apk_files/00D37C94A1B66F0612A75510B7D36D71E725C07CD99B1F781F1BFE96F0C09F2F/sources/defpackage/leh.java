package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.activity.result.ActivityResult;
import com.google.android.apps.youtube.app.search.voice.PermissionRequestActivity;
import com.google.android.youtube.R;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: leh  reason: default package */
/* loaded from: classes3.dex */
public final class leh extends lcg implements ViewTreeObserver.OnWindowFocusChangeListener, leb {
    public acti a;
    public yni ae;
    public yxz af;
    public final azpw ag = azpw.Y();
    public aacz ah;
    private lec ai;
    private ldv aj;
    private String ak;
    private byte[] al;
    private boolean am;
    private aby an;
    public acvh b;
    public led c;
    public ldw d;
    public Handler e;

    @Override // defpackage.dp
    public final void U() {
        super.U();
        this.ai.o();
        this.a.t();
        if (this.ag.ac() || this.ag.ab()) {
            return;
        }
        this.ag.b(new NoSuchElementException("VoiceSearchFragment destroyed without delivering a result"));
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        if (ake.c(rb(), "android.permission.RECORD_AUDIO") == 0) {
            q();
        } else if (!this.ag.ac() && !this.ag.ab()) {
            this.an.b(new Intent().setClass(rb(), PermissionRequestActivity.class));
        }
        this.ae.g(this.ai);
        this.O.getViewTreeObserver().addOnWindowFocusChangeListener(this);
    }

    @Override // defpackage.lbr
    public final boolean a() {
        if (this.ai == null || !ar()) {
            return false;
        }
        this.ai.a().a();
        return true;
    }

    @Override // defpackage.leb
    public final void f() {
        this.ag.sh(p(1));
    }

    @Override // defpackage.leb
    public final void g(final byte[] bArr) {
        if (this.b.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
            this.b.t("voz_rqf", asny.LATENCY_ACTION_VOICE_ASSISTANT);
        }
        this.ai.j();
        this.e.postDelayed(new Runnable() { // from class: leg
            @Override // java.lang.Runnable
            public final void run() {
                leh lehVar = leh.this;
                lehVar.ag.sh(lehVar.p(-1).putExtra("RecognizedText", bArr));
            }
        }, 100L);
    }

    @Override // defpackage.leb
    public final void h() {
        this.ag.sh(p(-1).putExtra("RegularVoiceSearch", true));
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        int i = this.m.getInt("ParentVeType");
        String string = this.m.getString("ParentCSN");
        this.ak = this.m.getString("searchEndpointParams");
        this.al = this.m.getByteArray("SearchboxStats");
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopa createBuilder = atnp.a.createBuilder();
        createBuilder.copyOnWrite();
        atnp atnpVar = (atnp) createBuilder.instance;
        atnpVar.b |= 2;
        atnpVar.d = i;
        if (string != null) {
            createBuilder.copyOnWrite();
            atnp atnpVar2 = (atnp) createBuilder.instance;
            atnpVar2.b |= 1;
            atnpVar2.c = string;
        }
        aopcVar.e(atno.b, (atnp) createBuilder.mo39build());
        this.a.d(acuo.a(22678), (apzg) aopcVar.mo39build(), null);
        acj acjVar = new acj();
        acd activityResultRegistry = mK().getActivityResultRegistry();
        abw abwVar = new abw() { // from class: lee
            @Override // defpackage.abw
            public final void a(Object obj) {
                leh lehVar = leh.this;
                if (((ActivityResult) obj).a == -1) {
                    lehVar.q();
                } else {
                    lehVar.f();
                }
            }
        };
        dk dkVar = new dk(activityResultRegistry);
        if (this.g > 1) {
            throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        }
        AtomicReference atomicReference = new AtomicReference();
        C0001do c0001do = new C0001do(this, dkVar, atomicReference, acjVar, abwVar);
        if (this.g >= 0) {
            c0001do.a();
        } else {
            this.ad.add(c0001do);
        }
        this.an = new dl(atomicReference);
        this.af.b();
        this.am = true;
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.voice_search_bottom_sheet_fragment, viewGroup, false);
        ldw ldwVar = this.d;
        acti actiVar = this.a;
        Context context = (Context) ldwVar.a.get();
        context.getClass();
        inflate.getClass();
        actiVar.getClass();
        ldv ldvVar = new ldv(context, inflate, actiVar);
        this.aj = ldvVar;
        this.ai = this.c.a(this, ldvVar, null, this.e, this.a, this.b);
        return inflate;
    }

    @Override // defpackage.dp
    public final void my() {
        super.my();
        this.ae.m(this.ai);
        this.O.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (!z) {
            this.ai.m();
        }
    }

    public final Intent p(int i) {
        return new Intent().putExtras(this.m).putExtra("resultCode", i).putExtra("AssistantCsn", this.a.k());
    }

    public final void q() {
        if (this.ai.p()) {
            this.a.n(new acte(actj.VOICE_SEARCH_MIC_BUTTON));
            if (this.b.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
                this.b.t("voz_vp", asny.LATENCY_ACTION_VOICE_ASSISTANT);
            }
            if (eog.au(this.ah)) {
                ylx.n(this, this.ai.b(), new lef(this), new lef(this, 1));
                return;
            } else {
                r("");
                return;
            }
        }
        h();
    }

    public final void r(String str) {
        this.ai.g(str, this.al, this.ak);
        lec lecVar = this.ai;
        if (!lecVar.o) {
            lecVar.d();
        } else if (!this.am) {
        } else {
            this.am = false;
            lecVar.n();
        }
    }
}
