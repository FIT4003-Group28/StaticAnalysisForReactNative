package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: ihm  reason: default package */
/* loaded from: classes.dex */
final class ihm extends abp {
    final /* synthetic */ iib a;
    final /* synthetic */ iif b;
    final /* synthetic */ Context c;

    public ihm(iib iibVar, iif iifVar, Context context) {
        this.a = iibVar;
        this.b = iifVar;
        this.c = context;
    }

    @Override // defpackage.abp
    public final void b(Rect rect, View view, RecyclerView recyclerView, aci aciVar) {
        int Z = recyclerView.Z(view);
        int b = aciVar.b() - 1;
        if (view.getVisibility() == 8 || Z == b) {
            return;
        }
        boolean b2 = bvox.b(this.c);
        iif c = this.a.c();
        if (c == null) {
            c = this.b;
        }
        int e = c.i().e(this.c);
        if (recyclerView.Z(view) == -1) {
            return;
        }
        int i = true != b2 ? 0 : e;
        if (true == b2) {
            e = 0;
        }
        rect.set(i, 0, e, 0);
    }
}
