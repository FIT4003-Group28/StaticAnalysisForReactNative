package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.Spanned;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.e;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.g;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PermissionsWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PlayabilityStatusWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.u;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;
import j$.util.Optional;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class EmbedFragmentService extends IEmbedFragmentService.Stub implements IBinder.DeathRecipient, oqh, b, c, a, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b, d, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a {
    public static final /* synthetic */ int s = 0;
    private final com.google.android.apps.youtube.embeddedplayer.service.hostappverification.b A;
    private final aadd B;
    private ankt C;
    private yiy D;
    private apoj E;
    private final aacz F;
    public final ooh a;
    public final oqi b;
    public final ajmy c;
    public u d;
    public final f e;
    public final com.google.android.apps.youtube.embeddedplayer.service.csi.service.a f;
    com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.service.b g;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.b h;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.service.b i;
    public a j;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.b k;
    public d l;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.b m;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a n;
    public final int o;
    e p;
    public aafo q;
    public volatile boolean r;
    private final Executor t;
    private final g u;
    private final com.google.android.apps.youtube.embeddedplayer.service.innertube.f w;
    private final Handler x;
    private final com.google.android.apps.youtube.embeddedplayer.service.errorlogging.service.a y;
    private final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.g z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class ThumbnailCallback implements yiw {
        public ThumbnailCallback() {
        }

        @Override // defpackage.yiw
        public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
            Uri uri = (Uri) obj;
            EmbedFragmentService.this.z(null);
        }

        @Override // defpackage.yiw
        public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
            Uri uri = (Uri) obj;
            EmbedFragmentService.this.z((Bitmap) obj2);
        }
    }

    public EmbedFragmentService(Handler handler, u uVar, ooh oohVar, oqi oqiVar, int i) {
        this.a = oohVar;
        handler.getClass();
        this.x = handler;
        this.d = uVar;
        this.b = oqiVar;
        f c = oohVar.c();
        this.e = c;
        this.f = oohVar.a();
        oon oonVar = (oon) oohVar;
        this.A = oonVar.f.e();
        this.t = oonVar.f.H();
        this.F = oonVar.f.K();
        this.B = oonVar.f.w();
        int a = c.a(i);
        this.o = a;
        com.google.android.apps.youtube.embeddedplayer.service.errorlogging.service.a d = oonVar.f.d();
        this.y = d;
        this.z = oohVar.d();
        d.a = oonVar.c.a;
        c.n(a);
        this.c = oohVar.h();
        this.w = oonVar.f.g();
        this.u = oonVar.f.h();
    }

    public final void A(CharSequence charSequence) {
        u uVar = this.d;
        if (uVar != null) {
            try {
                uVar.r(charSequence);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void B(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.b bVar) {
        this.h = bVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void C(VideoDetails videoDetails) {
        u uVar;
        if (this.r && (uVar = this.d) != null) {
            try {
                uVar.s(videoDetails);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b
    public final void D(com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a aVar) {
        this.n = aVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b
    public final void E(WatchLaterButtonData watchLaterButtonData) {
        u uVar;
        if (this.r && (uVar = this.d) != null) {
            try {
                uVar.t(watchLaterButtonData);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
    public final int a() {
        return this.o;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
    public final com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.c b() {
        return this.y;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        i();
    }

    @Override // defpackage.oqh
    public final void c() {
        k();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
    public final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d d() {
        return this.z;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
    public final void f() {
        this.h.i();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a
    public final void g() {
        this.x.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedFragmentService$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                EmbedFragmentService.this.j.g();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d
    public final void h(final SubscriptionNotificationMenuItem subscriptionNotificationMenuItem) {
        this.x.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedFragmentService$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                EmbedFragmentService embedFragmentService = EmbedFragmentService.this;
                embedFragmentService.l.h(subscriptionNotificationMenuItem);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
    public final void i() {
        this.x.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedFragmentService$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                EmbedFragmentService.this.k();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a
    public final void j() {
        this.x.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedFragmentService$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                EmbedFragmentService.this.n.j();
            }
        });
    }

    public final void k() {
        ankt anktVar = this.C;
        if (anktVar != null) {
            anktVar.cancel(true);
            this.C = null;
        }
        this.b.b(this);
        u uVar = this.d;
        if (uVar != null) {
            uVar.asBinder().unlinkToDeath(this, 0);
            this.d = null;
        }
        this.e.t(this.o);
        System.gc();
    }

    public final void l() {
        ankt anktVar = this.C;
        if (anktVar != null) {
            anktVar.cancel(true);
            this.C = null;
        }
        s(null);
        z(null);
        A(null);
        y(null);
        q(null);
        if (this.r) {
            n(null);
            C(VideoDetails.a);
            u(SubscribeButtonData.a);
            w(SubscriptionNotificationButtonData.a);
            pF(SubscriptionNotificationMenuData.a);
            E(WatchLaterButtonData.a);
        }
    }

    public final void m(SimplePlaybackDescriptor simplePlaybackDescriptor, Optional optional) {
        aopa createBuilder;
        boolean z = false;
        try {
            simplePlaybackDescriptor.getClass();
            int i = simplePlaybackDescriptor.a;
            if (i == 0) {
                createBuilder = arra.a.createBuilder();
            } else if (i == 1) {
                String str = simplePlaybackDescriptor.b;
                aqvb.i(str);
                u uVar = this.d;
                String str2 = "";
                if (uVar != null) {
                    try {
                        String a = uVar.a(str);
                        if (a != null) {
                            str2 = a;
                        }
                    } catch (RemoteException unused) {
                    }
                }
                createBuilder = arra.a.createBuilder();
                aopa createBuilder2 = arrd.a.createBuilder();
                createBuilder2.copyOnWrite();
                arrd arrdVar = (arrd) createBuilder2.instance;
                str.getClass();
                arrdVar.b |= 1;
                arrdVar.c = str;
                createBuilder2.copyOnWrite();
                arrd arrdVar2 = (arrd) createBuilder2.instance;
                arrdVar2.b |= 2;
                arrdVar2.d = str2;
                createBuilder.copyOnWrite();
                arra arraVar = (arra) createBuilder.instance;
                arrd arrdVar3 = (arrd) createBuilder2.mo39build();
                arrdVar3.getClass();
                arraVar.d = arrdVar3;
                arraVar.c = 2;
            } else if (i == 2) {
                aopa createBuilder3 = arra.a.createBuilder();
                aopa createBuilder4 = arrc.a.createBuilder();
                String str3 = simplePlaybackDescriptor.c;
                aqvb.i(str3);
                createBuilder4.copyOnWrite();
                arrc arrcVar = (arrc) createBuilder4.instance;
                str3.getClass();
                arrcVar.b |= 1;
                arrcVar.c = str3;
                createBuilder4.copyOnWrite();
                arrc arrcVar2 = (arrc) createBuilder4.instance;
                arrcVar2.b = 2 | arrcVar2.b;
                arrcVar2.d = simplePlaybackDescriptor.f;
                createBuilder3.copyOnWrite();
                arra arraVar2 = (arra) createBuilder3.instance;
                arrc arrcVar3 = (arrc) createBuilder4.mo39build();
                arrcVar3.getClass();
                arraVar2.d = arrcVar3;
                arraVar2.c = 3;
                createBuilder = createBuilder3;
            } else if (i == 3) {
                int i2 = simplePlaybackDescriptor.f;
                String str4 = (String) simplePlaybackDescriptor.d.get((i2 < 0 || i2 >= simplePlaybackDescriptor.d.size()) ? 0 : simplePlaybackDescriptor.f);
                str4.getClass();
                createBuilder = arra.a.createBuilder();
                aopa createBuilder5 = arrd.a.createBuilder();
                createBuilder5.copyOnWrite();
                arrd arrdVar4 = (arrd) createBuilder5.instance;
                arrdVar4.b |= 1;
                arrdVar4.c = str4;
                createBuilder.copyOnWrite();
                arra arraVar3 = (arra) createBuilder.instance;
                arrd arrdVar5 = (arrd) createBuilder5.mo39build();
                arrdVar5.getClass();
                arraVar3.d = arrdVar5;
                arraVar3.c = 2;
            } else {
                throw new IllegalArgumentException("Unrecognized playback descriptor type");
            }
            if (optional.isPresent()) {
                createBuilder.copyOnWrite();
                arra arraVar4 = (arra) createBuilder.instance;
                arraVar4.b |= 16;
                arraVar4.f = (String) optional.get();
            }
            com.google.android.apps.youtube.embeddedplayer.service.innertube.f fVar = this.w;
            aaqf aaqfVar = (aaqf) fVar.a.get();
            aaqfVar.getClass();
            afvn afvnVar = (afvn) fVar.b.get();
            afvnVar.getClass();
            createBuilder.getClass();
            e eVar = new e(aaqfVar, afvnVar, createBuilder);
            if (!akzj.f(this.p, eVar)) {
                aqtp h = pce.h(this.B);
                this.r = h != null && h.l;
                p(this.r);
                l();
                this.f.f(Tick.MAIN_APP_SENDS_EMBEDDED_PLAYER_REQUEST);
                ankt b = this.u.a.b(eVar, this.t);
                this.C = b;
                ylx.k(b, anjk.a, new ylv() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedFragmentService$$ExternalSyntheticLambda0
                    @Override // defpackage.zdt
                    /* renamed from: b */
                    public final void a(Throwable th) {
                        EmbedFragmentService embedFragmentService = EmbedFragmentService.this;
                        aopa createBuilder6 = asaa.a.createBuilder();
                        createBuilder6.copyOnWrite();
                        asaa asaaVar = (asaa) createBuilder6.instance;
                        asaaVar.c = 0;
                        asaaVar.b |= 1;
                        embedFragmentService.o((asaa) createBuilder6.mo39build());
                        embedFragmentService.l();
                    }
                }, new ylw() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedFragmentService$$ExternalSyntheticLambda2
                    @Override // defpackage.ylw, defpackage.zdt
                    public final void a(Object obj) {
                        asaa asaaVar;
                        aqtn aqtnVar;
                        arag aragVar;
                        arag aragVar2;
                        avhn avhnVar;
                        EmbedFragmentService embedFragmentService = EmbedFragmentService.this;
                        arrb arrbVar = (arrb) obj;
                        embedFragmentService.f.f(Tick.MAIN_APP_RECEIVES_EMBEDDED_PLAYER_REQUEST);
                        if (arrbVar == null) {
                            return;
                        }
                        u uVar2 = embedFragmentService.d;
                        if (uVar2 != null) {
                            try {
                                aqtv aqtvVar = arrbVar.g;
                                if (aqtvVar == null) {
                                    aqtvVar = aqtv.a;
                                }
                                uVar2.f(new PermissionsWrapper(aqtvVar));
                            } catch (RemoteException unused2) {
                                embedFragmentService.i();
                            }
                        }
                        if ((arrbVar.b & 32) != 0) {
                            asaaVar = arrbVar.f;
                            if (asaaVar == null) {
                                asaaVar = asaa.a;
                            }
                        } else {
                            aopa createBuilder6 = asaa.a.createBuilder();
                            createBuilder6.copyOnWrite();
                            asaa asaaVar2 = (asaa) createBuilder6.instance;
                            asaaVar2.c = 0;
                            asaaVar2.b |= 1;
                            asaaVar = (asaa) createBuilder6.mo39build();
                        }
                        embedFragmentService.o(asaaVar);
                        aqtm aqtmVar = arrbVar.d;
                        if (aqtmVar == null) {
                            aqtmVar = aqtm.a;
                        }
                        if (aqtmVar.b != 131195200) {
                            return;
                        }
                        aqtm aqtmVar2 = arrbVar.d;
                        if (aqtmVar2 == null) {
                            aqtmVar2 = aqtm.a;
                        }
                        if (aqtmVar2.b == 131195200) {
                            aqtnVar = (aqtn) aqtmVar2.c;
                        } else {
                            aqtnVar = aqtn.a;
                        }
                        aunb aunbVar = null;
                        if ((aqtnVar.b & 1) != 0) {
                            aragVar = aqtnVar.e;
                            if (aragVar == null) {
                                aragVar = arag.a;
                            }
                        } else {
                            aragVar = null;
                        }
                        Spanned b2 = ajgl.b(aragVar);
                        if ((aqtnVar.b & 2) != 0) {
                            aragVar2 = aqtnVar.f;
                            if (aragVar2 == null) {
                                aragVar2 = arag.a;
                            }
                        } else {
                            aragVar2 = null;
                        }
                        Spanned b3 = ajgl.b(aragVar2);
                        embedFragmentService.A(b2);
                        embedFragmentService.y(b3);
                        int intValue = aqtnVar.c == 6 ? ((Integer) aqtnVar.d).intValue() : 0;
                        u uVar3 = embedFragmentService.d;
                        if (uVar3 != null) {
                            try {
                                uVar3.p(intValue);
                            } catch (RemoteException unused3) {
                            }
                        }
                        if ((aqtnVar.b & 4) != 0) {
                            avhnVar = aqtnVar.g;
                            if (avhnVar == null) {
                                avhnVar = avhn.a;
                            }
                        } else {
                            avhnVar = null;
                        }
                        embedFragmentService.s(avhnVar);
                        if ((aqtnVar.b & 128) != 0 && (aunbVar = aqtnVar.i) == null) {
                            aunbVar = aunb.a;
                        }
                        embedFragmentService.q(aunbVar);
                        if (embedFragmentService.r) {
                            aunb aunbVar2 = aqtnVar.h;
                            if (aunbVar2 == null) {
                                aunbVar2 = aunb.a;
                            }
                            aqts aqtsVar = (aqts) aunbVar2.qm(aqtt.a);
                            embedFragmentService.g.a(aqtsVar, embedFragmentService);
                            aunb aunbVar3 = aqtsVar.e;
                            if (aunbVar3 == null) {
                                aunbVar3 = aunb.a;
                            }
                            aunb aunbVar4 = ((aqtr) aunbVar3.qm(aqtt.c)).c;
                            if (aunbVar4 == null) {
                                aunbVar4 = aunb.a;
                            }
                            embedFragmentService.i.b((avaq) aunbVar4.qm(SubscribeButtonRendererOuterClass.subscribeButtonRenderer), embedFragmentService, embedFragmentService.k, embedFragmentService);
                            com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.b bVar = embedFragmentService.m;
                            aunb aunbVar5 = aqtnVar.j;
                            if (aunbVar5 == null) {
                                aunbVar5 = aunb.a;
                            }
                            bVar.b((apoj) aunbVar5.qm(ButtonRendererOuterClass.buttonRenderer), embedFragmentService);
                        } else {
                            aqvb.k("MDSA flag not set!", new Object[0]);
                        }
                        embedFragmentService.e.d(embedFragmentService.o, arrbVar);
                    }
                });
            }
            this.p = eVar;
            if (simplePlaybackDescriptor.e != 0) {
                z = true;
            }
            this.e.m(this.o, com.google.android.apps.youtube.embeddedplayer.service.util.a.i(simplePlaybackDescriptor), z);
        } catch (RuntimeException unused2) {
            aqvb.k("Malformed description, cannot load preview.", new Object[0]);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void n(Bitmap bitmap) {
        u uVar;
        if (this.r && (uVar = this.d) != null) {
            try {
                uVar.h(bitmap);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void o(asaa asaaVar) {
        u uVar = this.d;
        if (uVar == null) {
            return;
        }
        try {
            uVar.j(new PlayabilityStatusWrapper(asaaVar));
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void p(boolean z) {
        u uVar = this.d;
        if (uVar != null) {
            try {
                uVar.i(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void pF(SubscriptionNotificationMenuData subscriptionNotificationMenuData) {
        u uVar;
        if (this.r && (uVar = this.d) != null) {
            try {
                uVar.n(subscriptionNotificationMenuData);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void q(aunb aunbVar) {
        u uVar;
        if (this.d == null) {
            return;
        }
        if (aunbVar != null) {
            apoj apojVar = (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer);
            if (apojVar != null && (uVar = this.d) != null) {
                try {
                    if (uVar.u()) {
                        this.e.s(this.o, apojVar.t.I());
                    }
                } catch (RemoteException unused) {
                }
            }
            this.E = apojVar;
        } else {
            this.E = null;
        }
        try {
            u uVar2 = this.d;
            if (uVar2 == null) {
                return;
            }
            uVar2.k(this.E != null);
        } catch (RemoteException unused2) {
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
    public final void r(final SimplePlaybackDescriptor simplePlaybackDescriptor) {
        aqto i = pce.i(this.F);
        if (i == null || !i.b) {
            m(simplePlaybackDescriptor, Optional.empty());
        } else {
            ylx.k(this.A.a(), this.t, EmbedFragmentService$$ExternalSyntheticLambda1.a, new ylw() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedFragmentService$$ExternalSyntheticLambda3
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    EmbedFragmentService.this.m(simplePlaybackDescriptor, Optional.of(((com.google.android.apps.youtube.embeddedplayer.service.hostappverification.d) obj).a));
                }
            });
        }
    }

    public final void s(avhn avhnVar) {
        yiy yiyVar = this.D;
        Uri uri = null;
        if (yiyVar != null) {
            yiyVar.d();
            this.D = null;
        }
        if (avhnVar != null) {
            uri = akel.q(avhnVar);
        }
        if (uri == null) {
            return;
        }
        yiy c = yiy.c(new ThumbnailCallback());
        this.D = c;
        this.c.l(uri, c);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c
    public final void t(a aVar) {
        this.j = aVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c
    public final void u(SubscribeButtonData subscribeButtonData) {
        u uVar;
        if (this.r && (uVar = this.d) != null) {
            try {
                uVar.l(subscribeButtonData);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void v(d dVar) {
        this.l = dVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void w(SubscriptionNotificationButtonData subscriptionNotificationButtonData) {
        u uVar;
        if (this.r && (uVar = this.d) != null) {
            try {
                uVar.m(subscriptionNotificationButtonData);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void y(CharSequence charSequence) {
        u uVar = this.d;
        if (uVar != null) {
            try {
                uVar.o(charSequence);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void z(Bitmap bitmap) {
        u uVar = this.d;
        if (uVar != null) {
            try {
                uVar.q(bitmap);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
    public final void e(int i) {
        if (i == 28664) {
            apoj apojVar = this.E;
            if (apojVar != null && (apojVar.b & 32768) != 0) {
                this.e.l(this.o, apojVar.t.I());
                return;
            }
            i = 28664;
        }
        this.e.k(this.o, acuo.b(i));
    }
}
