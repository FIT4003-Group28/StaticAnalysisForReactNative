package defpackage;
/* compiled from: PG */
/* renamed from: arcv  reason: default package */
/* loaded from: classes2.dex */
public final class arcv {
    public arcw a;
    public final ardc b;

    public arcv(arcw arcwVar, ardc ardcVar) {
        this.a = arcwVar;
        this.b = ardcVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final arct a(arcu arcuVar) {
        ardc ardcVar = this.b;
        int a = arcuVar.a(this.a);
        String str = arcuVar.l;
        int i = arcuVar.m;
        return new arct(ardcVar.b, str, ardcVar.a(a), i, arcuVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(@dzsi arct arctVar) {
        if (arctVar == null) {
            return;
        }
        this.b.b(arctVar, arctVar.g.a(this.a));
    }
}
