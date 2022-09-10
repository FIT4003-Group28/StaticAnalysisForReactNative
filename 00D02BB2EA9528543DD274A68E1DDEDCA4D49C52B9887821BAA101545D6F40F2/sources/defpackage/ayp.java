package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ayp  reason: default package */
/* loaded from: classes3.dex */
final class ayp extends ayo {
    final /* synthetic */ aif a;
    final /* synthetic */ ayq b;

    public ayp(ayq ayqVar, aif aifVar) {
        this.b = ayqVar;
        this.a = aifVar;
    }

    @Override // defpackage.ayo, defpackage.aym
    public final void a(ayn aynVar) {
        ((ArrayList) this.a.get(this.b.b)).remove(aynVar);
        aynVar.E(this);
    }
}
