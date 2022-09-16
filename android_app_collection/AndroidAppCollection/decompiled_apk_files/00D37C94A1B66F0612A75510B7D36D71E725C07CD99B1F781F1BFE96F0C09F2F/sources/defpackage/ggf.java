package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ggf  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ggf implements Runnable {
    public final /* synthetic */ ggg a;
    public final /* synthetic */ auhe b;
    public final /* synthetic */ View c;
    private final /* synthetic */ int d;

    public /* synthetic */ ggf(ggg gggVar, auhe auheVar, View view) {
        this.a = gggVar;
        this.b = auheVar;
        this.c = view;
    }

    public /* synthetic */ ggf(ggg gggVar, auhe auheVar, View view, int i) {
        this.d = i;
        this.a = gggVar;
        this.b = auheVar;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d == 0) {
            ggg gggVar = this.a;
            auhe auheVar = this.b;
            gggVar.a.d(auheVar.d, this.c);
            return;
        }
        ggg gggVar2 = this.a;
        auhe auheVar2 = this.b;
        gggVar2.a.d(auheVar2.d, this.c);
    }
}
