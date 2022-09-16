package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dj  reason: default package */
/* loaded from: classes3.dex */
public final class dj extends dw {
    final /* synthetic */ dp a;

    public dj(dp dpVar) {
        this.a = dpVar;
    }

    @Override // defpackage.dw
    public final boolean b() {
        return this.a.O != null;
    }

    @Override // defpackage.dw
    public final View a(int i) {
        View view = this.a.O;
        if (view == null) {
            throw new IllegalStateException("Fragment " + this.a + " does not have a view");
        }
        return view.findViewById(i);
    }
}
