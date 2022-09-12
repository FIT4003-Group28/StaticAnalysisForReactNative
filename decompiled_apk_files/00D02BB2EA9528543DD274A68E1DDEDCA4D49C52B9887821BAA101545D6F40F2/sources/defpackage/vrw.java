package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: vrw  reason: default package */
/* loaded from: classes7.dex */
public final class vrw {
    public final hwe a;
    public final dxio<akzh> b;
    public final gll c;
    private final akox d;

    public vrw(akox akoxVar, hwe hweVar, dxio<akzh> dxioVar, gll gllVar) {
        this.d = akoxVar;
        this.a = hweVar;
        this.b = dxioVar;
        this.c = gllVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(vuw vuwVar, akrs akrsVar) {
        int i;
        int i2;
        View af = this.d.af();
        if (af.getWidth() > vuwVar.a + vuwVar.b) {
            int height = af.getHeight();
            int i3 = vuwVar.c;
            int i4 = vuwVar.d;
            if (height <= i3 + i4 || (i = vuwVar.a) < 0 || (i2 = vuwVar.b) < 0 || i3 < 0 || i4 < 0) {
                return false;
            }
            b(akyt.f(akrsVar, i, i2, i3, i4));
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(akyc akycVar) {
        this.d.p(akycVar);
    }
}
