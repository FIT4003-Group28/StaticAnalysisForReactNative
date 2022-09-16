package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
/* compiled from: PG */
/* renamed from: tmz  reason: default package */
/* loaded from: classes4.dex */
public final class tmz {
    final /* synthetic */ tna a;
    private int b = -1;

    public tmz(tna tnaVar) {
        this.a = tnaVar;
    }

    public final void a(tmb tmbVar) {
        List list;
        List list2;
        SparseIntArray sparseIntArray;
        aqxo.y(tmbVar.b());
        aopc aopcVar = tmbVar.f;
        angf angfVar = ((tmh) aopcVar.instance).d;
        if (angfVar == null) {
            angfVar = angf.a;
        }
        aqxo.y((angfVar.b & 2048) != 0);
        int f = anhg.f(((tmh) aopcVar.instance).e);
        if (f == 0 || f == 1) {
            list = this.a.f;
            int size = list.size();
            list2 = this.a.f;
            list2.add(tmbVar.a());
            sparseIntArray = this.a.g;
            sparseIntArray.put(size, this.b);
            int i = this.b;
            this.b = size;
            View view = ((tml) tmbVar.b).a;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    tml.f(viewGroup.getChildAt(i2), this);
                }
            }
            this.b = i;
        }
    }
}
