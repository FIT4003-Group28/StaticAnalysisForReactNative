package defpackage;
/* compiled from: PG */
/* renamed from: mzm  reason: default package */
/* loaded from: classes7.dex */
public class mzm implements mzd {
    private mzl a;
    @dzsi
    private mze b;

    public mzm(mzl mzlVar) {
        this.a = mzlVar;
        this.b = c(mzlVar);
    }

    @dzsi
    private static mze c(mzl mzlVar) {
        mzn mznVar = ((mzg) mzlVar).a;
        if (mznVar == null) {
            return null;
        }
        return new mzo(mznVar);
    }

    @Override // defpackage.mzd
    @dzsi
    public mze a() {
        return this.b;
    }

    public boolean b(mzl mzlVar) {
        if (this.a.equals(mzlVar)) {
            return false;
        }
        this.a = mzlVar;
        this.b = c(mzlVar);
        return true;
    }
}
