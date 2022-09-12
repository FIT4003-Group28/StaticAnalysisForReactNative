package defpackage;
/* compiled from: PG */
/* renamed from: clmz  reason: default package */
/* loaded from: classes5.dex */
public final class clmz {
    public boolean a;
    public cloc b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;

    public clmz(cloc clocVar) {
        this.b = clocVar;
    }

    public final void a(int i) {
        boolean z = true;
        if (1 != ((this.a ? 1 : 0) | i)) {
            z = false;
        }
        this.a = z;
        this.c += i;
    }

    public final void b(int i) {
        boolean z = true;
        if (!this.d || this.e == 4) {
            this.a = true;
            this.d = true;
            this.e = i;
            return;
        }
        if (i != 4) {
            z = false;
        }
        cmmn.a(z);
    }
}
