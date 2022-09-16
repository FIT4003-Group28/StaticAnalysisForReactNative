package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cppa  reason: default package */
/* loaded from: classes5.dex */
public final class cppa implements cpox {
    private final View a;

    public cppa(View view) {
        this.a = view;
    }

    @Override // defpackage.cpox
    public final int a() {
        if (this.a.getLayoutParams() instanceof cppw) {
            cppw cppwVar = (cppw) this.a.getLayoutParams();
        }
        return 0;
    }

    @Override // defpackage.cpox
    public final String b() {
        return this.a.getContentDescription().toString();
    }
}
