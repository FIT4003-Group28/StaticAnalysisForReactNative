package defpackage;
/* compiled from: PG */
/* renamed from: cqup  reason: default package */
/* loaded from: classes5.dex */
public final class cqup extends cqsj {
    public final cqun[] a;
    public cqum b;

    public cqup(cqun[] cqunVarArr) {
        super(cqunVarArr);
        this.a = cqunVarArr;
        for (cqun cqunVar : cqunVarArr) {
            if (cqunVar instanceof cqum) {
                this.b = (cqum) cqunVar;
            }
        }
        dbsk.s(this.b);
    }

    public static cqup a(cqun... cqunVarArr) {
        return new cqup(cqunVarArr);
    }
}
