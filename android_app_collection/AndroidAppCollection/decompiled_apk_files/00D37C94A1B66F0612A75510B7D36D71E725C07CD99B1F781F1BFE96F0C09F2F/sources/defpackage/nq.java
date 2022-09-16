package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nq  reason: default package */
/* loaded from: classes3.dex */
public final class nq implements AdapterView.OnItemClickListener {
    final /* synthetic */ nv a;
    final /* synthetic */ ns b;

    public nq(ns nsVar, nv nvVar) {
        this.b = nsVar;
        this.a = nvVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.q.onClick(this.a.b, i);
        if (!this.b.u) {
            this.a.b.dismiss();
        }
    }
}
