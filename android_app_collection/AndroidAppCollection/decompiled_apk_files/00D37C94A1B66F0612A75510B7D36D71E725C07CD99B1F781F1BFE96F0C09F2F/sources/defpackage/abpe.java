package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: abpe  reason: default package */
/* loaded from: classes.dex */
final class abpe extends nd {
    final /* synthetic */ View a;
    final /* synthetic */ abpf b;

    public abpe(abpf abpfVar, View view) {
        this.b = abpfVar;
        this.a = view;
    }

    @Override // defpackage.nd
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        abqg.g(1.0f, this.a);
        abqg.g(1.0f, this.b.b());
        abqg.g(1.0f, this.b.c());
    }
}
