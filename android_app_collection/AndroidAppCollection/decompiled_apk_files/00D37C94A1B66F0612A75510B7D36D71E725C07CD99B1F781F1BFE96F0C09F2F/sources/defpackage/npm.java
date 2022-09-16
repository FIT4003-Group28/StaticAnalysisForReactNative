package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.app.watch.engagementpanel.LinearScrollToItemLayoutManager;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: npm  reason: default package */
/* loaded from: classes3.dex */
public final class npm extends ajwd implements gdr, oeh, nnc, gef {
    public final yni a;
    public final yzj b;
    public final fjk c;
    public final ajsm d;
    public final aari e;
    public final Map f;
    public final Set g;
    public final azpa h;
    public acti i;
    public oes j;
    public RecyclerView k;
    public LoadingFrameLayout l;
    public boolean m;
    public int n;
    public boolean o = true;
    public String p;
    public boolean q;
    public aypg r;
    public audg s;
    public int t;
    private final Set u;
    private final Set v;

    public npm(yni yniVar, aafo aafoVar, abeb abebVar, yzj yzjVar, oei oeiVar, ghs ghsVar) {
        this.a = yniVar;
        this.b = yzjVar;
        this.e = abebVar;
        HashSet hashSet = new HashSet();
        this.g = hashSet;
        hashSet.add(new ajqt(aafoVar));
        hashSet.add(new npi(this, 1));
        hashSet.add(new npi(this));
        this.f = new HashMap();
        this.u = Collections.newSetFromMap(new WeakHashMap());
        this.v = Collections.newSetFromMap(new WeakHashMap());
        this.c = new fjk();
        this.d = new ajsm();
        this.h = azpa.ar();
        oeiVar.a(this);
        ghsVar.d.n().Z(new npj(this));
    }

    @Override // defpackage.gdr
    public final String b() {
        return this.p;
    }

    @Override // defpackage.gdr
    public final void c(gdq gdqVar) {
        this.u.add(gdqVar);
    }

    @Override // defpackage.nnc
    public final void d() {
    }

    @Override // defpackage.nnc
    public final void e() {
        for (mex mexVar : new HashSet(this.v)) {
            mexVar.a();
        }
    }

    @Override // defpackage.gef
    public final void f(mex mexVar) {
        this.v.remove(mexVar);
    }

    @Override // defpackage.nnc
    public final void h() {
    }

    public final void i() {
        if (this.o) {
            Object obj = this.h.h.get();
            this.o = obj != null && !azoq.g(obj) && !azoq.h(obj) && ((audg) this.h.at()).r;
            Integer num = (Integer) this.f.get(this.p);
            if (num == null) {
                return;
            }
            l(num.intValue(), false);
        }
    }

    @Override // defpackage.ajwd, defpackage.zdx
    public final void j() {
        this.m = false;
        this.q = false;
        this.k = null;
        this.l = null;
        this.i = null;
        this.j = null;
        this.s = null;
        aypg aypgVar = this.r;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
            this.r = null;
        }
    }

    @Override // defpackage.oeh
    public final void k() {
        if (this.m) {
            this.l.c();
        }
    }

    public final void l(int i, boolean z) {
        int max = Math.max(this.c.a(i) - 2, 0);
        xw xwVar = this.k.n;
        if (xwVar instanceof LinearScrollToItemLayoutManager) {
            if (z) {
                ((LinearScrollToItemLayoutManager) xwVar).bC(max);
            } else {
                ((LinearLayoutManager) xwVar).aa(max, 0);
            }
        }
    }

    @Override // defpackage.ajyj
    public final ajqm lA() {
        return this.c.a;
    }

    public final void m(String str) {
        this.p = str;
        for (gdq gdqVar : this.u) {
            gdqVar.a();
        }
    }

    public final void n() {
        Object mriVar;
        audg audgVar = this.s;
        if (audgVar == null) {
            return;
        }
        ajsm ajsmVar = this.d;
        this.f.clear();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (audf audfVar : audgVar.i) {
            int i2 = audfVar.b;
            if ((i2 & 1) != 0) {
                audk audkVar = audfVar.c;
                if (audkVar == null) {
                    audkVar = audk.a;
                }
                int i3 = this.t;
                asxl asxlVar = audkVar.t;
                if (asxlVar == null) {
                    asxlVar = asxl.a;
                }
                int ab = almu.ab(asxlVar.c);
                if (ab == 0 || ab != 3) {
                    mriVar = new mri(audkVar);
                } else if (i3 == 1) {
                    mriVar = new mrf(audkVar);
                } else {
                    mriVar = new mez(audkVar);
                }
                arrayList.add(mriVar);
                audk audkVar2 = audfVar.c;
                if (audkVar2 == null) {
                    audkVar2 = audk.a;
                }
                String str = audkVar2.o;
                this.f.put(str, Integer.valueOf(i));
                audk audkVar3 = audfVar.c;
                if (audkVar3 == null) {
                    audkVar3 = audk.a;
                }
                if (audkVar3.k) {
                    m(str);
                }
            } else if ((i2 & 128) != 0) {
                audh audhVar = audfVar.e;
                if (audhVar == null) {
                    audhVar = audh.a;
                }
                arrayList.add(new krr(audhVar));
            } else if ((i2 & 512) != 0) {
                atfa atfaVar = audfVar.g;
                if (atfaVar == null) {
                    atfaVar = atfa.a;
                }
                arrayList.add(atfaVar);
            } else if ((i2 & 256) != 0) {
                aqtb aqtbVar = audfVar.f;
                if (aqtbVar == null) {
                    aqtbVar = aqtb.a;
                }
                arrayList.add(ajhh.a(aqtbVar));
            }
            i++;
        }
        ajsmVar.p(arrayList);
        ajsm ajsmVar2 = this.d;
        audg audgVar2 = this.s;
        ArrayList arrayList2 = new ArrayList();
        for (audf audfVar2 : audgVar2.i) {
            if ((audfVar2.b & 32) != 0) {
                audd auddVar = audfVar2.d;
                if (auddVar == null) {
                    auddVar = audd.a;
                }
                arrayList2.add(auddVar);
            }
        }
        ajsmVar2.addAll(arrayList2);
        this.c.b(this.d);
        this.l.a();
    }

    @Override // defpackage.nnc
    public final void pc() {
    }

    @Override // defpackage.nnc
    public final void pd() {
    }

    @Override // defpackage.gdr
    public final void pe(gdq gdqVar) {
        this.u.remove(gdqVar);
    }

    @Override // defpackage.gef
    public final void pf(mex mexVar) {
        this.v.add(mexVar);
    }
}
