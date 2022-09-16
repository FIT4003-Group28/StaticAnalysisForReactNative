package defpackage;

import android.support.v4.widget.NestedScrollView;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nm  reason: default package */
/* loaded from: classes3.dex */
public final class nm implements nc {
    final /* synthetic */ View a;
    final /* synthetic */ View b;

    public nm(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    @Override // defpackage.nc
    public final void a(NestedScrollView nestedScrollView, int i, int i2) {
        nv.a(nestedScrollView, this.a, this.b);
    }
}
