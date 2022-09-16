package defpackage;
/* compiled from: PG */
/* renamed from: aior  reason: default package */
/* loaded from: classes.dex */
public class aior {
    public final String a;
    public final yiw b;
    final /* synthetic */ aios c;
    private final asaa d;

    public aior(aios aiosVar, asaa asaaVar, yiw yiwVar, String str) {
        this.c = aiosVar;
        this.a = str;
        this.d = asaaVar;
        this.b = yiwVar;
    }

    public final void b() {
        aiot.a(this.b, aios.h(this.d, this.a));
    }

    public void a() {
        int cj = awwc.cj(this.d.c);
        if (cj == 0 || cj != 4) {
            int cj2 = awwc.cj(this.d.c);
            if (cj2 != 0 && cj2 == 6) {
                this.c.b = anlz.q(true);
                this.c.e();
            }
            int cj3 = awwc.cj(this.d.c);
            if (cj3 != 0 && cj3 == 5) {
                this.c.c = true;
            }
            aiot.b(this.b);
            return;
        }
        this.c.b(this.d, this.b, this.a);
    }
}
