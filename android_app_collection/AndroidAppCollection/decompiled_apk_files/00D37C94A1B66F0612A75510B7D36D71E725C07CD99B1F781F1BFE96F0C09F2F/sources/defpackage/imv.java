package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.FlowStepRendererOuterClass;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: imv  reason: default package */
/* loaded from: classes3.dex */
public final class imv {
    public final aafo a;
    public final axnm b;
    public final ajhl c;
    public final aajl d;
    public final ayor e;
    public final imt f;
    public final ims g;
    public final Optional h;
    public final acti i;
    public final Map j;
    public final azpm k;
    public final String l;
    public final aunb m;
    public final String n;
    public Optional o;
    public aypg p;

    public imv(aafo aafoVar, axnm axnmVar, ajhl ajhlVar, aagi aagiVar, afvn afvnVar, ayor ayorVar, aqza aqzaVar, imt imtVar, ims imsVar, Optional optional, acti actiVar) {
        this.o = Optional.empty();
        this.a = aafoVar;
        this.b = axnmVar;
        this.c = ajhlVar;
        this.d = aagiVar.a(afvnVar.c());
        this.e = ayorVar;
        this.f = imtVar;
        this.g = imsVar;
        this.h = optional;
        this.i = actiVar;
        HashMap hashMap = new HashMap();
        this.j = hashMap;
        this.k = azpm.aI(new Object());
        b(hashMap, aqzaVar.e);
        this.l = aqzaVar.c;
        aunb aunbVar = aqzaVar.d;
        this.m = aunbVar == null ? aunb.a : aunbVar;
        this.n = aqzaVar.f;
        if ((aqzaVar.b & 8) != 0) {
            apzg apzgVar = aqzaVar.g;
            this.o = Optional.of(apzgVar == null ? apzg.a : apzgVar);
        }
    }

    public static void b(Map map, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aunb aunbVar = (aunb) it.next();
            if (aunbVar.qn(FlowStepRendererOuterClass.flowStepRenderer)) {
                aqzh aqzhVar = (aqzh) aunbVar.qm(FlowStepRendererOuterClass.flowStepRenderer);
                map.put(aqzhVar.c, aqzhVar);
            }
        }
    }

    public final View a() {
        return this.c.a();
    }

    public final void c() {
        aypg aypgVar = this.p;
        if (aypgVar == null) {
            return;
        }
        ayqi.c((AtomicReference) aypgVar);
        this.p = null;
    }
}
