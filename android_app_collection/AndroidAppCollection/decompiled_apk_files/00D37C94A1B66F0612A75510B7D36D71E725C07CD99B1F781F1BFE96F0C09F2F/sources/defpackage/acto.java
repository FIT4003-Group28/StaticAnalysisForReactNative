package defpackage;

import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acto  reason: default package */
/* loaded from: classes.dex */
public final class acto {
    public final acup a;
    private final String b;
    private final Set c = new HashSet();
    private final Set d = new HashSet();

    public acto(String str, acup acupVar) {
        this.b = str;
        this.a = acupVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        return String.format("INTERACTIONLOGGINGBUG->%s_MISSING_ATTACH", str);
    }

    private final void d(String str, awbs awbsVar, boolean z) {
        a(str);
        String i = actp.i(this.a);
        String str2 = this.b;
        String j = actp.j(awbsVar);
        String.valueOf(i).length();
        String.valueOf(str2).length();
        String.valueOf(j).length();
    }

    private final boolean e(orr orrVar) {
        return this.c.contains(i(orrVar));
    }

    private static final actn f(awbs awbsVar) {
        return new actn(awbsVar.d, awbsVar.f);
    }

    private static final boolean g(awbs awbsVar) {
        return awbsVar.c.d() > 0;
    }

    private static final orr h(awbs awbsVar) {
        try {
            return (orr) aopi.parseFrom(orr.a, awbsVar.c, aoos.b());
        } catch (aopx unused) {
            return orr.a;
        }
    }

    private static final String i(orr orrVar) {
        Object[] objArr = new Object[3];
        orq orqVar = orrVar.d;
        if (orqVar == null) {
            orqVar = orq.a;
        }
        objArr[0] = Long.valueOf(orqVar.b);
        orq orqVar2 = orrVar.d;
        if (orqVar2 == null) {
            orqVar2 = orq.a;
        }
        objArr[1] = Integer.valueOf(orqVar2.c);
        orq orqVar3 = orrVar.d;
        if (orqVar3 == null) {
            orqVar3 = orq.a;
        }
        objArr[2] = Integer.valueOf(orqVar3.d);
        return Integer.toString(Objects.hash(objArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(awbs awbsVar) {
        if (g(awbsVar)) {
            orr h = h(awbsVar);
            if ((h.b & 4) == 0) {
                return false;
            }
            if (e(h)) {
                String i = actp.i(this.a);
                String str = this.b;
                String j = actp.j(awbsVar);
                String.valueOf(i).length();
                String.valueOf(str).length();
                String.valueOf(j).length();
                return false;
            }
            this.c.add(i(h));
            return true;
        }
        this.d.add(f(awbsVar));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(awbs awbsVar, String str) {
        if (g(awbsVar)) {
            orr h = h(awbsVar);
            if ((h.b & 4) == 0) {
                return false;
            }
            if (e(h)) {
                return true;
            }
            d(str, awbsVar, true);
            return false;
        }
        if (this.d.contains(f(awbsVar))) {
            return true;
        }
        d(str, awbsVar, false);
        return false;
    }
}
