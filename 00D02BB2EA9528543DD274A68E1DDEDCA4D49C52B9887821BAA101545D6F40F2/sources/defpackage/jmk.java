package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: jmk  reason: default package */
/* loaded from: classes7.dex */
public final class jmk extends cqqw {
    private final dcdc<cqqw> a;

    public jmk(cqqw... cqqwVarArr) {
        this.a = dcdc.t(cqqwVarArr);
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        dcdc<cqqw> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            dcdcVar.get(i2).QA(recyclerView, i);
        }
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        dcdc<cqqw> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            dcdcVar.get(i3).a(recyclerView, i, i2);
        }
    }
}
