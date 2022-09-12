package defpackage;
/* compiled from: PG */
/* renamed from: aeal  reason: default package */
/* loaded from: classes.dex */
public final class aeal {
    final /* synthetic */ aean a;

    public aeal(aean aeanVar) {
        this.a = aeanVar;
    }

    public final void a() {
        synchronized (this.a) {
            this.a.d.remove(this);
            this.a.g();
        }
    }

    public final boolean b() {
        boolean contains;
        synchronized (this.a) {
            contains = this.a.d.contains(this);
        }
        return contains;
    }
}
