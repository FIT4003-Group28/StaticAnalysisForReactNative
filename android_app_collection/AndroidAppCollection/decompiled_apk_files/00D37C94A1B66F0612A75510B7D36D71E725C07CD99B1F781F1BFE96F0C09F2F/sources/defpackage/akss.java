package defpackage;

import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: akss  reason: default package */
/* loaded from: classes.dex */
public final class akss {
    private final azqb a;
    private final azqb b;

    public akss(azqb azqbVar, azqb azqbVar2) {
        azqbVar.getClass();
        this.a = azqbVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
    }

    public final aksr a(List list) {
        abdk abdkVar = (abdk) this.a.get();
        abdkVar.getClass();
        Executor executor = (Executor) this.b.get();
        executor.getClass();
        list.getClass();
        return new aksr(abdkVar, executor, list);
    }
}
