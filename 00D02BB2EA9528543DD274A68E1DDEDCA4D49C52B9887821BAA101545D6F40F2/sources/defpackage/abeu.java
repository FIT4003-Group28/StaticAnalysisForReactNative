package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: abeu  reason: default package */
/* loaded from: classes2.dex */
public final class abeu implements abfi {
    private final abvg a;

    public abeu(abvg abvgVar) {
        this.a = abvgVar;
    }

    @Override // defpackage.abfi
    public final List<absp> a(dhym dhymVar) {
        djrs djrsVar;
        ArrayList arrayList = new ArrayList();
        for (dhyl dhylVar : dhymVar.b) {
            int a = dhyk.a(dhylVar.a);
            int i = a - 1;
            if (a == 0) {
                throw null;
            }
            if (i != 0) {
                int i2 = dhylVar.a;
            } else {
                abot abotVar = new abot();
                abvg abvgVar = this.a;
                if (dhylVar.a == 11) {
                    djrsVar = (djrs) dhylVar.b;
                } else {
                    djrsVar = djrs.g;
                }
                absg absgVar = absg.UNKNOWN_EXPLORE_SURFACE;
                abvd a2 = abvgVar.a.a();
                abvg.a(a2, 1);
                abvg.a(djrsVar, 2);
                abvg.a(absgVar, 4);
                arrayList.add(new abtf(abotVar, new abvf(a2, djrsVar, absgVar), true));
            }
        }
        return dcdc.r(arrayList);
    }

    @Override // defpackage.abfi
    public final List b(dhym dhymVar) {
        return dcdc.e();
    }
}
