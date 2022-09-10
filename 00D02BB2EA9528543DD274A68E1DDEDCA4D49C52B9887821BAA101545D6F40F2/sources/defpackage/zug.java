package defpackage;

import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zug  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class zug implements zun {
    static final zun a = new zug();

    private zug() {
    }

    @Override // defpackage.zun
    public final boolean a(GmmRecyclerView gmmRecyclerView, int i) {
        aegg aeggVar = zut.a;
        aag aagVar = (aag) gmmRecyclerView.l;
        return aagVar != null && aagVar.ad() > i;
    }
}
