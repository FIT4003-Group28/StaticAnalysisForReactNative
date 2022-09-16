package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: aixx  reason: default package */
/* loaded from: classes.dex */
public final class aixx implements afwf {
    private final SparseArray a = new SparseArray();

    @Override // defpackage.afwf
    public final /* bridge */ /* synthetic */ Object a() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.a.size(); i++) {
            arrayList.add(((aiyj) this.a.valueAt(i)).a());
        }
        return new aixy(arrayList);
    }

    public final aiyj b(int i) {
        aiyj aiyjVar = (aiyj) this.a.get(i);
        if (aiyjVar == null) {
            aiyj aiyjVar2 = new aiyj(i);
            this.a.put(i, aiyjVar2);
            return aiyjVar2;
        }
        return aiyjVar;
    }

    public final void c(int i, String str, int i2, int i3) {
        b(i).d(str, i2, i3);
    }
}
