package defpackage;

import java.security.MessageDigest;
/* compiled from: PG */
/* renamed from: cic  reason: default package */
/* loaded from: classes2.dex */
public final class cic implements chy {
    private final afw b = new cut();

    @Override // defpackage.chy
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            afw afwVar = this.b;
            if (i < afwVar.j) {
                cib cibVar = (cib) afwVar.f(i);
                Object i2 = this.b.i(i);
                cia ciaVar = cibVar.b;
                if (cibVar.d == null) {
                    cibVar.d = cibVar.c.getBytes(chy.a);
                }
                ciaVar.a(cibVar.d, i2, messageDigest);
                i++;
            } else {
                return;
            }
        }
    }

    public final Object b(cib cibVar) {
        return this.b.containsKey(cibVar) ? this.b.get(cibVar) : cibVar.a;
    }

    public final void c(cic cicVar) {
        this.b.k(cicVar.b);
    }

    public final void d(cib cibVar, Object obj) {
        this.b.put(cibVar, obj);
    }

    @Override // defpackage.chy
    public final boolean equals(Object obj) {
        if (obj instanceof cic) {
            return this.b.equals(((cic) obj).b);
        }
        return false;
    }

    @Override // defpackage.chy
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
