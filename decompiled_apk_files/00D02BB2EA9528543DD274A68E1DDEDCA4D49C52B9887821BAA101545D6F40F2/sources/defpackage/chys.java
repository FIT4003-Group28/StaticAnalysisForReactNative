package defpackage;
/* renamed from: chys  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class chys {
    public static chyu a(chyv chyvVar) {
        int size = chyvVar.d().size();
        if (size == 0) {
            return chyu.VISIBLE;
        }
        if (size == 1) {
            return chyvVar.d().get(0).a();
        }
        return chyu.COMPOUND;
    }

    public static boolean b(chyv chyvVar) {
        if (chyvVar.a() == chyu.COMPOUND) {
            return dcbg.b(chyvVar.d()).q(chyt.a);
        }
        return chyvVar.a() != chyu.VISIBLE;
    }
}
