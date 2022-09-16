package defpackage;
/* compiled from: PG */
/* renamed from: acus  reason: default package */
/* loaded from: classes.dex */
public final class acus {
    public final ymx a = new ymx();

    public final void a(acti actiVar, aoqu aoquVar, aoqu aoquVar2) {
        aqxo.p(b(aoquVar));
        aqxo.p(b(aoquVar2));
        actiVar.E(acun.a(c(aoquVar)), acun.a(c(aoquVar2)));
    }

    public final boolean b(aoqu aoquVar) {
        return this.a.containsKey(aoquVar);
    }

    public final awbs c(aoqu aoquVar) {
        aoquVar.getClass();
        aqxo.y(b(aoquVar));
        Integer num = ((acur) this.a.get(aoquVar)).b;
        throw null;
    }

    public final void d(acti actiVar, aoqu aoquVar) {
        aqxo.p(b(aoquVar));
        actiVar.u(acun.a(c(aoquVar)), null);
    }
}
