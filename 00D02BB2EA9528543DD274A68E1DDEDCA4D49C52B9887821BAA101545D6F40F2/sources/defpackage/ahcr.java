package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahcr  reason: default package */
/* loaded from: classes2.dex */
public class ahcr implements agzd {
    public final ahco a;
    public final btlu b;
    public final List<ahcn> c = new ArrayList();
    private final agwa d;
    private final bvrb e;

    public ahcr(agwa agwaVar, ahco ahcoVar, bvrb bvrbVar, btlu btluVar) {
        this.d = agwaVar;
        this.a = ahcoVar;
        this.e = bvrbVar;
        this.b = btluVar;
    }

    @Override // defpackage.agzd
    public Iterable<? extends agzc> a() {
        return dcft.i(this.c, ahcp.a);
    }

    public dehn<List<dldj>> b() {
        dehn<List<dldj>> k = this.d.k(this.b);
        deha.q(k, new ahcq(this), this.e.h());
        return k;
    }

    public Boolean c() {
        return Boolean.valueOf(!dcft.w(a()));
    }
}
