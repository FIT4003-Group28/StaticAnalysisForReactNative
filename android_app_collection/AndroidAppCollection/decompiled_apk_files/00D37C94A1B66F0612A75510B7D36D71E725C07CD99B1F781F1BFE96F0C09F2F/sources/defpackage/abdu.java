package defpackage;

import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: abdu  reason: default package */
/* loaded from: classes.dex */
public final class abdu extends aars {
    private final afvn a;
    private final aarl b;

    public abdu(aaqj aaqjVar, aaqf aaqfVar, afvn afvnVar, yqw yqwVar) {
        super(aaqfVar, yqwVar);
        this.a = afvnVar;
        this.b = c(asgb.a, aaqjVar, abcj.n, abdw.b);
    }

    public final abdt a() {
        return new abdt(this.e, this.a.c());
    }

    public final abdt b(String str) {
        return new abdt(this.e, this.a.d(str));
    }

    public final ankt d(aaqs aaqsVar) {
        return this.b.a(aaqsVar);
    }

    public final asgb e(abdt abdtVar) {
        ylr.b();
        try {
            return (asgb) d(abdtVar).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new aart(e);
        }
    }
}
