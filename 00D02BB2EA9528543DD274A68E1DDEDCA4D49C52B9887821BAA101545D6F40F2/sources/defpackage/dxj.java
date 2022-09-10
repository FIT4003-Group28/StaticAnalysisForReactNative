package defpackage;

import android.view.Choreographer;
import android.view.View;
import com.google.android.apps.gmm.ar.FilamentJNI;
import com.google.android.apps.gmm.map.util.jni.NativeHelper;
import com.google.android.apps.maps.R;
import com.google.android.filament.IndirectLight;
import com.google.ar.core.Session;
import com.google.ar.core.exceptions.CameraNotAvailableException;
import com.google.ar.sceneform.ArSceneView;
import com.google.ar.sceneform.assets.Loader;
import com.google.ar.sceneform.rendering.EngineInstance;
import com.google.ar.sceneform.rendering.Material;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
/* compiled from: PG */
/* renamed from: dxj  reason: default package */
/* loaded from: classes6.dex */
public final class dxj extends dnz implements dtz {
    public static final /* synthetic */ int q = 0;
    public final dvd g;
    public final dol h;
    public final Object i;
    public final cqat j;
    public final dxi k;
    public final Set<dbsz<duh>> l;
    public final ArSceneView m;
    public boolean n;
    public final dwr o;
    @dzsi
    public final arjq p;
    private final daj r;
    private final Executor s;
    private final duz t;
    private final dfeo u;
    private final czh v;
    @dzsi
    private dws w;
    @dzsi
    private dws x;
    private final dxg y;

    static {
        NativeHelper.a();
        FilamentJNI.a();
        Loader.a = "gmm-jni";
    }

    public dxj(dwr dwrVar, dol dolVar, dve dveVar, dvt dvtVar, Executor executor, cqat cqatVar, duz duzVar, der derVar, djs djsVar, cjqy cjqyVar, dkh dkhVar, dkn dknVar, gga ggaVar, arjq arjqVar, boolean z, boolean z2, czj czjVar, boolean z3, czh czhVar) {
        super(cjqyVar, dkhVar, dknVar, dolVar, derVar, djsVar, ggaVar, z, z2, czjVar, z3, czhVar, true);
        this.i = new Object();
        this.k = new dxi(this);
        this.l = new LinkedHashSet();
        this.n = false;
        this.w = null;
        this.y = new dxg(this);
        this.p = arjqVar;
        this.j = cqatVar;
        this.t = duzVar;
        this.s = dehx.b(executor);
        this.v = czhVar;
        ArSceneView arSceneView = new ArSceneView(ggaVar);
        dbgx dbgxVar = arSceneView.c;
        if (dbgxVar.e) {
            dbgxVar.e = false;
            for (dbgy dbgyVar : dbgxVar.b.values()) {
                dbgyVar.a(dbgxVar.e);
            }
        }
        dbgx dbgxVar2 = arSceneView.c;
        if (dbgxVar2.f) {
            dbgxVar2.f = false;
            for (dbgy dbgyVar2 : dbgxVar2.b.values()) {
                dbgyVar2.b(dbgxVar2.f);
            }
        }
        dbhq dbhqVar = arSceneView.f;
        dbsk.s(dbhqVar);
        dbcs dbcsVar = arSceneView.g;
        duv a = dveVar.a.a();
        dve.a(a, 1);
        dve.a(dveVar.b.a(), 2);
        dve.a(dbhqVar, 3);
        dve.a(dbcsVar, 4);
        dve.a(this, 5);
        this.g = new dvd(a, dbhqVar, dbcsVar, this);
        dbsk.s(dwrVar);
        this.o = dwrVar;
        this.m = arSceneView;
        this.h = dolVar;
        dvv a2 = dvtVar.a.a();
        dvt.a(a2, 1);
        dwa a3 = dvtVar.b.a();
        dvt.a(a3, 2);
        dwc a4 = dvtVar.c.a();
        dvt.a(a4, 3);
        dvt.a(dvtVar.d.a(), 4);
        dvt.a(ggaVar, 5);
        dvt.a(this, 6);
        this.r = new dvs(a2, a3, a4, ggaVar, this);
        dws d = dwrVar.d(czhVar, czs.NONE);
        this.x = d;
        this.u = d.b();
    }

    @Override // defpackage.dnz
    @dzsi
    public final String A() {
        return this.o.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dnz
    public final boolean B() {
        return false;
    }

    @Override // defpackage.dtz
    public final void C(dbsz<duh> dbszVar) {
        this.l.add(dbszVar);
    }

    @Override // defpackage.dtz
    public final void D(dbsz<duh> dbszVar) {
        this.l.remove(dbszVar);
    }

    @Override // defpackage.dnz, defpackage.czz
    public final void d() {
        dws d;
        Session session;
        super.d();
        synchronized (this.i) {
            d = this.o.d(this.v, czs.CAMERA);
            this.w = d;
        }
        this.g.g = d;
        synchronized (d.a) {
            dbsk.s(d.b);
            session = d.b.f;
        }
        dbsk.s(session);
        this.m.setupSession(session);
        ArSceneView arSceneView = this.m;
        Executor executor = this.s;
        final WeakReference weakReference = new WeakReference(arSceneView);
        arSceneView.d.a(new Runnable(weakReference) { // from class: dbcb
            private final WeakReference a;

            {
                this.a = weakReference;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WeakReference weakReference2 = this.a;
                int i = ArSceneView.e;
                ArSceneView arSceneView2 = (ArSceneView) weakReference2.get();
                if (arSceneView2 != null) {
                    try {
                        Session session2 = arSceneView2.a;
                        if (session2 == null) {
                            return;
                        }
                        try {
                            if (!Loader.a()) {
                                System.loadLibrary("arsceneview_jni");
                            }
                            Session session3 = arSceneView2.a;
                            if (session3 != null) {
                                ArSceneView.nativeReportEngineType(session3, "Sceneform", "1.7");
                            }
                        } catch (Throwable unused) {
                        }
                        session2.resume();
                    } catch (CameraNotAvailableException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }, executor);
        arSceneView.d.a(new Runnable(weakReference) { // from class: dbcc
            private final WeakReference a;

            {
                this.a = weakReference;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WeakReference weakReference2 = this.a;
                int i = ArSceneView.e;
                ArSceneView arSceneView2 = (ArSceneView) weakReference2.get();
                if (arSceneView2 != null) {
                    try {
                        dbhq dbhqVar = arSceneView2.f;
                        if (dbhqVar != null) {
                            final dbij dbijVar = dbhqVar.a;
                            dbijVar.a.post(new Runnable(dbijVar) { // from class: dbii
                                private final dbij a;

                                {
                                    this.a = dbijVar;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    dbij dbijVar2 = this.a;
                                    if (dbijVar2.d.getParent() != null || !dbijVar2.a.isAttachedToWindow()) {
                                        return;
                                    }
                                    dbijVar2.b.addView(dbijVar2.d, dbijVar2.c);
                                }
                            });
                        }
                        Choreographer.getInstance().removeFrameCallback(arSceneView2);
                        Choreographer.getInstance().postFrameCallback(arSceneView2);
                    } catch (CameraNotAvailableException e) {
                        throw new IllegalStateException(e);
                    }
                }
            }
        }, dbie.a()).exceptionally(dxd.a);
        d.b().a();
        dbcs dbcsVar = this.m.g;
        dxg dxgVar = this.y;
        dbjb.d(dxgVar, "Parameter 'onUpdateListener' was null.");
        if (!dbcsVar.f.contains(dxgVar)) {
            dbcsVar.f.add(dxgVar);
        }
        this.t.a(R.raw.camera_texture).thenAccept(new Consumer(this) { // from class: dxe
            private final dxj a;

            {
                this.a = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.a.m.setCameraMaterial((Material) obj);
            }
        });
    }

    @Override // defpackage.dnz, defpackage.czz
    public final void e() {
        dws dwsVar;
        super.e();
        synchronized (this.i) {
            dwsVar = this.w;
            dbsk.s(dwsVar);
            this.w = null;
            this.n = false;
        }
        dwsVar.b().b();
        dwsVar.c();
        this.g.g = null;
        dbcs dbcsVar = this.m.g;
        dxg dxgVar = this.y;
        dbjb.d(dxgVar, "Parameter 'onUpdateListener' was null.");
        dbcsVar.f.remove(dxgVar);
        ArSceneView arSceneView = this.m;
        Executor executor = this.s;
        final WeakReference weakReference = new WeakReference(arSceneView);
        arSceneView.d.a(new Runnable(weakReference) { // from class: dbcd
            private final WeakReference a;

            {
                this.a = weakReference;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WeakReference weakReference2 = this.a;
                int i = ArSceneView.e;
                ArSceneView arSceneView2 = (ArSceneView) weakReference2.get();
                if (arSceneView2 == null) {
                    return;
                }
                Choreographer.getInstance().removeFrameCallback(arSceneView2);
                dbhq dbhqVar = arSceneView2.f;
                if (dbhqVar == null) {
                    return;
                }
                dbij dbijVar = dbhqVar.a;
                if (dbijVar.d.getParent() == null) {
                    return;
                }
                dbijVar.b.removeView(dbijVar.d);
            }
        }, dbie.a());
        arSceneView.d.a(new Runnable(weakReference) { // from class: dbce
            private final WeakReference a;

            {
                this.a = weakReference;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Session session;
                WeakReference weakReference2 = this.a;
                int i = ArSceneView.e;
                ArSceneView arSceneView2 = (ArSceneView) weakReference2.get();
                if (arSceneView2 == null || (session = arSceneView2.a) == null) {
                    return;
                }
                session.pause();
            }
        }, executor).thenAcceptAsync(dbcf.a, dbie.a()).exceptionally(dxf.a);
    }

    @Override // defpackage.dnz, defpackage.czz
    public final void f() {
        synchronized (this.i) {
            dbsk.l(!this.e);
            this.g.c();
            this.l.clear();
        }
    }

    @Override // defpackage.dnz, defpackage.czz
    public final void g() {
        super.g();
        synchronized (this.i) {
            this.g.c();
            this.l.clear();
            dws dwsVar = this.x;
            dbsk.s(dwsVar);
            dwsVar.c();
            this.x = null;
        }
        ArSceneView arSceneView = this.m;
        dbhq dbhqVar = arSceneView.f;
        if (dbhqVar != null) {
            dbhqVar.o.detach();
            ArrayList<dbex> arrayList = dbhqVar.d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.get(i).f();
            }
            dbfh dbfhVar = dbhqVar.m;
            if (dbfhVar != null) {
                dbfhVar.a();
                dbhqVar.m = null;
            }
            dbet a = EngineInstance.a();
            IndirectLight indirectLight = dbhqVar.l;
            if (indirectLight != null) {
                a.i(indirectLight);
            }
            a.a.destroyRenderer(dbhqVar.i);
            a.d(dbhqVar.h);
            a.d(dbhqVar.g);
            dbhq.i();
            arSceneView.f = null;
        }
        dbhq.h();
    }

    @Override // defpackage.czz
    public final daj m() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dnz
    public final View y() {
        return this.m;
    }

    @Override // defpackage.dnz
    protected final dfeo z() {
        return this.u;
    }
}
