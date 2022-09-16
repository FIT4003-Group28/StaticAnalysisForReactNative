package defpackage;
/* compiled from: PG */
/* renamed from: cqsj  reason: default package */
/* loaded from: classes.dex */
public class cqsj implements cqku, cqur {
    private final cqhs a;
    public final boolean g;

    public cqsj(Object[] objArr) {
        this.a = new cqhs(getClass(), objArr);
        this.g = cqvl.c(objArr);
    }

    @Override // defpackage.cqur
    public boolean NJ() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cqsj) && this.a.equals(((cqsj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
