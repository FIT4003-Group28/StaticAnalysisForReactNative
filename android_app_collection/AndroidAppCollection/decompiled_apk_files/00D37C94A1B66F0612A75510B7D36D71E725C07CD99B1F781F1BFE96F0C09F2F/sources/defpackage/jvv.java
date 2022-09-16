package defpackage;
/* compiled from: PG */
/* renamed from: jvv  reason: default package */
/* loaded from: classes3.dex */
final class jvv implements afwa {
    final /* synthetic */ jvw a;
    private final asaa b;
    private final yiw c;
    private final String d;

    public jvv(jvw jvwVar, asaa asaaVar, yiw yiwVar, String str) {
        this.a = jvwVar;
        this.b = asaaVar;
        this.c = yiwVar;
        this.d = str;
    }

    @Override // defpackage.afwa
    public final void a() {
        this.a.g();
        aiot.a(this.c, aios.h(this.b, this.d));
    }

    @Override // defpackage.afwa
    public final void b() {
        this.a.g();
        aiot.b(this.c);
    }

    @Override // defpackage.afwa
    public final void c(Exception exc) {
        this.a.g();
        aiot.a(this.c, aios.h(this.b, this.d));
    }
}
