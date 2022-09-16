package defpackage;

import android.os.Bundle;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: akuj  reason: default package */
/* loaded from: classes.dex */
final class akuj extends tzh {
    final /* synthetic */ Bundle a;

    public akuj(Bundle bundle) {
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
