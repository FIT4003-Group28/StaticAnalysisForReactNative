package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cdwl  reason: default package */
/* loaded from: classes4.dex */
public class cdwl {
    public final View d;
    public final cebc e;

    /* JADX INFO: Access modifiers changed from: protected */
    public cdwl(View view, cebd cebdVar) {
        this.d = view;
        this.e = cebdVar.a(view);
    }

    public static cdwl h(View view, cebd cebdVar) {
        return new cdwl(view, cebdVar);
    }

    public void g(cjtd cjtdVar) {
        this.e.c(cjtdVar);
    }

    public final cdwl i(ddho ddhoVar) {
        g(cjtd.a(ddhoVar));
        return this;
    }

    public void j(Runnable runnable) {
        this.e.b(runnable);
    }
}
