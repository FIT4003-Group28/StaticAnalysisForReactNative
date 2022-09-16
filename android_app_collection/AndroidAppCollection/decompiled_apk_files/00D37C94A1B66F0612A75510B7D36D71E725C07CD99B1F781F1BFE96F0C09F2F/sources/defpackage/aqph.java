package defpackage;
/* compiled from: PG */
/* renamed from: aqph  reason: default package */
/* loaded from: classes2.dex */
public final class aqph {
    public final aopa a;

    public aqph() {
        this.a = aqpm.a.createBuilder();
    }

    public aqph(aopa aopaVar) {
        this.a = aopaVar;
    }

    public final aqpi a(aajl aajlVar) {
        return new aqpi((aqpm) this.a.mo39build(), aajlVar);
    }

    public final void b(avhn... avhnVarArr) {
        for (int i = 0; i <= 0; i++) {
            avhn avhnVar = avhnVarArr[i];
            aopa aopaVar = this.a;
            aopaVar.copyOnWrite();
            aqpm aqpmVar = (aqpm) aopaVar.instance;
            aqpm aqpmVar2 = aqpm.a;
            avhnVar.getClass();
            aopu aopuVar = aqpmVar.c;
            if (!aopuVar.c()) {
                aqpmVar.c = aopi.mutableCopy(aopuVar);
            }
            aqpmVar.c.add(avhnVar);
        }
    }

    public final void c(awkj awkjVar) {
        aopa aopaVar = this.a;
        aopaVar.copyOnWrite();
        aqpm aqpmVar = (aqpm) aopaVar.instance;
        aqpm aqpmVar2 = aqpm.a;
        aqpmVar.e = awkjVar.f;
        aqpmVar.b |= 1;
    }
}
