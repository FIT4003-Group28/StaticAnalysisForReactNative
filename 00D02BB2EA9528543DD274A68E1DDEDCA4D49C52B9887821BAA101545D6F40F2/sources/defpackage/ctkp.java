package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
/* renamed from: ctkp  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class ctkp implements dbrn {
    static final dbrn a = new ctkp();

    private ctkp() {
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00dc -> B:21:0x00e1). Please submit an issue!!! */
    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cuhs a2;
        HashMap hashMap = (HashMap) obj;
        try {
            a2 = cuhs.a(((Integer) hashMap.get("TEXT_STYLE_TYPE")).intValue());
            cuhn cuhnVar = cuhn.UNKNOWN;
        } catch (Exception unused) {
            cstl.a("RichTextConverters");
        }
        switch (a2.ordinal()) {
            case 0:
                return dbsg.i(cuhq.o());
            case 1:
                return dbsg.i(cuhq.p());
            case 2:
                return dbsg.i(cuhq.q());
            case 3:
                return dbsg.i(cuhq.r());
            case 4:
                return dbsg.i(cuhq.s());
            case 5:
                return dbsg.i(cuhq.t());
            case 6:
                return dbsg.i(cuhq.u());
            case 7:
                return dbsg.i(cubt.a(((Integer) hashMap.get("COLOR")).intValue()));
            case 8:
                return dbsg.i(cubt.b(((Integer) hashMap.get("BACKGROUND_COLOR")).intValue()));
            case 9:
                return dbsg.i(cubt.c(((Integer) hashMap.get("SIZE")).intValue()));
            case 10:
                return dbsg.i(cubt.d(cstr.a((ArrayList) hashMap.get("TYPEFACE_LIST"), ctkq.a)));
            case 11:
                return dbsg.i(cubt.e(((Integer) hashMap.get("HORIZONTAL_ALIGNMENT")).intValue()));
            case 12:
                return dbsg.i(cubt.f((cuhk) hashMap.get("HYPER_LINK")));
            default:
                return dbpy.a;
        }
    }
}
