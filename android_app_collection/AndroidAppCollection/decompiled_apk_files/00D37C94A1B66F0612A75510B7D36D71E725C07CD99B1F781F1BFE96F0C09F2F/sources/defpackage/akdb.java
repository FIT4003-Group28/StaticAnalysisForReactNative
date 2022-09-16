package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: akdb  reason: default package */
/* loaded from: classes.dex */
public final class akdb implements ajzn {
    public ajkj a = ajkj.a;
    public Object b;
    private final acti c;
    private final ajjr d;
    private final ajkd e;
    private final tdu f;
    private final azqb g;
    private final swq h;

    public akdb(swq swqVar, acti actiVar, ajjr ajjrVar, ajkd ajkdVar, tdu tduVar, azqb azqbVar) {
        this.h = swqVar;
        this.c = actiVar;
        this.d = ajjrVar;
        this.e = ajkdVar;
        this.f = tduVar;
        this.g = azqbVar;
    }

    @Override // defpackage.ajzn
    /* renamed from: b */
    public final akdg a(RecyclerView recyclerView, ajsf ajsfVar) {
        return new akdg(recyclerView, ajsfVar, this.h, this.c, this.d, this.e, this.a, this.f, this.g, this.b);
    }
}
