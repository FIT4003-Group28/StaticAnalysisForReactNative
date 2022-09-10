package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: aacz  reason: default package */
/* loaded from: classes2.dex */
public final class aacz {
    public static final String a = "aacz";
    @dzsi
    public Bundle b;

    public final Bundle a(aada aadaVar) {
        Bundle bundle = new Bundle();
        int i = aadaVar.f;
        int i2 = i - 1;
        if (i != 0) {
            bundle.putInt("UiMode", i2);
            bundle.putBoolean("ShowListOnResponse", aadaVar.e);
            bundle.putParcelable("SliderListState", b(aadaVar).B());
            return bundle;
        }
        throw null;
    }

    public final abs b(aada aadaVar) {
        RecyclerView recyclerView = (RecyclerView) cqkx.e(aadaVar.c, aabt.a, RecyclerView.class);
        dbsk.s(recyclerView);
        abs absVar = recyclerView.l;
        dbsk.s(absVar);
        return absVar;
    }
}
