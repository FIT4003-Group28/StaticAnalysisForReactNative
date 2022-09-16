package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aaoq  reason: default package */
/* loaded from: classes.dex */
public final class aaoq {
    public static final aaoq a = new aaoq(aadk.a, usw.k, new qrj(4));
    public final aadj b;
    public final azqb c;
    private final Executor d;

    public aaoq(aadj aadjVar, azqb azqbVar, Executor executor) {
        this.b = aadjVar;
        azqbVar.getClass();
        this.c = azqbVar;
        executor.getClass();
        this.d = executor;
    }

    public final void a(aoqu aoquVar) {
        this.d.execute(new aaop(this, aoquVar));
    }
}
