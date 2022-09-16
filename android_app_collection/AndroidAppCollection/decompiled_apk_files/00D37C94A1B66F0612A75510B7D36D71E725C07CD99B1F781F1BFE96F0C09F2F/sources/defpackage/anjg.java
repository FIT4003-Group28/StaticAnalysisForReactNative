package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: anjg  reason: default package */
/* loaded from: classes.dex */
final class anjg extends anji {
    final /* synthetic */ anjj a;
    private final aniq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anjg(anjj anjjVar, aniq aniqVar, Executor executor) {
        super(anjjVar, executor);
        this.a = anjjVar;
        aniqVar.getClass();
        this.c = aniqVar;
    }

    @Override // defpackage.anks
    public final /* bridge */ /* synthetic */ Object a() {
        ankt a = this.c.a();
        a.getClass();
        return a;
    }

    @Override // defpackage.anks
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.anji
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.a.lV((ankt) obj);
    }
}
