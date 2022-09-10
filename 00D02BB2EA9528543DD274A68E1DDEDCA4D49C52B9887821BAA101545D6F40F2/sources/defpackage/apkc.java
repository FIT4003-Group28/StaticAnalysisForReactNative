package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: apkc  reason: default package */
/* loaded from: classes2.dex */
public final class apkc extends abx {
    private final dcdc<abx> a;

    public apkc(dcdc<abx> dcdcVar) {
        this.a = dcdcVar;
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        dcdc<abx> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            dcdcVar.get(i2).QA(recyclerView, i);
        }
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        dcdc<abx> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            dcdcVar.get(i3).a(recyclerView, i, i2);
        }
    }
}
