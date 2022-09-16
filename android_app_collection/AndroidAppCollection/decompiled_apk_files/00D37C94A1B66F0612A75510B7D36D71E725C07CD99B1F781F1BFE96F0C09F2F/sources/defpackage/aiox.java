package defpackage;
/* compiled from: PG */
/* renamed from: aiox  reason: default package */
/* loaded from: classes.dex */
final class aiox implements afwa {
    final /* synthetic */ aioy a;
    private final asaa b;
    private final yiw c;
    private final String d;

    public aiox(aioy aioyVar, asaa asaaVar, yiw yiwVar, String str) {
        this.a = aioyVar;
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
