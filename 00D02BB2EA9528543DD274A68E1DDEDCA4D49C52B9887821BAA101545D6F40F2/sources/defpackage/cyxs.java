package defpackage;
/* compiled from: PG */
/* renamed from: cyxs  reason: default package */
/* loaded from: classes5.dex */
final class cyxs implements dbsl<cyvs> {
    @Override // defpackage.dbsl
    public final /* bridge */ /* synthetic */ boolean a(@dzsi cyvs cyvsVar) {
        cyvs cyvsVar2 = cyvsVar;
        if (cyvsVar2 != null) {
            if (cyvsVar2.f == cyxk.GROUP) {
                if (cyvsVar2.w > 0) {
                    return true;
                }
            } else if (cyxk.a(cyvsVar2.f)) {
                return !cyvsVar2.a().isEmpty() || !cyvsVar2.g().isEmpty();
            }
        }
        return false;
    }
}
