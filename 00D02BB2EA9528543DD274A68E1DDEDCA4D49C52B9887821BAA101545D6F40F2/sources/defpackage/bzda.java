package defpackage;
/* compiled from: PG */
/* renamed from: bzda  reason: default package */
/* loaded from: classes4.dex */
public final class bzda {
    private amuq[] a = new amuq[0];

    public bzda(amub amubVar) {
        a(amubVar);
    }

    public final synchronized void a(amub amubVar) {
        amtr amtrVar = amubVar.d.b[0];
        this.a = new amuq[amtrVar.e()];
        for (int i = 0; i < amtrVar.e(); i++) {
            this.a[i] = amtrVar.d(i);
        }
    }

    public final synchronized amuq b(int i) {
        return this.a[i];
    }
}
