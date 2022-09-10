package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ctjh  reason: default package */
/* loaded from: classes5.dex */
public final class ctjh {
    public static HashMap<String, Object> a(ctzl ctzlVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        h(ctzlVar, hashMap);
        ctzd ctzdVar = ctzd.UNKNOWN;
        switch (ctzlVar.f().ordinal()) {
            case 1:
                hashMap.put("ACTION_PAYLOAD", e(ctzlVar.g().b()));
                break;
            case 2:
                hashMap.put("ACTION_PAYLOAD", e(ctzlVar.g().c()));
                break;
            case 3:
                hashMap.put("ACTION_PAYLOAD", ctzlVar.g().d());
                break;
            case 4:
                hashMap.put("ACTION_PAYLOAD", ctzlVar.g().e());
                break;
            case 5:
                hashMap.put("ACTION_TYPE", Integer.valueOf(ctzd.COMPOSED_OVERLAY_ACTION.l));
                ctzh c = ctzi.c();
                c.b(ctzlVar.g().g());
                hashMap.put("ACTION_PAYLOAD", f(c.a()));
                break;
            case 7:
                hashMap.put("ACTION_PAYLOAD", ctzlVar.g().h());
                break;
            case 8:
                hashMap.put("ACTION_PAYLOAD", ctzlVar.g().i());
                break;
            case 9:
                hashMap.put("ACTION_PAYLOAD", f(ctzlVar.g().f()));
                break;
            case 10:
                cuif j = ctzlVar.g().j();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("URL", j.a());
                hashMap2.put("REPLACEMENTS", cstr.b(j.b(), ctix.a));
                hashMap.put("ACTION_PAYLOAD", hashMap2);
                break;
        }
        if (ctzlVar.h().ordinal() == 8) {
            hashMap.put("EVENT_CALLBACK_FAILURE_ACTION_PAYLOAD", ctzlVar.i().i());
        }
        return hashMap;
    }

    public static dbsg<ctzl> b(HashMap<String, Object> hashMap) {
        try {
            ctze j = ctzl.j();
            i(j, hashMap);
            ctzd b = ctzd.b(((Integer) hashMap.get("ACTION_TYPE")).intValue());
            switch (b.ordinal()) {
                case 1:
                    dbsg b2 = cstn.b(csto.h(hashMap.get("ACTION_PAYLOAD")), ctiy.a);
                    if (b2.a()) {
                        j.l((ctzk) b2.b());
                        break;
                    }
                    break;
                case 2:
                    dbsg b3 = cstn.b(csto.h(hashMap.get("ACTION_PAYLOAD")), ctiz.a);
                    if (b3.a()) {
                        j.k((ctzk) b3.b());
                        break;
                    }
                    break;
                case 3:
                    j.e((String) hashMap.get("ACTION_PAYLOAD"));
                    break;
                case 4:
                    j.p((String) hashMap.get("ACTION_PAYLOAD"));
                    break;
                case 5:
                    dbsg b4 = cstn.b(csto.h(hashMap.get("ACTION_PAYLOAD")), ctja.a);
                    if (b4.a()) {
                        ctzh c = ctzi.c();
                        c.b((cugq) b4.b());
                        j.q(c.a());
                        break;
                    } else {
                        return dbpy.a;
                    }
                case 6:
                    j.s();
                    break;
                case 7:
                    j.d((String) hashMap.get("ACTION_PAYLOAD"));
                    break;
                case 8:
                    j.m((String) hashMap.get("ACTION_PAYLOAD"));
                    break;
                case 9:
                    dbsg b5 = cstn.b(csto.h(hashMap.get("ACTION_PAYLOAD")), ctjb.a);
                    if (b5.a()) {
                        j.q((ctzi) b5.b());
                        break;
                    } else {
                        return dbpy.a;
                    }
                case 10:
                    dbsg b6 = cstn.b(csto.h(hashMap.get("ACTION_PAYLOAD")), ctjc.a);
                    if (!b6.a()) {
                        cstl.a("ActionConv");
                        return dbpy.a;
                    }
                    j.o((cuif) b6.b());
                    break;
                default:
                    String valueOf = String.valueOf(b);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                    sb.append("encountered unknown action type: ");
                    sb.append(valueOf);
                    sb.toString();
                    cstl.a("ActionConv");
                    return dbpy.a;
            }
            if (hashMap.containsKey("EVENT_CALLBACK_FAILURE_ACTION_TYPE") && ctzd.b(((Integer) hashMap.get("EVENT_CALLBACK_FAILURE_ACTION_TYPE")).intValue()).ordinal() == 8) {
                j.h((String) hashMap.get("EVENT_CALLBACK_FAILURE_ACTION_PAYLOAD"));
            }
            return dbsg.i(j.a());
        } catch (IllegalStateException | NullPointerException unused) {
            cstl.a("ActionConv");
            return dbpy.a;
        }
    }

    public static dbsg<cugq> c(HashMap<String, Object> hashMap) {
        try {
            cugp k = cugq.k();
            k.k(((Integer) hashMap.get("time_to_live_sec")).intValue());
            k.j(((Integer) hashMap.get("OVERLAY_STYLE")).intValue());
            if (hashMap.containsKey("dismiss_action")) {
                dbsg<HashMap<String, Object>> h = csto.h(hashMap.get("dismiss_action"));
                ctzl ctzlVar = null;
                if (!h.a()) {
                    cstl.a("ActionConv");
                } else {
                    HashMap<String, Object> b = h.b();
                    if (!ctzd.b(((Integer) b.get("ACTION_TYPE")).intValue()).equals(ctzd.NO_OP_ACTION)) {
                        cstl.a("ActionConv");
                    } else {
                        ctze j = ctzl.j();
                        i(j, b);
                        j.s();
                        ctzlVar = j.a();
                    }
                }
                if (ctzlVar == null) {
                    return dbpy.a;
                }
                k.b(ctzlVar);
            }
            if (hashMap.containsKey("display_icon")) {
                k.d((dspd) hashMap.get("display_icon"));
            }
            if (hashMap.containsKey("display_text")) {
                k.e((String) hashMap.get("display_text"));
            }
            if (hashMap.containsKey("overlay_expire_time")) {
                k.f(((Integer) hashMap.get("overlay_expire_time")).intValue());
            }
            if (hashMap.containsKey("overlay_lighter_icon")) {
                dbsg<cugd> b2 = ctkb.b((HashMap) hashMap.get("overlay_lighter_icon"));
                if (b2.a()) {
                    k.i(b2.b());
                } else {
                    return dbpy.a;
                }
            }
            if (hashMap.containsKey("hide_snippet_in_conversation_list")) {
                k.h(((Boolean) hashMap.get("hide_snippet_in_conversation_list")).booleanValue());
            }
            if (hashMap.containsKey("hide_dismiss_button")) {
                k.g(((Boolean) hashMap.get("hide_snippet_in_conversation_list")).booleanValue());
            }
            if (hashMap.containsKey("dismissible_by_tapping_outside")) {
                k.c(((Boolean) hashMap.get("hide_snippet_in_conversation_list")).booleanValue());
            }
            return dbsg.i(k.a());
        } catch (IllegalStateException | NullPointerException unused) {
            cstl.a("ActionConv");
            return dbpy.a;
        }
    }

    public static dbsg<ctzk> d(HashMap<String, Object> hashMap) {
        try {
            ctzj c = ctzk.c();
            c.c((String) hashMap.get("TEXT"));
            c.b((String) hashMap.get("MESSAGE_CALLBACK_PAYLOAD"));
            return dbsg.i(c.a());
        } catch (IllegalStateException | NullPointerException unused) {
            cstl.a("ActionConv");
            return dbpy.a;
        }
    }

    private static HashMap<String, Object> e(ctzk ctzkVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("TEXT", ctzkVar.a());
        hashMap.put("MESSAGE_CALLBACK_PAYLOAD", ctzkVar.b());
        return hashMap;
    }

    private static Map<String, Object> f(ctzi ctziVar) {
        HashMap hashMap = new HashMap();
        if (ctziVar.a().a()) {
            hashMap.put("REACTION_OVERLAY_HEADER", g(ctziVar.a().b()));
        }
        if (ctziVar.b().a()) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("URL", ctziVar.b().b().b());
            hashMap2.put("WEB_VIEW_HEADER", g(ctziVar.b().b().a()));
            hashMap.put("STACKED_REACTION_WEB_VIEW", hashMap2);
        }
        return hashMap;
    }

    private static HashMap<String, Object> g(cugq cugqVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (cugqVar.a().a()) {
            if (cugqVar.a().b().f().equals(ctzd.NO_OP_ACTION)) {
                HashMap hashMap2 = new HashMap();
                h(cugqVar.a().b(), hashMap2);
                hashMap.put("dismiss_action", hashMap2);
            } else {
                cstl.a("ActionConv");
                return hashMap;
            }
        }
        hashMap.put("time_to_live_sec", Integer.valueOf(cugqVar.e()));
        hashMap.put("OVERLAY_STYLE", Integer.valueOf(cugqVar.j()));
        if (cugqVar.b().a()) {
            hashMap.put("display_icon", cugqVar.b().b());
        }
        if (cugqVar.d().a()) {
            hashMap.put("display_text", cugqVar.d().b());
        }
        if (cugqVar.c().a()) {
            hashMap.put("overlay_lighter_icon", ctkb.a(cugqVar.c().b()));
        }
        if (cugqVar.i().a()) {
            hashMap.put("overlay_expire_time", cugqVar.i().b());
        }
        hashMap.put("hide_dismiss_button", Boolean.valueOf(cugqVar.g()));
        hashMap.put("hide_snippet_in_conversation_list", Boolean.valueOf(cugqVar.f()));
        hashMap.put("dismissible_by_tapping_outside", Boolean.valueOf(cugqVar.h()));
        return hashMap;
    }

    private static void h(ctzl ctzlVar, HashMap<String, Object> hashMap) {
        hashMap.put("ACTION_TYPE", Integer.valueOf(ctzlVar.f().l));
        hashMap.put("EVENT_CALLBACK_FAILURE_ACTION_TYPE", Integer.valueOf(ctzlVar.h().l));
        hashMap.put("ACTION_TRIGGERED_LOG_ID", Long.valueOf(ctzlVar.e()));
        if (ctzlVar.c().a()) {
            hashMap.put("EVENT_CALLBACK_PAYLOAD", ctzlVar.c().b());
        }
        if (ctzlVar.d().a()) {
            ctzf b = ctzlVar.d().b();
            HashMap hashMap2 = new HashMap();
            int c = b.c();
            int i = c - 1;
            if (c == 0) {
                throw null;
            }
            if (i == 1) {
                int c2 = b.c();
                int i2 = c2 - 1;
                if (c2 == 0) {
                    throw null;
                }
                hashMap2.put("EVENT_CALLBACK_DESTINATION_TYPE", Integer.valueOf(i2));
                hashMap2.put("EVENT_CALLBACK_DESTINATION", ctju.a(b.a()));
            } else if (i == 2) {
                int c3 = b.c();
                int i3 = c3 - 1;
                if (c3 == 0) {
                    throw null;
                }
                hashMap2.put("EVENT_CALLBACK_DESTINATION_TYPE", Integer.valueOf(i3));
                hashMap2.put("EVENT_CALLBACK_DESTINATION", ctka.a(b.b()));
            }
            hashMap.put("EVENT_CALLBACK_DESTINATION", hashMap2);
        }
        if (ctzlVar.a().a()) {
            hashMap.put("TRACE_ID", ctzlVar.a().b());
        }
        if (ctzlVar.b().a()) {
            hashMap.put("MESSAGE_ID", ctzlVar.b().b());
        }
    }

    private static void i(ctze ctzeVar, HashMap<String, Object> hashMap) {
        if (!hashMap.containsKey("ACTION_TRIGGERED_LOG_ID")) {
            cstl.a("ActionConv");
            ctzeVar.c(0L);
        }
        ctzeVar.c(((Long) hashMap.get("ACTION_TRIGGERED_LOG_ID")).longValue());
        if (hashMap.containsKey("EVENT_CALLBACK_PAYLOAD")) {
            ctzeVar.i((String) hashMap.get("EVENT_CALLBACK_PAYLOAD"));
        }
        if (hashMap.containsKey("TRACE_ID")) {
            ctzeVar.n((String) hashMap.get("TRACE_ID"));
        }
        if (hashMap.containsKey("MESSAGE_ID")) {
            ctzeVar.j((String) hashMap.get("MESSAGE_ID"));
        }
        if (hashMap.containsKey("EVENT_CALLBACK_DESTINATION")) {
            dbsg b = cstn.b(csto.h(hashMap.get("EVENT_CALLBACK_DESTINATION")), ctje.a);
            if (!b.a()) {
                return;
            }
            ctzeVar.f((ctzf) b.b());
        }
    }
}
