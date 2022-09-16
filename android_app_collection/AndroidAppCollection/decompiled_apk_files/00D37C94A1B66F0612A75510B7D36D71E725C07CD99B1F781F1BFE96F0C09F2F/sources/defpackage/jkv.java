package defpackage;

import android.view.ViewStub;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: jkv  reason: default package */
/* loaded from: classes3.dex */
public final class jkv {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final azqb g;

    public jkv(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7) {
        azqbVar.getClass();
        this.a = azqbVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
        azqbVar3.getClass();
        this.c = azqbVar3;
        azqbVar4.getClass();
        this.d = azqbVar4;
        azqbVar5.getClass();
        this.e = azqbVar5;
        azqbVar6.getClass();
        this.f = azqbVar6;
        this.g = azqbVar7;
    }

    public final jku a(ViewStub viewStub, jlk jlkVar) {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.get();
        scheduledExecutorService.getClass();
        Executor executor = (Executor) this.b.get();
        executor.getClass();
        agrf agrfVar = (agrf) this.c.get();
        agrfVar.getClass();
        yni yniVar = (yni) this.d.get();
        yniVar.getClass();
        ahdn ahdnVar = (ahdn) this.e.get();
        ahdnVar.getClass();
        fcd fcdVar = (fcd) this.f.get();
        fcdVar.getClass();
        fbj fbjVar = (fbj) this.g.get();
        fbjVar.getClass();
        viewStub.getClass();
        return new jku(scheduledExecutorService, executor, agrfVar, yniVar, ahdnVar, fcdVar, fbjVar, viewStub, jlkVar);
    }
}
