package defpackage;
/* compiled from: PG */
/* renamed from: crgl  reason: default package */
/* loaded from: classes5.dex */
public final class crgl implements crgy {
    private final dxio<ahjq> a;
    private final ckco b;

    public crgl(dxio<ahjq> dxioVar, ckcw ckcwVar) {
        this.a = dxioVar;
        this.b = (ckco) ckcwVar.a(ckhi.aR);
    }

    @Override // defpackage.crgy
    public final void a(crgz crgzVar) {
        ahjt h = this.a.a().h();
        int i = 8;
        if (h.b == ahjs.UNKNOWN || h.c == ahjs.UNKNOWN || h.a == ahjs.UNKNOWN) {
            this.b.a(8);
            return;
        }
        ahjs ahjsVar = h.b;
        ahjs ahjsVar2 = ahjs.HARDWARE_MISSING;
        ahjs ahjsVar3 = h.c;
        ahjs ahjsVar4 = ahjs.HARDWARE_MISSING;
        ahjs ahjsVar5 = h.a;
        ahjs ahjsVar6 = ahjs.HARDWARE_MISSING;
        if (ahjsVar != ahjsVar2) {
            i = ahjsVar5 != ahjsVar6 ? ahjsVar3 != ahjsVar4 ? 1 : 2 : ahjsVar3 != ahjsVar4 ? 3 : 5;
        } else if (ahjsVar5 != ahjsVar6) {
            i = ahjsVar3 != ahjsVar4 ? 4 : 6;
        } else if (ahjsVar3 != ahjsVar4) {
            i = 7;
        }
        this.b.a(i - 1);
    }

    @Override // defpackage.crgy
    public final void b(boolean z) {
    }
}
