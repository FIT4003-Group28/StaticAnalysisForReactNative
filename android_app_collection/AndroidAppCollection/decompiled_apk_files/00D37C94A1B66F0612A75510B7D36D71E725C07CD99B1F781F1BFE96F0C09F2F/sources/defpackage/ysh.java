package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ysh  reason: default package */
/* loaded from: classes4.dex */
public final class ysh implements yqn {
    private final azqb a;
    private final ysa b;

    public ysh(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, yme ymeVar) {
        ysa ysaVar = new ysa();
        if (azqbVar != null) {
            ysaVar.a = azqbVar;
            if (azqbVar2 != null) {
                ysaVar.c = azqbVar2;
                if (ymeVar != null) {
                    ysaVar.d = ymeVar;
                    if (azqbVar3 != null) {
                        ysaVar.b = azqbVar3;
                        this.b = ysaVar;
                        this.a = azqbVar;
                        return;
                    }
                    throw new NullPointerException("Null headerDecoratorProvider");
                }
                throw new NullPointerException("Null commonConfigs");
            }
            throw new NullPointerException("Null uriRewriter");
        }
        throw new NullPointerException("Null cronetEngineProvider");
    }

    @Override // defpackage.yqn
    public final /* bridge */ /* synthetic */ yqh a(yqj yqjVar) {
        azqb azqbVar;
        azqb azqbVar2;
        yme ymeVar;
        yqj yqjVar2;
        ysa ysaVar = this.b;
        if (yqjVar != null) {
            ysaVar.e = yqjVar;
            azqb azqbVar3 = ysaVar.a;
            if (azqbVar3 == null || (azqbVar = ysaVar.b) == null || (azqbVar2 = ysaVar.c) == null || (ymeVar = ysaVar.d) == null || (yqjVar2 = ysaVar.e) == null) {
                StringBuilder sb = new StringBuilder();
                if (ysaVar.a == null) {
                    sb.append(" cronetEngineProvider");
                }
                if (ysaVar.b == null) {
                    sb.append(" headerDecoratorProvider");
                }
                if (ysaVar.c == null) {
                    sb.append(" uriRewriter");
                }
                if (ysaVar.d == null) {
                    sb.append(" commonConfigs");
                }
                if (ysaVar.e == null) {
                    sb.append(" httpClientConfig");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            }
            return new yse(new ysf(azqbVar3, azqbVar, azqbVar2, ymeVar, yqjVar2));
        }
        throw new NullPointerException("Null httpClientConfig");
    }

    @Override // defpackage.yqn
    public final void b(Executor executor) {
        executor.execute(new ysg(this.a));
    }
}
