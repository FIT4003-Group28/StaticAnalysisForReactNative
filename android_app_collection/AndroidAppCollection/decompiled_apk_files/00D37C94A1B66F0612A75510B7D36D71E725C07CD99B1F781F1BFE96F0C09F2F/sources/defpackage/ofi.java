package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: ofi  reason: default package */
/* loaded from: classes3.dex */
final class ofi implements nxd {
    public final int a;
    public final ezr b = new ezr();
    public nxe c;

    public ofi(int i) {
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(nxe nxeVar) {
        Rect v = nxeVar.v();
        int width = v.width();
        int height = v.height();
        if (width <= 0 || height <= 0) {
            return;
        }
        ezr ezrVar = this.b;
        int width2 = v.width();
        int height2 = v.height();
        boolean z = true;
        if (this.a != 1) {
            z = false;
        }
        ezrVar.a(width2, height2, z);
    }

    @Override // defpackage.nxd
    public final void ph(nxe nxeVar) {
        b(nxeVar);
    }
}
