package defpackage;

import android.widget.ListView;
/* compiled from: PG */
/* renamed from: bwtk  reason: default package */
/* loaded from: classes4.dex */
final class bwtk implements izb {
    final /* synthetic */ bwtr a;

    public bwtk(bwtr bwtrVar) {
        this.a = bwtrVar;
    }

    @Override // defpackage.izb
    public final void a(int i) {
        ListView listView = this.a.d;
        dbsk.s(listView);
        listView.post(new bwtj(listView, i));
    }
}
