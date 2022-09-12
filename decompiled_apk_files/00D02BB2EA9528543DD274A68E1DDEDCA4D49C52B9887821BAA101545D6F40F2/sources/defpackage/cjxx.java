package defpackage;
/* compiled from: PG */
/* renamed from: cjxx  reason: default package */
/* loaded from: classes4.dex */
public abstract class cjxx implements Runnable {
    @dzsi
    public cjyb b = null;
    protected boolean c = false;

    public boolean a() {
        return true;
    }

    public void b() {
        dbsk.m(this.b != null, "Action isn't pending");
        this.b.d.c();
        dbsk.l(this.b.c.remove(this));
        this.b = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        this.c = true;
    }

    public final boolean d() {
        return this.b != null;
    }
}
