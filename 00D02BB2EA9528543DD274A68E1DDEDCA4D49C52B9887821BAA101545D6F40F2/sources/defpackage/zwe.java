package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: zwe  reason: default package */
/* loaded from: classes7.dex */
public final class zwe implements cpru<zwh> {
    final /* synthetic */ Context a;

    public zwe(Context context) {
        this.a = context;
    }

    @Override // defpackage.cpru
    public final List<String> a(List<zwh> list) {
        ArrayList f = dchl.f(list.size());
        for (zwh zwhVar : list) {
            f.add(dbsj.d(zwhVar.a.a) ? "" : bvtb.i(this.a, zwhVar.a.b));
        }
        return f;
    }
}
