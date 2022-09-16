package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: sbd  reason: default package */
/* loaded from: classes4.dex */
public final class sbd implements saw {
    private final View a;

    public sbd(View view) {
        this.a = view;
    }

    @Override // defpackage.saw
    public final int a() {
        if (this.a.getLayoutParams() instanceof sby) {
            sby sbyVar = (sby) this.a.getLayoutParams();
        }
        return 0;
    }

    @Override // defpackage.saw
    public final String b() {
        return this.a.getContentDescription().toString();
    }
}
