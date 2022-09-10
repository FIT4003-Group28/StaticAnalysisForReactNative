package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cpnr  reason: default package */
/* loaded from: classes5.dex */
final class cpnr implements View.OnClickListener {
    final /* synthetic */ cpnv a;

    public cpnr(cpnv cpnvVar) {
        this.a = cpnvVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dcdc<cpnn> h = this.a.h();
        int size = h.size();
        for (int i = 0; i < size; i++) {
            h.get(i).b(cpnv.n(this.a.a));
        }
        this.a.m();
    }
}
