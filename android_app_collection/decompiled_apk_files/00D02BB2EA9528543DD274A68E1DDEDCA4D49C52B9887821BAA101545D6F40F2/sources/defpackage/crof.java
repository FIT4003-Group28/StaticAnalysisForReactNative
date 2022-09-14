package defpackage;
/* compiled from: PG */
/* renamed from: crof  reason: default package */
/* loaded from: classes5.dex */
public final class crof<T> extends btrh<T> {
    public crof(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        croe croeVar = (croe) this.a;
        crih crihVar = (crih) obj;
        synchronized (croeVar) {
            croeVar.c(croeVar.b, ((atbs) ((dbsu) croeVar.a).a).b(), ((atbs) ((dbsu) croeVar.a).a).d());
        }
    }
}
