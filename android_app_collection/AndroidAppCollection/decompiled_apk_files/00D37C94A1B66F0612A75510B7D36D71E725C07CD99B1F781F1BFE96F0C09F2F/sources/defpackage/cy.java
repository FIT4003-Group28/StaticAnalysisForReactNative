package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cy  reason: default package */
/* loaded from: classes3.dex */
public final class cy implements akk {
    final /* synthetic */ View a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ cz c;

    public cy(View view, ViewGroup viewGroup, cz czVar) {
        this.a = view;
        this.b = viewGroup;
        this.c = czVar;
    }

    @Override // defpackage.akk
    public final void a() {
        this.a.clearAnimation();
        this.b.endViewTransition(this.a);
        this.c.b();
    }
}
