package com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.service;

import android.net.Uri;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.protos.youtube.api.innertube.AndroidIntentActionEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SubscribeEndpointOuterClass$SubscribeEndpoint;
import com.google.protos.youtube.api.innertube.UnsubscribeEndpointOuterClass$UnsubscribeEndpoint;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b implements com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a {
    public final aafo a;
    public int c;
    private final yrj d;
    private final afvn e;
    private final abdi f;
    private com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.b h;
    private String i;
    private String j;
    private boolean l;
    public avaq b = avaq.a;
    private com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c g = com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c.V;
    private aoob k = aoob.b;

    public b(aafo aafoVar, yrj yrjVar, afvn afvnVar, abdi abdiVar) {
        this.a = aafoVar;
        this.d = yrjVar;
        this.e = afvnVar;
        this.f = abdiVar;
    }

    public final int a() {
        ylr.c();
        return this.c;
    }

    public final void b(avaq avaqVar, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c cVar, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.b bVar, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b bVar2) {
        avbh avbhVar;
        ylr.c();
        avaqVar.getClass();
        this.b = avaqVar;
        cVar.getClass();
        this.g = cVar;
        this.h = bVar;
        int i = this.b.b;
        if ((i & 4) != 0 && (i & 8) != 0 && (i & 4096) != 0 && (i & 1024) != 0) {
            arag aragVar = avaqVar.h;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            this.i = ajgl.b(aragVar).toString();
            arag aragVar2 = avaqVar.g;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            this.j = ajgl.b(aragVar2).toString();
            this.k = avaqVar.D;
            if (!avaqVar.n) {
                this.c = 1;
            } else {
                this.c = !avaqVar.l ? 2 : 3;
            }
            c(a());
            if (bVar == null || bVar2 == null) {
                return;
            }
            avao avaoVar = avaqVar.p;
            if (avaoVar == null) {
                avaoVar = avao.a;
            }
            if (avaoVar.b == 136076983) {
                avbhVar = (avbh) avaoVar.c;
            } else {
                avbhVar = avbh.a;
            }
            ylr.c();
            bVar.c = bVar2;
            bVar.d(avbhVar);
            return;
        }
        this.c = 0;
        c(a());
    }

    public final void c(int i) {
        String str;
        com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.a e = SubscribeButtonData.e();
        e.b(i);
        e.c(this.k);
        if (i == 0) {
            str = null;
        } else if (i == 1 || i == 2) {
            str = this.i;
        } else {
            String str2 = this.j;
            e.a = str2;
            e.b = str2;
            this.g.u(e.a());
        }
        e.a = str;
        e.b = str;
        this.g.u(e.a());
    }

    public final void d(avbh avbhVar) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.b bVar = this.h;
        if (bVar != null) {
            bVar.d(avbhVar);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a
    public final void g() {
        ylr.c();
        if (a() == 1 || a() == 0 || this.l) {
            return;
        }
        if (!this.e.t()) {
            aafo aafoVar = this.a;
            String builder = new Uri.Builder().scheme("https").authority("www.youtube.com").appendPath("channel").appendPath(this.b.f).toString();
            aopc aopcVar = (aopc) apzg.a.createBuilder();
            aopg aopgVar = AndroidIntentActionEndpointOuterClass.androidIntentActionEndpoint;
            aopa createBuilder = apff.a.createBuilder();
            createBuilder.copyOnWrite();
            apff.b((apff) createBuilder.instance);
            createBuilder.copyOnWrite();
            apff apffVar = (apff) createBuilder.instance;
            builder.getClass();
            apffVar.b |= 4;
            apffVar.e = builder;
            createBuilder.copyOnWrite();
            apff.a((apff) createBuilder.instance);
            aopcVar.e(aopgVar, (apff) createBuilder.mo39build());
            aafoVar.a((apzg) aopcVar.mo39build());
        } else if (a() == 2) {
            apzg apzgVar = apzg.a;
            SubscribeEndpointOuterClass$SubscribeEndpoint subscribeEndpointOuterClass$SubscribeEndpoint = SubscribeEndpointOuterClass$SubscribeEndpoint.a;
            for (apzg apzgVar2 : this.b.x) {
                if (apzgVar2.qn(SubscribeEndpointOuterClass$SubscribeEndpoint.subscribeEndpoint)) {
                    subscribeEndpointOuterClass$SubscribeEndpoint = (SubscribeEndpointOuterClass$SubscribeEndpoint) apzgVar2.qm(SubscribeEndpointOuterClass$SubscribeEndpoint.subscribeEndpoint);
                    apzgVar = apzgVar2;
                }
            }
            abdf a = this.f.a();
            a.j(apzgVar.c);
            for (String str : subscribeEndpointOuterClass$SubscribeEndpoint.b) {
                a.t(str);
            }
            a.b = subscribeEndpointOuterClass$SubscribeEndpoint.d;
            this.l = true;
            if (this.d.p()) {
                c(3);
            }
            this.f.e(a, new a(this, 1));
        } else if (a() == 3) {
            apzg apzgVar3 = apzg.a;
            UnsubscribeEndpointOuterClass$UnsubscribeEndpoint unsubscribeEndpointOuterClass$UnsubscribeEndpoint = UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.a;
            for (apzg apzgVar4 : this.b.x) {
                if (apzgVar4.qn(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)) {
                    unsubscribeEndpointOuterClass$UnsubscribeEndpoint = (UnsubscribeEndpointOuterClass$UnsubscribeEndpoint) apzgVar4.qm(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint);
                    apzgVar3 = apzgVar4;
                }
            }
            abdj b = this.f.b();
            b.j(apzgVar3.c);
            for (String str2 : unsubscribeEndpointOuterClass$UnsubscribeEndpoint.c) {
                b.t(str2);
            }
            b.b = unsubscribeEndpointOuterClass$UnsubscribeEndpoint.e;
            this.l = true;
            if (this.d.p()) {
                com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.b bVar = this.h;
                if (bVar != null) {
                    bVar.c();
                }
                c(2);
            }
            this.f.f(b, new a(this));
        }
    }
}
