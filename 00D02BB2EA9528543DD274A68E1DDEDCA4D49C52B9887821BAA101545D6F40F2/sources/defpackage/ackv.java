package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ackv  reason: default package */
/* loaded from: classes2.dex */
public final class ackv extends bfdp {
    public cqkj a;
    public dxio<afha> b;
    public dxio<axwy> c;

    @Override // defpackage.bfdp
    protected final jib g() {
        return jib.g(J(), Rp(R.string.TOP_LISTS_HEADER_TITLE));
    }

    @Override // defpackage.bfdp
    protected final View i(ilo iloVar) {
        cqkf c = this.a.c(new acvt(), null);
        acvy acvyVar = new acvy(J(), this.b, this.c);
        dgmq dgmqVar = iloVar.h().ba;
        if (dgmqVar == null) {
            dgmqVar = dgmq.b;
        }
        acvyVar.b(dgmqVar);
        c.e(acvyVar);
        return c.c();
    }
}
