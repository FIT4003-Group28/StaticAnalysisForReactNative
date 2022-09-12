package defpackage;
/* compiled from: PG */
/* renamed from: btsx  reason: default package */
/* loaded from: classes4.dex */
public final class btsx {
    public static <T extends btta> T a(Class<T> cls, fd fdVar) {
        boolean z = true;
        if ((fdVar instanceof btsv) && ((btsv) fdVar).bf()) {
            z = false;
        }
        dbsk.m(z, "A component for this fragment already exists. If created by a superclass, use FragmentInjectUtil#getComponent instead of creating another one.");
        return (T) btsr.a.i(cls, fdVar, btsq.b(btsy.class, fdVar.J()));
    }

    public static <T extends btta> T b(Class<T> cls, btsv btsvVar) {
        if (btsvVar.J() instanceof btsw) {
            return (T) ((btsw) btsvVar.J()).a();
        }
        return cls.cast(btsvVar.be());
    }
}
