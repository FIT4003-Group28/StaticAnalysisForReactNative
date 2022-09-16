package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: jsi  reason: default package */
/* loaded from: classes3.dex */
public final class jsi extends jtb {
    public jry a;
    private jji ae;
    private jsh af;
    private boolean ag = true;
    public fsx b;
    public fry c;
    private fsx d;
    private jrx e;

    @Override // defpackage.gbd
    public final fsx aK() {
        return this.d;
    }

    @Override // defpackage.gbd
    public final CharSequence aP() {
        oa oaVar = this.ap;
        return oaVar != null ? oaVar.getString(R.string.offline_videos_title) : "";
    }

    @Override // defpackage.gbd
    public final Object aQ() {
        jrx jrxVar = this.e;
        akam akamVar = null;
        if (jrxVar == null) {
            return null;
        }
        jsy jsyVar = jrxVar.s;
        if (jsyVar != null) {
            akamVar = jsyVar.pn();
        }
        return new jsh(new jrw(akamVar, jrxVar.x));
    }

    @Override // defpackage.gbd
    public final void aV(Object obj) {
        if (!(obj instanceof jsh)) {
            return;
        }
        jsh jshVar = (jsh) obj;
        this.af = jshVar;
        Object obj2 = jshVar.a;
    }

    @Override // defpackage.gbd
    public final void aW(boolean z) {
        this.ag = z;
        jrx jrxVar = this.e;
        if (jrxVar == null) {
            return;
        }
        jrxVar.c(z);
    }

    @Override // defpackage.gbd, defpackage.dp
    public final void mS() {
        super.mS();
        this.ae.b.d(acuo.a(42352), aM(), null);
        final jrx jrxVar = this.e;
        jrq jrqVar = jrxVar.j;
        if (!jrqVar.d) {
            acvg c = ((acvh) jrqVar.a.get()).c(asny.LATENCY_ACTION_DOWNLOADS);
            c.getClass();
            jrqVar.c = c;
            ajph ajphVar = (ajph) jrqVar.b.get();
            ajmy ajmyVar = (ajmy) ajphVar.a.get();
            ajmyVar.getClass();
            akcq akcqVar = (akcq) ajphVar.b.get();
            akcqVar.getClass();
            akvm akvmVar = (akvm) ajphVar.c.get();
            akvmVar.getClass();
            c.getClass();
            new ajpg(ajmyVar, akcqVar, akvmVar, 6, 1, 0, false, false, c).k();
            c.c("br_s");
        }
        jsz jszVar = jrxVar.a;
        akam akamVar = jrxVar.t;
        RecyclerView recyclerView = jrxVar.r;
        recyclerView.getClass();
        jji jjiVar = jrxVar.l;
        ajsg ajsgVar = (ajsg) jszVar.a.get();
        ajsgVar.getClass();
        ajyx ajyxVar = (ajyx) jszVar.b.get();
        ajyxVar.getClass();
        jna jnaVar = (jna) jszVar.c.get();
        jnaVar.getClass();
        yni yniVar = (yni) jszVar.d.get();
        yniVar.getClass();
        yzj yzjVar = (yzj) jszVar.e.get();
        yzjVar.getClass();
        ajsi ajsiVar = (ajsi) jszVar.f.get();
        ajsiVar.getClass();
        akar akarVar = (akar) jszVar.g.get();
        akarVar.getClass();
        aadd aaddVar = (aadd) jszVar.h.get();
        aaddVar.getClass();
        aynx aynxVar = (aynx) jszVar.i.get();
        aynxVar.getClass();
        fbu fbuVar = (fbu) jszVar.j.get();
        fbuVar.getClass();
        recyclerView.getClass();
        jrxVar.s = new jsy(ajsgVar, ajyxVar, jnaVar, yniVar, yzjVar, ajsiVar, akarVar, aaddVar, aynxVar, fbuVar, akamVar, recyclerView, jjiVar);
        if (jrxVar.t == null || !jrxVar.x) {
            jna jnaVar2 = jrxVar.k;
            aqpa aqpaVar = aqpa.FILTER_TYPE_NONE;
            aopa createBuilder = aqpb.a.createBuilder();
            createBuilder.copyOnWrite();
            aqpb aqpbVar = (aqpb) createBuilder.instance;
            aqpbVar.c = aqpaVar.e;
            aqpbVar.b |= 1;
            jrxVar.u = ayos.A(new jmy(jnaVar2, new jnb("downloads_page_section_identifier_unknown", createBuilder, jnaVar2.a, amon.a), 1)).K(azpj.b(jrxVar.h)).G(azpj.b(jrxVar.i)).S(new ayqb() { // from class: jrr
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    jrx jrxVar2 = jrx.this;
                    jmz jmzVar = (jmz) obj;
                    jsy jsyVar = jrxVar2.s;
                    if (jsyVar != null) {
                        jsyVar.T(jmzVar.a);
                        jrxVar2.a();
                    }
                }
            });
        } else {
            jrxVar.i.execute(new Runnable() { // from class: jrs
                @Override // java.lang.Runnable
                public final void run() {
                    jrx.this.a();
                }
            });
        }
        jrxVar.b.g(jrxVar);
        jrxVar.b.g(jrxVar.c);
        jrxVar.b.g(jrxVar.e);
        jrxVar.f.a(jrxVar.o);
        jrxVar.c.b();
        jrxVar.d.b(jot.c);
        if (jrxVar.n) {
            jrxVar.v = new ajsm();
            jrxVar.w = new fsl(jrxVar.m);
            jrxVar.c(true);
            jsy jsyVar = jrxVar.s;
            jsyVar.getClass();
            jsyVar.J(jrxVar.v);
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.downloads_page_fragment, viewGroup, false);
        acti oi = oi();
        oi.getClass();
        this.ae = new jji(oi);
        jry jryVar = this.a;
        jsh jshVar = this.af;
        akam akamVar = jshVar != null ? jshVar.b : null;
        jji jjiVar = this.ae;
        CharSequence aP = aP();
        boolean ba = ba();
        yni yniVar = (yni) jryVar.b.get();
        yniVar.getClass();
        jln jlnVar = (jln) jryVar.c.get();
        jlnVar.getClass();
        jot jotVar = (jot) jryVar.d.get();
        jotVar.getClass();
        fcd fcdVar = (fcd) jryVar.e.get();
        fcdVar.getClass();
        jaw jawVar = (jaw) jryVar.f.get();
        jawVar.getClass();
        aagi aagiVar = (aagi) jryVar.g.get();
        aagiVar.getClass();
        Executor executor = (Executor) jryVar.h.get();
        executor.getClass();
        Executor executor2 = (Executor) jryVar.i.get();
        executor2.getClass();
        jrq jrqVar = (jrq) jryVar.j.get();
        jrqVar.getClass();
        jna jnaVar = (jna) jryVar.k.get();
        jnaVar.getClass();
        ypf ypfVar = (ypf) jryVar.l.get();
        aacz aaczVar = (aacz) jryVar.m.get();
        aaczVar.getClass();
        fcu fcuVar = (fcu) jryVar.n.get();
        fcuVar.getClass();
        fbw fbwVar = (fbw) jryVar.o.get();
        fbwVar.getClass();
        snc sncVar = (snc) jryVar.p.get();
        sncVar.getClass();
        jjiVar.getClass();
        aP.getClass();
        jrx jrxVar = new jrx((jsz) jryVar.a.get(), yniVar, jlnVar, jotVar, fcdVar, jawVar, aagiVar, executor, executor2, jrqVar, jnaVar, ypfVar, aaczVar, fcuVar, fbwVar, sncVar, akamVar, jjiVar, aP, ba);
        this.e = jrxVar;
        jrxVar.q = (LoadingFrameLayout) inflate.findViewById(R.id.loading_layout);
        jrxVar.r = (RecyclerView) inflate.findViewById(R.id.downloads_list);
        RecyclerView recyclerView = jrxVar.r;
        recyclerView.getContext();
        recyclerView.ag(new LinearLayoutManager());
        this.e.c(this.ag);
        fsw a = this.b.a();
        a.m(new jsg(this, 1));
        this.d = a.a();
        return inflate;
    }

    @Override // defpackage.dp
    public final void my() {
        super.my();
        jrx jrxVar = this.e;
        aypg aypgVar = jrxVar.u;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
            jrxVar.u = null;
        }
        jrxVar.x = false;
        jrxVar.f.c(jrxVar.o);
        jrxVar.b.m(jrxVar);
        jrxVar.b.m(jrxVar.c);
        jrxVar.b.m(jrxVar.e);
        jsy jsyVar = jrxVar.s;
        jsyVar.getClass();
        jsyVar.j();
        jrxVar.s = null;
        jji jjiVar = jrxVar.l;
        jjiVar.g = 0;
        jjiVar.d.clear();
        jjiVar.c.clear();
        jjiVar.e.clear();
        jjiVar.f.clear();
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        jsy jsyVar;
        super.onConfigurationChanged(configuration);
        jrx jrxVar = this.e;
        if (jrxVar == null || (jsyVar = jrxVar.s) == null) {
            return;
        }
        jsyVar.E(configuration);
    }
}
