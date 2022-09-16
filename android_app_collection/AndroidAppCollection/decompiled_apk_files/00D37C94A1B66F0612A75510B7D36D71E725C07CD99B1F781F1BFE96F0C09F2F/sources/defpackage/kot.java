package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: kot  reason: default package */
/* loaded from: classes3.dex */
public final class kot implements nxc {
    public final koi a;
    public final Rect b = new Rect();

    public kot(koi koiVar, kok kokVar) {
        this.a = koiVar;
        kokVar.t().Z(new ayqb() { // from class: kos
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                kot kotVar = kot.this;
                Rect rect = (Rect) obj;
                if (kotVar.b.equals(rect)) {
                    return;
                }
                if (rect.left > 0 || rect.right > 0) {
                    koo kooVar = kotVar.a.b;
                    if (kooVar != null) {
                        kooVar.c = false;
                    }
                } else {
                    koo kooVar2 = kotVar.a.b;
                    if (kooVar2 != null) {
                        kooVar2.c = true;
                    }
                }
                kotVar.b.set(rect);
                kotVar.a.m();
            }
        });
    }

    @Override // defpackage.nxc
    public final Rect a(Rect rect) {
        Rect rect2 = new Rect(rect);
        rect2.left += this.b.left;
        rect2.right -= this.b.right;
        return this.a.a(rect2);
    }

    @Override // defpackage.nxc
    public final void i(nws nwsVar) {
        this.a.i(nwsVar);
    }

    @Override // defpackage.nxc
    public final void j(nws nwsVar) {
        this.a.j(nwsVar);
    }
}
