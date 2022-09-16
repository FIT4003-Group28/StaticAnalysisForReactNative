package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: yvl  reason: default package */
/* loaded from: classes4.dex */
public final class yvl {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;

    public yvl(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        azqbVar.getClass();
        this.a = azqbVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
        azqbVar3.getClass();
        this.c = azqbVar3;
        azqbVar4.getClass();
        this.d = azqbVar4;
    }

    public final yvk a(ampg ampgVar, yjc yjcVar, aoqu aoquVar) {
        ((Context) this.a.get()).getClass();
        yme ymeVar = (yme) this.b.get();
        ymeVar.getClass();
        Executor executor = (Executor) this.c.get();
        executor.getClass();
        SharedPreferences sharedPreferences = (SharedPreferences) this.d.get();
        sharedPreferences.getClass();
        ampgVar.getClass();
        yjcVar.getClass();
        aoquVar.getClass();
        return new yvk(ymeVar, executor, sharedPreferences, ampgVar, yjcVar, aoquVar);
    }
}
