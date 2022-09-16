package defpackage;
/* compiled from: PG */
/* renamed from: bmuf  reason: default package */
/* loaded from: classes3.dex */
abstract class bmuf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static bmuf c(dcdc<bmud> dcdcVar, eapg eapgVar) {
        dbsk.a(dcmw.a.p(dchl.k(dcdcVar, bmue.a)));
        if (!dcdcVar.isEmpty()) {
            boolean z = false;
            if (eapgVar.compareTo(dcdcVar.get(0).a()) >= 0) {
                z = true;
            }
            dbsk.a(z);
        }
        return new bmtx(dcdcVar, eapgVar);
    }

    public abstract dcdc<bmud> a();

    public abstract eapg b();
}
