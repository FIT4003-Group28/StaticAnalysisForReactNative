package defpackage;
/* compiled from: PG */
/* renamed from: lkz  reason: default package */
/* loaded from: classes3.dex */
public class lkz {
    public final aurg a;

    public lkz(aurg aurgVar) {
        this.a = aurgVar;
    }

    public static lkz a(aurg aurgVar) {
        int bf = awwc.bf(aurgVar.c);
        if (bf == 0) {
            bf = 1;
        }
        int i = bf - 1;
        if (i != 270) {
            if (i == 273) {
                return new lkx(aurgVar);
            }
            if (i == 280) {
                return new lky(aurgVar);
            }
            if (i == 345) {
                return new lku(aurgVar);
            }
            return new lkv(aurgVar);
        }
        return new lkw(aurgVar);
    }
}
