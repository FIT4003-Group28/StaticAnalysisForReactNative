package defpackage;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cik  reason: default package */
/* loaded from: classes4.dex */
public final class cik implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference<cil> a;

    public cik(cil cilVar) {
        this.a = new WeakReference<>(cilVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        cil cilVar = this.a.get();
        if (cilVar == null || cilVar.c.isEmpty()) {
            return true;
        }
        int c = cilVar.c();
        int b = cilVar.b();
        if (!cil.d(c, b)) {
            return true;
        }
        ArrayList arrayList = new ArrayList(cilVar.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cii) arrayList.get(i)).j(c, b);
        }
        cilVar.a();
        return true;
    }
}
