package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: jjg  reason: default package */
/* loaded from: classes3.dex */
public final class jjg extends jjb implements ynl {
    public yni a;
    public fcd ae;
    public axnm af;
    public jnw ag;
    public fsx ah;
    public String ai;
    public String aj;
    public Future ak = anlz.o();
    public jev al;
    public agrf am;
    private agvx an;
    public yrj b;
    public aios c;
    public jew d;
    public jln e;

    @Override // defpackage.gbd, defpackage.dp
    public final void Y() {
        super.Y();
        if (this.b.o()) {
            this.an.l().j();
        }
    }

    @Override // defpackage.gbd
    public final fsx aK() {
        return this.ah;
    }

    @Override // defpackage.gbd
    public final CharSequence aP() {
        return this.aj;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                if (!((agnn) obj).a.equals(this.ai)) {
                    return null;
                }
                this.at.c(true);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{agnn.class};
    }

    @Override // defpackage.gbd
    public final fsx lt() {
        if (this.aq == null) {
            fsw a = this.ah.a();
            a.m(new ampg() { // from class: jje
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    frz frzVar = (frz) obj;
                    frzVar.a = jjg.this.aj;
                    return frzVar;
                }
            });
            this.aq = a.a();
        }
        return this.aq;
    }

    @Override // defpackage.gbd, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        String string = this.m.getString("playlist_id");
        zgh.m(string);
        this.ai = string;
    }

    @Override // defpackage.gbd, defpackage.dp
    public final void mS() {
        super.mS();
        this.a.g(this);
        this.a.g(this.e);
        this.a.g(this.ae);
        jev jevVar = this.al;
        jevVar.a(true);
        jevVar.b.g(jevVar);
        if (jevVar.s.b().booleanValue()) {
            jff jffVar = jevVar.x;
            if (jffVar != null) {
                jevVar.b.g(jffVar);
                jlj jljVar = jffVar.c;
                String str = jffVar.h;
                jffVar.n = jljVar.a(str, jffVar.m, 1, jffVar.d.a(str, null, null, new jfd(jffVar, 1), new jfd(jffVar), jffVar.f));
                if (jffVar.j != null) {
                    jffVar.c(jffVar.g == aspb.LIKE);
                    jffVar.j.setEnabled(false);
                }
                ImageView imageView = jffVar.k;
                if (imageView != null) {
                    zag.o(imageView, false);
                }
                ImageView imageView2 = jffVar.j;
                if (imageView2 != null) {
                    imageView2.setOnClickListener(new jfc(jffVar, 1));
                }
                ImageView imageView3 = jffVar.k;
                if (imageView3 != null) {
                    imageView3.setOnClickListener(new jfc(jffVar));
                }
                TextView textView = jffVar.l;
                if (textView != null) {
                    textView.setOnClickListener(new jfc(jffVar, 2));
                }
                agqg d = ((agrf) jffVar.e.get()).a().i().d(jffVar.h);
                if (d != null) {
                    jffVar.b(d.a);
                    jffVar.e();
                }
            }
        } else {
            jfa jfaVar = jevVar.w;
            if (jfaVar != null) {
                jevVar.b.g(jfaVar);
                jfaVar.g();
                jlj jljVar2 = jfaVar.c;
                String str2 = jfaVar.h;
                jfaVar.n = jljVar2.a(str2, jfaVar.m, 1, jfaVar.d.a(str2, null, null, new jey(jfaVar), new jey(jfaVar, 1), jfaVar.f));
                if (jfaVar.j != null) {
                    jfaVar.d(jfaVar.g == aspb.LIKE);
                    jfaVar.j.setEnabled(false);
                }
                ImageView imageView4 = jfaVar.k;
                if (imageView4 != null) {
                    zag.o(imageView4, false);
                }
                ImageView imageView5 = jfaVar.j;
                if (imageView5 != null) {
                    imageView5.setOnClickListener(new jex(jfaVar, 1));
                }
                ImageView imageView6 = jfaVar.k;
                if (imageView6 != null) {
                    imageView6.setOnClickListener(new jex(jfaVar));
                }
                TextView textView2 = jfaVar.l;
                if (textView2 != null) {
                    textView2.setOnClickListener(new jex(jfaVar, 2));
                }
                agqg d2 = ((agrf) jfaVar.e.get()).a().i().d(jfaVar.h);
                if (d2 != null) {
                    jfaVar.c(d2.a);
                    jfaVar.h();
                }
            }
        }
        this.ak = this.ag.b(this.ai, new jjf(this));
        this.e.b();
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        View inflate = layoutInflater.inflate(R.layout.offline_playlist_fragment, viewGroup, false);
        this.an = this.am.a();
        aios aiosVar = this.c;
        oa oaVar = this.ap;
        oaVar.getClass();
        aiosVar.d = new aiop(oaVar, null);
        jew jewVar = this.d;
        acti oi = oi();
        String str = this.ai;
        boolean ba = ba();
        axxi axxiVar = (axxi) jewVar.a.get();
        axxiVar.getClass();
        Activity activity = (Activity) jewVar.b.get();
        activity.getClass();
        yni yniVar = (yni) jewVar.c.get();
        yniVar.getClass();
        aadd aaddVar = (aadd) jewVar.d.get();
        aaddVar.getClass();
        jfb jfbVar = (jfb) jewVar.e.get();
        jfg jfgVar = (jfg) jewVar.f.get();
        jol jolVar = (jol) jewVar.g.get();
        jolVar.getClass();
        azqb azqbVar = jewVar.h;
        ajrh ajrhVar = (ajrh) jewVar.i.get();
        ajrhVar.getClass();
        ajsa ajsaVar = (ajsa) jewVar.j.get();
        ajsaVar.getClass();
        jlh jlhVar = (jlh) jewVar.k.get();
        azqb azqbVar2 = jewVar.l;
        oi.getClass();
        str.getClass();
        final jev jevVar = new jev(axxiVar, activity, yniVar, aaddVar, jfbVar, jfgVar, jolVar, azqbVar, ajrhVar, ajsaVar, jlhVar, azqbVar2, oi, str, ba);
        this.al = jevVar;
        jevVar.p = (LoadingFrameLayout) inflate.findViewById(R.id.loading_layout);
        jevVar.q = (ListView) inflate.findViewById(R.id.videos);
        if (jevVar.n) {
            fsl fslVar = new fsl("");
            jevVar.v = akel.h(jevVar.g, fslVar, null);
            jevVar.v.oK(new ajrs(), fslVar);
            zgd.v(jevVar.v.a(), -1, -2);
            ListView listView = jevVar.q;
            ajru ajruVar = jevVar.v;
            ajruVar.getClass();
            listView.addHeaderView(ajruVar.a());
        }
        if (jevVar.s.b().booleanValue()) {
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.playlist_header_v2, (ViewGroup) jevVar.q, false);
            jevVar.q.addHeaderView(viewGroup2);
            jfg jfgVar2 = jevVar.d;
            acti actiVar = jevVar.l;
            aspb aspbVar = aspb.INDIFFERENT;
            String str2 = jevVar.m;
            boolean z = jevVar.n;
            Activity activity2 = (Activity) jfgVar2.a.get();
            activity2.getClass();
            ajmy ajmyVar = (ajmy) jfgVar2.b.get();
            ajmyVar.getClass();
            ksj ksjVar = (ksj) jfgVar2.c.get();
            ksjVar.getClass();
            ahce ahceVar = (ahce) jfgVar2.d.get();
            ahceVar.getClass();
            jlj jljVar = (jlj) jfgVar2.e.get();
            fcg fcgVar = (fcg) jfgVar2.f.get();
            azqb azqbVar3 = jfgVar2.g;
            aadd aaddVar2 = (aadd) jfgVar2.h.get();
            aaddVar2.getClass();
            akbn akbnVar = (akbn) jfgVar2.i.get();
            akbnVar.getClass();
            aspbVar.getClass();
            viewGroup2.getClass();
            view = inflate;
            jevVar.x = new jff(activity2, ajmyVar, ksjVar, ahceVar, jljVar, fcgVar, azqbVar3, aaddVar2, akbnVar, actiVar, aspbVar, viewGroup2, str2, z);
        } else {
            view = inflate;
            ViewGroup viewGroup3 = (ViewGroup) layoutInflater.inflate(R.layout.playlist_header, (ViewGroup) jevVar.q, false);
            jevVar.q.addHeaderView(viewGroup3);
            jfb jfbVar2 = jevVar.c;
            acti actiVar2 = jevVar.l;
            aspb aspbVar2 = aspb.INDIFFERENT;
            String str3 = jevVar.m;
            boolean z2 = jevVar.n;
            Activity activity3 = (Activity) jfbVar2.a.get();
            activity3.getClass();
            ajmy ajmyVar2 = (ajmy) jfbVar2.b.get();
            ajmyVar2.getClass();
            ksj ksjVar2 = (ksj) jfbVar2.c.get();
            ksjVar2.getClass();
            ahce ahceVar2 = (ahce) jfbVar2.d.get();
            ahceVar2.getClass();
            jfw jfwVar = (jfw) jfbVar2.e.get();
            gee geeVar = (gee) jfbVar2.f.get();
            jlj jljVar2 = (jlj) jfbVar2.g.get();
            fcg fcgVar2 = (fcg) jfbVar2.h.get();
            azqb azqbVar4 = jfbVar2.i;
            aadd aaddVar3 = (aadd) jfbVar2.j.get();
            aaddVar3.getClass();
            aspbVar2.getClass();
            viewGroup3.getClass();
            jevVar.w = new jfa(activity3, ajmyVar2, ksjVar2, ahceVar2, geeVar, jljVar2, fcgVar2, azqbVar4, aaddVar3, actiVar2, aspbVar2, viewGroup3, str3, z2);
        }
        ajqw ajqwVar = new ajqw();
        ajqwVar.f(agqo.class, jevVar.h);
        ajqwVar.f(atfa.class, new ajsc(jevVar.i));
        ajrg a = jevVar.f.a(ajqwVar);
        jevVar.r = new ajsm();
        jevVar.r.mG(new ajrt() { // from class: jes
            @Override // defpackage.ajrt
            public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
                ajrsVar.f("OfflineVideoPresenter.playlistId", jev.this.m);
            }
        });
        a.h(jevVar.r);
        jevVar.q.setAdapter((ListAdapter) a);
        jevVar.u = (TextView) layoutInflater.inflate(R.layout.offline_videos_footer, (ViewGroup) jevVar.q, false);
        jevVar.u.setVisibility(8);
        jevVar.q.addFooterView(jevVar.u);
        return view;
    }

    @Override // defpackage.dp
    public final void my() {
        super.my();
        this.ak.cancel(false);
        jev jevVar = this.al;
        yiy yiyVar = jevVar.t;
        if (yiyVar != null && !yiyVar.e()) {
            jevVar.t.d();
        }
        jevVar.t = null;
        if (jevVar.v != null) {
            jevVar.q.reclaimViews(new ArrayList());
            ajsa ajsaVar = jevVar.g;
            ajru ajruVar = jevVar.v;
            ajruVar.getClass();
            ajsaVar.b(ajruVar.a());
            jevVar.v = null;
        }
        jevVar.b.m(jevVar);
        if (jevVar.s.b().booleanValue()) {
            jff jffVar = jevVar.x;
            if (jffVar != null) {
                jevVar.b.m(jffVar);
            }
        } else {
            jfa jfaVar = jevVar.w;
            if (jfaVar != null) {
                jfaVar.a();
                jevVar.b.m(jfaVar);
            }
        }
        this.a.m(this.ae);
        this.a.m(this.e);
        this.a.m(this);
    }
}
