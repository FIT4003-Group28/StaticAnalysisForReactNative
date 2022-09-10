package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abbn  reason: default package */
/* loaded from: classes2.dex */
public final class abbn extends bfdp {
    public abej a;
    public cqkj b;

    @Override // defpackage.bfdp
    protected final jib g() {
        return jib.g(J(), Rp(R.string.SHOWTIMES_TITLE));
    }

    @Override // defpackage.bfdp
    protected final View i(ilo iloVar) {
        dqqa U = iloVar.U();
        dbsk.t(U, "ShowtimesPageFragment cannot be created without showtimes proto");
        dbsk.v(0, U.b.size(), "ShowtimesPageFragment cannot be created with zero daily showtimes");
        int i = U.b.get(0).a;
        abej abejVar = this.a;
        String n = iloVar.n();
        gga a = abejVar.a.a();
        abej.a(a, 1);
        abej.a(abejVar.b.a(), 2);
        abdz a2 = abejVar.c.a();
        abej.a(a2, 3);
        abej.a(U, 4);
        abej.a(n, 5);
        abei abeiVar = new abei(a, a2, U, n, i);
        cqkf e = this.b.e(new abcb());
        e.e(abeiVar);
        return e.c();
    }
}
