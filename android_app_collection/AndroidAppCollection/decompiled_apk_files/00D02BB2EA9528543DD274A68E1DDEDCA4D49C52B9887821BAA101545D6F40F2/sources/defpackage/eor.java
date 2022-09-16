package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: eor  reason: default package */
/* loaded from: classes6.dex */
final class eor<T> implements dzsj<T> {
    final /* synthetic */ eos a;
    private final int b;

    public eor(eos eosVar, int i) {
        this.a = eosVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i == 0) {
            eos eosVar = this.a;
            return (T) new bzyt(eosVar.b.eW.bu(), eosVar.b.bb());
        } else if (i == 1) {
            this.a.b.eW.bu();
            return (T) new bzyu();
        } else if (i == 2) {
            eos eosVar2 = this.a;
            return (T) new bzyo(eosVar2.b.eW.bu(), eosVar2.b.aR());
        } else if (i == 3) {
            eos eosVar3 = this.a;
            return (T) new cavr(eosVar3.b.eW.il(), eosVar3.b.eW.bu(), eosVar3.b.eW.R());
        } else if (i != 4) {
            eos eosVar4 = this.a;
            return (T) new eco(eosVar4.b.ad(), eosVar4.b.eW.il(), eosVar4.b.lf(), eosVar4.b.eW.R());
        } else {
            eos eosVar5 = this.a;
            dzsj<Resources> fr = eosVar5.b.eW.fr();
            dzsj dzsjVar = eosVar5.a;
            if (dzsjVar == null) {
                dzsjVar = new eor(eosVar5, 5);
                eosVar5.a = dzsjVar;
            }
            return (T) new ech(fr, dzsjVar, eosVar5.b.tl());
        }
    }
}
