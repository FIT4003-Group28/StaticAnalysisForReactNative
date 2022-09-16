package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.Surface;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.CommandWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.FancyDismissibleDialogRendererWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.g;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.r;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.b;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.d;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.h;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.l;
import com.google.android.apps.youtube.embeddedplayer.service.model.IpcCompatiblePlaybackState;
import com.google.android.apps.youtube.embeddedplayer.service.prewarm.model.EmbedsPrewarmData;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.i;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.al;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.k;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.service.a;
import com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.e;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.f;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.c;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import j$.util.Optional;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterOutputStream;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ApiPlayerService extends IApiPlayerService.Stub implements IBinder.DeathRecipient, oqh {
    public final opc a;
    private final Handler b;
    private final oqi c;
    private final ApiPlayerListener d;
    private final b e;
    private final d f;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.service.d g;
    private final a h;
    private final k i;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.service.a j;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.service.a k;
    private final f l;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.service.a m;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.service.b n;
    private final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.a o;
    private final c p;
    private final com.google.android.apps.youtube.embeddedplayer.service.databus.service.a q;
    private final g r;
    private final com.google.android.apps.youtube.embeddedplayer.service.csi.service.b s;
    private final com.google.android.apps.youtube.embeddedplayer.service.errorlogging.service.a t;
    private final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.d u;
    private final ApiPlayerEmbedConfigProvider v;
    private r w;
    private final com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.b x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class ApiPlayerEmbedConfigProvider implements alya {
        public r a;

        public ApiPlayerEmbedConfigProvider(r rVar) {
            this.a = rVar;
        }

        @Override // defpackage.alya
        public final String a(String str) {
            r rVar = this.a;
            if (rVar != null) {
                try {
                    return rVar.a(str);
                } catch (RemoteException unused) {
                }
            }
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class ApiPlayerListener implements opb {
        public r a;

        public ApiPlayerListener(r rVar) {
            this.a = rVar;
        }

        @Override // defpackage.opb
        public final void a() {
            r rVar = this.a;
            if (rVar != null) {
                try {
                    rVar.f();
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.opb
        public final void b(boolean z, long j) {
            r rVar = this.a;
            if (rVar != null) {
                try {
                    rVar.g(z, j);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.opb
        public final void c() {
            r rVar = this.a;
            if (rVar != null) {
                try {
                    rVar.h();
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.opb
        public final void d() {
            r rVar = this.a;
            if (rVar != null) {
                try {
                    rVar.i();
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.opb
        public final void e(boolean z) {
            r rVar = this.a;
            if (rVar != null) {
                try {
                    rVar.k(z);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.opb
        public final void f(String str, String str2, long j, long j2, boolean z, boolean z2, int i) {
            r rVar = this.a;
            if (rVar != null) {
                try {
                    rVar.l(str, str2, j, j2, z, z2, i);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.opb
        public final void g() {
            r rVar = this.a;
            if (rVar != null) {
                try {
                    rVar.m();
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.opb
        public final void h() {
            r rVar = this.a;
            if (rVar != null) {
                try {
                    rVar.n();
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.opb
        public final void i(long j) {
            r rVar = this.a;
            if (rVar != null) {
                try {
                    rVar.o(j);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.opb
        public final void j(long j, long j2) {
            r rVar = this.a;
            if (rVar != null) {
                try {
                    rVar.p(j, j2);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.opb
        public final void k() {
            r rVar = this.a;
            if (rVar != null) {
                try {
                    rVar.q();
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.opb
        public final void l() {
            r rVar = this.a;
            if (rVar != null) {
                try {
                    rVar.r();
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.opb
        public final void m() {
            r rVar = this.a;
            if (rVar != null) {
                try {
                    rVar.s();
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.opb
        public final void n(long j, long j2) {
            r rVar = this.a;
            if (rVar != null) {
                try {
                    rVar.t(j, j2);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.opb
        public final void o(long j) {
            r rVar = this.a;
            if (rVar != null) {
                try {
                    rVar.u(j);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.opb
        public final void p() {
            r rVar = this.a;
            if (rVar != null) {
                try {
                    rVar.v();
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.opb
        public final void q() {
            r rVar = this.a;
            if (rVar != null) {
                try {
                    rVar.w();
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.opb
        public final void r() {
            r rVar = this.a;
            if (rVar != null) {
                try {
                    rVar.x();
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.opb
        public final void s(String str) {
            r rVar = this.a;
            if (rVar != null) {
                try {
                    rVar.y(str);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.opb
        public final void t(Intent intent) {
            r rVar = this.a;
            if (rVar != null) {
                try {
                    rVar.z(intent);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.opb
        public final void u(int i) {
            r rVar = this.a;
            if (rVar != null) {
                try {
                    rVar.j(aqvb.m(i));
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public ApiPlayerService(Context context, Handler handler, oqi oqiVar, ooh oohVar, r rVar, final com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.c cVar, com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f fVar, l lVar, com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar2, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c cVar3, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c cVar4, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar5, com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f fVar2, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c cVar6, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c cVar7, com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c cVar8, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c cVar9, com.google.android.apps.youtube.embeddedplayer.service.databus.shared.c cVar10, com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f fVar3, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f fVar4, boolean z) {
        context.getClass();
        handler.getClass();
        this.b = handler;
        oqiVar.getClass();
        this.c = oqiVar;
        oohVar.getClass();
        this.w = rVar;
        if (!z) {
            fVar.getClass();
        } else {
            lVar.getClass();
        }
        this.g = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.service.d(handler, cVar3);
        this.h = new a(handler, cVar4);
        oon oonVar = (oon) oohVar;
        final k kVar = new k(handler, oonVar.f.o(), cVar5, oohVar.c());
        this.i = kVar;
        try {
            cVar.f(new e(handler, new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda38
                @Override // java.lang.Runnable
                public final void run() {
                    k.this.pI();
                }
            }));
        } catch (RemoteException unused) {
        }
        this.j = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.service.a(cVar6);
        this.k = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.service.a(cVar7);
        this.l = new f(cVar8);
        this.m = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.service.a(cVar9);
        this.n = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.service.b(handler, fVar4);
        if (!z) {
            this.f = null;
            fVar.getClass();
            b bVar = new b(fVar);
            if (bVar.b != null) {
                bVar.c = new h(handler, bVar);
                try {
                    bVar.b.j(bVar.c);
                } catch (RemoteException unused2) {
                }
            }
            this.e = bVar;
            this.o = new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.c(bVar, cVar2);
        } else {
            this.e = null;
            lVar.getClass();
            d dVar = new d(handler, lVar);
            this.f = dVar;
            com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.e eVar = new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.e(cVar2);
            dVar.a.a = eVar;
            this.o = eVar;
        }
        ApiPlayerListener apiPlayerListener = new ApiPlayerListener(rVar);
        this.d = apiPlayerListener;
        rvx rvxVar = new rvx();
        this.p = new c(al.a, handler, rvxVar, fVar2, null);
        com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar = new com.google.android.apps.youtube.embeddedplayer.service.databus.service.a(cVar10);
        this.q = aVar;
        this.x = com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.b.d(fVar3, oohVar.b(), oohVar.h());
        com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.d dVar2 = new com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.d();
        this.u = dVar2;
        this.r = oohVar.d();
        this.s = new com.google.android.apps.youtube.embeddedplayer.service.csi.service.b(oohVar.a());
        com.google.android.apps.youtube.embeddedplayer.service.errorlogging.service.a d = oonVar.f.d();
        this.t = d;
        d.a = oonVar.c.a;
        i iVar = new i(this.g, handler, oohVar.h());
        ApiPlayerEmbedConfigProvider apiPlayerEmbedConfigProvider = new ApiPlayerEmbedConfigProvider(rVar);
        this.v = apiPlayerEmbedConfigProvider;
        zdt zdtVar = new zdt() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda1
            @Override // defpackage.zdt
            public final void a(Object obj) {
                com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.c cVar11 = com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.c.this;
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    try {
                        cVar11.a(bool.booleanValue());
                    } catch (RemoteException unused3) {
                    }
                }
            }
        };
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.a aVar2 = this.o;
        a aVar3 = this.h;
        k kVar2 = this.i;
        this.a = opc.M(context, apiPlayerListener, oohVar, aVar2, iVar, aVar3, kVar2, kVar2, kVar2, kVar2, kVar2, kVar2, kVar2, rvxVar, dVar2, kVar2, kVar2, kVar2, this.j, this.k, this.l, this.m, aVar, zdtVar, apiPlayerEmbedConfigProvider, new com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.a() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda0
            @Override // com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.a
            public final void a(aqxq aqxqVar) {
                try {
                    com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c.this.o(new FancyDismissibleDialogRendererWrapper(aqxqVar));
                } catch (RemoteException unused3) {
                }
            }
        }, this.n);
        oqiVar.a(this);
        try {
            rVar.asBinder().linkToDeath(this, 0);
        } catch (RemoteException unused3) {
            binderDied();
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void A(final EmbedsPrewarmData embedsPrewarmData) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                EmbedsPrewarmData embedsPrewarmData2 = embedsPrewarmData;
                opc opcVar = apiPlayerService.a;
                final com.google.android.apps.youtube.embeddedplayer.service.prewarm.service.b bVar = opcVar.U;
                alya alyaVar = opcVar.b;
                aqtp h = pce.h(bVar.g);
                if (h == null || !h.g) {
                    return;
                }
                int a = embedsPrewarmData2.a();
                aijl e = com.google.android.apps.youtube.embeddedplayer.service.util.a.b(embedsPrewarmData2.b(), 0L).e();
                boolean z = a != 2;
                e.d = z;
                e.f = z;
                PlaybackStartDescriptor a2 = e.a();
                aqto i = pce.i(bVar.i);
                if (i != null && i.b) {
                    ylx.i(bVar.f.a(), new ylw() { // from class: com.google.android.apps.youtube.embeddedplayer.service.prewarm.service.a
                        @Override // defpackage.ylw, defpackage.zdt
                        public final void a(Object obj) {
                            b.this.d.b = ((com.google.android.apps.youtube.embeddedplayer.service.hostappverification.d) obj).a;
                        }
                    });
                }
                bVar.d.a = alyaVar.a(embedsPrewarmData2.b());
                bVar.c.b(a2.h(bVar.e), embedsPrewarmData2.a() == 1);
                aqtp h2 = pce.h(bVar.g);
                long millis = (h2 == null || (h2.b & 65536) == 0) ? com.google.android.apps.youtube.embeddedplayer.service.prewarm.service.b.a.toMillis() : h2.h;
                aieb aiebVar = new aieb();
                aiebVar.a = Long.valueOf(millis);
                aiebVar.b = false;
                aiju aijuVar = com.google.android.apps.youtube.embeddedplayer.service.prewarm.service.b.b;
                if (aijuVar != null) {
                    aiebVar.c = aijuVar;
                    Long l = aiebVar.a;
                    if (l == null || aiebVar.b == null || aiebVar.c == null) {
                        StringBuilder sb = new StringBuilder();
                        if (aiebVar.a == null) {
                            sb.append(" mediaDurationMs");
                        }
                        if (aiebVar.b == null) {
                            sb.append(" enableAutoMediaDuration");
                        }
                        if (aiebVar.c == null) {
                            sb.append(" prefetchPlaybackContextWrapper");
                        }
                        String valueOf = String.valueOf(sb);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                        sb2.append("Missing required properties:");
                        sb2.append(valueOf);
                        throw new IllegalStateException(sb2.toString());
                    }
                    aiec aiecVar = new aiec(l.longValue(), aiebVar.b.booleanValue(), aiebVar.c);
                    aiea aieaVar = bVar.h;
                    if (aiix.g(aieaVar.b)) {
                        aed.c(new aidz(aieaVar, a2, aiecVar, 1));
                        return;
                    } else {
                        aed.c(new aidz(aieaVar, a2, aiecVar));
                        return;
                    }
                }
                throw new NullPointerException("Null prefetchPlaybackContextWrapper");
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void B(final boolean z) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda34
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService.this.C(z);
            }
        });
    }

    public final void C(boolean z) {
        this.a.x(z);
        this.q.b();
        this.x.c();
        this.c.b(this);
        this.p.b();
        r rVar = this.w;
        if (rVar != null) {
            rVar.asBinder().unlinkToDeath(this, 0);
            this.w = null;
        }
        this.d.a = null;
        this.v.a = null;
        b bVar = this.e;
        if (bVar != null) {
            Surface surface = bVar.d;
            if (surface != null) {
                surface.release();
                bVar.d = null;
                bVar.a();
            }
            bVar.b = null;
        }
        this.i.a = null;
        this.g.a = null;
        this.h.a = null;
        this.j.a = null;
        this.k.a = null;
        this.l.a = null;
        this.m.a = null;
        this.n.a = null;
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.a aVar = this.o;
        aVar.D();
        aVar.a = null;
        System.gc();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void D(CommandWrapper commandWrapper) {
        this.a.y((apzg) commandWrapper.a);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void E(final int i) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.z(i);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void F(final int i) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.A(i);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void G(final boolean z) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda35
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.B(z);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void H(final boolean z) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda36
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.C(z);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void I(final boolean z) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda37
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.D(z);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void J() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService.this.a.E();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void K(final String str) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda23
            @Override // java.lang.Runnable
            public final void run() {
                ankt anktVar;
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                final String str2 = str;
                final opc opcVar = apiPlayerService.a;
                com.google.android.apps.youtube.embeddedplayer.service.permissions.c cVar = opcVar.aa;
                final com.google.android.apps.youtube.embeddedplayer.service.permissions.a aVar = com.google.android.apps.youtube.embeddedplayer.service.permissions.a.a;
                aqto i = pce.i(cVar.c);
                if (i == null || !i.d) {
                    anktVar = ankq.a;
                } else {
                    anktVar = anii.i(anko.q(cVar.a.a()), new anir() { // from class: com.google.android.apps.youtube.embeddedplayer.service.permissions.b
                        @Override // defpackage.anir
                        public final ankt a(Object obj) {
                            a aVar2 = a.this;
                            aotw aotwVar = ((com.google.android.apps.youtube.embeddedplayer.service.hostappverification.d) obj).b;
                            a aVar3 = a.a;
                            if (aVar2.ordinal() == 0) {
                                aotx aotxVar = aotwVar.b;
                                if (aotxVar == null || !aotxVar.b) {
                                    return anlz.p(new AccessControlException(aVar2.b));
                                }
                                return ankq.a;
                            }
                            throw new AssertionError("Incorrect permission requested");
                        }
                    }, cVar.b);
                }
                ylx.i(anktVar, new ylw() { // from class: oow
                    @Override // defpackage.ylw, defpackage.zdt
                    public final void a(Object obj) {
                        opc opcVar2 = opc.this;
                        Void r4 = (Void) obj;
                        opcVar2.a.i(str2, new afvz(1));
                    }
                });
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void L() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda10
            /* JADX WARN: Type inference failed for: r0v6, types: [wge, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                azqb azqbVar;
                oon oonVar = (oon) ApiPlayerService.this.a.a;
                if (!oonVar.e || (azqbVar = oonVar.g) == null) {
                    throw new AccessControlException("Permission denied: unauthorized usage of SignOut API");
                }
                azqbVar.get().l("Third-party signOut invocation.", true);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void M() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService.this.a.F();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void N() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService.this.a.F();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final boolean O() {
        final ConditionVariable conditionVariable = new ConditionVariable();
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                ConditionVariable conditionVariable2 = conditionVariable;
                atomicBoolean2.set(apiPlayerService.a.J());
                conditionVariable2.open();
            }
        });
        conditionVariable.block();
        return atomicBoolean.get();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final boolean P(byte[] bArr) {
        Inflater inflater = new Inflater();
        inflater.setInput(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(65536);
        InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(byteArrayOutputStream);
        try {
            inflaterOutputStream.write(bArr, 0, bArr.length);
            inflaterOutputStream.flush();
            inflaterOutputStream.close();
        } catch (IOException unused) {
            afus.b(2, 4, "IOException when decompressing.");
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        inflater.end();
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(byteArray, 0, byteArray.length);
        obtain.setDataPosition(0);
        if (obtain.readInt() != 1) {
            obtain.recycle();
            afus.b(2, 4, "Incorrect state format.");
            return false;
        }
        try {
            try {
                final PlaybackServiceState playbackServiceState = (PlaybackServiceState) obtain.readParcelable(PlaybackServiceState.class.getClassLoader());
                obtain.recycle();
                final ConditionVariable conditionVariable = new ConditionVariable();
                this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda21
                    @Override // java.lang.Runnable
                    public final void run() {
                        ApiPlayerService apiPlayerService = ApiPlayerService.this;
                        PlaybackServiceState playbackServiceState2 = playbackServiceState;
                        ConditionVariable conditionVariable2 = conditionVariable;
                        apiPlayerService.a.t(playbackServiceState2);
                        conditionVariable2.open();
                    }
                });
                conditionVariable.block();
                return true;
            } catch (BadParcelableException unused2) {
                afus.b(2, 4, "Cannot read state.");
                obtain.recycle();
                return false;
            }
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final byte[] Q() {
        final AtomicReference atomicReference = new AtomicReference();
        final ConditionVariable conditionVariable = new ConditionVariable();
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda31
            @Override // java.lang.Runnable
            public final void run() {
                PlaybackStartDescriptor playbackStartDescriptor;
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                AtomicReference atomicReference2 = atomicReference;
                ConditionVariable conditionVariable2 = conditionVariable;
                opc opcVar = apiPlayerService.a;
                PlaybackServiceState c = opcVar.c();
                int hashCode = c.hashCode();
                opcVar.h.a = c;
                Optional empty = Optional.empty();
                PlaybackStartDescriptor playbackStartDescriptor2 = opcVar.e;
                if (playbackStartDescriptor2 != null) {
                    empty = Optional.of(playbackStartDescriptor2.h(opcVar.V));
                    playbackStartDescriptor = opcVar.e.e().a();
                    ajbf n = opcVar.i.n();
                    if (n != null) {
                        playbackStartDescriptor.q(n.b());
                    }
                } else {
                    playbackStartDescriptor = null;
                }
                boolean z = true;
                if (!opcVar.I(empty) && opcVar.g != 2) {
                    z = false;
                }
                atomicReference2.set(new IpcCompatiblePlaybackState(hashCode, playbackStartDescriptor, z));
                conditionVariable2.open();
            }
        });
        conditionVariable.block();
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable((Parcelable) atomicReference.get(), 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final byte[] R() {
        final AtomicReference atomicReference = new AtomicReference();
        final ConditionVariable conditionVariable = new ConditionVariable();
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda32
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                AtomicReference atomicReference2 = atomicReference;
                ConditionVariable conditionVariable2 = conditionVariable;
                atomicReference2.set(apiPlayerService.a.c());
                conditionVariable2.open();
            }
        });
        conditionVariable.block();
        Parcel obtain = Parcel.obtain();
        obtain.writeInt(1);
        obtain.writeParcelable((Parcelable) atomicReference.get(), 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        int length = marshall.length;
        if (length > 419430) {
            StringBuilder sb = new StringBuilder(34);
            sb.append("Saved state excessive: ");
            sb.append(length);
            afus.b(1, 4, sb.toString());
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(65536);
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
        try {
            deflaterOutputStream.write(marshall);
            deflaterOutputStream.flush();
            deflaterOutputStream.close();
        } catch (IOException unused) {
            afus.b(2, 4, "Problem during compression.");
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length >= 419430) {
            afus.b(2, 4, "Compression above threshold.");
        }
        return byteArray;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d a() {
        return this.s;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.c b() {
        return this.t;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        B(true);
    }

    @Override // defpackage.oqh
    public final void c() {
        C(true);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d d() {
        return this.r;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c e() {
        return this.u;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void f() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService.this.a.d();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void g() {
        final ConditionVariable conditionVariable = new ConditionVariable();
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                ConditionVariable conditionVariable2 = conditionVariable;
                apiPlayerService.a.F();
                conditionVariable2.open();
            }
        });
        conditionVariable.block();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void h(final String str, final int i, final int i2, final int i3) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda25
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.e(str, i, i2, i3);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void i(final String str, final int i, final int i2) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.g(str, i, i2);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void j(final List list, final int i, final int i2, final int i3) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda28
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.h(list, i, i2, i3);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void k(final boolean z) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda33
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.i(z);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void l(String str) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda22
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void m() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService.this.a.q();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void n() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService.this.a.j();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void o(final String str, final int i, final int i2, final boolean z, final int i3) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.n(str, i, i2, z, i3);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void p(final String str, final boolean z, final int i, final boolean z2, final int i2) {
        this.s.g(Tick.MAIN_APP_RECEIVES_REQUEST, System.currentTimeMillis());
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.o(str, z, i, z2, i2);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void q(final List list, final int i, final int i2, final boolean z, final int i3) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.p(list, i, i2, z, i3);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void r() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService.this.a.r();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void s(final VisibilityChangeEventData visibilityChangeEventData) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.s(visibilityChangeEventData);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void t(byte[] bArr) {
        final IpcCompatiblePlaybackState ipcCompatiblePlaybackState;
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        try {
            try {
                ipcCompatiblePlaybackState = (IpcCompatiblePlaybackState) obtain.readParcelable(IpcCompatiblePlaybackState.class.getClassLoader());
            } catch (BadParcelableException unused) {
                afus.b(2, 4, "Cannot read IPC-compatible player state.");
                obtain.recycle();
                ipcCompatiblePlaybackState = null;
            }
            if (ipcCompatiblePlaybackState == null) {
                return;
            }
            final ConditionVariable conditionVariable = new ConditionVariable();
            this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda18
                @Override // java.lang.Runnable
                public final void run() {
                    ApiPlayerService apiPlayerService = ApiPlayerService.this;
                    IpcCompatiblePlaybackState ipcCompatiblePlaybackState2 = ipcCompatiblePlaybackState;
                    ConditionVariable conditionVariable2 = conditionVariable;
                    opc opcVar = apiPlayerService.a;
                    ApiPlayerStateCache apiPlayerStateCache = opcVar.h;
                    int i = ipcCompatiblePlaybackState2.b;
                    PlaybackServiceState playbackServiceState = apiPlayerStateCache.a;
                    PlaybackServiceState playbackServiceState2 = null;
                    if (playbackServiceState != null && i == playbackServiceState.hashCode()) {
                        playbackServiceState2 = apiPlayerStateCache.a;
                    }
                    if (playbackServiceState2 != null) {
                        opcVar.t(playbackServiceState2);
                    } else {
                        PlaybackStartDescriptor playbackStartDescriptor = ipcCompatiblePlaybackState2.c;
                        if (playbackStartDescriptor != null) {
                            opcVar.l(playbackStartDescriptor, ipcCompatiblePlaybackState2.a, opcVar.f);
                        }
                    }
                    conditionVariable2.open();
                }
            });
            conditionVariable.block();
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void u(final int i, final KeyEvent keyEvent) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.K(i, keyEvent);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void v(final int i, final KeyEvent keyEvent) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.L(i, keyEvent);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void w() {
        zah zahVar = this.a.K;
        if (zahVar != null) {
            zahVar.b();
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void x() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService.this.a.u();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void y() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService.this.a.v();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void z() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService.this.a.w();
            }
        });
    }
}
