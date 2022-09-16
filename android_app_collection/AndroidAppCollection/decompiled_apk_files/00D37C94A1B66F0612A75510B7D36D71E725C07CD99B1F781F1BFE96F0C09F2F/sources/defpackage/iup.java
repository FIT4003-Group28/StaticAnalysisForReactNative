package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: iup  reason: default package */
/* loaded from: classes3.dex */
final class iup extends abpf {
    final /* synthetic */ iuq a;
    private View l;
    private View m;
    private View n;
    private RecyclerView o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iup(iuq iuqVar, ajyi ajyiVar, ajsg ajsgVar, acti actiVar, abjy abjyVar) {
        super(iuqVar.b, ajyiVar, ajsgVar, actiVar, abjyVar);
        this.a = iuqVar;
    }

    @Override // defpackage.abpd
    public final RecyclerView a() {
        return this.a.h;
    }

    @Override // defpackage.abpf, defpackage.abpd
    public final RecyclerView b() {
        if (this.o == null) {
            RecyclerView recyclerView = (RecyclerView) this.a.i.findViewById(R.id.ticker);
            this.o = recyclerView;
            if (recyclerView != null) {
                recyclerView.af(null);
            }
        }
        return this.o;
    }

    @Override // defpackage.abpf
    public final View c() {
        if (this.n == null) {
            this.n = this.a.i.findViewById(R.id.live_chat_banner_container);
        }
        return this.n;
    }

    @Override // defpackage.abpd
    public final View d() {
        if (this.l == null) {
            this.l = this.a.i.findViewById(R.id.more_comments_icon_container);
        }
        return this.l;
    }

    @Override // defpackage.abpf
    protected final View e() {
        if (this.m == null) {
            this.m = this.a.i.findViewById(R.id.more_comments_icon);
        }
        return this.m;
    }

    @Override // defpackage.abpd
    public final ajzn f() {
        iuq iuqVar = this.a;
        if (iuqVar.k == null) {
            iuqVar.c.a();
            iuq iuqVar2 = this.a;
            swq swqVar = iuqVar2.m;
            acti actiVar = ((abiq) iuqVar2.a.get()).p;
            ajjr ajjrVar = this.a.c;
            ajkd a = ajjrVar.a().a(ajkb.LIVE_CHAT);
            iuq iuqVar3 = this.a;
            iuqVar2.k = new akdb(swqVar, actiVar, ajjrVar, a, iuqVar3.d, iuqVar3.e);
        }
        return this.a.k;
    }
}
