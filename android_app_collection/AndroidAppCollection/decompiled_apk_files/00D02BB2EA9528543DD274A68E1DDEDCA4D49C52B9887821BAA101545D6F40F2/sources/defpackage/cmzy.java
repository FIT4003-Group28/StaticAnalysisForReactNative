package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: cmzy  reason: default package */
/* loaded from: classes5.dex */
public final class cmzy {
    public final int a;
    public final int b;
    public final long c;
    public final int d;

    public cmzy(int i) {
        this.a = i;
        this.b = -1;
        this.c = -1L;
        this.d = -1;
    }

    public cmzy(int i, int i2, long j, int i3) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = i3;
    }

    public static int a(View view, View view2) {
        int id;
        if (view == null || (id = view.getId()) == -1 || view2.findViewById(id) != view) {
            return -1;
        }
        return id;
    }

    public final acl b(RecyclerView recyclerView, ahp<RecyclerView, acl> ahpVar) {
        acl a = ahpVar.a(recyclerView);
        if (a == null || !a.a.isAttachedToWindow()) {
            recyclerView.l(this.b);
            return ahpVar.a(recyclerView);
        }
        return a;
    }
}
