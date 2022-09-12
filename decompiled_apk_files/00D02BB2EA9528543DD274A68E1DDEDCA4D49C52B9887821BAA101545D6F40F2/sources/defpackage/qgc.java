package defpackage;
/* compiled from: PG */
/* renamed from: qgc  reason: default package */
/* loaded from: classes7.dex */
public final class qgc {
    private final alec a;
    private final aksp b;
    private final akpq c;
    private final akzh d;

    public qgc(akto aktoVar, alec alecVar, akpq akpqVar, akzh akzhVar) {
        this.a = alecVar;
        this.b = aktoVar.b();
        this.c = akpqVar;
        this.d = akzhVar;
    }

    public final qge a(akqq akqqVar) {
        return new qge(akqqVar, this.a, this.b, this.c, this.d);
    }
}
