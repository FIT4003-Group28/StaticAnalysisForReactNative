package defpackage;

import android.content.Context;
import android.content.res.Resources;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kwq  reason: default package */
/* loaded from: classes7.dex */
public final class kwq implements dbty<algf> {
    final /* synthetic */ kwy a;

    public kwq(kwy kwyVar) {
        this.a = kwyVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ algf a() {
        akvz aE = ((kwf) this.a.u).A.a().aj().aE();
        Context context = this.a.b;
        btsp c = btsp.c(aE);
        vpe vpeVar = new vpe(btsp.c(this.a.o), this.a.j);
        Resources resources = this.a.b.getResources();
        kwy kwyVar = this.a;
        return new kxe(context, aE, new algi(c, vpeVar, resources, kwyVar.w, kwyVar.m));
    }
}
