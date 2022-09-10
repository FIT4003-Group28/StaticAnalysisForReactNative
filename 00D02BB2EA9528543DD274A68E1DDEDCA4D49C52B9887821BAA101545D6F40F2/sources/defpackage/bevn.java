package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bevn  reason: default package */
/* loaded from: classes3.dex */
public final class bevn extends bfdp {
    public cqkj a;
    public begg b;
    public dzsj<beuq> c;

    @Override // defpackage.bfdp
    protected final jib g() {
        return jib.g(J(), Rp(R.string.EV_HOST));
    }

    @Override // defpackage.bfdp
    protected final View i(ilo iloVar) {
        cqkf c = this.a.c(new bevo(), null);
        c.e(new bevq(iloVar, this.b, J(), this.c.a()));
        return c.c();
    }
}
