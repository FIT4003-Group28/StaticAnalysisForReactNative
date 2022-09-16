package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: cunm  reason: default package */
/* loaded from: classes5.dex */
public final class cunm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static HashMap<String, Object> a(cuqq cuqqVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("PADDING_START", Integer.valueOf(cuqqVar.b()));
        hashMap.put("PADDING_TOP", Integer.valueOf(cuqqVar.c()));
        hashMap.put("PADDING_END", Integer.valueOf(cuqqVar.d()));
        hashMap.put("PADDING_BOTTOM", Integer.valueOf(cuqqVar.e()));
        hashMap.put("TYPE", cuqqVar.f());
        cuqp cuqpVar = cuqp.RICH_TEXT;
        int ordinal = cuqqVar.f().ordinal();
        if (ordinal == 0) {
            hashMap.put("RICH_TEXT", ctkr.a(cuqqVar.a().f()));
        } else if (ordinal == 2) {
            cuqh g = cuqqVar.a().g();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("TEXT", g.a());
            hashMap2.put("BACKGROUND_COLOR", Integer.valueOf(g.b()));
            hashMap2.put("TEXT_COLOR", Integer.valueOf(g.c()));
            hashMap.put("STATUS_BADGE", hashMap2);
        } else if (ordinal == 3) {
            cuqb e = cuqqVar.a().e();
            HashMap hashMap3 = new HashMap();
            hashMap3.put("ORIENTATION", Integer.valueOf(e.b()));
            hashMap3.put("BUTTONS", cstr.b(e.a(), cunb.a));
            if (e.b() == 2) {
                hashMap3.put("HORIZONTAL_ALIGNMENT", Integer.valueOf(e.c().a() ? e.c().b().intValue() : 0));
            }
            hashMap.put("RICH_CARD_BUTTONS", hashMap3);
        } else if (ordinal == 4) {
            cups c = cuqqVar.a().c();
            HashMap hashMap4 = new HashMap();
            hashMap4.put("LINE_COLOR", Integer.valueOf(c.a()));
            hashMap4.put("LINE_WIDTH", Float.valueOf(c.b()));
            hashMap.put("HORIZONTAL_LINE", hashMap4);
        } else if (ordinal == 5) {
            cupq b = cuqqVar.a().b();
            HashMap hashMap5 = new HashMap();
            hashMap5.put("VERTICAL_LAYOUT_BUTTON", cstr.b(b.a(), cumz.a));
            hashMap.put("HORIZONTAL_LAYOUT_BUTTONS", hashMap5);
        } else if (ordinal == 6) {
            dbsg<JSONObject> h = cuqqVar.a().d().h();
            if (h.a()) {
                hashMap.put("IMAGE_ELEMENT", h.b().toString());
            } else {
                throw new IllegalArgumentException("Unable to convert image element to JSON.");
            }
        } else {
            int i = cuqqVar.f().i;
            StringBuilder sb = new StringBuilder(39);
            sb.append("Unsupported UiElement type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dbsg<cuqq> b(HashMap<String, Object> hashMap) {
        cuqm g;
        int ordinal;
        dbsg dbsgVar;
        dbsg dbsgVar2;
        dbsg dbsgVar3;
        dbsg dbsgVar4;
        try {
            g = cuqq.g();
            g.e(((Integer) hashMap.get("PADDING_START")).intValue());
            g.f(((Integer) hashMap.get("PADDING_TOP")).intValue());
            g.d(((Integer) hashMap.get("PADDING_END")).intValue());
            g.c(((Integer) hashMap.get("PADDING_BOTTOM")).intValue());
            cuqp cuqpVar = cuqp.RICH_TEXT;
            ordinal = ((cuqp) hashMap.get("TYPE")).ordinal();
        } catch (Exception unused) {
            cstl.a("UiElementConverters");
            return dbpy.a;
        }
        if (ordinal == 0) {
            g.l(ctkr.b((HashMap) hashMap.get("RICH_TEXT")).b());
            return dbsg.i(g.a());
        }
        if (ordinal == 2) {
            HashMap hashMap2 = (HashMap) hashMap.get("STATUS_BADGE");
            try {
                cuqg d = cuqh.d();
                d.c((String) hashMap2.get("TEXT"));
                d.b(((Integer) hashMap2.get("BACKGROUND_COLOR")).intValue());
                d.d(((Integer) hashMap2.get("TEXT_COLOR")).intValue());
                dbsgVar = dbsg.i(d.a());
            } catch (Exception unused2) {
                cstl.a("StatusBadgeConverters");
                dbsgVar = dbpy.a;
            }
            g.m((cuqh) dbsgVar.b());
            return dbsg.i(g.a());
        } else if (ordinal == 3) {
            HashMap hashMap3 = (HashMap) hashMap.get("RICH_CARD_BUTTONS");
            try {
                cupy d2 = cuqb.d();
                if (((Integer) hashMap3.get("ORIENTATION")).intValue() == 2) {
                    d2.c(hashMap3.containsKey("HORIZONTAL_ALIGNMENT") ? ((Integer) hashMap3.get("HORIZONTAL_ALIGNMENT")).intValue() : 0);
                }
                d2.b(cstr.c((ArrayList) hashMap3.get("BUTTONS"), cund.a));
                d2.d(((Integer) hashMap3.get("ORIENTATION")).intValue());
                dbsgVar2 = dbsg.i(d2.a());
            } catch (IllegalStateException | NullPointerException unused3) {
                cstl.a("RCButtonsConverters");
                dbsgVar2 = dbpy.a;
            }
            g.k((cuqb) dbsgVar2.b());
            return dbsg.i(g.a());
        } else if (ordinal == 4) {
            HashMap hashMap4 = (HashMap) hashMap.get("HORIZONTAL_LINE");
            try {
                cupr c = cups.c();
                c.b(((Integer) hashMap4.get("LINE_COLOR")).intValue());
                c.c(((Float) hashMap4.get("LINE_WIDTH")).floatValue());
                dbsgVar3 = dbsg.i(c.a());
            } catch (Exception unused4) {
                cstl.a("HrzntlLineConverters");
                dbsgVar3 = dbpy.a;
            }
            g.i((cups) dbsgVar3.b());
            return dbsg.i(g.a());
        } else if (ordinal == 5) {
            HashMap hashMap5 = (HashMap) hashMap.get("HORIZONTAL_LAYOUT_BUTTONS");
            try {
                cupn b = cupq.b();
                b.b(cstr.c((ArrayList) hashMap5.get("VERTICAL_LAYOUT_BUTTON"), cuna.a));
                dbsgVar4 = dbsg.i(b.a());
            } catch (IllegalStateException | NullPointerException unused5) {
                cstl.a("HrzntlytBtnConverter");
                dbsgVar4 = dbpy.a;
            }
            g.h((cupq) dbsgVar4.b());
            return dbsg.i(g.a());
        } else if (ordinal == 6) {
            dbsg<cupu> i = cupu.i(new JSONObject((String) hashMap.get("IMAGE_ELEMENT")));
            if (i.a()) {
                g.j(i.b());
                return dbsg.i(g.a());
            }
            cstl.a("UiElementConverters");
            return dbpy.a;
        } else {
            String valueOf = String.valueOf(hashMap.get("TYPE"));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Unsupported UiElement type: ");
            sb.append(valueOf);
            sb.toString();
            cstl.a("UiElementConverters");
            return dbpy.a;
        }
        cstl.a("UiElementConverters");
        return dbpy.a;
    }
}
