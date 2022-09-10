package defpackage;

import android.app.Activity;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: aehu  reason: default package */
/* loaded from: classes2.dex */
public class aehu {
    public static final eatp a = eato.b("yyyy-MM-dd").a(Locale.US);
    public static final eaou b = eaou.b;
    public final eapg c;
    public final eapg d;
    public final long e;
    public final long f;

    public aehu(eapg eapgVar, eapg eapgVar2) {
        this.c = eapgVar;
        this.d = eapgVar2;
        eaou eaouVar = b;
        this.e = eapgVar.m(eaouVar).a;
        this.f = eapgVar2.m(eaouVar).s().a;
    }

    public static String c(Activity activity, long j, long j2, boolean z) {
        return DateUtils.formatDateRange(activity, new Formatter(new StringBuilder(50), Locale.getDefault()), j, j2, true != z ? 65560 : 524312, b.d).toString();
    }

    public static eapg d(cqat cqatVar) {
        return bmdv.g(cqatVar.b(), null).q(1);
    }

    public static eapg e(cqat cqatVar) {
        return bmdv.g(cqatVar.b(), null).p(330);
    }

    public static eapg f(eapg eapgVar) {
        return eapgVar.p(30);
    }

    public static eapg g(eapg eapgVar) {
        return eapgVar.p(1);
    }

    public static eapg h(String str) {
        try {
            return a.j(str);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }

    public final aehu a(eapg eapgVar) {
        return new aehu(eapgVar, eapgVar.p(decl.h(eaov.c(eapgVar, this.d).p, 1, 30)));
    }

    public final String b(Activity activity) {
        return c(activity, this.e, this.f, false);
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aehu)) {
            return false;
        }
        aehu aehuVar = (aehu) obj;
        return aehuVar.c.equals(this.c) && aehuVar.d.equals(this.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c.toString(), this.d.toString()});
    }
}
