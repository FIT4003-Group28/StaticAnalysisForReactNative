package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: cxwq  reason: default package */
/* loaded from: classes5.dex */
final class cxwq implements Comparator<cxwm> {
    final /* synthetic */ cxwr a;

    public cxwq(cxwr cxwrVar) {
        this.a = cxwrVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(cxwm cxwmVar, cxwm cxwmVar2) {
        String a = cxwmVar.a();
        String a2 = cxwmVar2.a();
        return this.a.a.getInt(a2, 0) - this.a.a.getInt(a, 0);
    }
}
