package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acjq  reason: default package */
/* loaded from: classes.dex */
public final class acjq extends abpd {
    final /* synthetic */ acjs a;
    private RecyclerView l;
    private ajzn m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acjq(acjs acjsVar, ajyi ajyiVar) {
        super(acjsVar.al, ajyiVar, acjsVar.d, acjsVar.c, acjsVar.ai);
        this.a = acjsVar;
    }

    @Override // defpackage.abpd
    public final RecyclerView a() {
        return this.a.am;
    }

    @Override // defpackage.abpd
    public final RecyclerView b() {
        if (this.a.ae.c().C) {
            if (this.l == null) {
                this.l = (RecyclerView) this.a.al.findViewById(R.id.ticker);
            }
            return this.l;
        }
        return null;
    }

    @Override // defpackage.abpd
    public final View d() {
        return this.a.an;
    }

    @Override // defpackage.abpd
    public final ajzn f() {
        if (this.m == null) {
            this.a.af.a();
            acjs acjsVar = this.a;
            swq swqVar = acjsVar.as;
            acti actiVar = this.e;
            ajjr ajjrVar = acjsVar.af;
            ajkd a = ajjrVar.a().a(ajkb.LIVE_CHAT);
            acjs acjsVar2 = this.a;
            this.m = new akdb(swqVar, actiVar, ajjrVar, a, acjsVar2.ag, acjsVar2.ah);
        }
        return this.m;
    }
}
