package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
/* compiled from: PG */
/* renamed from: actp  reason: default package */
/* loaded from: classes.dex */
public final class actp {
    private static final Random d = new Random();
    public final Map a;
    public final boolean b;
    public final Set c;
    private final aadd e;

    public actp(SharedPreferences sharedPreferences, yve yveVar, acrr acrrVar, aadd aaddVar) {
        sharedPreferences.getClass();
        yveVar.getClass();
        acrrVar.getClass();
        this.a = new HashMap();
        this.e = aaddVar;
        this.b = false;
        this.c = new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(awbs awbsVar) {
        orr orrVar;
        if (awbsVar == null) {
            return 0;
        }
        if (awbsVar.c.d() <= 0) {
            return awbsVar.d;
        }
        try {
            orrVar = (orr) aopi.parseFrom(orr.a, awbsVar.c, aoos.b());
        } catch (aopx unused) {
            zep.b("Failed to parse tracking params");
            orrVar = orr.a;
        }
        return orrVar.c;
    }

    static String g(int i, int i2) {
        StringBuilder sb = new StringBuilder(28);
        sb.append("VE (");
        sb.append(i);
        sb.append(":");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String i(acup acupVar) {
        return g(acupVar.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String j(awbs awbsVar) {
        if (awbsVar == null) {
            return null;
        }
        return g(a(awbsVar), awbsVar.f);
    }

    public static void l(String str, String str2) {
        ampm.b(" ").e(str, str2, "\nSee go/yt-il-debug-mode on how to address this issue.");
    }

    private static final String n(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(j((awbs) it.next()));
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(awbs awbsVar, awbs awbsVar2, String str) {
        if (f()) {
            return;
        }
        List<awbs> asList = Arrays.asList(awbsVar);
        HashMap hashMap = new HashMap();
        hashMap.put("client.params.parentVe", j(awbsVar2));
        hashMap.put("client.params.childVe", n(asList));
        if (TextUtils.isEmpty(str)) {
            String j = j(awbsVar2);
            String n = n(asList);
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 22 + String.valueOf(n).length());
            sb.append("parent_ve: ");
            sb.append(j);
            sb.append("child_ves: ");
            sb.append(n);
            l("INTERACTIONLOGGINGBUG->ATTACH_CHILD_MISSING_CSN", sb.toString());
            afus.f("INTERACTIONLOGGINGBUG->ATTACH_CHILD_MISSING_CSN", hashMap);
        } else if (!this.a.containsKey(str)) {
            String j2 = j(awbsVar2);
            String n2 = n(asList);
            StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 22 + String.valueOf(n2).length());
            sb2.append("parent_ve: ");
            sb2.append(j2);
            sb2.append("child_ves: ");
            sb2.append(n2);
            l("INTERACTIONLOGGINGBUG->ATTACH_CHILD_UNRESOLVED_CSN", sb2.toString());
            afus.f("INTERACTIONLOGGINGBUG->ATTACH_CHILD_UNRESOLVED_CSN", hashMap);
        } else {
            acto actoVar = (acto) this.a.get(str);
            hashMap.put("client.params.pageVe", i(actoVar.a));
            if (!actoVar.c(awbsVar2, "PARENT_VE_IN_ATTACH")) {
                afus.f(acto.a("PARENT_VE_IN_ATTACH"), hashMap);
                return;
            }
            for (awbs awbsVar3 : asList) {
                if (!((acto) this.a.get(str)).b(awbsVar3)) {
                    afus.f("INTERACTIONLOGGINGBUG->MULTIPLE_ATTACH", hashMap);
                    acup acupVar = actoVar.a;
                    a(awbsVar3);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(asij asijVar) {
        if (f()) {
            return;
        }
        int i = asijVar.f;
        HashMap hashMap = new HashMap();
        awbs awbsVar = asijVar.d;
        if (awbsVar == null) {
            awbsVar = awbs.a;
        }
        hashMap.put("client.params.ve", j(awbsVar));
        if ((asijVar.b & 1) == 0 || asijVar.c.isEmpty()) {
            awbs awbsVar2 = asijVar.d;
            if (awbsVar2 == null) {
                awbsVar2 = awbs.a;
            }
            String valueOf = String.valueOf(j(awbsVar2));
            l("INTERACTIONLOGGINGBUG->HIDE_MISSING_CSN", valueOf.length() != 0 ? "ve: ".concat(valueOf) : new String("ve: "));
            afus.f("INTERACTIONLOGGINGBUG->HIDE_MISSING_CSN", hashMap);
        } else if (!this.a.containsKey(asijVar.c)) {
            awbs awbsVar3 = asijVar.d;
            if (awbsVar3 == null) {
                awbsVar3 = awbs.a;
            }
            String valueOf2 = String.valueOf(j(awbsVar3));
            l("INTERACTIONLOGGINGBUG->HIDE_UNRESOLVED_CSN", valueOf2.length() != 0 ? "ve: ".concat(valueOf2) : new String("ve: "));
            afus.f("INTERACTIONLOGGINGBUG->HIDE_UNRESOLVED_CSN", hashMap);
        } else {
            acto actoVar = (acto) this.a.get(asijVar.c);
            awbs awbsVar4 = asijVar.d;
            if (awbsVar4 == null) {
                awbsVar4 = awbs.a;
            }
            m("HIDDEN", actoVar, awbsVar4, hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(asik asikVar) {
        if (f()) {
            return;
        }
        int i = asikVar.f;
        HashMap hashMap = new HashMap();
        awbs awbsVar = asikVar.d;
        if (awbsVar == null) {
            awbsVar = awbs.a;
        }
        hashMap.put("client.params.ve", j(awbsVar));
        if ((asikVar.b & 1) == 0 || asikVar.c.isEmpty()) {
            awbs awbsVar2 = asikVar.d;
            if (awbsVar2 == null) {
                awbsVar2 = awbs.a;
            }
            String valueOf = String.valueOf(j(awbsVar2));
            l("INTERACTIONLOGGINGBUG->SHOW_MISSING_CSN", valueOf.length() != 0 ? "ve: ".concat(valueOf) : new String("ve: "));
            afus.f("INTERACTIONLOGGINGBUG->SHOW_MISSING_CSN", hashMap);
        } else if (!this.a.containsKey(asikVar.c)) {
            awbs awbsVar3 = asikVar.d;
            if (awbsVar3 == null) {
                awbsVar3 = awbs.a;
            }
            String valueOf2 = String.valueOf(j(awbsVar3));
            l("INTERACTIONLOGGINGBUG->SHOW_UNRESOLVED_CSN", valueOf2.length() != 0 ? "ve: ".concat(valueOf2) : new String("ve: "));
            afus.f("INTERACTIONLOGGINGBUG->SHOW_UNRESOLVED_CSN", hashMap);
        } else {
            acto actoVar = (acto) this.a.get(asikVar.c);
            awbs awbsVar4 = asikVar.d;
            if (awbsVar4 == null) {
                awbsVar4 = awbs.a;
            }
            m("SHOWN", actoVar, awbsVar4, hashMap);
        }
    }

    public final boolean e(asif asifVar) {
        return (asifVar.b & 2) != 0 && !asifVar.d.isEmpty();
    }

    public final boolean f() {
        float nextFloat = d.nextFloat() * 100.0f;
        asvx asvxVar = this.e.a().m;
        if (asvxVar == null) {
            asvxVar = asvx.a;
        }
        aski askiVar = asvxVar.c;
        if (askiVar == null) {
            askiVar = aski.a;
        }
        return nextFloat >= askiVar.j;
    }

    public final boolean h(String str, acto actoVar, awbs awbsVar) {
        if (!actoVar.c(awbsVar, str)) {
            acup acupVar = actoVar.a;
            a(awbsVar);
            return true;
        }
        return false;
    }

    public final void k(String str, acup acupVar, awbs awbsVar) {
        String g = g(acupVar.a, 0);
        String j = j(awbsVar);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 15 + String.valueOf(g).length() + String.valueOf(j).length());
        sb.append(str);
        sb.append(" page_ve: ");
        sb.append(g);
        sb.append(" ve: ");
        sb.append(j);
    }

    public final void m(String str, acto actoVar, awbs awbsVar, Map map) {
        if (h(str, actoVar, awbsVar)) {
            String a = acto.a(str);
            k(acto.a(str), actoVar.a, awbsVar);
            afus.f(a, map);
        }
    }
}
