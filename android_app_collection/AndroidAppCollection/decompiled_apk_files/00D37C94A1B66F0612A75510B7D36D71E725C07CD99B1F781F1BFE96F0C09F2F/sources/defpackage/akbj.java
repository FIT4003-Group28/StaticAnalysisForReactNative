package defpackage;

import android.view.View;
import java.util.Map;
/* compiled from: PG */
/* renamed from: akbj  reason: default package */
/* loaded from: classes.dex */
public class akbj implements View.OnClickListener {
    public final ajsk a;
    public final View b;
    protected apoj c;
    public akbi d;
    public akbh e;
    private final aafo f;
    private Map g;

    public akbj(aafo aafoVar, ajsk ajskVar, View view) {
        aafoVar.getClass();
        this.f = aafoVar;
        this.a = ajskVar;
        view.getClass();
        this.b = view;
        view.setOnClickListener(this);
    }

    private final amup c() {
        akbh akbhVar = this.e;
        Map a = akbhVar != null ? akbhVar.a() : null;
        return a == null ? amyc.b : amup.j(a);
    }

    private final Map d(amup amupVar, boolean z) {
        Map h = actk.h(this.c, z);
        Map map = this.g;
        if (map != null) {
            h.putAll(map);
        }
        h.putAll(amupVar);
        return h;
    }

    public void a(final apoj apojVar, acti actiVar, Map map) {
        String str;
        this.g = map != null ? amup.j(map) : null;
        this.c = apojVar;
        if (apojVar == null) {
            this.b.setVisibility(8);
            return;
        }
        this.b.setVisibility(0);
        this.b.setEnabled(!this.c.h);
        this.b.setClickable(!this.c.h);
        apoj apojVar2 = this.c;
        if ((apojVar2.b & 65536) != 0) {
            aovr aovrVar = apojVar2.r;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            str = aovrVar.c;
        } else {
            str = null;
        }
        if (str != null) {
            this.b.setContentDescription(str);
        }
        if (actiVar != null) {
            apoj apojVar3 = this.c;
            if ((apojVar3.b & 1048576) != 0) {
                actiVar.u(new acte(apojVar3.t), null);
            }
        }
        if (apojVar.q.size() != 0) {
            this.f.d(apojVar.q, d(c(), false));
        }
        if (this.a == null) {
            return;
        }
        if (!this.b.isShown() || !lj.aj(this.b)) {
            this.b.post(new Runnable() { // from class: akbg
                @Override // java.lang.Runnable
                public final void run() {
                    akbj akbjVar = akbj.this;
                    akbjVar.a.a(apojVar, akbjVar.b);
                }
            });
        } else {
            this.a.a(apojVar, this.b);
        }
    }

    public final void b(apoj apojVar, acti actiVar) {
        a(apojVar, actiVar, null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apoj apojVar = this.c;
        if (apojVar == null || apojVar.h) {
            return;
        }
        if (this.d != null) {
            aopc aopcVar = (aopc) apojVar.mo52toBuilder();
            this.d.oL(aopcVar);
            this.c = (apoj) aopcVar.mo39build();
        }
        apoj apojVar2 = this.c;
        int i = apojVar2.b;
        if ((i & 8192) == 0 && (i & 16384) == 0 && (i & 32768) == 0) {
            return;
        }
        amup c = c();
        int i2 = apojVar2.b;
        if ((i2 & 8192) != 0) {
            boolean z = !((i2 & 16384) != 0);
            aafo aafoVar = this.f;
            apzg apzgVar = apojVar2.n;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, d(c, z));
        }
        if ((apojVar2.b & 16384) != 0) {
            aafo aafoVar2 = this.f;
            apzg apzgVar2 = apojVar2.o;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            aafoVar2.c(apzgVar2, d(c, false));
        }
        if ((apojVar2.b & 32768) == 0) {
            return;
        }
        aafo aafoVar3 = this.f;
        apzg apzgVar3 = apojVar2.p;
        if (apzgVar3 == null) {
            apzgVar3 = apzg.a;
        }
        aafoVar3.c(apzgVar3, d(c, false));
    }
}
