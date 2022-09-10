package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: boxg  reason: default package */
/* loaded from: classes3.dex */
public class boxg {
    private static final Map<drlf, boxf> d = dcjz.k(drlf.class);
    public boxf a;
    public boxf b;
    public final boxf c;

    static {
        boxf[] values;
        for (boxf boxfVar : boxf.values()) {
            d.put(boxfVar.k, boxfVar);
        }
    }

    public boxg(int i, drlf drlfVar, boolean z) {
        boxf boxfVar;
        this.a = boxf.DIRECTIONALITY_HINT;
        this.b = boxf.DIRECTIONALITY_HINT;
        this.c = (drlfVar == drlf.UNKNOWN_TRAFFIC_ACCESS || d.get(drlfVar) == null) ? boxf.DIRECTIONALITY_HINT : boxfVar;
        boxfVar = (z || i != 1) ? boxf.DIRECTIONALITY_HINT : boxfVar;
        this.a = boxfVar;
        this.b = boxfVar;
    }

    public final boolean a() {
        return this.b != this.a;
    }
}
