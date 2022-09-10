package defpackage;
/* compiled from: PG */
/* renamed from: dexz  reason: default package */
/* loaded from: classes6.dex */
public final class dexz extends deyz {
    final /* synthetic */ cnnm a;

    public dexz(cnnm cnnmVar) {
        this.a = cnnmVar;
    }

    @Override // defpackage.deyz
    public final dyjb a(int i) {
        cnnh b;
        int length;
        cnnm cnnmVar = this.a;
        String[] packagesForUid = cnnmVar.a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            b = null;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    b = cnnmVar.d(packagesForUid[i2]);
                    if (b.b) {
                        break;
                    }
                    i2++;
                } else {
                    cnwc.a(b);
                    break;
                }
            }
        } else {
            b = cnnh.b("no pkgs");
        }
        if (b.b) {
            return dyjb.b;
        }
        return dyjb.h.g("Rejected by (1st-party only) security policy");
    }
}
