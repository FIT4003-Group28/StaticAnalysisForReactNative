package defpackage;
/* compiled from: PG */
/* renamed from: abxj  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abxj {
    public final /* synthetic */ abyk a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ abxj(abyk abykVar, boolean z) {
        this.a = abykVar;
        this.b = z;
    }

    public final void a(int i) {
        final abyk abykVar = this.a;
        final boolean z = this.b;
        if (i != 0 && i != 2) {
            zep.b("Error stopping capture: 1");
        }
        abykVar.k.f(new abtv() { // from class: abxi
            @Override // defpackage.abtv
            public final void a(int i2) {
                abyk abykVar2 = abyk.this;
                if (z) {
                    abyp abypVar = abykVar2.j;
                    aqxo.y(abypVar.a == 11);
                    abypVar.f(11);
                }
            }
        });
    }
}
