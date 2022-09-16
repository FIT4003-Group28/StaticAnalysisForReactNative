package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: amye  reason: default package */
/* loaded from: classes.dex */
final class amye implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;
    final int[] b;

    public amye(amxj amxjVar) {
        amvg amvgVar = (amvg) amxjVar;
        int size = amvgVar.j().size();
        this.a = new Object[size];
        this.b = new int[size];
        int i = 0;
        for (amxk amxkVar : amvgVar.j()) {
            this.a[i] = amxkVar.a;
            this.b[i] = amxkVar.a();
            i++;
        }
    }

    Object readResolve() {
        amvd amvdVar = new amvd(this.a.length);
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i < objArr.length) {
                amvdVar.b(objArr[i], this.b[i]);
                i++;
            } else {
                return amvdVar.a();
            }
        }
    }
}
