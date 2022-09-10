package defpackage;

import android.app.Application;
import com.google.geo.imagery.viewer.api.IconHandle;
import com.google.geo.imagery.viewer.api.IconRenderer;
import com.google.geo.imagery.viewer.api.IconRendererSwigJNI;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bwsm  reason: default package */
/* loaded from: classes4.dex */
public final class bwsm {
    public final Map<dpsn, bwvi> a;
    public final Application b;
    public final btvo c;
    public final Executor d;
    public final bwzj e;
    public final bwsw f;
    public final dftz g;
    public final cjqp h;
    public final bxce i;
    public final dxio<befw> j;
    @dzsi
    public bwvi k;
    @dzsi
    public dhjz l;
    @dzsi
    public bwrs<ilo> m;
    @dzsi
    public dggg n;
    public final bunk o;
    private final bwtb p;

    public bwsm(Application application, bunk bunkVar, btvo btvoVar, Executor executor, bwzj bwzjVar, dxio dxioVar, bxce bxceVar, bwta bwtaVar, dftz dftzVar, bwtb bwtbVar, cjqp cjqpVar) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        this.k = null;
        this.n = null;
        this.b = application;
        this.o = bunkVar;
        this.c = btvoVar;
        this.d = executor;
        this.e = bwzjVar;
        this.f = new bwsw(hashMap, bwtaVar);
        this.g = dftzVar;
        this.p = bwtbVar;
        this.h = cjqpVar;
        this.i = bxceVar;
        this.j = dxioVar;
    }

    public static double a(dhjz dhjzVar, dhjz dhjzVar2) {
        double e = akqo.e(akqq.j(dhjzVar), akqq.j(dhjzVar2));
        if (e < 5.0d) {
            return 64.0d;
        }
        if (e <= 30.0d) {
            return ((e - 5.0d) * (-0.64d)) + 64.0d;
        }
        return 48.0d;
    }

    public final void b() {
        e(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final bwvi c(float f, float f2, dhjx dhjxVar) {
        IconHandle iconHandle;
        dftz dftzVar = this.g;
        float e = cqrp.d(48.0d).e(this.b);
        synchronized (dftzVar.b) {
            IconRenderer iconRenderer = dftzVar.a;
            if (iconRenderer == null) {
                iconHandle = null;
            } else {
                iconHandle = new IconHandle(IconRendererSwigJNI.IconRenderer_pick(iconRenderer.a, iconRenderer, dhjxVar == null ? null : dhjxVar.bS(), f, f2, e));
            }
        }
        if (iconHandle == null) {
            return null;
        }
        for (Map.Entry<dpsn, bwvi> entry : this.a.entrySet()) {
            IconHandle iconHandle2 = entry.getValue().d;
            if (iconHandle2 != null) {
                if (IconRendererSwigJNI.IconHandle_isEqual(iconHandle.a, iconHandle, IconHandle.a(iconHandle2), iconHandle2)) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    public final void d(bwvi bwviVar, @dzsi ams amsVar) {
        cjql cjqlVar;
        e(bwviVar);
        ilo c = bwviVar.b.c();
        this.i.p(bwviVar.b);
        if (c != null && (cjqlVar = bwviVar.e) != null) {
            bwzj bwzjVar = this.e;
            deaf deafVar = deaf.TAP;
            ddho ddhoVar = bwviVar.f;
            dbsk.s(ddhoVar);
            bwzjVar.a(cjqlVar, deafVar, ddhoVar, this.n, c.ai());
        }
        if (amsVar != null) {
            int i = bwviVar.a;
            amsVar.o(i, 0);
            amsVar.A(i, 1);
        }
    }

    public final void e(@dzsi bwvi bwviVar) {
        bwvi bwviVar2 = this.k;
        if (bwviVar2 != null && bwviVar2 != bwviVar) {
            bwviVar2.b(false);
        }
        this.k = bwviVar;
        if (bwviVar == null) {
            this.p.a(null);
            this.m = null;
            return;
        }
        bwviVar.b(true);
        this.p.a(this.k);
    }
}
