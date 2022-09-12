package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cpt  reason: default package */
/* loaded from: classes5.dex */
final class cpt implements cqa {
    private final String a;

    public cpt(Class<?> cls) {
        this.a = cls.getName();
    }

    @Override // defpackage.cqa
    public final void b(View view, pc pcVar) {
        dzvx.c(view, "host");
        pcVar.B(this.a);
    }
}
