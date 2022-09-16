package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: yii  reason: default package */
/* loaded from: classes4.dex */
public final class yii implements axou {
    private final azqb a;

    public yii(azqb azqbVar) {
        this.a = azqbVar;
    }

    public static yig b(Executor executor) {
        return new yig(executor);
    }

    public static yii c(azqb azqbVar) {
        return new yii(azqbVar);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final yig get() {
        return b((Executor) this.a.get());
    }
}
