package defpackage;
/* compiled from: PG */
/* renamed from: dvht  reason: default package */
/* loaded from: classes.dex */
public final class dvht extends dsqp<dvhu, dvht> implements dssk {
    public dvht() {
        super(dvhu.d);
    }

    public final void a(dhxw dhxwVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dvhu dvhuVar = (dvhu) this.b;
        dvhu dvhuVar2 = dvhu.d;
        dhxwVar.getClass();
        dsrj<dhxw> dsrjVar = dvhuVar.b;
        if (!dsrjVar.a()) {
            dvhuVar.b = dsqw.cl(dsrjVar);
        }
        dvhuVar.b.add(dhxwVar);
    }
}
