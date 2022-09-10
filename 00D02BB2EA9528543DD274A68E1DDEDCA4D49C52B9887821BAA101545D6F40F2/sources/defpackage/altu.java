package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: altu  reason: default package */
/* loaded from: classes.dex */
public class altu {
    public static final akqh a = new akqh(0, 0);
    public final dcdc<akqh> b;
    public final String c;
    public final altv d;
    private final String e;
    private final int f;
    @dzsi
    private final aksj g;

    public altu(akqh akqhVar, dcdc<akqh> dcdcVar, String str, String str2, int i, int i2, @dzsi aksj aksjVar) {
        this.b = dcdcVar;
        this.e = str;
        this.c = str2;
        this.f = i;
        this.d = new altv(akqhVar, i2);
        this.g = aksjVar;
    }

    @dzsi
    public static altu a(dmjk dmjkVar) {
        String str;
        aksj aksjVar;
        akqh a2 = akqh.a(dmjkVar.b);
        if (a2 == null) {
            String str2 = dmjkVar.b;
            return null;
        }
        int size = dmjkVar.c.size();
        dccx G = dcdc.G(size);
        for (int i = 0; i < size; i++) {
            akqh a3 = akqh.a(dmjkVar.c.get(i));
            if (a3 != null) {
                G.g(a3);
            } else {
                dmjkVar.c.get(i);
            }
        }
        dcdc f = G.f();
        int i2 = dmjkVar.a;
        String str3 = (i2 & 2) != 0 ? dmjkVar.d : dmjkVar.e;
        if ((i2 & 4) != 0) {
            str = dmjkVar.e;
        } else {
            str = dmjkVar.d;
        }
        int i3 = dmjkVar.f;
        int i4 = (i2 & 16) != 0 ? dmjkVar.g : Integer.MIN_VALUE;
        if ((i2 & 32) != 0) {
            dgrt dgrtVar = dmjkVar.h;
            if (dgrtVar == null) {
                dgrtVar = dgrt.d;
            }
            dgrn dgrnVar = dgrtVar.b;
            if (dgrnVar == null) {
                dgrnVar = dgrn.d;
            }
            int i5 = dgrnVar.b;
            dgrn dgrnVar2 = dgrtVar.b;
            if (dgrnVar2 == null) {
                dgrnVar2 = dgrn.d;
            }
            akra b = akra.b(i5, dgrnVar2.c);
            dgrn dgrnVar3 = dgrtVar.c;
            if (dgrnVar3 == null) {
                dgrnVar3 = dgrn.d;
            }
            int i6 = dgrnVar3.b;
            dgrn dgrnVar4 = dgrtVar.c;
            if (dgrnVar4 == null) {
                dgrnVar4 = dgrn.d;
            }
            akra b2 = akra.b(i6, dgrnVar4.c);
            int i7 = b.a;
            int i8 = b2.a;
            if (i7 > i8) {
                b2.a = i8 + 1073741824;
            }
            aksjVar = aksj.c(new akrp(b, b2));
        } else {
            aksjVar = null;
        }
        return new altu(a2, f, str3, str, i3, i4, aksjVar);
    }

    public final akqh b() {
        return this.d.a;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof altu)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        altu altuVar = (altu) obj;
        return dchl.m(this.b, altuVar.b) && this.e.equals(altuVar.e) && this.c.equals(altuVar.c) && this.f == altuVar.f && this.d.equals(altuVar.d) && dbsd.a(this.g, altuVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.e, this.c, Integer.valueOf(this.f), this.d, this.g});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
        sb.append("[Level: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
