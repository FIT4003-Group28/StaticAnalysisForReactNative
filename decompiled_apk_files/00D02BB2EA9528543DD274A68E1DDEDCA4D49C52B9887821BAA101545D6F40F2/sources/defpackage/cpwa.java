package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: cpwa  reason: default package */
/* loaded from: classes5.dex */
final class cpwa implements cpve {
    final Double a = Double.valueOf((double) dcyn.a);
    final /* synthetic */ cpve b;
    final /* synthetic */ Map c;

    public cpwa(cpve cpveVar, Map map) {
        this.b = cpveVar;
        this.c = map;
    }

    @Override // defpackage.cpve
    public final /* bridge */ /* synthetic */ Object a(Object obj, int i, cpvi cpviVar) {
        Double d = (Double) this.c.get(this.b.a(obj, i, cpviVar));
        return d != null ? d : this.a;
    }
}
