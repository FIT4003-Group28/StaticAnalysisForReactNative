package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcaq  reason: default package */
/* loaded from: classes5.dex */
public final class dcaq extends dcao {
    final /* synthetic */ dcar a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcaq(dcar dcarVar) {
        super(dcarVar.d.length);
        this.a = dcarVar;
    }

    @Override // defpackage.dcao
    public final dcdn a() {
        return this.a.b;
    }

    @Override // defpackage.dcao
    public final /* bridge */ /* synthetic */ Object b(int i) {
        return new dcap(this.a, i);
    }

    @Override // defpackage.dcdn
    public final boolean c() {
        return false;
    }
}
