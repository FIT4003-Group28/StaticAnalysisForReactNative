package defpackage;

import android.view.View;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hd  reason: default package */
/* loaded from: classes6.dex */
public final class hd implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ hr b;
    final /* synthetic */ View c;
    final /* synthetic */ fd d;
    final /* synthetic */ ArrayList e;
    final /* synthetic */ ArrayList f;
    final /* synthetic */ ArrayList g;
    final /* synthetic */ Object h;

    public hd(Object obj, hr hrVar, View view, fd fdVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.a = obj;
        this.b = hrVar;
        this.c = view;
        this.d = fdVar;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = arrayList3;
        this.h = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.a;
        if (obj != null) {
            this.b.n(obj, this.c);
            this.f.addAll(hh.c(this.b, this.a, this.d, this.e, this.c));
        }
        if (this.g != null) {
            if (this.h != null) {
                ArrayList<View> arrayList = new ArrayList<>();
                arrayList.add(this.c);
                this.b.l(this.h, this.g, arrayList);
            }
            this.g.clear();
            this.g.add(this.c);
        }
    }
}
