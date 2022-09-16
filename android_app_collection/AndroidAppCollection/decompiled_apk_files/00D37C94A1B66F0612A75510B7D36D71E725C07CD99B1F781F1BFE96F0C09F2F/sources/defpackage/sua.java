package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sua  reason: default package */
/* loaded from: classes4.dex */
public final class sua implements tcr {
    private final float a;
    private final boolean b;
    private final int c;
    private final dle d;

    public sua(axmr axmrVar, Context context, dle dleVar) {
        this.a = context.getResources().getDisplayMetrics().density;
        this.b = tgo.g(context);
        this.c = axmrVar.aJ();
        this.d = dleVar;
    }

    @Override // defpackage.tcr
    public final tcq a(tcq tcqVar) {
        RecyclerView a = this.d.a();
        if (a == null) {
            return tcqVar;
        }
        aopa createBuilder = awmm.a.createBuilder();
        aopa createBuilder2 = awoj.a.createBuilder();
        int computeHorizontalScrollOffset = a.computeHorizontalScrollOffset();
        float f = this.a;
        createBuilder2.copyOnWrite();
        awoj awojVar = (awoj) createBuilder2.instance;
        awojVar.b |= 1;
        awojVar.c = computeHorizontalScrollOffset / f;
        int computeVerticalScrollOffset = a.computeVerticalScrollOffset();
        float f2 = this.a;
        createBuilder2.copyOnWrite();
        awoj awojVar2 = (awoj) createBuilder2.instance;
        awojVar2.b |= 2;
        awojVar2.d = computeVerticalScrollOffset / f2;
        createBuilder.copyOnWrite();
        awmm awmmVar = (awmm) createBuilder.instance;
        awoj awojVar3 = (awoj) createBuilder2.mo39build();
        awojVar3.getClass();
        awmmVar.d = awojVar3;
        awmmVar.c |= 1;
        int i = this.c;
        boolean z = this.b;
        int i2 = sub.a;
        int i3 = -1;
        if (i != 1) {
            xw xwVar = a.n;
            if (xwVar instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) xwVar;
                if (z) {
                    i3 = linearLayoutManager.L();
                } else {
                    i3 = linearLayoutManager.J();
                }
            }
        } else {
            View n = a.n(a.getWidth() / 2, a.getHeight() / 2);
            if (n != null) {
                i3 = a.c(n);
            }
        }
        createBuilder.copyOnWrite();
        awmm awmmVar2 = (awmm) createBuilder.instance;
        awmmVar2.c |= 2;
        awmmVar2.e = i3;
        awmm awmmVar3 = (awmm) createBuilder.mo39build();
        awon awonVar = tcqVar.e;
        if (awonVar == null) {
            awonVar = awon.a;
        }
        aopc aopcVar = (aopc) awonVar.mo52toBuilder();
        aopcVar.e(awmm.b, awmmVar3);
        tcqVar.e = (awon) aopcVar.mo39build();
        return tcqVar;
    }
}
