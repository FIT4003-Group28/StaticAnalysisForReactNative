package defpackage;
/* compiled from: PG */
/* renamed from: ahml  reason: default package */
/* loaded from: classes.dex */
final class ahml implements Runnable {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ ahmq c;

    public ahml(ahmq ahmqVar, float f, float f2) {
        this.c = ahmqVar;
        this.a = f;
        this.b = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ahmq ahmqVar = this.c;
        float f = this.a;
        float f2 = this.b;
        afio afioVar = ahmqVar.b;
        long round = Math.round(Math.toDegrees(f));
        long round2 = Math.round(Math.toDegrees(f2));
        StringBuilder sb = new StringBuilder(23);
        sb.append((int) round);
        sb.append(":");
        sb.append((int) round2);
        afioVar.a(sb.toString());
    }
}
