package defpackage;
/* compiled from: PG */
/* renamed from: axdj  reason: default package */
/* loaded from: classes2.dex */
final class axdj implements Runnable {
    final /* synthetic */ axdd a;
    final /* synthetic */ axdn b;

    public axdj(axdn axdnVar, axdd axddVar) {
        this.b = axdnVar;
        this.a = axddVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afdh afdhVar = this.b.c;
        axdd axddVar = this.a;
        String str = afdhVar.b;
        StringBuilder sb = new StringBuilder(str.length() + 50);
        sb.append("Error with ");
        sb.append(str);
        sb.append(" spatial audio renderer initialization.");
        zep.d(sb.toString(), axddVar);
    }
}
