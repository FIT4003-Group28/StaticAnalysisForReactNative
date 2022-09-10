package defpackage;

import android.os.RemoteException;
import com.google.android.apps.auto.sdk.SearchItem;
/* compiled from: PG */
/* renamed from: mvv  reason: default package */
/* loaded from: classes7.dex */
public final class mvv extends cmq {
    public final cms a;
    @dzsi
    public cmq b;

    public mvv(cms cmsVar) {
        dbsk.s(cmsVar);
        this.a = cmsVar;
    }

    @Override // defpackage.cmq
    public final void a() {
        cmq cmqVar = this.b;
        if (cmqVar == null) {
            return;
        }
        cmqVar.a();
    }

    @Override // defpackage.cmq
    public final void b() {
        cmq cmqVar = this.b;
        if (cmqVar == null) {
            return;
        }
        cmqVar.b();
    }

    @Override // defpackage.cmq
    public final void c(String str) {
        cmq cmqVar = this.b;
        if (cmqVar == null) {
            return;
        }
        cmqVar.c(str);
    }

    @Override // defpackage.cmq
    public final boolean d(String str) {
        cmq cmqVar = this.b;
        if (cmqVar == null) {
            return true;
        }
        return cmqVar.d(str);
    }

    @Override // defpackage.cmq
    public final void e(SearchItem searchItem) {
        cmq cmqVar = this.b;
        if (cmqVar == null) {
            return;
        }
        cmqVar.e(searchItem);
    }

    public final void f(dcdc<SearchItem> dcdcVar) {
        cms cmsVar = this.a;
        String valueOf = String.valueOf(dcdcVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("setSearchItems ");
        sb.append(valueOf);
        sb.toString();
        if (dcdcVar == null) {
            throw new IllegalArgumentException("SearchItems cannot be null.");
        }
        try {
            cmsVar.b.g(dcdcVar);
        } catch (RemoteException unused) {
        }
    }

    public final void g() {
        cms cmsVar = this.a;
        if (cmsVar.a == null) {
            throw new IllegalStateException("No SearchCallback is set");
        }
        try {
            cmsVar.b.i();
        } catch (RemoteException unused) {
        }
        this.b = null;
    }
}
