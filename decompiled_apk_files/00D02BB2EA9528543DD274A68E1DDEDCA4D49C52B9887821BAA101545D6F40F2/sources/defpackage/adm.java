package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adm  reason: default package */
/* loaded from: classes2.dex */
public final class adm implements AdapterView.OnItemClickListener {
    final /* synthetic */ adv a;

    public adm(adv advVar) {
        this.a = advVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.a.x(i);
    }
}
