package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bzul  reason: default package */
/* loaded from: classes4.dex */
public final class bzul {
    public static Set<Uri> a(bzui bzuiVar, bztp bztpVar, Context context, dlhu dlhuVar) {
        bztn g = bztpVar.g();
        ArrayList b = dchl.b(g.j(), g.g());
        if (dcnm.q(bzuiVar.a(), bzuj.a).size() <= 1) {
            b.add(g.i());
        }
        ArrayList c = dchl.c(b);
        if ((dlhuVar.a & 1) != 0) {
            dlht dlhtVar = dlhuVar.b;
            if (dlhtVar == null) {
                dlhtVar = dlht.c;
            }
            bztn g2 = bztpVar.g();
            c.add(g2.a(new eapd(dlhtVar.a)));
            c.add(g2.b(new eapd(dlhtVar.b)));
            return bzud.a(dcft.o((Iterable) deha.s(bztpVar.b(c)), bzuk.a), context);
        }
        return dcnm.j();
    }
}
