package defpackage;

import android.view.View;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: axr  reason: default package */
/* loaded from: classes3.dex */
final class axr implements aym {
    final /* synthetic */ View a;
    final /* synthetic */ ArrayList b;

    public axr(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // defpackage.aym
    public final void a(ayn aynVar) {
        aynVar.E(this);
        this.a.setVisibility(8);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.b.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.aym
    public final void b() {
    }

    @Override // defpackage.aym
    public final void c() {
    }

    @Override // defpackage.aym
    public final void d() {
    }

    @Override // defpackage.aym
    public final void e(ayn aynVar) {
        aynVar.E(this);
        aynVar.A(this);
    }
}
