package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: dsw  reason: default package */
/* loaded from: classes3.dex */
public final class dsw extends dsv {
    protected dsw(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static dsw n(String str, Context context, boolean z) {
        s(context, z);
        return new dsw(context, str, z);
    }

    @Override // defpackage.dsv
    protected final List o(dtq dtqVar, Context context, aopa aopaVar, dnq dnqVar) {
        if (dtqVar.b == null || !this.u) {
            return super.o(dtqVar, context, aopaVar, dnqVar);
        }
        int a = dtqVar.a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.o(dtqVar, context, aopaVar, dnqVar));
        arrayList.add(new due(dtqVar, aopaVar, a));
        return arrayList;
    }
}
