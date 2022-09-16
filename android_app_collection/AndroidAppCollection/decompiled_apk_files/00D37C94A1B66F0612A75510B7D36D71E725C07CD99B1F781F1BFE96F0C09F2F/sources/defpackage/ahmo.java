package defpackage;
/* compiled from: PG */
/* renamed from: ahmo  reason: default package */
/* loaded from: classes.dex */
final class ahmo implements Runnable {
    final /* synthetic */ double a;
    final /* synthetic */ double b;
    final /* synthetic */ String c;
    final /* synthetic */ ahmp d;

    public ahmo(ahmp ahmpVar, double d, double d2, String str) {
        this.d = ahmpVar;
        this.a = d;
        this.b = d2;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afiy afiyVar = this.d.n;
        double d = this.a;
        double d2 = this.b;
        String str = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
        sb.append(d);
        sb.append(":");
        sb.append(d2);
        sb.append(":");
        sb.append(str);
        afiyVar.a(sb.toString());
    }
}
