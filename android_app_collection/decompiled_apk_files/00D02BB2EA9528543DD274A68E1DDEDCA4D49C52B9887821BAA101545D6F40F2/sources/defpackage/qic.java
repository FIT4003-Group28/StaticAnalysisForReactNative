package defpackage;
/* compiled from: PG */
/* renamed from: qic  reason: default package */
/* loaded from: classes7.dex */
public abstract class qic {
    @dzsi
    public static qic c(amuq amuqVar) {
        dpec a = amuqVar.a();
        dqvj c = dqvj.c(a.b);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        if (c != dqvj.WALK || (a.a & 8) == 0) {
            return null;
        }
        dgas dgasVar = a.e;
        if (dgasVar == null) {
            dgasVar = dgas.e;
        }
        return new qhm(dgasVar, alcf.t(a));
    }

    public abstract dgas a();

    @dzsi
    public abstract String b();
}
