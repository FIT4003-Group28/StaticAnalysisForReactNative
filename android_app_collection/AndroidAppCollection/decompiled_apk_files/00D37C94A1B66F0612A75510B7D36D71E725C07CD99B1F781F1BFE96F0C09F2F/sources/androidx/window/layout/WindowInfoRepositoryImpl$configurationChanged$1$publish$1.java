package androidx.window.layout;
/* compiled from: PG */
/* loaded from: classes.dex */
final class WindowInfoRepositoryImpl$configurationChanged$1$publish$1 extends azsu implements azrr {
    final /* synthetic */ azwu $channel;
    final /* synthetic */ azrr $producer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoRepositoryImpl$configurationChanged$1$publish$1(azwu azwuVar, azrr azrrVar) {
        super(0);
        this.$channel = azwuVar;
        this.$producer = azrrVar;
    }

    @Override // defpackage.azrr
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo26invoke() {
        mo26invoke();
        return azqm.a;
    }

    @Override // defpackage.azrr
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo26invoke() {
        this.$channel.g(this.$producer.mo26invoke());
    }
}
