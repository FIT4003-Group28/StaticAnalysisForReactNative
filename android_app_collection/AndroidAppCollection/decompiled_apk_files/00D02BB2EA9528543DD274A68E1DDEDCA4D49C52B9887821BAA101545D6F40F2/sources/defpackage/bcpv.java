package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bcpv  reason: default package */
/* loaded from: classes3.dex */
public final class bcpv implements bbup {
    final /* synthetic */ bdej a;
    final /* synthetic */ bcpz b;

    public bcpv(bcpz bcpzVar, bdej bdejVar) {
        this.b = bcpzVar;
        this.a = bdejVar;
    }

    @Override // defpackage.bbup
    public final void c() {
    }

    @Override // defpackage.bbup
    public final void j() {
        this.a.h();
        cqkx.p(this.a);
    }

    @Override // defpackage.bbup
    public final void k(dbsg<bttq> dbsgVar) {
        ff J = this.b.J();
        if (!this.b.aD || J == null) {
            return;
        }
        Toast.makeText(J, J.getString(R.string.FAILED_TO_FETCH_PHOTOS), 0).show();
    }
}
