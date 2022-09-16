package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: gsr  reason: default package */
/* loaded from: classes3.dex */
public final class gsr implements yjo {
    private final yrj a;
    private final akpu b;
    private final acrr c;

    public gsr(yrj yrjVar, akpu akpuVar, acrr acrrVar) {
        this.a = yrjVar;
        this.b = akpuVar;
        this.c = acrrVar;
    }

    @Override // defpackage.yjo
    public final int a(Bundle bundle) {
        aopa createBuilder = aqlu.a.createBuilder();
        aqlv f = this.a.f();
        createBuilder.copyOnWrite();
        aqlu aqluVar = (aqlu) createBuilder.instance;
        aqluVar.c = f.B;
        aqluVar.b |= 1;
        atnw b = this.b.b();
        createBuilder.copyOnWrite();
        aqlu aqluVar2 = (aqlu) createBuilder.instance;
        aqluVar2.d = b.g;
        aqluVar2.b |= 2;
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).cm((aqlu) createBuilder.mo39build());
        this.c.c((arrh) a.mo39build());
        return 0;
    }
}
