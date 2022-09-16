package defpackage;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: fac  reason: default package */
/* loaded from: classes3.dex */
public final class fac implements yjo {
    private final acrr a;
    private final azqb b;

    public fac(acrr acrrVar, azqb azqbVar) {
        this.a = acrrVar;
        this.b = azqbVar;
    }

    @Override // defpackage.yjo
    public final int a(Bundle bundle) {
        faa faaVar = (faa) this.b.get();
        long d = faaVar.b.d();
        atnx a = atny.a();
        int andSet = faaVar.a.getAndSet(0);
        a.copyOnWrite();
        ((atny) a.instance).f(andSet);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(d - faaVar.c);
        a.copyOnWrite();
        ((atny) a.instance).e(seconds);
        faaVar.c = d;
        arrf a2 = arrh.a();
        a2.copyOnWrite();
        ((arrh) a2.instance).di((atny) a.mo39build());
        this.a.c((arrh) a2.mo39build());
        return 0;
    }
}
