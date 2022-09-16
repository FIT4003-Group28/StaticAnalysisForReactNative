package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bnm  reason: default package */
/* loaded from: classes2.dex */
final class bnm extends bnl {
    final /* synthetic */ afw a;
    final /* synthetic */ bnn b;

    public bnm(bnn bnnVar, afw afwVar) {
        this.b = bnnVar;
        this.a = afwVar;
    }

    @Override // defpackage.bnl, defpackage.bnj
    public final void a(bnk bnkVar) {
        ((ArrayList) this.a.get(this.b.b)).remove(bnkVar);
        bnkVar.B(this);
    }
}
