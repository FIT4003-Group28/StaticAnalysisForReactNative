package defpackage;
/* compiled from: PG */
/* renamed from: rmr  reason: default package */
/* loaded from: classes7.dex */
public final class rmr {
    public final gga a;
    public final dxio<axwy> b;
    public final sic c;
    public final bath d;
    public final batg e;

    public rmr(gga ggaVar, dxio<axwy> dxioVar, sic sicVar, bath bathVar, batg batgVar) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.c = sicVar;
        this.d = bathVar;
        this.e = batgVar;
    }

    @dzsi
    public static akqq a(qjn qjnVar, dndr dndrVar) {
        dndr dndrVar2 = dndr.UNKNOWN_ALIAS_TYPE;
        int ordinal = dndrVar.ordinal();
        if (ordinal == 1) {
            azva a = qjnVar.a();
            if (a == null) {
                return null;
            }
            return a.e;
        } else if (ordinal == 2) {
            azva b = qjnVar.b();
            if (b == null) {
                return null;
            }
            return b.e;
        } else if (ordinal == 5) {
            azxa e = qjnVar.e();
            if (e == null) {
                return null;
            }
            return e.d();
        } else if (ordinal == 6) {
            azxa f = qjnVar.f();
            if (f == null) {
                return null;
            }
            return f.d();
        } else {
            String valueOf = String.valueOf(dndrVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Unexpected alias type: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }
}
