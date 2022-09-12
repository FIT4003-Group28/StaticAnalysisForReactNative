package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: cxwv  reason: default package */
/* loaded from: classes5.dex */
final class cxwv implements Comparator<cxwm> {
    final /* synthetic */ cxww a;

    public cxwv(cxww cxwwVar) {
        this.a = cxwwVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(cxwm cxwmVar, cxwm cxwmVar2) {
        String a = cxwmVar.a();
        String a2 = cxwmVar2.a();
        return (this.a.a.getLong(a2, 0L) > this.a.a.getLong(a, 0L) ? 1 : (this.a.a.getLong(a2, 0L) == this.a.a.getLong(a, 0L) ? 0 : -1));
    }
}
