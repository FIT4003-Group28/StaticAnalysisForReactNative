package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clyk  reason: default package */
/* loaded from: classes5.dex */
public abstract class clyk {
    public final clye b = new clye();
    public clvk c;
    public clup d;
    public clyg e;
    public long f;
    public long g;
    public long h;
    public int i;
    public int j;
    public clyi k;
    public long l;
    public boolean m;
    public boolean n;

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(boolean z) {
        int i;
        if (z) {
            this.k = new clyi();
            this.g = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.i = i;
        this.f = -1L;
        this.h = 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract long b(cmnk cmnkVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean c(cmnk cmnkVar, long j, clyi clyiVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final long d(long j) {
        return (j * 1000000) / this.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long e(long j) {
        return (this.j * j) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(long j) {
        this.h = j;
    }
}
