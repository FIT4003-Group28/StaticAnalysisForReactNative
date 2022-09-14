package defpackage;

import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zuh  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class zuh implements zun {
    static final zun a = new zuh();

    private zuh() {
    }

    @Override // defpackage.zun
    public final boolean a(GmmRecyclerView gmmRecyclerView, int i) {
        aegg aeggVar = zut.a;
        aag aagVar = (aag) gmmRecyclerView.l;
        return aagVar != null && aagVar.ac() < i;
    }
}
