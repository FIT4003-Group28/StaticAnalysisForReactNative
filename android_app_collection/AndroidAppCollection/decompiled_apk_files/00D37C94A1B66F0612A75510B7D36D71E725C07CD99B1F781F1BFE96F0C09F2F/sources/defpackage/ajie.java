package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Arrays;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: ajie  reason: default package */
/* loaded from: classes.dex */
public final class ajie extends ajmf {
    public final ajkd q;
    public final acti r;
    public final swq s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajie(ajkd ajkdVar, swq swqVar, acti actiVar) {
        super(ajkdVar.n, ajkdVar.o);
        new HashSet(Arrays.asList(tia.LAYOUT));
        this.q = ajkdVar;
        this.s = swqVar;
        this.r = actiVar;
    }

    @Override // defpackage.thz
    public final void f() {
        super.d();
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            recyclerView.aG(this.e);
            this.c.removeOnLayoutChangeListener(this.f);
        }
        xo xoVar = this.b;
        if (xoVar != null) {
            xoVar.v(this.g);
        }
        this.b = null;
        this.c = null;
        this.p = null;
        this.j.clear();
        this.h = -1;
        this.i = -1;
        this.k = -1;
        this.l = -1;
        this.m = 1;
        this.n = -1;
        this.o = -1;
        this.a.clear();
    }
}
