package com.google.android.apps.youtube.embeddedplayer.service.jar;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.CommandWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.ax;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.bm;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.bp;
import com.google.android.apps.youtube.embeddedplayer.service.model.PlayerViewModeData;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.DisconnectedApiPlayerService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.al;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class m implements aafo {
    public static final /* synthetic */ int i = 0;
    private static WeakReference k;
    private static WeakReference l;
    public final bp a;
    public ax b;
    public ax c;
    public ax d;
    public final e e;
    final l f;
    public final azpm g;
    final k h;
    private final HashSet m;
    private boolean n;
    private final k o;
    private final o p;
    private final j q;

    public m(Context context, a aVar, e eVar, o oVar) {
        azpm aI = azpm.aI(com.google.android.apps.youtube.embeddedplayer.service.model.d.a);
        this.g = aI;
        this.e = eVar;
        this.p = oVar;
        k kVar = new k(this, 1);
        this.h = kVar;
        k kVar2 = new k(this);
        this.o = kVar2;
        l lVar = new l(this);
        this.f = lVar;
        j jVar = new j(this);
        this.q = jVar;
        this.m = new HashSet();
        this.a = new bp(context, aVar, lVar, kVar2, eVar, oVar, kVar, aI, jVar, null);
    }

    private final void A() {
        View view;
        ViewGroup viewGroup;
        if (this.b == null) {
            return;
        }
        this.p.a(null);
        this.g.c(com.google.android.apps.youtube.embeddedplayer.service.model.d.a);
        bp bpVar = this.a;
        if (!bpVar.f()) {
            pcu.i();
        } else {
            try {
                bpVar.l = false;
                bpVar.c.g();
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
        ax axVar = this.b;
        if (axVar == null) {
            return;
        }
        com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.c cVar = axVar.c;
        Optional a = cVar.h.a();
        if (a.isPresent() && (view = cVar.d) != null && (viewGroup = cVar.c) != null) {
            viewGroup.removeView(view);
            cVar.c.addView((View) a.get());
            cVar.d = null;
        }
        this.b = null;
    }

    private final boolean C(ax axVar) {
        return this.c != null && this.d == axVar;
    }

    private final boolean D(ax axVar) {
        if (!this.n) {
            return false;
        }
        if (axVar != this.b) {
            return C(axVar);
        }
        return true;
    }

    public static synchronized m g(Context context, a aVar) {
        m mVar;
        synchronized (m.class) {
            z(Tick.REMOTE_EMBED_COORDINATOR_INIT_START);
            mVar = new m(context, aVar, new e(new ConcurrentHashMap()), new o());
            z(Tick.REMOTE_EMBED_COORDINATOR_INIT_END);
            l = new WeakReference(mVar);
        }
        return mVar;
    }

    public static synchronized ayos h(ayos ayosVar, a aVar, IApiPlayerFactoryService iApiPlayerFactoryService) {
        synchronized (m.class) {
            WeakReference weakReference = l;
            ayos ayosVar2 = null;
            m mVar = weakReference == null ? null : (m) weakReference.get();
            if (mVar != null) {
                return ayos.D(mVar);
            }
            WeakReference weakReference2 = k;
            if (weakReference2 != null) {
                ayosVar2 = (ayos) weakReference2.get();
            }
            if (ayosVar2 != null) {
                return ayosVar2;
            }
            ayos y = y(ayosVar, aVar, iApiPlayerFactoryService);
            k = new WeakReference(y);
            return y;
        }
    }

    private static synchronized ayos y(ayos ayosVar, final a aVar, final IApiPlayerFactoryService iApiPlayerFactoryService) {
        ayos l2;
        synchronized (m.class) {
            try {
                com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.b.h(System.currentTimeMillis());
            } catch (RemoteException unused) {
                aqvb.l("Csi controller service is disconnected", new Object[0]);
            }
            ayqe ayqeVar = new ayqe() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.g
                @Override // defpackage.ayqe
                public final Object a(Object obj) {
                    return m.g((Context) obj, a.this);
                }
            };
            l2 = ayosVar.G(aypa.a()).E(ayqeVar).G(azpj.a()).E(new ayqe() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.h
                @Override // defpackage.ayqe
                public final Object a(Object obj) {
                    IApiPlayerFactoryService iApiPlayerFactoryService2 = IApiPlayerFactoryService.this;
                    m mVar = (m) obj;
                    int i2 = m.i;
                    try {
                        final bp bpVar = mVar.a;
                        bpVar.c(Tick.REMOTE_EMBEDDED_PLAYER_V2_SERVICE_INIT_START);
                        bpVar.c = iApiPlayerFactoryService2.a(new bm(bpVar), bpVar.H, bpVar.I, null, bpVar.f155J, bpVar.K, bpVar.L, bpVar.M, bpVar.N, bpVar.O, bpVar.P, bpVar.Q, bpVar.R, bpVar.S, bpVar.T, bpVar.U, false);
                        bpVar.e = bpVar.c.d();
                        bpVar.i = new com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.c(bpVar.e);
                        bpVar.d = bpVar.c.e();
                        bpVar.f = bpVar.c.a();
                        com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.a(bpVar.f);
                        com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.b.a().b(bpVar.c.b());
                        bpVar.m.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.az
                            @Override // java.lang.Runnable
                            public final void run() {
                                bp bpVar2 = bp.this;
                                bpVar2.y.g(bpVar2.U, bpVar2.d, bpVar2.e);
                                bpVar2.w.i = new WeakReference(bpVar2.d);
                                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.al alVar = bpVar2.p;
                                com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d dVar = bpVar2.e;
                                alVar.C = dVar;
                                alVar.E.h = dVar;
                                com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b bVar = bpVar2.i;
                                alVar.D = bVar;
                                if (alVar.nI()) {
                                    alVar.s.i = bVar;
                                }
                            }
                        });
                        final IApiPlayerService iApiPlayerService = bpVar.c;
                        bpVar.b = new aafo() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.bb
                            @Override // defpackage.aafo
                            public final /* synthetic */ void a(apzg apzgVar) {
                                aafn.a(this, apzgVar);
                            }

                            @Override // defpackage.aafo
                            public final /* synthetic */ void b(List list) {
                                aafn.b(this, list);
                            }

                            @Override // defpackage.aafo
                            public final void c(apzg apzgVar, Map map) {
                                IApiPlayerService iApiPlayerService2 = IApiPlayerService.this;
                                int i3 = bp.W;
                                try {
                                    iApiPlayerService2.D(new CommandWrapper(apzgVar));
                                } catch (RemoteException e) {
                                    pcu.h(e);
                                }
                            }

                            @Override // defpackage.aafo
                            public final /* synthetic */ void d(List list, Map map) {
                                aafn.c(this, list, map);
                            }

                            @Override // defpackage.aafo
                            public final /* synthetic */ void e(List list, Object obj2) {
                                aafn.d(this, list, obj2);
                            }
                        };
                        bpVar.D.sh(bpVar.b);
                        bpVar.c(Tick.REMOTE_EMBEDDED_PLAYER_V2_SERVICE_INIT_END);
                        bpVar.f.a();
                        return mVar;
                    } catch (RemoteException e) {
                        throw azom.b(e);
                    }
                }
            }).l();
        }
        return l2;
    }

    private static void z(Tick tick) {
        try {
            com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.b.e(tick, System.currentTimeMillis());
        } catch (RemoteException unused) {
            aqvb.l("Csi controller service is disconnected", new Object[0]);
        }
    }

    @Override // defpackage.aafo
    public final void a(apzg apzgVar) {
        aafo aafoVar = this.a.b;
        if (aafoVar != null) {
            aafn.a(aafoVar, apzgVar);
        } else {
            aqvb.l("Command routing not available", new Object[0]);
        }
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void b(List list) {
        aafn.b(this, list);
    }

    @Override // defpackage.aafo
    @Deprecated
    public final void c(apzg apzgVar, Map map) {
        if (map != null) {
            aqvb.k("Routing in the remote-loaded process does not support arguments", new Object[0]);
        }
        a(apzgVar);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void d(List list, Map map) {
        aafn.c(this, list, map);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void e(List list, Object obj) {
        aafn.d(this, list, obj);
    }

    public final synchronized Bundle f(ax axVar) {
        Bundle bundle = null;
        byte[] bArr = null;
        if (axVar != this.b) {
            return null;
        }
        bp bpVar = this.a;
        if (bpVar.f()) {
            Bundle bundle2 = new Bundle();
            com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c cVar = bpVar.A;
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("isFullscreen", cVar.g);
            bundle2.putBundle("fullscreenHelperState", bundle3);
            try {
                bArr = bpVar.c.Q();
            } catch (RemoteException e) {
                pcu.h(e);
            }
            if (bArr != null) {
                bundle2.putByteArray("apiPlayerState", bArr);
                return bundle2;
            }
            bundle = bundle2;
        }
        return bundle;
    }

    public final synchronized void i(ax axVar) {
        if (axVar == null) {
            return;
        }
        if (this.b == axVar) {
            zep.b("Deregistering currently playing fragment.");
            o(axVar);
        }
        if (this.c == axVar) {
            this.c = null;
            this.d = null;
            this.a.e(false);
        }
        if (this.d == axVar) {
            this.d = null;
        }
        this.m.remove(axVar);
        if (this.m.size() != 0) {
            return;
        }
        bp bpVar = this.a;
        if (bpVar.f()) {
            com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c cVar = bpVar.A;
            cVar.b.i();
            cVar.f = false;
            bpVar.B.f();
            ayqi.c((AtomicReference) bpVar.E);
            try {
                bpVar.c.B(true);
                com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e eVar = bpVar.I;
                if (eVar != null) {
                    eVar.b();
                }
                aypg aypgVar = bpVar.x.d;
                if (aypgVar != null) {
                    ayqi.c((AtomicReference) aypgVar);
                }
                com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.j jVar = bpVar.y;
                if (!jVar.a.e()) {
                    ayqi.c((AtomicReference) jVar.a);
                }
                bpVar.H.b();
                bpVar.K.b();
                bpVar.N.c();
                bpVar.U.c();
                bpVar.M.b();
                bpVar.O.b();
                bpVar.L.b();
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.e eVar2 = bpVar.S;
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded.d dVar = eVar2.b;
                if (dVar != null) {
                    dVar.a = null;
                    eVar2.b = null;
                }
                eVar2.a = null;
                com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.b.a().c();
                com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.b = com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.a;
            } catch (RemoteException e) {
                pcu.h(e);
            }
            bpVar.d = null;
            bpVar.i = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;
            bpVar.c = new DisconnectedApiPlayerService();
        }
        k = null;
        l = null;
    }

    public final synchronized void j(String str) {
        e eVar = this.e;
        if (str != null) {
            eVar.b.remove(str);
        }
    }

    public final synchronized void k() {
        try {
            this.a.c.w();
        } catch (RemoteException e) {
            pcu.h(e);
        }
    }

    public final synchronized void l(ax axVar) {
        this.m.add(axVar);
    }

    public final synchronized void m(ax axVar) {
        if (this.c != null) {
            zep.b("Attempting to register more than one fullscreen embed.");
            i(this.c);
        }
        this.c = axVar;
        l(axVar);
        o(this.b);
    }

    public final synchronized void n(String str, ax axVar) {
        this.e.a(str, axVar);
    }

    public final synchronized void o(ax axVar) {
        if (axVar == null) {
            return;
        }
        if (axVar == this.b) {
            A();
        } else if (C(axVar)) {
            x(axVar, false);
        } else {
            zep.b("Attempting to relinquish an ungranted playback.");
        }
    }

    public final synchronized void p(ax axVar, SimplePlaybackDescriptor simplePlaybackDescriptor, com.google.android.apps.youtube.embeddedplayer.service.model.g gVar, boolean z) {
        if (simplePlaybackDescriptor == null) {
            zep.b("No description for playback provided.");
            return;
        }
        boolean z2 = false;
        if (!B(axVar, false)) {
            return;
        }
        String str = simplePlaybackDescriptor.b;
        if (str != null) {
            bp bpVar = this.a;
            boolean z3 = simplePlaybackDescriptor.e == 2 && !z;
            int i2 = simplePlaybackDescriptor.g;
            int i3 = axVar.o;
            if (bpVar.f()) {
                try {
                    bpVar.l = false;
                    bpVar.x.l();
                    if (!z3) {
                        bpVar.x.g();
                    }
                    com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.d dVar = bpVar.w;
                    dVar.g(4);
                    dVar.e.removeMessages(1);
                    bpVar.p.ng();
                    bpVar.y.kT();
                    bpVar.V.b(new PlayerViewModeData(0));
                    com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c cVar = bpVar.A;
                    if (cVar.e != gVar) {
                        cVar.e = gVar;
                        yzt yztVar = cVar.b;
                        if (cVar.e.b && cVar.c != null && !cVar.d.hasFeature(9)) {
                            z2 = true;
                        }
                        yztVar.p(!z2);
                    }
                    bpVar.f.g(Tick.REMOTE_SENDS_MAIN_APP_REQUEST, System.currentTimeMillis());
                    bpVar.c.p(str, z3, i2, z, i3);
                    return;
                } catch (RemoteException e) {
                    pcu.h(e);
                    return;
                }
            }
            pcu.i();
            return;
        }
        String str2 = simplePlaybackDescriptor.c;
        if (str2 != null) {
            bp bpVar2 = this.a;
            int i4 = simplePlaybackDescriptor.f;
            int i5 = simplePlaybackDescriptor.g;
            int i6 = axVar.o;
            if (bpVar2.f()) {
                try {
                    bpVar2.l = false;
                    bpVar2.c.o(str2, i4, i5, z, i6);
                    return;
                } catch (RemoteException e2) {
                    pcu.h(e2);
                    return;
                }
            }
            pcu.i();
            return;
        }
        ArrayList arrayList = simplePlaybackDescriptor.d;
        if (arrayList != null) {
            bp bpVar3 = this.a;
            int i7 = simplePlaybackDescriptor.f;
            int i8 = simplePlaybackDescriptor.g;
            int i9 = axVar.o;
            if (bpVar3.f()) {
                try {
                    bpVar3.l = false;
                    bpVar3.c.q(arrayList, i7, i8, z, i9);
                    return;
                } catch (RemoteException e3) {
                    pcu.h(e3);
                    return;
                }
            }
            pcu.i();
            return;
        }
        zep.b("No playback information provided; cannot start playback.");
        return;
    }

    public final synchronized void q(ax axVar, Bundle bundle) {
        if (!B(axVar, true)) {
            return;
        }
        bp bpVar = this.a;
        if (bpVar.f()) {
            Bundle bundle2 = bundle.getBundle("fullscreenHelperState");
            if (bundle2 != null) {
                com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c cVar = bpVar.A;
                if (bundle2.getBoolean("isFullscreen")) {
                    cVar.h.a.e(true);
                }
            }
            if (!bpVar.B.l()) {
                aqvb.l("Aborting Fragment restoration because player is not visible", new Object[0]);
            } else {
                byte[] byteArray = bundle.getByteArray("apiPlayerState");
                if (byteArray != null) {
                    try {
                        bpVar.c.t(byteArray);
                    } catch (RemoteException e) {
                        pcu.h(e);
                    }
                }
            }
        }
        ax axVar2 = this.c;
        if (axVar2 != null && axVar2 == axVar) {
            bp bpVar2 = this.a;
            if (bpVar2.F) {
                bpVar2.b();
            }
        }
    }

    public final synchronized void r(String str) {
        bp bpVar = this.a;
        if (!bpVar.f()) {
            pcu.i();
            return;
        }
        try {
            bpVar.c.K(str);
        } catch (RemoteException e) {
            pcu.h(e);
        }
    }

    public final synchronized void s() {
        bp bpVar = this.a;
        if (!bpVar.f()) {
            pcu.i();
            return;
        }
        try {
            bpVar.c.L();
        } catch (RemoteException e) {
            pcu.h(e);
        }
    }

    public final synchronized boolean t(ax axVar) {
        boolean D;
        D = D(axVar);
        if (D) {
            bp bpVar = this.a;
            if (!bpVar.f()) {
                pcu.i();
            } else {
                try {
                    bpVar.c.y();
                } catch (RemoteException e) {
                    pcu.h(e);
                }
            }
        }
        return D;
    }

    public final synchronized void u(ax axVar) {
        if (axVar == this.b && !this.n) {
            this.n = true;
            bp bpVar = this.a;
            if (!bpVar.f()) {
                pcu.i();
                return;
            }
            try {
                bpVar.c.f();
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    public final synchronized void v(ax axVar, boolean z) {
        if (axVar == this.b && this.n) {
            this.n = false;
            bp bpVar = this.a;
            if (!bpVar.f()) {
                pcu.i();
                return;
            }
            try {
                bpVar.c.k(z);
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    public final synchronized void w(ax axVar) {
        if (D(axVar)) {
            this.a.d();
        }
    }

    public final synchronized void x(ax axVar, boolean z) {
        if (D(axVar)) {
            this.a.e(z);
        }
    }

    private final boolean B(ax axVar, boolean z) {
        ViewGroup viewGroup;
        ax axVar2 = this.c;
        boolean z2 = false;
        if (axVar2 == null ? !z || this.b == null : axVar2 == axVar) {
            if (!axVar.equals(this.b)) {
                A();
                FrameLayout frameLayout = this.a.n;
                com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.c cVar = axVar.c;
                View view = cVar.d;
                if (view == null || view == frameLayout) {
                    z2 = true;
                }
                aqxo.q(z2, "Another player view is already attached.");
                cVar.d = frameLayout;
                Optional a = cVar.h.a();
                if (a.isPresent() && (viewGroup = cVar.c) != null) {
                    viewGroup.removeView((View) a.get());
                    cVar.c.addView(frameLayout);
                }
                try {
                    this.a.c.m();
                } catch (RemoteException e) {
                    pcu.h(e);
                }
                this.b = axVar;
                axVar.m.D(new aypv() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.f
                    @Override // defpackage.aypv
                    public final void a() {
                        m.this.g.c(com.google.android.apps.youtube.embeddedplayer.service.model.d.a);
                    }
                }).az(this.g);
                this.p.a(this.b);
                u(axVar);
                Optional ofNullable = Optional.ofNullable((Context) axVar.e.get());
                final bp bpVar = this.a;
                bpVar.getClass();
                ofNullable.ifPresent(new Consumer() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.i
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj) {
                        bp bpVar2 = bp.this;
                        Context context = (Context) obj;
                        bpVar2.a = context;
                        al alVar = bpVar2.p;
                        alVar.H = context;
                        com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.b bVar = alVar.E;
                        bVar.g = context;
                        bVar.d.c = context;
                        bVar.c.c = context;
                        bpVar2.q.c = context;
                    }

                    @Override // j$.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return consumer.getClass();
                    }
                });
            }
            return true;
        }
        return false;
    }
}
