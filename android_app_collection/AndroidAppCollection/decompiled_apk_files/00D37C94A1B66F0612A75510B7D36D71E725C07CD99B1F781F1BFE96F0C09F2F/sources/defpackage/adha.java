package defpackage;

import android.content.Context;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: adha  reason: default package */
/* loaded from: classes.dex */
public final class adha extends adgw implements adfv {
    public AdapterView.OnItemClickListener m;
    public final yni n;
    public final azqb o;
    public final adfa p;
    public final acti q;
    public final Map r;
    private final adeq s;
    private final adgl t;
    private final acyz u;
    private final boolean v;
    private final aczr w;
    private final acyx x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adha(Context context, adnq adnqVar, adef adefVar, boolean z, yni yniVar, azqb azqbVar, azqb azqbVar2, adfa adfaVar, adgl adglVar, acyz acyzVar, acyx acyxVar, aczr aczrVar, acwu acwuVar, acti actiVar, Executor executor, adgj adgjVar) {
        super(context, null);
        String str = null;
        this.s = new adeq(adnqVar, adefVar, z, this, azqbVar2 != null ? (String) azqbVar2.get() : str, executor, adgjVar);
        this.n = yniVar;
        this.o = azqbVar;
        this.p = adfaVar;
        this.t = adglVar;
        this.v = acwuVar.ah;
        this.u = acyzVar;
        this.x = acyxVar;
        this.w = aczrVar;
        this.q = actiVar;
        this.r = new HashMap();
    }

    @Override // defpackage.bev
    public final void a(List list) {
        this.s.b(list);
        if (this.q.c() != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bhc bhcVar = (bhc) it.next();
                if (this.r.containsKey(bhcVar.c)) {
                    this.q.u((acum) this.r.get(bhcVar.c), p(bhcVar));
                } else {
                    acum acumVar = new acum(this.q.c(), actj.MEDIA_ROUTE_CONNECT_BUTTON);
                    this.q.D(acumVar);
                    this.q.u(acumVar, p(bhcVar));
                    this.r.put(bhcVar.c, acumVar);
                }
            }
            return;
        }
        zep.c(adhb.ae, "No screen attached to interaction logger yet.");
    }

    @Override // defpackage.adgw
    protected final void j(rut rutVar) {
        rve c;
        acyx acyxVar = this.x;
        aczd aczdVar = acyxVar.a;
        if (aczdVar.c.h(aczdVar.b, 211500000) != 0) {
            c = rwd.c(2);
        } else {
            qst qstVar = acyxVar.b;
            rvh rvhVar = new rvh();
            qvx b = qvy.b();
            b.c = 8417;
            b.a = new qjn(3);
            rve s = qstVar.s(b.a());
            s.r(new rdg(rvhVar, 1));
            s.n(new rdf(rvhVar, 1));
            c = rvhVar.a;
        }
        c.q(rutVar);
    }

    @Override // defpackage.adgw
    protected final void m() {
        ListView listView = this.c;
        this.m = listView.getOnItemClickListener();
        listView.setOnItemClickListener(new adgz(this));
    }

    @Override // defpackage.adgw
    protected final boolean n() {
        return this.v;
    }

    @Override // defpackage.adgw
    protected final boolean o() {
        aczr aczrVar = this.w;
        return aczrVar != null && aczrVar.c.equals("cl");
    }

    public final asjj p(bhc bhcVar) {
        aopa createBuilder = asjj.a.createBuilder();
        aopa createBuilder2 = asjk.a.createBuilder();
        adgl adglVar = this.t;
        int i = adglVar.f(bhcVar) ? 4 : adglVar.e(bhcVar) ? 5 : adgl.h(bhcVar) ? 2 : adgl.i(bhcVar) ? 3 : 1;
        createBuilder2.copyOnWrite();
        asjk asjkVar = (asjk) createBuilder2.instance;
        asjkVar.c = i - 1;
        asjkVar.b |= 1;
        asjk asjkVar2 = (asjk) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        asjj asjjVar = (asjj) createBuilder.instance;
        asjkVar2.getClass();
        asjjVar.e = asjkVar2;
        asjjVar.b |= 4;
        return (asjj) createBuilder.mo39build();
    }

    @Override // defpackage.adfv
    public final boolean rk(bhc bhcVar) {
        acum acumVar;
        if (this.u.e() || !this.t.f(bhcVar)) {
            return i(bhcVar);
        }
        if (this.q.c() == null) {
            return false;
        }
        if (this.r.containsKey(bhcVar.c)) {
            acumVar = (acum) this.r.get(bhcVar.c);
        } else {
            acumVar = new acum(this.q.c(), actj.MEDIA_ROUTE_CONNECT_BUTTON);
            this.q.D(acumVar);
            this.r.put(bhcVar.c, acumVar);
        }
        this.q.q(acumVar, p(bhcVar));
        return false;
    }
}
