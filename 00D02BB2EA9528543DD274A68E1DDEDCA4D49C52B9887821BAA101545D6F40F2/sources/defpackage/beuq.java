package defpackage;
/* compiled from: PG */
/* renamed from: beuq  reason: default package */
/* loaded from: classes3.dex */
public final class beuq {
    public final btxc a;

    public beuq(btxc btxcVar) {
        this.a = btxcVar;
    }

    public static boolean b(@dzsi btvo btvoVar) {
        if (btvoVar == null) {
            return false;
        }
        return btvoVar.getPlaceSheetParameters().d();
    }

    public final boolean a() {
        return b(this.a.a().l());
    }

    public final boolean c() {
        btvo l = this.a.a().l();
        if (b(l) && l != null) {
            return l.getPlaceSheetParameters().e();
        }
        return false;
    }
}
