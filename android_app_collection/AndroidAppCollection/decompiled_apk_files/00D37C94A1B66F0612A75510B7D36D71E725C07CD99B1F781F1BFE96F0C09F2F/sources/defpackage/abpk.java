package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: abpk  reason: default package */
/* loaded from: classes.dex */
public final class abpk extends abpd {
    private final acth a;
    private final ajjr l;
    private final tdu m;
    private final azqb n;
    private final View o;
    private RecyclerView p;
    private View q;
    private RecyclerView r;
    private ajzn s;
    private final swq t;

    public abpk(Context context, ajyi ajyiVar, ajsg ajsgVar, acth acthVar, swq swqVar, ajjr ajjrVar, tdu tduVar, azqb azqbVar, abjy abjyVar, View view) {
        super(context, ajyiVar, ajsgVar, acthVar.oi(), abjyVar);
        this.n = azqbVar;
        this.o = view;
        this.a = acthVar;
        this.t = swqVar;
        this.l = ajjrVar;
        this.m = tduVar;
    }

    @Override // defpackage.abpd
    public final abpp C() {
        return new abpp(this.c, (abhg) this.g, this.o);
    }

    @Override // defpackage.abpd
    public final RecyclerView a() {
        if (this.p == null) {
            this.p = (RecyclerView) this.o.findViewById(R.id.conversation_list);
        }
        return this.p;
    }

    @Override // defpackage.abpd
    public final RecyclerView b() {
        if (this.r == null) {
            this.r = (RecyclerView) this.o.findViewById(R.id.ticker);
        }
        return this.r;
    }

    @Override // defpackage.abpd
    public final View d() {
        if (this.q == null) {
            this.q = this.o.findViewById(R.id.more_comments_icon);
        }
        return this.q;
    }

    @Override // defpackage.abpd
    public final ajzn f() {
        if (this.s == null) {
            this.l.a();
            swq swqVar = this.t;
            acti oi = this.a.oi();
            ajjr ajjrVar = this.l;
            this.s = new akdb(swqVar, oi, ajjrVar, ajjrVar.a().a(ajkb.LIVE_CHAT), this.m, this.n);
        }
        return this.s;
    }
}
