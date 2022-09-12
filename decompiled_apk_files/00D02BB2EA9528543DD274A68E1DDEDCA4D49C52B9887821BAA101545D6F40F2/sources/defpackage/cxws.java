package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: cxws  reason: default package */
/* loaded from: classes5.dex */
final class cxws implements Comparator<cxwm> {
    final /* synthetic */ cxwt a;

    public cxws(cxwt cxwtVar) {
        this.a = cxwtVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(cxwm cxwmVar, cxwm cxwmVar2) {
        String a = cxwmVar.a();
        return this.a.a.get(cxwmVar2.a()).intValue() - this.a.a.get(a).intValue();
    }
}
