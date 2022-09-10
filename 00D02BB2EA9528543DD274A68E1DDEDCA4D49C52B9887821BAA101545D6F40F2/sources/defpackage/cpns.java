package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cpns  reason: default package */
/* loaded from: classes5.dex */
final class cpns implements View.OnClickListener {
    final /* synthetic */ dgzv a;
    final /* synthetic */ cpnv b;

    public cpns(cpnv cpnvVar, dgzv dgzvVar) {
        this.b = cpnvVar;
        this.a = dgzvVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dcdc<cpnn> h = this.b.h();
        int size = h.size();
        for (int i = 0; i < size; i++) {
            h.get(i).a(this.a);
        }
        this.b.m();
    }
}
