package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: alts  reason: default package */
/* loaded from: classes.dex */
public class alts {
    public final akqh a;
    public final dcdc<altu> b;
    public final boolean c;
    @dzsi
    public final akqp d;
    private final int e;

    public alts(akqh akqhVar, dcdc<altu> dcdcVar, int i, boolean z, @dzsi akqp akqpVar) {
        this.a = akqhVar;
        this.b = dcdcVar;
        this.e = i;
        this.c = z;
        this.d = akqpVar;
    }

    public final int a(akqh akqhVar) {
        for (int i = 0; i < this.b.size(); i++) {
            if (akqhVar.equals(this.b.get(i).b())) {
                return i;
            }
        }
        return -1;
    }

    @dzsi
    public final altu b(int i) {
        if (i < 0 || i >= this.b.size()) {
            return null;
        }
        return this.b.get(i);
    }

    @dzsi
    public final altu c() {
        return b(this.e);
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof alts)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        alts altsVar = (alts) obj;
        return dbsd.a(this.d, altsVar.d) && dbsd.a(this.b, altsVar.b) && dbsd.a(this.a, altsVar.a) && this.e == altsVar.e && this.c == altsVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.b, Integer.valueOf(this.e), this.a, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("[Building: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
