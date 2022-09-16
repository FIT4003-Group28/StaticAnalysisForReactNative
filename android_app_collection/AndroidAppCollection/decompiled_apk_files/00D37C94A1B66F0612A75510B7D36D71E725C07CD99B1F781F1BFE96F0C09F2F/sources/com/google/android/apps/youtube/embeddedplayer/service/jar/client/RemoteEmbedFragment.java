package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.SetOperationType;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import com.google.android.apps.youtube.embeddedplayer.service.prewarm.model.EmbedsPrewarmData;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService;
import com.google.android.youtube.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class RemoteEmbedFragment extends alyd {
    private final Context a;
    private final IApiPlayerFactoryService b;
    private final IEmbedFragmentServiceFactoryService c;
    private ViewGroup d;
    private ayos e;
    private Future f;

    public RemoteEmbedFragment(Context context, IApiPlayerFactoryService iApiPlayerFactoryService, IEmbedFragmentServiceFactoryService iEmbedFragmentServiceFactoryService) {
        this.a = context;
        this.b = iApiPlayerFactoryService;
        this.c = iEmbedFragmentServiceFactoryService;
    }

    private final void E(final Context context, com.google.android.apps.youtube.embeddedplayer.service.jar.a aVar) {
        this.d = new FrameLayout(context);
        final Context context2 = this.a;
        ayos l = ayos.A(new Callable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ac
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context3 = context2;
                Context context4 = context;
                Resources.Theme theme = context3.getTheme();
                theme.applyStyle(R.style.YouTubeEmbedServiceTheme, false);
                return com.google.android.apps.youtube.embeddedplayer.service.context.b.a(context4, context3.getResources(), context3.getClassLoader(), theme);
            }
        }).K(azpj.a()).l();
        ayos G = ax.c(l, com.google.android.apps.youtube.embeddedplayer.service.jar.m.h(l, aVar, this.b), aVar, this.d, this.c).G(aypa.a());
        this.e = G;
        G.T(ab.i, ab.k);
        this.f = this.e.V();
    }

    private static void F(SetOperationType setOperationType) {
        com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d dVar = com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.b;
        try {
            dVar.j(setOperationType, System.currentTimeMillis());
            dVar.g(Tick.REMOTE_RECEIVES_REQUEST, System.currentTimeMillis());
        } catch (RemoteException unused) {
            aqvb.l("Csi Controller Service disconnected", new Object[0]);
        }
    }

    @Override // defpackage.alye
    public final void A() {
        this.e.T(ab.j, ab.k);
    }

    @Override // defpackage.alye
    public final void B() {
        com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.b.c();
        this.e.T(ab.h, ab.k);
    }

    @Override // defpackage.alye
    public final void C(final alyb alybVar) {
        this.e.T(new ayqb() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ae
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                alyb alybVar2 = alyb.this;
                o oVar = ((ax) obj).n;
                if (oVar == null) {
                    try {
                        alybVar2.a(0L);
                        return;
                    } catch (RemoteException unused) {
                        aqvb.k("Problem sending getDuration result.", new Object[0]);
                        return;
                    }
                }
                oVar.c(alybVar2);
            }
        }, ab.k);
    }

    @Override // defpackage.alye
    public final void D(final String str, final alyb alybVar) {
        this.e.T(new ayqb() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.x
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                String str2 = str;
                alyb alybVar2 = alybVar;
                Optional a = com.google.android.apps.youtube.embeddedplayer.service.util.b.a(str2);
                a.ifPresent(new aq((ax) obj));
                try {
                    boolean isPresent = a.isPresent();
                    Parcel pv = alybVar2.pv();
                    dve.e(pv, isPresent);
                    alybVar2.px(1, pv);
                } catch (RemoteException unused) {
                    aqvb.k("Problem sending setUri result to client.", new Object[0]);
                }
            }
        }, ab.k);
    }

    @Override // defpackage.alye
    public final Bundle a() {
        ax axVar;
        try {
            axVar = (ax) this.f.get(1L, TimeUnit.SECONDS);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            aqvb.l(valueOf.length() != 0 ? "Cannot save state: ".concat(valueOf) : new String("Cannot save state: "), new Object[0]);
            axVar = null;
        }
        if (axVar == null) {
            return null;
        }
        return axVar.b();
    }

    @Override // defpackage.alye
    public final alyy b() {
        return alyx.a(this.d);
    }

    @Override // defpackage.alye
    @Deprecated
    public final void c() {
        this.e.T(ab.a, ab.k);
    }

    @Override // defpackage.alye
    public final void d() {
        F(SetOperationType.MUTED_AUTOPLAY);
        this.e.T(ab.c, ab.k);
    }

    @Override // defpackage.alye
    public final void e(String str) {
        this.e.T(new jhq(str, 4), ab.k);
    }

    @Override // defpackage.alye
    public final void f(IBinder iBinder) {
        alyy alywVar;
        if (iBinder == null) {
            alywVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof alyy) {
                alywVar = (alyy) queryLocalInterface;
            } else {
                alywVar = new alyw(iBinder);
            }
        }
        Activity activity = (Activity) alyx.b(alywVar);
        E(activity, new com.google.android.apps.youtube.embeddedplayer.service.jar.b(activity));
    }

    @Override // defpackage.alye
    public final void g(IBinder iBinder) {
        alyy alywVar;
        if (iBinder == null) {
            alywVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof alyy) {
                alywVar = (alyy) queryLocalInterface;
            } else {
                alywVar = new alyw(iBinder);
            }
        }
        Window window = (Window) alyx.b(alywVar);
        E(window.getContext(), new com.google.android.apps.youtube.embeddedplayer.service.jar.r(window));
    }

    @Override // defpackage.alye
    public final void h() {
        this.e.T(ab.d, ab.k);
    }

    @Override // defpackage.alye
    public final void i(final Bundle bundle) {
        this.e.T(new ayqb() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ad
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                Bundle bundle2 = bundle;
                ax axVar = (ax) obj;
                if (bundle2 == null || axVar.n()) {
                    return;
                }
                axVar.r = bundle2.getBundle("saved_coordinator_state");
                axVar.e();
                if (!bundle2.getBoolean("has_simple_start_descriptor")) {
                    return;
                }
                com.google.android.apps.youtube.embeddedplayer.service.model.k kVar = new com.google.android.apps.youtube.embeddedplayer.service.model.k();
                kVar.a = bundle2.getInt("spd_descriptor_type");
                kVar.b = bundle2.getString("spd_video_id");
                kVar.c = bundle2.getString("spd_playlist_id");
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("spd_video_ids_list");
                if (stringArrayList == null) {
                    stringArrayList = new ArrayList<>();
                }
                kVar.d = stringArrayList;
                kVar.e = 0;
                kVar.f = bundle2.getInt("spd_start_index");
                kVar.g = bundle2.getInt("spd_start_millis");
                axVar.q = kVar.a();
                try {
                    IEmbedFragmentService iEmbedFragmentService = axVar.h;
                    if (iEmbedFragmentService == null) {
                        return;
                    }
                    iEmbedFragmentService.r(axVar.q);
                } catch (RemoteException unused) {
                    aqvb.k("Problem setting playback description.", new Object[0]);
                }
            }
        }, ab.k);
    }

    @Override // defpackage.alye
    public final void j() {
        this.e.T(ab.e, ab.k);
    }

    @Override // defpackage.alye
    public final void k() {
        F(SetOperationType.AUTOPLAY);
        this.e.T(ab.f, ab.k);
    }

    @Override // defpackage.alye
    public final void l(final String str, final int i) {
        this.e.T(new ayqb() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.w
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                String str2 = str;
                int i2 = i;
                ax axVar = (ax) obj;
                com.google.android.apps.youtube.embeddedplayer.service.prewarm.model.a c = EmbedsPrewarmData.c();
                c.c(str2);
                c.b(i2);
                EmbedsPrewarmData a = c.a();
                if (!axVar.n()) {
                    bp bpVar = axVar.g.a;
                    if (!bpVar.f()) {
                        pcu.i();
                        return;
                    }
                    try {
                        bpVar.c.A(a);
                    } catch (RemoteException e) {
                        pcu.h(e);
                    }
                }
            }
        }, ab.k);
    }

    @Override // defpackage.alye
    public final void m(int i) {
        this.e.T(new v(i), ab.k);
    }

    @Override // defpackage.alye
    public final void n(int i) {
        this.e.T(new v(i, 2), ab.k);
    }

    @Override // defpackage.alye
    public final void o() {
        this.e.T(ab.g, ab.k);
    }

    @Override // defpackage.alye
    public final void p(String str) {
        this.e.T(new jhq(str, 5), ab.k);
    }

    @Override // defpackage.alye
    public final void q(boolean z) {
        this.e.T(new aa(z, 1), ab.k);
    }

    @Override // defpackage.alye
    public final void r(boolean z) {
        this.e.T(new aa(z), ab.k);
    }

    @Override // defpackage.alye
    public final void s(final alyi alyiVar) {
        this.e.T(new ayqb() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.af
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ((ax) obj).k = alyi.this;
            }
        }, ab.k);
    }

    @Override // defpackage.alye
    public final void t(int i) {
        this.e.T(new v(i, 3), ab.k);
    }

    @Override // defpackage.alye
    @Deprecated
    public final void u(String str, boolean z) {
        this.e.T(new y(str, z, 1), ab.k);
    }

    @Override // defpackage.alye
    public final void v(String str) {
        this.e.T(new jhq(str, 6), ab.k);
    }

    @Override // defpackage.alye
    public final void w(String str, boolean z) {
        this.e.T(new y(str, z), ab.k);
    }

    @Override // defpackage.alye
    public final void x(String str) {
        this.e.T(new jhq(str, 7), ab.k);
    }

    @Override // defpackage.alye
    @Deprecated
    public final void y(final List list, final boolean z) {
        this.e.T(new ayqb() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.z
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                List list2 = list;
                boolean z2 = z;
                com.google.android.apps.youtube.embeddedplayer.service.model.k kVar = new com.google.android.apps.youtube.embeddedplayer.service.model.k();
                kVar.a = 3;
                kVar.d = new ArrayList(list2);
                kVar.e = ax.a(z2);
                ((ax) obj).l(kVar.a());
            }
        }, ab.k);
    }

    @Override // defpackage.alye
    public final void z(String str) {
        this.e.T(new jhq(str, 3), ab.k);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RemoteEmbedFragment(android.os.IBinder r4, android.os.IBinder r5, android.os.IBinder r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L5
            r1 = r0
            goto L17
        L5:
            java.lang.String r1 = "com.google.android.youtube.player.internal.dynamic.IObjectWrapper"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.alyy
            if (r2 == 0) goto L12
            alyy r1 = (defpackage.alyy) r1
            goto L17
        L12:
            alyw r1 = new alyw
            r1.<init>(r4)
        L17:
            java.lang.Object r4 = defpackage.alyx.b(r1)
            android.content.Context r4 = (android.content.Context) r4
            if (r5 != 0) goto L21
            r1 = r0
            goto L33
        L21:
            java.lang.String r1 = "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService
            if (r2 == 0) goto L2e
            com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService r1 = (com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService) r1
            goto L33
        L2e:
            com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService$Stub$Proxy r1 = new com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService$Stub$Proxy
            r1.<init>(r5)
        L33:
            if (r6 != 0) goto L36
            goto L49
        L36:
            java.lang.String r5 = "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService"
            android.os.IInterface r5 = r6.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService
            if (r0 == 0) goto L44
            r0 = r5
            com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService r0 = (com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService) r0
            goto L49
        L44:
            com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService$Stub$Proxy r0 = new com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService$Stub$Proxy
            r0.<init>(r6)
        L49:
            r3.<init>(r4, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.jar.client.RemoteEmbedFragment.<init>(android.os.IBinder, android.os.IBinder, android.os.IBinder):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RemoteEmbedFragment(android.os.IBinder r5, android.os.IBinder r6, android.os.IBinder r7, android.os.IBinder r8) {
        /*
            r4 = this;
            java.lang.String r0 = "com.google.android.youtube.player.internal.dynamic.IObjectWrapper"
            r1 = 0
            if (r5 != 0) goto L7
            r2 = r1
            goto L17
        L7:
            android.os.IInterface r2 = r5.queryLocalInterface(r0)
            boolean r3 = r2 instanceof defpackage.alyy
            if (r3 == 0) goto L12
            alyy r2 = (defpackage.alyy) r2
            goto L17
        L12:
            alyw r2 = new alyw
            r2.<init>(r5)
        L17:
            java.lang.Object r5 = defpackage.alyx.b(r2)
            android.content.Context r5 = (android.content.Context) r5
            if (r7 != 0) goto L21
            r2 = r1
            goto L33
        L21:
            java.lang.String r2 = "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService"
            android.os.IInterface r2 = r7.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService
            if (r3 == 0) goto L2e
            com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService r2 = (com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService) r2
            goto L33
        L2e:
            com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService$Stub$Proxy r2 = new com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService$Stub$Proxy
            r2.<init>(r7)
        L33:
            if (r8 != 0) goto L37
            r7 = r1
            goto L49
        L37:
            java.lang.String r7 = "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService"
            android.os.IInterface r7 = r8.queryLocalInterface(r7)
            boolean r3 = r7 instanceof com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService
            if (r3 == 0) goto L44
            com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService r7 = (com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService) r7
            goto L49
        L44:
            com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService$Stub$Proxy r7 = new com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService$Stub$Proxy
            r7.<init>(r8)
        L49:
            r4.<init>(r5, r2, r7)
            if (r6 != 0) goto L4f
            goto L60
        L4f:
            android.os.IInterface r5 = r6.queryLocalInterface(r0)
            boolean r7 = r5 instanceof defpackage.alyy
            if (r7 == 0) goto L5b
            r1 = r5
            alyy r1 = (defpackage.alyy) r1
            goto L60
        L5b:
            alyw r1 = new alyw
            r1.<init>(r6)
        L60:
            java.lang.Object r5 = defpackage.alyx.b(r1)
            android.app.Activity r5 = (android.app.Activity) r5
            com.google.android.apps.youtube.embeddedplayer.service.jar.b r6 = new com.google.android.apps.youtube.embeddedplayer.service.jar.b
            r6.<init>(r5)
            r4.E(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.jar.client.RemoteEmbedFragment.<init>(android.os.IBinder, android.os.IBinder, android.os.IBinder, android.os.IBinder):void");
    }
}
