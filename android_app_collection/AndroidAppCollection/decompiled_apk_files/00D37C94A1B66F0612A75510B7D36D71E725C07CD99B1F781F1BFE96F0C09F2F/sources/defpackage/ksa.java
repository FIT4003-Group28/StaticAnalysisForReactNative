package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ksa  reason: default package */
/* loaded from: classes3.dex */
public final class ksa implements afzf {
    final /* synthetic */ ksc a;
    private final afzf b;

    public ksa(ksc kscVar, afzf afzfVar) {
        this.a = kscVar;
        this.b = afzfVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        ksc kscVar = this.a;
        int i = kscVar.d + 1;
        kscVar.d = i;
        if (i > 3) {
            kscVar.d = 0;
            this.b.kV(cffVar);
            this.a.b();
            return;
        }
        ksc.e(kscVar.c, kscVar.b);
        ksc kscVar2 = this.a;
        kscVar2.c(kscVar2.c);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        this.a.d = 0;
        this.b.lG((asat) obj);
        this.a.b();
    }
}
