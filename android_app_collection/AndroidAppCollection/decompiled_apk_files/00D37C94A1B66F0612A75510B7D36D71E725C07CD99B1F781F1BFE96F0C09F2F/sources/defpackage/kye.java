package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kye  reason: default package */
/* loaded from: classes3.dex */
public final class kye implements View.OnClickListener {
    final /* synthetic */ kyf a;

    public kye(kyf kyfVar) {
        this.a = kyfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kyf kyfVar = this.a;
        aqul aqulVar = kyfVar.b;
        if (aqulVar == null || (aqulVar.b & 8) == 0) {
            return;
        }
        aopa mo52toBuilder = aqulVar.mo52toBuilder();
        kyf kyfVar2 = this.a;
        acti actiVar = kyfVar2.c.a;
        apzg apzgVar = kyfVar2.b.f;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        apzg f = actiVar.f(apzgVar);
        mo52toBuilder.copyOnWrite();
        aqul aqulVar2 = (aqul) mo52toBuilder.instance;
        f.getClass();
        aqulVar2.f = f;
        aqulVar2.b |= 8;
        kyfVar.b = (aqul) mo52toBuilder.mo39build();
        kyf kyfVar3 = this.a;
        aafo aafoVar = kyfVar3.a;
        apzg apzgVar2 = kyfVar3.b.f;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        aafoVar.c(apzgVar2, null);
    }
}
