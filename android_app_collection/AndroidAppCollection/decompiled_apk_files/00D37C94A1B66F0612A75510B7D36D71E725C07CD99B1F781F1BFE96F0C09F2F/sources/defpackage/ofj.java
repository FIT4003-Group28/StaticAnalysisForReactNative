package defpackage;

import android.content.Context;
import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: ofj  reason: default package */
/* loaded from: classes3.dex */
public final class ofj implements ezs {
    public final SparseArray b = new SparseArray();

    public ofj(Context context, nxe nxeVar, nxe nxeVar2, nxe nxeVar3) {
        int l = zew.l(context);
        int j = zew.j(context);
        b(0, 2, nxeVar, l, j);
        b(1, 1, nxeVar2, l, j);
        b(2, 3, nxeVar3, l, j);
    }

    private final void b(int i, int i2, nxe nxeVar, int i3, int i4) {
        ofi ofiVar = new ofi(i2);
        nxeVar.z(i3, i4);
        ofiVar.b(nxeVar);
        this.b.put(i, ofiVar);
    }

    @Override // defpackage.ezs
    public final ezr a(int i) {
        return ((ofi) this.b.get(i)).b;
    }
}
