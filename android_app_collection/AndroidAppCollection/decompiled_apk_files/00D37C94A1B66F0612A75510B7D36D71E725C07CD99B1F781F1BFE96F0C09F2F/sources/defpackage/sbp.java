package defpackage;
/* compiled from: PG */
/* renamed from: sbp  reason: default package */
/* loaded from: classes4.dex */
public class sbp {
    public sgt a;
    public int b;
    public sco c;
    public boolean d = false;

    public sbp(sco scoVar) {
        this.c = scoVar;
    }

    protected final void a() {
        this.d = true;
    }

    public final synchronized void b(float f) {
        this.c.g(f);
        a();
    }

    public synchronized void c(set setVar, set setVar2, sgt sgtVar, sgp sgpVar, boolean z) {
        this.a = sgtVar;
        this.c.x(setVar, setVar2, sgpVar, sgtVar);
        a();
    }
}
