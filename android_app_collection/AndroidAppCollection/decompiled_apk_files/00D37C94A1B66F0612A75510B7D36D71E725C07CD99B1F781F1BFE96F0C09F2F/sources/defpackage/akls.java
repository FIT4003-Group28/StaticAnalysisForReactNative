package defpackage;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: akls  reason: default package */
/* loaded from: classes.dex */
public final class akls extends ajwd implements aklk, akoj, akpa, akmk, akny {
    public final PackageManager a;
    public final aafo b;
    public final aklw c;
    public final yni d;
    public final acti e;
    public final Map f;
    public final Map g;
    public final Executor h;
    public final ankw i;
    public boolean j;
    public String k;
    private final Context l;
    private final ajsm m;
    private final int n;
    private final List o;
    private final ajmy p;
    private final aknz q;
    private final boolean r;
    private final int s;

    public akls(avnn avnnVar, Context context, aafo aafoVar, apgv apgvVar, List list, aklw aklwVar, yni yniVar, ajmy ajmyVar, aknz aknzVar, acti actiVar, boolean z, Executor executor, ankw ankwVar) {
        autf autfVar;
        this.l = context;
        this.b = aafoVar;
        this.c = aklwVar;
        this.d = yniVar;
        this.p = ajmyVar;
        this.q = aknzVar;
        this.e = actiVar;
        this.r = z;
        this.s = true != aklwVar.l() ? 4 : 1;
        this.h = executor;
        ankwVar.getClass();
        this.i = ankwVar;
        this.f = new HashMap();
        this.g = new HashMap();
        this.m = new ajsm();
        this.n = context.getResources().getInteger(R.integer.share_panel_third_party_columns);
        this.a = context.getPackageManager();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            zew.M(hashMap, apwt.q(resolveInfo.activityInfo.applicationInfo.packageName, apgvVar), resolveInfo);
        }
        this.o = new ArrayList();
        this.j = true;
        for (autg autgVar : avnnVar.c) {
            if ((autgVar.b & 2) != 0) {
                autf autfVar2 = autgVar.d;
                autfVar2 = autfVar2 == null ? autf.a : autfVar2;
                Set set = (Set) hashMap.get(Integer.valueOf(autfVar2.c));
                if (set == null || set.isEmpty()) {
                    this.o.add(autfVar2);
                } else {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        ResolveInfo resolveInfo2 = (ResolveInfo) it2.next();
                        autf p = apwt.p(autfVar2, resolveInfo2);
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo != null && activityInfo.exported) {
                            this.f.put(p, resolveInfo2);
                            this.o.add(p);
                        }
                        it2.remove();
                    }
                }
            }
        }
        for (ausy ausyVar : avnnVar.e) {
            if (ausyVar != null) {
                hashMap.remove(Integer.valueOf(ausyVar.c));
            }
        }
        if ((avnnVar.b & 2) != 0) {
            for (Set<ResolveInfo> set2 : hashMap.values()) {
                for (ResolveInfo resolveInfo3 : set2) {
                    auth authVar = avnnVar.d;
                    if (((authVar == null ? auth.a : authVar).b & 1) != 0) {
                        auth authVar2 = avnnVar.d;
                        autfVar = (authVar2 == null ? auth.a : authVar2).c;
                        if (autfVar == null) {
                            autfVar = autf.a;
                        }
                    } else {
                        autfVar = null;
                    }
                    autf p2 = apwt.p(autfVar, resolveInfo3);
                    this.f.put(p2, resolveInfo3);
                    this.o.add(p2);
                }
            }
        }
        m();
        aknzVar.a(this);
    }

    public static final asjj k(autf autfVar) {
        apzg apzgVar = autfVar.f;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        arnd arndVar = ((SendShareEndpoint$SendShareExternallyEndpoint) apzgVar.qm(SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint)).d;
        if (arndVar == null) {
            arndVar = arnd.a;
        }
        ausy ausyVar = arndVar.c;
        if (ausyVar == null) {
            ausyVar = ausy.a;
        }
        if (ausyVar.d.isEmpty() || ausyVar.e.isEmpty()) {
            return null;
        }
        aopa createBuilder = asjj.a.createBuilder();
        aopa createBuilder2 = asjo.a.createBuilder();
        String format = String.format("%s/%s", ausyVar.d, ausyVar.e);
        createBuilder2.copyOnWrite();
        asjo asjoVar = (asjo) createBuilder2.instance;
        format.getClass();
        asjoVar.b = 1 | asjoVar.b;
        asjoVar.c = format;
        createBuilder.copyOnWrite();
        asjj asjjVar = (asjj) createBuilder.instance;
        asjo asjoVar2 = (asjo) createBuilder2.mo39build();
        asjoVar2.getClass();
        asjjVar.i = asjoVar2;
        asjjVar.b |= 32;
        return (asjj) createBuilder.mo39build();
    }

    @Override // defpackage.akny
    public final void a(aknz aknzVar) {
        boolean z = false;
        if (TextUtils.isEmpty(null) && aknzVar.a.isEmpty()) {
            z = true;
        }
        this.j = z;
        if (this.r) {
            m();
        } else {
            this.m.l();
        }
    }

    @Override // defpackage.aklk
    public final void b(List list) {
    }

    @Override // defpackage.aklk
    public final void c(ajsa ajsaVar) {
        izn iznVar = new izn(2);
        ajsaVar.f(autf.class, new akoz(this.l, this, this.p));
        ajqz ajqzVar = new ajqz(this.l, iznVar, ajsaVar);
        ajsaVar.f(ajqo.class, ajqzVar);
        ajsaVar.f(aknu.class, ajqzVar);
    }

    @Override // defpackage.akoj
    public final void d(String str) {
        this.k = str;
    }

    @Override // defpackage.akoj
    public final void f() {
    }

    @Override // defpackage.akmk
    public final void h() {
        this.c.b(false);
    }

    @Override // defpackage.akmk
    public final void i() {
        this.c.b(false);
        this.c.h();
        this.d.d(new akly());
    }

    @Override // defpackage.ajwd, defpackage.zdx
    public final void j() {
        this.q.c(this);
    }

    @Override // defpackage.akoj
    public final void l() {
    }

    @Override // defpackage.ajyj
    public final ajqm lA() {
        return this.m;
    }

    @Override // defpackage.ajwd, defpackage.ajyj
    public final void lC(Configuration configuration) {
        m();
    }

    private final void m() {
        if (!this.r || this.j) {
            for (autf autfVar : this.o) {
                ((acsx) this.e).D(new acte(autfVar.g));
            }
            aklr aklrVar = new aklr(this.o, this.n);
            this.m.clear();
            boolean z = !this.c.l();
            for (int i = 0; i < aklrVar.size(); i++) {
                List list = aklrVar.get(i);
                if (i < this.s) {
                    this.m.add(new aknu(this.n, list));
                } else {
                    ajsm ajsmVar = this.m;
                    ajqn a = ajqo.a();
                    a.a = this.n;
                    a.b = list;
                    ajsmVar.add(a.a());
                    z = false;
                }
            }
            this.c.i(z);
            return;
        }
        this.m.clear();
    }
}
