package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: nqh  reason: default package */
/* loaded from: classes3.dex */
public final class nqh extends nom {
    public final azpm n;
    public final aagi o;
    public ampq p;
    public final aypf q;
    public boolean r;

    public nqh(Context context, aagi aagiVar, acti actiVar) {
        super(context, actiVar);
        this.o = aagiVar;
        this.p = amon.a;
        this.l = amon.a;
        this.q = new aypf();
        this.n = azpm.aI(true);
    }

    @Override // defpackage.nom
    protected final void b() {
        if (this.d != null) {
            return;
        }
        this.d = (FrameLayout) LayoutInflater.from(this.a).inflate(R.layout.sync_button, (ViewGroup) this.e, false).findViewById(R.id.sync_button);
        this.f = (TextView) this.d.findViewById(R.id.sync_text);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: nqf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nqh nqhVar = nqh.this;
                nqhVar.o(true);
                nqhVar.f.startAnimation(nqhVar.g);
                if (nqhVar.l.h()) {
                    nqhVar.k.H(3, (acum) nqhVar.l.c(), null);
                }
            }
        });
    }

    @Override // defpackage.nom
    public final void f() {
        super.f();
        o(true);
        this.q.c();
        this.r = false;
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        if (!this.b || !((Boolean) this.n.aJ()).booleanValue() || this.r) {
            return;
        }
        o(false);
        d(this.a.getString(R.string.sync_to_video));
    }

    public final void o(boolean z) {
        this.n.c(Boolean.valueOf(z));
        if (!this.p.h()) {
            return;
        }
        aopa createBuilder = aqvy.a.createBuilder();
        alzh b = alzi.b();
        b.d(7);
        alzl b2 = b.b();
        createBuilder.copyOnWrite();
        aqvy aqvyVar = (aqvy) createBuilder.instance;
        b2.getClass();
        aqvyVar.d = b2;
        aqvyVar.b |= 2;
        aopa createBuilder2 = aqvx.a.createBuilder();
        createBuilder2.copyOnWrite();
        aqvx aqvxVar = (aqvx) createBuilder2.instance;
        aqvxVar.c = 1;
        aqvxVar.b |= 1;
        aqvx aqvxVar2 = (aqvx) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        aqvy aqvyVar2 = (aqvy) createBuilder.instance;
        aqvxVar2.getClass();
        aqvyVar2.c = aqvxVar2;
        aqvyVar2.b |= 1;
        aqvy aqvyVar3 = (aqvy) createBuilder.mo39build();
        aahb c = ((aagu) this.o.c()).c();
        String str = (String) this.p.c();
        atab f = atac.f((String) this.p.c());
        f.b(z ? atag.SYNC_MODE_SYNCED_WITH_VIDEO : atag.SYNC_MODE_USER_BROWSING);
        c.i(str, aqvyVar3, f.c().c());
        c.b().S(fzb.k, npy.c);
    }
}
