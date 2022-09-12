package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aloh  reason: default package */
/* loaded from: classes.dex */
public final class aloh implements Runnable {
    boolean a;
    private final aloi b;
    private int c = -1;

    public aloh(aloi aloiVar) {
        this.b = aloiVar;
    }

    public final synchronized void a(int i) {
        this.c = i;
        b();
    }

    public final synchronized void b() {
        if (!this.a) {
            this.a = true;
            this.b.b.execute(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        dcdc r;
        synchronized (this) {
            i = this.c;
            this.a = false;
        }
        aloi aloiVar = this.b;
        synchronized (aloiVar) {
            r = dcdc.r(aloiVar.c);
        }
        int size = r.size();
        for (i2 = 0; i2 < size; i2++) {
            ((alkx) r.get(i2)).F(aloiVar.a, i);
        }
        aloiVar.b(true);
    }
}
