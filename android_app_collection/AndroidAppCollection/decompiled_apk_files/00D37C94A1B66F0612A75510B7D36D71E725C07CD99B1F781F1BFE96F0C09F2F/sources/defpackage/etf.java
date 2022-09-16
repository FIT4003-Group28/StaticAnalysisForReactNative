package defpackage;

import android.os.Bundle;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: etf  reason: default package */
/* loaded from: classes3.dex */
public final class etf implements yjo {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final asxj d;

    public etf(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, aacz aaczVar) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        asxj asxjVar = aaczVar.b().e;
        this.d = asxjVar == null ? asxj.a : asxjVar;
    }

    @Override // defpackage.yjo
    public final int a(Bundle bundle) {
        try {
            abcu abcuVar = (abcu) this.a.get();
            abcl a = abcuVar.a(null);
            if (this.d.bu) {
                a.q = ytz.LOW;
            }
            ((etd) this.b.get()).j((abcn) abcuVar.d(a).get());
            ((afuy) this.c.get()).b();
            return 0;
        } catch (InterruptedException | ExecutionException e) {
            zep.d("Failed to fetch settings", e);
            return 1;
        }
    }
}
