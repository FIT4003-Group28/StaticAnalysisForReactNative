package defpackage;
/* compiled from: PG */
/* renamed from: bgys  reason: default package */
/* loaded from: classes3.dex */
public abstract class bgys implements bgyn {
    private int a;

    static {
        pq.a(0.3f, 0.0f, 0.0f, 1.0f);
    }

    @Override // defpackage.bgyn
    public String e() {
        return Integer.toString(this.a);
    }

    @Override // defpackage.bgyn
    @dzsi
    public cqfc f() {
        return null;
    }

    public void g(int i) {
        this.a = i;
    }
}
