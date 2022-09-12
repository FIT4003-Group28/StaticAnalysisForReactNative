package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: debv  reason: default package */
/* loaded from: classes6.dex */
public final class debv implements Cloneable, Serializable {
    private static final long serialVersionUID = -8238943980617262692L;
    public String a;
    public String b;
    public String c;
    private final Charset d;
    private debx e;
    private String f;

    public debv() {
        this.d = debw.a;
    }

    public static debv a(String str) {
        debu a = debu.a(str);
        dbsk.s(a);
        debv e = debt.e(a.f);
        dbsk.s(a);
        dbsk.j(e.d.equals(a.f), "encoding mismatch; expected %s but was %s", e.d, a.f);
        String str2 = a.b;
        if (str2 != null) {
            e.a = str2;
        }
        String str3 = a.c;
        if (str3 != null) {
            e.b = str3;
        }
        String str4 = a.d;
        if (str4 != null) {
            e.c = str4;
        }
        if (!a.c().D()) {
            e.b().H(a.c());
        }
        String str5 = a.e;
        if (str5 != null) {
            e.f = str5;
        }
        return e;
    }

    public final debx b() {
        if (this.e == null) {
            this.e = new debx();
        }
        return this.e;
    }

    public final debu c() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        debx debxVar = this.e;
        String str4 = null;
        if (debxVar != null && !debxVar.D()) {
            str4 = debt.b(this.e, this.d);
        }
        return new debu(str, str2, str3, str4, this.f, this.d);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        debv debvVar = new debv();
        String str = this.a;
        if (str != null) {
            debvVar.a = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            debvVar.b = str2;
        }
        String str3 = this.c;
        if (str3 != null) {
            debvVar.c = str3;
        }
        String str4 = this.f;
        if (str4 != null) {
            debvVar.f = str4;
        }
        debx debxVar = this.e;
        if (debxVar != null) {
            debvVar.e = debxVar.clone();
        }
        return debvVar;
    }

    public final void d(String str, String str2) {
        b().n(str, str2);
    }

    public final void e(String str, String... strArr) {
        dbsk.s(str);
        b().e(str, Arrays.asList(strArr));
    }

    public final String toString() {
        return c().toString();
    }

    public debv(Charset charset) {
        dbsk.s(charset);
        this.d = charset;
    }
}
