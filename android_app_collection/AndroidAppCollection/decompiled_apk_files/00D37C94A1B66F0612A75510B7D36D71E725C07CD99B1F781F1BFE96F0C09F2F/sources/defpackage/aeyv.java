package defpackage;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.IOException;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aeyv  reason: default package */
/* loaded from: classes.dex */
public final class aeyv extends aezc {
    final Set a;
    final aeyu b;

    public aeyv(Set set, aeyu aeyuVar) {
        this.a = set;
        this.b = aeyuVar;
    }

    @Override // defpackage.aezc, defpackage.bab
    public final void c(pwu pwuVar, int i) {
        try {
            Set set = this.a;
            EventMessage c = poq.c(pwuVar);
            aeui aeuiVar = (set.isEmpty() || set.contains(c.a)) ? new aeui(c.a, aeui.e(new pwu(c.e))) : null;
            if (aeuiVar == null) {
                return;
            }
            this.b.i(aeuiVar);
        } catch (IOException e) {
            this.b.j(e);
        }
    }
}
