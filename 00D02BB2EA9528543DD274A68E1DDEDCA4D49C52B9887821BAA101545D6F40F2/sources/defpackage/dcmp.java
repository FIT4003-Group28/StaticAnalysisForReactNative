package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dcmp  reason: default package */
/* loaded from: classes5.dex */
final class dcmp implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;
    final int[] b;

    public dcmp(dclb<?> dclbVar) {
        dcei dceiVar = (dcei) dclbVar;
        int size = dceiVar.l().size();
        this.a = new Object[size];
        this.b = new int[size];
        int i = 0;
        for (dcla dclaVar : dceiVar.l()) {
            this.a[i] = dclaVar.a();
            this.b[i] = dclaVar.b();
            i++;
        }
    }

    Object readResolve() {
        dcef dcefVar = new dcef(this.a.length);
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i < objArr.length) {
                dcefVar.f(objArr[i], this.b[i]);
                i++;
            } else {
                return dcefVar.a();
            }
        }
    }
}
