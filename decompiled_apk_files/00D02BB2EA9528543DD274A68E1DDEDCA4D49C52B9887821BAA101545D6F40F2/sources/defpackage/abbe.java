package defpackage;
/* compiled from: PG */
/* renamed from: abbe  reason: default package */
/* loaded from: classes2.dex */
public abstract class abbe {
    public static abbe g(diwb diwbVar) {
        dmni a;
        ditt dittVar = diwbVar.e;
        if (dittVar == null) {
            dittVar = ditt.n;
        }
        abav abavVar = new abav();
        String str = dittVar.c;
        if (str != null) {
            abavVar.a = str;
            String str2 = dittVar.b;
            if (str2 != null) {
                abavVar.b = str2;
                if ((diwbVar.a & 8) != 0) {
                    a = diwbVar.f;
                    if (a == null) {
                        a = dmni.f;
                    }
                } else {
                    a = aknz.a(dittVar.j);
                }
                if (!a.equals(dmni.f)) {
                    abavVar.c = a;
                }
                if ((diwbVar.a & 16) != 0) {
                    dmxh dmxhVar = diwbVar.g;
                    if (dmxhVar == null) {
                        dmxhVar = dmxh.j;
                    }
                    abavVar.d = dmxhVar;
                }
                if ((dittVar.a & 1024) != 0) {
                    dpum dpumVar = dittVar.l;
                    if (dpumVar == null) {
                        dpumVar = dpum.d;
                    }
                    abavVar.e = dpumVar;
                }
                if ((dittVar.a & 512) != 0) {
                    dpuq dpuqVar = dittVar.k;
                    if (dpuqVar == null) {
                        dpuqVar = dpuq.d;
                    }
                    abavVar.f = new akqs(dpuqVar);
                }
                String str3 = abavVar.a == null ? " mid" : "";
                if (abavVar.b == null) {
                    str3 = str3.concat(" ved");
                }
                if (str3.isEmpty()) {
                    return new abaw(abavVar.a, abavVar.b, abavVar.c, abavVar.d, abavVar.e, abavVar.f);
                }
                String valueOf = String.valueOf(str3);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            throw new NullPointerException("Null ved");
        }
        throw new NullPointerException("Null mid");
    }

    public abstract String a();

    public abstract String b();

    @dzsi
    public abstract dmni c();

    @dzsi
    public abstract dmxh d();

    @dzsi
    public abstract dpum e();

    @dzsi
    public abstract akqs f();
}
