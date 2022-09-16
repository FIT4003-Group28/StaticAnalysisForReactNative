package defpackage;
/* renamed from: blig  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class blig implements dbrn {
    static final dbrn a = new blig();

    private blig() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dmbc dmbcVar;
        dmbw dmbwVar = (dmbw) obj;
        if ((dmbwVar.a & 2) != 0) {
            dmbcVar = dmbwVar.c;
            if (dmbcVar == null) {
                dmbcVar = dmbc.h;
            }
        } else {
            dmbcVar = dmbwVar.b;
            if (dmbcVar == null) {
                dmbcVar = dmbc.h;
            }
        }
        return new cdsa(dmbcVar);
    }
}
