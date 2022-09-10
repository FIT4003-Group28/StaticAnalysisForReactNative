package defpackage;
/* compiled from: PG */
/* renamed from: bzdb  reason: default package */
/* loaded from: classes4.dex */
public final class bzdb {
    public static final dqvj a = dqvj.WALK;

    public static dqvj a(amuo amuoVar) {
        dpec dpecVar = amuoVar.a;
        if (dpecVar == null || (dpecVar.a & 1) == 0) {
            return a;
        }
        dqvj c = dqvj.c(dpecVar.b);
        return c == null ? dqvj.DRIVE : c;
    }

    public static boolean b(@dzsi amuo amuoVar, @dzsi amuo amuoVar2) {
        amuq amuqVar;
        return (amuoVar == null || amuoVar2 == null || (amuqVar = amuoVar.b) == null || !amuqVar.equals(amuoVar2.b)) ? false : true;
    }

    public static boolean c(cray crayVar) {
        return crayVar.g <= 10;
    }
}
