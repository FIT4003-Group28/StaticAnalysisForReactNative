package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: agbv  reason: default package */
/* loaded from: classes.dex */
public final class agbv implements aaqw {
    private final agbd a;
    private final Context b;
    private final aadd c;

    public agbv(agbd agbdVar, Context context, aadd aaddVar) {
        this.a = agbdVar;
        this.b = context;
        this.c = aaddVar;
    }

    @Override // defpackage.aaqw
    public final void a(aopa aopaVar) {
        atps atpsVar = this.c.a().p;
        if (atpsVar == null) {
            atpsVar = atps.a;
        }
        if (!atpsVar.n) {
            return;
        }
        aopa createBuilder = atoq.a.createBuilder();
        int i = true != this.a.d(this.b) ? 3 : 2;
        createBuilder.copyOnWrite();
        atoq atoqVar = (atoq) createBuilder.instance;
        atoqVar.c = i - 1;
        atoqVar.b |= 1;
        if (this.a.a() > 0) {
            long a = this.a.a();
            createBuilder.copyOnWrite();
            atoq atoqVar2 = (atoq) createBuilder.instance;
            atoqVar2.b = 2 | atoqVar2.b;
            atoqVar2.d = a;
        }
        arow arowVar = ((aroy) aopaVar.instance).c;
        if (arowVar == null) {
            arowVar = arow.a;
        }
        aopa mo52toBuilder = arowVar.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        arow arowVar2 = (arow) mo52toBuilder.instance;
        atoq atoqVar3 = (atoq) createBuilder.mo39build();
        atoqVar3.getClass();
        arowVar2.S = atoqVar3;
        arowVar2.d |= 2097152;
        aopaVar.copyOnWrite();
        aroy aroyVar = (aroy) aopaVar.instance;
        arow arowVar3 = (arow) mo52toBuilder.mo39build();
        arowVar3.getClass();
        aroyVar.c = arowVar3;
        aroyVar.b |= 1;
    }
}
