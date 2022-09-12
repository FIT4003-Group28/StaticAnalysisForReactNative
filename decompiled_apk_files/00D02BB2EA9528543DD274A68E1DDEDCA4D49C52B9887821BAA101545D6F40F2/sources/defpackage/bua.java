package defpackage;

import java.security.MessageDigest;
/* compiled from: PG */
/* renamed from: bua  reason: default package */
/* loaded from: classes.dex */
public final class bua implements btw {
    private final aif<btz<?>, Object> b = new cjc();

    @Override // defpackage.btw
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            aif<btz<?>, Object> aifVar = this.b;
            if (i < aifVar.j) {
                btz<?> i2 = aifVar.i(i);
                Object j = this.b.j(i);
                bty<?> btyVar = i2.b;
                if (i2.d == null) {
                    i2.d = i2.c.getBytes(btw.a);
                }
                btyVar.a(i2.d, j, messageDigest);
                i++;
            } else {
                return;
            }
        }
    }

    public final void b(bua buaVar) {
        this.b.l(buaVar.b);
    }

    public final <T> T c(btz<T> btzVar) {
        return this.b.containsKey(btzVar) ? (T) this.b.get(btzVar) : btzVar.a;
    }

    public final <T> void d(btz<T> btzVar, T t) {
        this.b.put(btzVar, t);
    }

    @Override // defpackage.btw
    public final boolean equals(Object obj) {
        if (obj instanceof bua) {
            return this.b.equals(((bua) obj).b);
        }
        return false;
    }

    @Override // defpackage.btw
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("Options{values=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
