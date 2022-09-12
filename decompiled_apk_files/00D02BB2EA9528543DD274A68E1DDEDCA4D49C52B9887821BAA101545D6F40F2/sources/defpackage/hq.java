package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hq  reason: default package */
/* loaded from: classes6.dex */
public final class hq implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ Map b;

    public hq(ArrayList arrayList, Map map) {
        this.a = arrayList;
        this.b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.a.get(i);
            od.I(view, (String) this.b.get(od.J(view)));
        }
    }
}
