package defpackage;
/* compiled from: PG */
/* renamed from: fjk  reason: default package */
/* loaded from: classes3.dex */
public final class fjk {
    public final ajrj a;
    public ajqm b;
    public ajqm c;
    private ajqm d;
    private Object e;
    private Object f;

    public fjk() {
        ajrj ajrjVar = new ajrj();
        this.a = ajrjVar;
        this.d = new ajsm();
        this.b = new ajsm();
        this.c = new ajsm();
        ajrjVar.m(this.d);
        ajrjVar.m(this.c);
        ajrjVar.m(this.b);
    }

    public final int a(int i) {
        return i + ((ync) this.d).size();
    }

    public final void b(ajqm ajqmVar) {
        if (this.c == ajqmVar) {
            return;
        }
        if (ajqmVar == null) {
            ajqmVar = new ajsm();
        }
        this.a.r(this.c, ajqmVar);
        this.c = ajqmVar;
    }

    public final void c(Object obj) {
        if (obj == this.f) {
            return;
        }
        this.f = obj;
        ajsm ajsmVar = new ajsm();
        if (obj != null) {
            ajsmVar.add(0, obj);
        }
        this.a.r(this.b, ajsmVar);
        this.b = ajsmVar;
    }

    public final void d(Object obj) {
        if (obj == this.e) {
            return;
        }
        this.e = obj;
        ajsm ajsmVar = new ajsm();
        if (obj != null) {
            ajsmVar.add(0, obj);
        }
        this.a.r(this.d, ajsmVar);
        this.d = ajsmVar;
    }
}
