package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ajqv  reason: default package */
/* loaded from: classes.dex */
public final class ajqv extends ajqd {
    public final ajqm a;
    public final ampt b;
    public final ArrayList d;
    private final ajqu e;

    public ajqv(ajqm ajqmVar, ampt amptVar) {
        ajqmVar.getClass();
        this.a = ajqmVar;
        amptVar.getClass();
        this.b = amptVar;
        this.d = new ArrayList();
        ajqu ajquVar = new ajqu(this);
        this.e = ajquVar;
        ajqmVar.lT(ajquVar);
    }

    @Override // defpackage.ajqm
    public final int a() {
        return this.d.size();
    }

    @Override // defpackage.ajqm
    public final long b(int i) {
        return i;
    }

    @Override // defpackage.ajqm
    public final Object c(int i) {
        return this.a.c(((Integer) this.d.get(i)).intValue());
    }

    @Override // defpackage.ajqm
    public final boolean contains(Object obj) {
        throw null;
    }

    @Override // defpackage.ajqm
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // defpackage.ajqd, defpackage.ajqm
    public final void mG(ajrt ajrtVar) {
        this.a.mG(ajrtVar);
    }

    @Override // defpackage.ajqd, defpackage.ajqm
    public final void mH(ajrs ajrsVar, int i) {
        this.a.mH(ajrsVar, zgd.P(i, 0, a()) ? ((Integer) this.d.get(i)).intValue() : -1);
    }
}
