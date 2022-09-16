package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mke  reason: default package */
/* loaded from: classes3.dex */
public final class mke extends ajsl {
    public final RecyclerView a;
    public final fjy b;
    final ajsm c;
    private final Context d;
    private final ajsg e;
    private argq f;
    private ajry g;
    private ajry h;
    private final ajrc i;

    public mke(Context context, fjy fjyVar, ajsg ajsgVar, ViewGroup viewGroup) {
        this.d = context;
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.horizontal_buttons_layout, viewGroup, false);
        this.a = recyclerView;
        recyclerView.ag(new mkd());
        this.b = fjyVar;
        this.e = ajsgVar;
        this.c = new ajsm();
        this.i = new ajrc();
    }

    private final int f(apmy apmyVar, avgj avgjVar) {
        int orElse = zhn.j(this.d, R.attr.ytGeneralBackgroundB).orElse(0);
        if (avgjVar == null || (avgjVar.b & 4) == 0) {
            return apmyVar != null ? apmyVar.c : orElse;
        }
        Context context = this.d;
        avgg b = avgg.b(avgjVar.e);
        if (b == null) {
            b = avgg.THEME_ATTRIBUTE_UNKNOWN;
        }
        return akeq.a(context, b, orElse);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        apmy apmyVar;
        ajry ajryVar;
        argq argqVar = (argq) obj;
        zag.o(this.a, true);
        this.i.a = ajrsVar.a;
        if (!akzj.f(this.f, argqVar)) {
            this.f = argqVar;
            avgj avgjVar = null;
            if ((argqVar.b & 1) != 0) {
                argp argpVar = argqVar.d;
                if (argpVar == null) {
                    argpVar = argp.a;
                }
                if (argpVar.b == 118483990) {
                    apmyVar = (apmy) argpVar.c;
                } else {
                    apmyVar = apmy.a;
                }
            } else {
                apmyVar = null;
            }
            if ((argqVar.b & 1) != 0) {
                argp argpVar2 = argqVar.d;
                if (argpVar2 == null) {
                    argpVar2 = argp.a;
                }
                if (argpVar2.b == 256005610) {
                    avgjVar = (avgj) argpVar2.c;
                } else {
                    avgjVar = avgj.a;
                }
            }
            ajsi ajsiVar = new ajsi();
            if (!(apmyVar == null && avgjVar == null) && zdb.c(f(apmyVar, avgjVar)) > 0.5d) {
                if (this.h == null) {
                    this.h = new mkb(this, 1);
                }
                ajryVar = this.h;
            } else {
                if (this.g == null) {
                    this.g = new mkb(this);
                }
                ajryVar = this.g;
            }
            ajsiVar.f(apoj.class, ajryVar);
            ajsf a = this.e.a(ajsiVar);
            a.h(this.c);
            a.rZ(this.i);
            this.a.ad(a);
            this.a.setBackgroundColor(f(apmyVar, avgjVar));
        }
        for (apok apokVar : argqVar.c) {
            if ((apokVar.b & 1) != 0) {
                ajsm ajsmVar = this.c;
                apoj apojVar = apokVar.c;
                if (apojVar == null) {
                    apojVar = apoj.a;
                }
                ajsmVar.add(apojVar);
            }
        }
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((argq) obj).e.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.c.clear();
        zag.o(this.a, false);
    }
}
