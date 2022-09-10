package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qr  reason: default package */
/* loaded from: classes7.dex */
public final class qr implements AdapterView.OnItemClickListener {
    final /* synthetic */ qw a;
    final /* synthetic */ qt b;

    public qr(qt qtVar, qw qwVar) {
        this.b = qtVar;
        this.a = qwVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.b.p.onClick(this.a.b, i);
        if (!this.b.t) {
            this.a.b.dismiss();
        }
    }
}
