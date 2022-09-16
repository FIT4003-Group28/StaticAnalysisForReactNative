package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: shh  reason: default package */
/* loaded from: classes4.dex */
public final class shh implements sgp {
    final Double a = Double.valueOf(0.0d);
    final /* synthetic */ sgp b;
    final /* synthetic */ Map c;

    public shh(sgp sgpVar, Map map) {
        this.b = sgpVar;
        this.c = map;
    }

    @Override // defpackage.sgp
    public final /* bridge */ /* synthetic */ Object a(Object obj, int i, sgt sgtVar) {
        Double d = (Double) this.c.get(this.b.a(obj, i, sgtVar));
        return d != null ? d : this.a;
    }
}
