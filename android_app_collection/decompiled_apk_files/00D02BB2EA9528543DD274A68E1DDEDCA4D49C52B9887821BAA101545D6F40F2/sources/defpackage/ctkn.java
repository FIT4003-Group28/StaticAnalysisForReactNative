package defpackage;

import java.util.HashMap;
/* renamed from: ctkn  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class ctkn implements dbrn {
    static final dbrn a = new ctkn();

    private ctkn() {
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0044 -> B:15:0x0049). Please submit an issue!!! */
    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        int ordinal;
        HashMap hashMap = (HashMap) obj;
        try {
            cuhn a2 = cuhn.a(((Integer) hashMap.get("LINE_STYLE_TYPE")).intValue());
            cuhs cuhsVar = cuhs.UNKNOWN;
            ordinal = a2.ordinal();
        } catch (Exception unused) {
            cstl.a("RichTextConverters");
        }
        if (ordinal != 0) {
            if (ordinal == 1) {
                return dbsg.i(cube.a(((Integer) hashMap.get("INDENTATION")).intValue()));
            }
            if (ordinal != 2) {
                return dbpy.a;
            }
            return dbsg.i(cuba.a);
        }
        return dbsg.i(cubc.a);
    }
}
