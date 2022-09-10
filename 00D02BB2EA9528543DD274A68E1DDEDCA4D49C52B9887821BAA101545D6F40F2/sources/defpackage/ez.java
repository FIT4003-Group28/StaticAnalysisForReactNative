package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ez  reason: default package */
/* loaded from: classes6.dex */
public final class ez extends fn {
    final /* synthetic */ fd a;

    public ez(fd fdVar) {
        this.a = fdVar;
    }

    @Override // defpackage.fn
    public final boolean MW() {
        return this.a.P != null;
    }

    @Override // defpackage.fn
    public final View a(int i) {
        View view = this.a.P;
        if (view == null) {
            throw new IllegalStateException("Fragment " + this.a + " does not have a view");
        }
        return view.findViewById(i);
    }
}
