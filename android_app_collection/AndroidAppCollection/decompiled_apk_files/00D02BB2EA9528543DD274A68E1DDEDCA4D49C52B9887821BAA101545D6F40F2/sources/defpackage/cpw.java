package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cpw  reason: default package */
/* loaded from: classes5.dex */
final class cpw implements pp {
    final /* synthetic */ int a;

    public cpw(int i) {
        this.a = i;
    }

    @Override // defpackage.pp
    public final boolean a(View view) {
        dzvx.c(view, "host");
        View findViewById = view.findViewById(this.a);
        if (findViewById != null) {
            return findViewById.performClick();
        }
        return false;
    }
}
