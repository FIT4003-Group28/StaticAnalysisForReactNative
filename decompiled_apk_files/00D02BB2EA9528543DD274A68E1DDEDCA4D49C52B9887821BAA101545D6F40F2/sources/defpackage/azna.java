package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azna  reason: default package */
/* loaded from: classes3.dex */
public final class azna extends aznj<azxg> {
    final /* synthetic */ aznc a;

    public azna(aznc azncVar) {
        this.a = azncVar;
    }

    @Override // defpackage.aznj
    public final /* bridge */ /* synthetic */ azxg a(azxg azxgVar) {
        azxg azxgVar2 = azxgVar;
        if (this.a.f.containsKey(azxgVar2.j().b())) {
            azxf i = azxgVar2.i();
            i.h = this.a.f.get(azxgVar2.j().b());
            return i.b();
        }
        return azxgVar2;
    }
}
