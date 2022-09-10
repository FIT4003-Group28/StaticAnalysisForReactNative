package defpackage;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: baiw  reason: default package */
/* loaded from: classes3.dex */
public final class baiw implements crzp<Map<azxb, ilo>> {
    final /* synthetic */ baix a;

    public baiw(baix baixVar) {
        this.a = baixVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<Map<azxb, ilo>> crzmVar) {
        dbsk.l(crzmVar.k());
        Map<azxb, ilo> l = crzmVar.l();
        dbsk.s(l);
        for (Map.Entry<azxb, ilo> entry : l.entrySet()) {
            baig baigVar = this.a.g.get(entry.getKey());
            if (baigVar != null) {
                baigVar.l(this.a.f.a(entry.getValue()).a());
            }
        }
    }
}
