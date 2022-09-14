package defpackage;
/* compiled from: PG */
/* renamed from: cydx  reason: default package */
/* loaded from: classes5.dex */
public abstract class cydx {
    @dzsi
    public static cydx c(cyer cyerVar, cyes cyesVar) {
        if (cyesVar.equals(cyes.SUCCESS) || cyesVar.equals(cyes.SKIPPED)) {
            return null;
        }
        return new cycr(cyerVar, cyesVar);
    }

    public abstract cyer a();

    public abstract cyes b();
}
