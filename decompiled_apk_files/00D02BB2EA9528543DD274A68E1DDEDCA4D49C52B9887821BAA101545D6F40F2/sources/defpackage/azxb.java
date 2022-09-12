package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: azxb  reason: default package */
/* loaded from: classes3.dex */
public abstract class azxb implements Serializable {
    public static azxb f(akqi akqiVar, @dzsi akqq akqqVar) {
        return new azvk(akqiVar, akqqVar, "", dpuk.UNKNOWN_KNOWLEDGE_ENTITY, "");
    }

    public static azxb g(String str, dpuk dpukVar) {
        dbsk.b(!str.isEmpty(), "MID cannot be empty for experience identifier");
        return new azvk(akqi.a, null, str, dpukVar, "");
    }

    private final boolean i(azxb azxbVar) {
        return akqi.d(a()) || akqi.d(azxbVar.a());
    }

    private final boolean k(azxb azxbVar) {
        return !c().isEmpty() || !azxbVar.c().isEmpty();
    }

    private final boolean l(azxb azxbVar) {
        return c().equals(azxbVar.c());
    }

    public abstract akqi a();

    @dzsi
    public abstract akqq b();

    public abstract String c();

    public abstract dpuk d();

    public abstract String e();

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof azxb) {
            azxb azxbVar = (azxb) obj;
            if (k(azxbVar)) {
                return l(azxbVar);
            }
            if (i(azxbVar)) {
                return j(a(), azxbVar.a());
            }
            return dbsd.a(b(), azxbVar.b());
        }
        return false;
    }

    public final boolean h(azxb azxbVar) {
        if (!k(azxbVar)) {
            if (!e().isEmpty() || !azxbVar.e().isEmpty()) {
                return e().equals(azxbVar.e());
            }
            if (i(azxbVar)) {
                return j(a(), azxbVar.a());
            }
            return akqq.v(b(), azxbVar.b(), 0.15d);
        }
        return l(azxbVar);
    }

    public final int hashCode() {
        if (!c().isEmpty()) {
            return Arrays.hashCode(new Object[]{c()});
        }
        if (akqi.d(a())) {
            return Arrays.hashCode(new Object[]{Long.valueOf(a().c)});
        }
        return Arrays.hashCode(new Object[]{b()});
    }

    private static boolean j(akqi akqiVar, akqi akqiVar2) {
        if (akqiVar.b == 0 || akqiVar2.b == 0) {
            return akqiVar.p(akqiVar2);
        }
        return akqiVar.equals(akqiVar2);
    }
}
