package com.google.android.apps.youtube.app.search;

import android.content.res.Configuration;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
import com.google.android.libraries.youtube.innertube.model.SearchResponseModel;
import com.google.protos.youtube.api.innertube.EngagementPanelSectionListRendererOuterClass;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class OnlineSearchController extends kuz implements lar, f, ynl {
    private final lay L;
    private final kwj M;
    private final kwk N;
    private final HatsController O;
    private final MealbarPromoController P;
    private final akfw Q;
    private final fsd R;
    private final axnm S;
    private final nml T;
    private final boolean U;
    private final int V;
    private akam W;
    private final kwh X;
    public final akvm a;
    public final ajwb b;
    public SearchResponseModel c;
    public apvj d;
    public TextToSpeech e;
    public final abcg f;
    public final akhf g;
    public final akhi h;
    public final yni i;
    public final yzj j;
    public final lbl k;
    public final ajmy l;
    public final akcq m;
    public final aafo n;
    public final azqb o;
    public final axxo p;
    public ajpm q;
    public acvh r;
    public lyy s;
    String t;
    lau u;
    argv v;
    fjv w;
    public afzc x;

    /* JADX WARN: Removed duplicated region for block: B:55:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OnlineSearchController(defpackage.azqb r42, defpackage.mbu r43, defpackage.lpj r44, defpackage.lpr r45, defpackage.abcg r46, com.google.android.apps.youtube.app.common.ui.bottomui.HatsController r47, com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController r48, defpackage.akfw r49, defpackage.akhf r50, defpackage.akhi r51, defpackage.yni r52, final defpackage.yzj r53, defpackage.fsd r54, defpackage.lbl r55, defpackage.aacz r56, defpackage.aadd r57, defpackage.axnm r58, defpackage.ajmy r59, defpackage.akcq r60, defpackage.acvh r61, defpackage.lay r62, defpackage.tdu r63, defpackage.aafo r64, defpackage.akvm r65, defpackage.kza r66, defpackage.ajsg r67, defpackage.azqb r68, defpackage.nml r69, defpackage.axxo r70, android.support.v7.widget.RecyclerView r71, com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout r72, android.app.Activity r73, final defpackage.acti r74, defpackage.kwj r75, defpackage.kwk r76, defpackage.kwh r77, android.os.Bundle r78, defpackage.akam r79) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.search.OnlineSearchController.<init>(azqb, mbu, lpj, lpr, abcg, com.google.android.apps.youtube.app.common.ui.bottomui.HatsController, com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController, akfw, akhf, akhi, yni, yzj, fsd, lbl, aacz, aadd, axnm, ajmy, akcq, acvh, lay, tdu, aafo, akvm, kza, ajsg, azqb, nml, axxo, android.support.v7.widget.RecyclerView, com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout, android.app.Activity, acti, kwj, kwk, kwh, android.os.Bundle, akam):void");
    }

    private final void p(final String str, boolean z) {
        boolean z2 = false;
        q(false);
        if (z) {
            this.b.z();
            this.b.O();
        } else {
            this.z.c();
            if (this.D != null) {
                argv argvVar = this.v;
                if (argvVar != null) {
                    this.u.a(argvVar);
                }
                i();
                asbz asbzVar = this.D;
                if ((asbzVar.b & 512) != 0) {
                    this.A.D(new acte(asbzVar.h));
                }
                if (eog.aU(this.K)) {
                    this.b.c();
                    this.z.a();
                    return;
                }
                h(new SearchResponseModel(this.D), false);
                return;
            }
        }
        kur kurVar = new kur(this, z, str);
        lyy lyyVar = this.s;
        if (lyyVar != null && this.U) {
            int i = this.V;
            aopa createBuilder = apvj.a.createBuilder();
            for (int i2 = 0; i2 < i; i2++) {
                aopa createBuilder2 = apvg.a.createBuilder();
                aopa createBuilder3 = apvi.a.createBuilder();
                apvh apvhVar = apvh.STYLE_HOME_FILTER;
                createBuilder3.copyOnWrite();
                apvi apviVar = (apvi) createBuilder3.instance;
                apviVar.c = apvhVar.p;
                apviVar.b |= 1;
                createBuilder2.copyOnWrite();
                apvg apvgVar = (apvg) createBuilder2.instance;
                apvi apviVar2 = (apvi) createBuilder3.mo39build();
                apviVar2.getClass();
                apvgVar.e = apviVar2;
                apvgVar.b |= 1;
                apvg apvgVar2 = (apvg) createBuilder2.mo39build();
                aopa createBuilder4 = apvk.a.createBuilder();
                createBuilder4.copyOnWrite();
                apvk apvkVar = (apvk) createBuilder4.instance;
                apvgVar2.getClass();
                apvkVar.c = apvgVar2;
                apvkVar.b = 91394224;
                apvk apvkVar2 = (apvk) createBuilder4.mo39build();
                createBuilder.copyOnWrite();
                apvj apvjVar = (apvj) createBuilder.instance;
                apvkVar2.getClass();
                aopu aopuVar = apvjVar.b;
                if (!aopuVar.c()) {
                    apvjVar.b = aopi.mutableCopy(aopuVar);
                }
                apvjVar.b.add(apvkVar2);
            }
            lyyVar.a(createBuilder);
        }
        if (eog.z(this.B) && this.r.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
            z2 = true;
        }
        this.x = new afzc(kurVar);
        final lay layVar = this.L;
        final kuu kuuVar = new kuu(this, str, z, z2);
        layVar.a.execute(new Runnable() { // from class: law
            @Override // java.lang.Runnable
            public final void run() {
                String str2;
                lay layVar2 = lay.this;
                String str3 = str;
                final lax laxVar = kuuVar;
                byte[] bArr = layVar2.c;
                if (bArr == null || bArr.length == 0 || (str2 = layVar2.d) == null || !str2.equals(str3)) {
                    laxVar.a(null);
                    return;
                }
                final asbz asbzVar2 = (asbz) layVar2.e.a(layVar2.c, asbz.a);
                layVar2.b.post(new Runnable() { // from class: lav
                    @Override // java.lang.Runnable
                    public final void run() {
                        lax.this.a(asbzVar2);
                    }
                });
            }
        });
    }

    private final void q(boolean z) {
        kwj kwjVar = this.M;
        if (kwjVar != null) {
            kwjVar.c(z);
        }
    }

    @Override // defpackage.kuz
    public final void a() {
        n();
        this.b.j();
        afzc afzcVar = this.x;
        if (afzcVar != null) {
            afzcVar.d();
        }
        this.i.m(this);
    }

    @Override // defpackage.kuz
    public final void b(String str, String str2) {
        aopa createBuilder = atnp.a.createBuilder();
        createBuilder.copyOnWrite();
        atnp atnpVar = (atnp) createBuilder.instance;
        atnpVar.b |= 2;
        atnpVar.d = 22156;
        if (!TextUtils.isEmpty(str)) {
            createBuilder.copyOnWrite();
            atnp atnpVar2 = (atnp) createBuilder.instance;
            str.getClass();
            atnpVar2.b |= 1;
            atnpVar2.c = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            createBuilder.copyOnWrite();
            atnp atnpVar3 = (atnp) createBuilder.instance;
            str2.getClass();
            atnpVar3.b |= 32;
            atnpVar3.f = str2;
        }
        this.f221J = (atnp) createBuilder.mo39build();
        i();
    }

    @Override // defpackage.kuz
    public final void c(Configuration configuration) {
        this.b.E(configuration);
    }

    @Override // defpackage.kuz
    public final void d(String str) {
        p(str, false);
    }

    @Override // defpackage.kuz
    public final boolean e() {
        return this.c != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(com.google.android.libraries.youtube.innertube.model.SearchResponseModel r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.search.OnlineSearchController.h(com.google.android.libraries.youtube.innertube.model.SearchResponseModel, boolean):void");
    }

    public final void i() {
        apzg apzgVar;
        if (this.D != null && this.f221J != null && (apzgVar = this.C) != null) {
            aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
            aopcVar.e(atno.b, this.f221J);
            this.C = (apzg) aopcVar.mo39build();
        }
        this.A.F(acuo.a(4724), acuc.DEFAULT, this.C);
        this.A.n(new acte(acuo.b(10349)));
        this.A.n(new acte(acuo.b(64833)));
        this.A.n(new acte(acuo.b(22156)));
        this.R.n(this.A.c().a);
        this.R.o();
    }

    @Override // defpackage.lar
    public final void j(aupl auplVar, int i) {
        apzg apzgVar = auplVar.e;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        if (apzgVar.qn(SearchEndpointOuterClass.searchEndpoint)) {
            apzg apzgVar2 = auplVar.e;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            String str = ((auoy) apzgVar2.qm(SearchEndpointOuterClass.searchEndpoint)).c;
            kux kuxVar = this.I;
            if (kuxVar != null) {
                kwm kwmVar = (kwm) kuxVar;
                kwmVar.az = str;
                kwmVar.af.d(str);
                kwmVar.aB.setText(kwmVar.az);
            }
            p(str, true);
        }
    }

    @Override // defpackage.kuz
    public final void k(Bundle bundle) {
        super.k(bundle);
        if (this.t != null && this.D != null) {
            final abcc abccVar = (abcc) this.S.get();
            final String str = this.t;
            final asbz asbzVar = this.D;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Invalid cache key: cache key is empty");
            }
            abccVar.c.execute(new Runnable() { // from class: abca
                @Override // java.lang.Runnable
                public final void run() {
                    abcc abccVar2 = abcc.this;
                    asbz asbzVar2 = asbzVar;
                    String str2 = str;
                    HashMap hashMap = new HashMap();
                    cer cerVar = new cer();
                    cerVar.a = asbzVar2.toByteArray();
                    cerVar.g = hashMap;
                    abccVar2.a.d(str2, cerVar);
                }
            });
        }
        argv argvVar = this.v;
        if (argvVar != null) {
            lau lauVar = this.u;
            if (lauVar != null) {
                argvVar = pns.g(argvVar, lauVar.a.c);
            }
            bundle.putByteArray("sticky_horizontal_card_list", argvVar.toByteArray());
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                h(this.c, ((kxb) obj).b());
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{kxb.class};
    }

    public final void l(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aunb aunbVar = (aunb) it.next();
            if (aunbVar.qn(EngagementPanelSectionListRendererOuterClass.engagementPanelSectionListRenderer)) {
                this.T.q((aqvq) aunbVar.qm(EngagementPanelSectionListRendererOuterClass.engagementPanelSectionListRenderer));
            }
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    public final void m(asbz asbzVar) {
        aafo aafoVar = this.n;
        amuf f = amuk.f();
        f.j(asbzVar.k);
        aafoVar.b(f.g());
    }

    public final void n() {
        ajpm ajpmVar = this.q;
        if (ajpmVar != null) {
            ajpmVar.f();
            this.q = null;
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nv(apy apyVar) {
        TextToSpeech textToSpeech = this.e;
        if (textToSpeech != null) {
            textToSpeech.stop();
            this.e.shutdown();
            this.e = null;
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }

    @Override // defpackage.kuz, defpackage.ajzh
    public final akam pn() {
        lyx lyxVar;
        kuy kuyVar = new kuy(this.D, this.b.p());
        lyy lyyVar = this.s;
        if (lyyVar != null) {
            lzd lzdVar = lyyVar.a;
            if (lzdVar != null) {
                lyxVar = new lyx(lyyVar.c, lyyVar.b, lzdVar.g);
            } else {
                lyxVar = new lyx(lyyVar.c, lyyVar.b, null);
            }
            this.W = lyxVar;
        }
        if (eog.aU(this.K)) {
            return new kus(kuyVar, this.b.pn(), this.d, this.W);
        }
        return new kus(kuyVar, null, this.d, this.W);
    }
}
