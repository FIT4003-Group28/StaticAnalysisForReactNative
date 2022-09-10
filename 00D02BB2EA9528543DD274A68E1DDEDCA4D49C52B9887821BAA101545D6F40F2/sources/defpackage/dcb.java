package defpackage;
/* compiled from: PG */
/* renamed from: dcb  reason: default package */
/* loaded from: classes5.dex */
public final class dcb {
    public static final dbz a = new dbz();
    public static final dca b = new dca();

    public static boolean a(czh czhVar, czw czwVar, btvo btvoVar) {
        if (czhVar != czh.LIGHTHOUSE) {
            return false;
        }
        dte dteVar = czwVar.a().b;
        if (dteVar == null) {
            dteVar = dte.w;
        }
        if ((dteVar.a & 4096) != 0) {
            return dteVar.n;
        }
        dknv dknvVar = btvoVar.getAugmentedRealityParameters().a;
        if (dknvVar == null) {
            dknvVar = dknv.v;
        }
        return dknvVar.e;
    }
}
