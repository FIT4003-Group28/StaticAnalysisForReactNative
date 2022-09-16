package defpackage;
/* compiled from: PG */
/* renamed from: ajwu  reason: default package */
/* loaded from: classes.dex */
final class ajwu implements Runnable {
    final /* synthetic */ ajwv a;

    public ajwu(ajwv ajwvVar) {
        this.a = ajwvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ajwv ajwvVar = this.a;
        ajxh ajxhVar = ajwvVar.c;
        ajxhVar.ab(ajwvVar.b, null, aclb.p, ajxhVar.V(), new ajxa(true));
    }
}
