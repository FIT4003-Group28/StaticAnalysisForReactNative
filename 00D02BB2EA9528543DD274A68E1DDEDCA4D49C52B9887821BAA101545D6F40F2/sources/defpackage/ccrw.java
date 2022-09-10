package defpackage;

import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ccrw  reason: default package */
/* loaded from: classes4.dex */
public final class ccrw implements bwrr<ilo> {
    public final Map<dgfb, dcdc<ccln>> a = new EnumMap(dgfb.class);
    public bkkj b = bkkj.b;

    @Override // defpackage.bwrr
    public final /* bridge */ /* synthetic */ void PV(@dzsi ilo iloVar) {
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final dcdc<ccln> a(dgfb dgfbVar) {
        return this.a.get(dgfbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.a.clear();
        this.b = bkkj.b;
    }
}
