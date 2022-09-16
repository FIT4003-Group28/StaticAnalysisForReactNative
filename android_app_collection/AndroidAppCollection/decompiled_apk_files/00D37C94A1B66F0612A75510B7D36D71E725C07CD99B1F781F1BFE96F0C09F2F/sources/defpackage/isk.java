package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: isk  reason: default package */
/* loaded from: classes3.dex */
public final class isk implements aaoo {
    private final azqb a;
    private final Executor b;

    public isk(azqb azqbVar, Executor executor) {
        this.a = azqbVar;
        this.b = executor;
    }

    @Override // defpackage.aaoo
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        auqj auqjVar = (auqj) obj;
        atof atofVar = auqjVar.c;
        if (atofVar == null) {
            atofVar = atof.a;
        }
        if (atofVar.g) {
            aath aathVar = (aath) this.a.get();
            atof atofVar2 = auqjVar.c;
            if (atofVar2 == null) {
                atofVar2 = atof.a;
            }
            aatf a = aathVar.a(ajna.g(atofVar2));
            a.j = true;
            ylx.j(((aath) this.a.get()).h(a, this.b), anjk.a, gpe.j);
        }
    }
}
