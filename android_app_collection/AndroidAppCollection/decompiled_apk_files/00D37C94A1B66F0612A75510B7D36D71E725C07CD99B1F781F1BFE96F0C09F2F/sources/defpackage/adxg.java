package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: adxg  reason: default package */
/* loaded from: classes.dex */
public final class adxg implements afjp {
    final /* synthetic */ azqb a;
    final /* synthetic */ afjp b;

    public adxg(azqb azqbVar, afjp afjpVar) {
        this.a = azqbVar;
        this.b = afjpVar;
    }

    @Override // defpackage.afjp
    public final void D(int i, Map map) {
        Long c = new aflw(map).c("x-walltime-ms");
        if (c != null) {
            ((zdt) this.a.get()).a(c);
        }
        this.b.D(i, map);
    }
}
