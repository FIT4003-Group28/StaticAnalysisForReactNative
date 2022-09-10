package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aznq  reason: default package */
/* loaded from: classes3.dex */
public final class aznq implements aznm<Boolean> {
    final /* synthetic */ azwm a;
    final /* synthetic */ azof b;

    public aznq(azof azofVar, azwm azwmVar) {
        this.b = azofVar;
        this.a = azwmVar;
    }

    @Override // defpackage.aznm
    public final /* bridge */ /* synthetic */ Boolean a() {
        azxm h = this.a.h();
        dbsk.s(h);
        azxl b = h.b();
        azwl azwlVar = this.a.j;
        dbsk.s(azwlVar);
        return Boolean.valueOf(aznn.r(b, azwlVar.a));
    }
}
