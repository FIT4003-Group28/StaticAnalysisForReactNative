package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: afny  reason: default package */
/* loaded from: classes.dex */
public final class afny implements tct {
    public final tdb a;
    public final snc b;

    public afny(tdb tdbVar, snc sncVar) {
        this.a = tdbVar;
        this.b = sncVar;
    }

    @Override // defpackage.tct
    public final aooq a() {
        return aqfi.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, tcs tcsVar) {
        final aqfi aqfiVar = (aqfi) obj;
        return aynr.t(new aypv() { // from class: afnx
            @Override // defpackage.aypv
            public final void a() {
                afny afnyVar = afny.this;
                aqfi aqfiVar2 = aqfiVar;
                tdb tdbVar = afnyVar.a;
                String str = aqfiVar2.c;
                aopa createBuilder = awpe.a.createBuilder();
                long seconds = TimeUnit.MILLISECONDS.toSeconds(afnyVar.b.c());
                createBuilder.copyOnWrite();
                awpe awpeVar = (awpe) createBuilder.instance;
                awpeVar.b |= 1;
                awpeVar.c = seconds;
                tdbVar.b(str, ((awpe) createBuilder.mo39build()).toByteArray());
            }
        });
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }
}
