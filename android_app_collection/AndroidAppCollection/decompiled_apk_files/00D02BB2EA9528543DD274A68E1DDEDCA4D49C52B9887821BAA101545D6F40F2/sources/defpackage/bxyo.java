package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bxyo  reason: default package */
/* loaded from: classes4.dex */
public class bxyo implements jau {
    final /* synthetic */ bxyn a;
    final /* synthetic */ bxyp b;

    public bxyo(bxyp bxypVar, bxyn bxynVar) {
        this.b = bxypVar;
        this.a = bxynVar;
    }

    @Override // defpackage.jau
    public cqtd c() {
        return cqrt.g(2131232205, ibl.aw());
    }

    @Override // defpackage.jau
    public cqkl d() {
        bxyn bxynVar = this.a;
        dbsz<dpte> c = bxynVar.c();
        if (c != null) {
            c.NU(bxynVar.b());
        }
        return cqkl.a;
    }

    @Override // defpackage.jau
    public String e() {
        return this.b.a.getString(R.string.RECENT_HISTORY_DELETE_LINK_DESCRIPTION);
    }

    @Override // defpackage.jau
    public cjtd f() {
        return cjtd.a(dtyb.bA);
    }
}
