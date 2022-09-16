package defpackage;

import android.os.Bundle;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: eyi  reason: default package */
/* loaded from: classes3.dex */
final class eyi extends tzh {
    final /* synthetic */ Bundle a;

    public eyi(Bundle bundle) {
        this.a = bundle;
    }

    @Override // defpackage.tzh
    public final List a() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.a.keySet()) {
            arrayList.add(Pair.create(str, this.a.getString(str, "")));
        }
        return arrayList;
    }
}
