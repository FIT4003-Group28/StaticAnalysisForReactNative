package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axjl  reason: default package */
/* loaded from: classes3.dex */
public final class axjl<T> implements dzaz<dimq> {
    final /* synthetic */ axjm a;
    final /* synthetic */ dimm b;

    public axjl(axjm axjmVar, dimm dimmVar) {
        this.a = axjmVar;
        this.b = dimmVar;
    }

    @Override // defpackage.dzaz
    public final /* bridge */ /* synthetic */ void SR(dimq dimqVar) {
        dimq dimqVar2 = dimqVar;
        dzgn<axjk> dzgnVar = this.a.a;
        String str = this.b.b;
        dzvx.b(str, "request.getObfuscatedGaiaId()");
        dzvx.b(dimqVar2, "it");
        dzgnVar.c(new axjk(str, dimqVar2));
    }
}
