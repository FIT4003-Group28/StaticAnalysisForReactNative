package defpackage;

import android.content.res.Resources;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eox  reason: default package */
/* loaded from: classes6.dex */
public final class eox<T> implements dzsj<T> {
    final /* synthetic */ eoy a;
    private final int b;

    public eox(eoy eoyVar, int i) {
        this.a = eoyVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                eoy eoyVar = this.a;
                return (T) new apim(eoyVar.b.eW.er(), eoyVar.b.eW.oB(), eoyVar.b.ad(), eoyVar.b.eW.lL(), eoyVar.c());
            } else if (i != 2) {
                eoy eoyVar2 = this.a;
                return (T) new aphy(eoyVar2.b.ad(), eoyVar2.b.eW.er());
            } else {
                return (T) this.a.b();
            }
        }
        eoy eoyVar3 = this.a;
        dzsj<Resources> fr = eoyVar3.b.eW.fr();
        dzsj dzsjVar = eoyVar3.a;
        if (dzsjVar == null) {
            dzsjVar = new eox(eoyVar3, 1);
            eoyVar3.a = dzsjVar;
        }
        return (T) new apii(fr, dzsjVar, eoyVar3.b.eW.al(), eoyVar3.c());
    }
}
