package defpackage;
/* compiled from: PG */
/* renamed from: wwf  reason: default package */
/* loaded from: classes4.dex */
public final class wwf {
    public static void a(xdu xduVar, String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "[Control flow] ".concat(valueOf);
        }
        if (xduVar == null) {
            String valueOf2 = String.valueOf(str);
            afus.b(2, 1, valueOf2.length() != 0 ? "[Control flow] ".concat(valueOf2) : new String("[Control flow] "));
            return;
        }
        String b = vzx.b(xduVar);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 17 + String.valueOf(str).length());
        sb.append("[Control flow] ");
        sb.append(b);
        sb.append(": ");
        sb.append(str);
        afus.b(2, 1, sb.toString());
    }

    public static final void b(xdu xduVar, xci xciVar, String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "[Control flow] ".concat(valueOf);
        }
        if (xduVar == null) {
            String valueOf2 = String.valueOf(str);
            afus.b(2, 1, valueOf2.length() != 0 ? "[Control flow] ".concat(valueOf2) : new String("[Control flow] "));
            return;
        }
        String b = vzx.b(xduVar);
        StringBuilder sb = new StringBuilder(xciVar.b.name());
        sb.append(" ");
        vzx.c(sb, xciVar.d);
        vzx.c(sb, xciVar.e);
        vzx.c(sb, xciVar.f);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(b).length() + 19 + String.valueOf(sb2).length() + String.valueOf(str).length());
        sb3.append("[Control flow] ");
        sb3.append(b);
        sb3.append(", ");
        sb3.append(sb2);
        sb3.append(": ");
        sb3.append(str);
        afus.b(2, 1, sb3.toString());
    }

    public static final void c(String str) {
        a(null, str);
    }

    public static boolean d(Class cls, xdu xduVar) {
        wwb wwbVar = (wwb) cls.getAnnotation(wwb.class);
        if (wwbVar == null) {
            String valueOf = String.valueOf(xduVar);
            StringBuilder sb = new StringBuilder("null".length() + 33 + String.valueOf(valueOf).length());
            sb.append("Null values for FactoryHelper: ");
            sb.append("null");
            sb.append(", ");
            sb.append(valueOf);
            a(null, sb.toString());
            return false;
        } else if (wwbVar.b() != apcd.SLOT_TYPE_UNSPECIFIED && wwbVar.b() != xduVar.c()) {
            return false;
        } else {
            return xduVar.f(wwbVar.d());
        }
    }

    public static boolean e(Class cls, xdu xduVar, xci xciVar) {
        wwb wwbVar = (wwb) cls.getAnnotation(wwb.class);
        if (wwbVar == null || xciVar == null) {
            String valueOf = String.valueOf(wwbVar);
            String valueOf2 = String.valueOf(xduVar);
            String valueOf3 = String.valueOf(xciVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
            sb.append("Null values for FactoryHelper: ");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            sb.append(", ");
            sb.append(valueOf3);
            a(null, sb.toString());
            return false;
        } else if (wwbVar.b() != apcd.SLOT_TYPE_UNSPECIFIED && wwbVar.b() != xduVar.c()) {
            return false;
        } else {
            if ((wwbVar.a() == apcb.LAYOUT_TYPE_UNSPECIFIED || wwbVar.a() == xciVar.b) && xduVar.f(wwbVar.d())) {
                for (Class cls2 : wwbVar.c()) {
                    if (xciVar.f(cls2)) {
                    }
                }
                return true;
            }
            return false;
        }
    }
}
