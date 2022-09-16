package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hf  reason: default package */
/* loaded from: classes6.dex */
public final class hf implements Runnable {
    final /* synthetic */ hr a;
    final /* synthetic */ aif b;
    final /* synthetic */ Object c;
    final /* synthetic */ hg d;
    final /* synthetic */ ArrayList e;
    final /* synthetic */ View f;
    final /* synthetic */ boolean g;
    final /* synthetic */ ArrayList h;
    final /* synthetic */ Object i;
    final /* synthetic */ Rect j;

    public hf(hr hrVar, aif aifVar, Object obj, hg hgVar, ArrayList arrayList, View view, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.a = hrVar;
        this.b = aifVar;
        this.c = obj;
        this.d = hgVar;
        this.e = arrayList;
        this.f = view;
        this.g = z;
        this.h = arrayList2;
        this.i = obj2;
        this.j = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aif<String, View> a = hh.a(this.a, this.b, this.c, this.d);
        if (a != null) {
            this.e.addAll(a.values());
            this.e.add(this.f);
        }
        Object obj = this.c;
        if (obj != null) {
            this.a.k(obj, this.h, this.e);
            View b = hh.b(a, this.d, this.i, this.g);
            if (b == null) {
                return;
            }
            hr.u(b, this.j);
        }
    }
}
