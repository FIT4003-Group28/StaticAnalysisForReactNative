package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcam  reason: default package */
/* loaded from: classes5.dex */
public final class dcam extends dcao {
    final /* synthetic */ dcar a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcam(dcar dcarVar) {
        super(dcarVar.e.length);
        this.a = dcarVar;
    }

    @Override // defpackage.dcao
    public final dcdn a() {
        return this.a.c;
    }

    @Override // defpackage.dcao
    public final /* bridge */ /* synthetic */ Object b(int i) {
        return new dcal(this.a, i);
    }

    @Override // defpackage.dcdn
    public final boolean c() {
        return false;
    }
}
