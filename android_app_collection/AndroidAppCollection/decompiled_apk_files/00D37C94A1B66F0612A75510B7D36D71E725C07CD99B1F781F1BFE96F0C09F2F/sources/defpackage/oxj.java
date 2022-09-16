package defpackage;
/* compiled from: PG */
/* renamed from: oxj  reason: default package */
/* loaded from: classes4.dex */
final class oxj implements Runnable {
    final /* synthetic */ oxl a;
    final /* synthetic */ oxk b;

    public oxj(oxk oxkVar, oxl oxlVar) {
        this.b = oxkVar;
        this.a = oxlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afdh afdhVar = this.b.b;
        oxl oxlVar = this.a;
        String str = afdhVar.b;
        StringBuilder sb = new StringBuilder(str.length() + 26);
        sb.append("Error with ");
        sb.append(str);
        sb.append(" audio decoder.");
        zep.d(sb.toString(), oxlVar);
    }
}
