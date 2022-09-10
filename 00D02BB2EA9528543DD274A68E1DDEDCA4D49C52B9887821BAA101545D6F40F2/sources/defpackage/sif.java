package defpackage;
/* compiled from: PG */
/* renamed from: sif  reason: default package */
/* loaded from: classes7.dex */
public final class sif {
    public static boolean a(btvo btvoVar) {
        return btvoVar.getTransitPagesParameters().v;
    }

    public static boolean b(btvo btvoVar) {
        return btvoVar.getCommuteSetupParameters().j;
    }

    public static boolean c(btvo btvoVar) {
        dunm commuteSetupParameters = btvoVar.getCommuteSetupParameters();
        return commuteSetupParameters.j || commuteSetupParameters.k;
    }
}
