package defpackage;

import android.content.res.Configuration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import j$.util.OptionalInt;
/* compiled from: PG */
/* renamed from: obe  reason: default package */
/* loaded from: classes3.dex */
public final class obe implements oec {
    public final RecyclerView a;
    public Runnable b;
    private final LinearLayoutManager c;
    private final odn d;

    public obe(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, odn odnVar, azqb azqbVar, ajsg ajsgVar, acti actiVar, ajzq ajzqVar, View view) {
        this.a = recyclerView;
        this.c = linearLayoutManager;
        this.d = odnVar;
        odnVar.g = view;
        recyclerView.ag(linearLayoutManager);
        recyclerView.af(null);
        recyclerView.aE(new obd(this));
        ajsf a = ajsgVar.a((ajsa) azqbVar.get());
        a.h(odnVar.d);
        a.rZ(new ajrc(actiVar));
        a.rZ(new akag(ajzqVar));
        recyclerView.ad(a);
    }

    @Override // defpackage.oec
    public final void b(Configuration configuration) {
        xo xoVar;
        if (configuration.orientation != 2 || (xoVar = this.a.m) == null) {
            return;
        }
        xoVar.mr();
    }

    @Override // defpackage.oec
    public final void c(WatchNextResponseModel watchNextResponseModel) {
        aakw aakwVar;
        View view;
        odn odnVar = this.d;
        odnVar.a();
        if (watchNextResponseModel != null && (aakwVar = watchNextResponseModel.e) != null) {
            boolean z = false;
            for (auqk auqkVar : aakwVar.a.d) {
                aslq aslqVar = auqkVar.j;
                if (aslqVar == null) {
                    aslqVar = aslq.a;
                }
                if (!oaw.c(aslqVar)) {
                    if (aslqVar.e.size() > 0) {
                        ajsm ajsmVar = new ajsm();
                        ajsmVar.addAll(odnVar.b.a(aslqVar.e));
                        odnVar.e.put(aslqVar.h, ajsmVar);
                        odnVar.d.m(ajsmVar);
                    }
                } else {
                    ajsm ajsmVar2 = new ajsm();
                    ajsmVar2.addAll(odnVar.c.a(aslqVar.e));
                    odnVar.e.put(aslqVar.h, ajsmVar2);
                    odnVar.d.m(ajsmVar2);
                    z = true;
                }
                if ((auqkVar.e & 8192) != 0) {
                    odm odmVar = odnVar.a;
                    auxn auxnVar = auqkVar.bk;
                    if (auxnVar == null) {
                        auxnVar = auxn.a;
                    }
                    odnVar.f = odmVar.a(auxnVar);
                    odnVar.d.m(odnVar.f.d);
                }
            }
            if (odnVar.f != null && !z && (view = odnVar.g) != null && view.getVisibility() == 0) {
                odnVar.f.f();
            }
        }
        if (!this.d.d.isEmpty()) {
            this.c.aa(0, 0);
        } else {
            this.d.a();
        }
    }

    @Override // defpackage.oec
    public final void d() {
        this.d.a();
    }

    @Override // defpackage.ajzw
    public final boolean ln(String str, int i, Runnable runnable) {
        final OptionalInt of;
        odn odnVar = this.d;
        ajqm ajqmVar = (ajqm) odnVar.e.get(str);
        if (ajqmVar == null) {
            of = OptionalInt.empty();
        } else {
            ajrj ajrjVar = odnVar.d;
            ajri k = ajrjVar.k(ajrjVar.i(ajqmVar));
            if (k == null) {
                of = OptionalInt.empty();
            } else {
                int g = k.g();
                of = g >= 0 ? OptionalInt.of(g) : OptionalInt.empty();
            }
        }
        if (of.isPresent()) {
            this.b = runnable;
            this.a.post(new Runnable() { // from class: obc
                @Override // java.lang.Runnable
                public final void run() {
                    obe.this.a.al(of.getAsInt());
                }
            });
            return true;
        }
        return false;
    }

    @Override // defpackage.ajzw
    public final /* synthetic */ void lp(String str) {
        throw null;
    }
}
