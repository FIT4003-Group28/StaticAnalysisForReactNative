package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bxdl  reason: default package */
/* loaded from: classes4.dex */
public final class bxdl implements View.OnLayoutChangeListener {
    final /* synthetic */ bxdn a;

    public bxdl(bxdn bxdnVar) {
        this.a = bxdnVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.t = view.getMeasuredHeight();
        cqkx.p(this.a);
        bwzk bwzkVar = this.a.z;
        if (bwzkVar != null) {
            bwzkVar.b();
        }
    }
}
