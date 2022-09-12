package defpackage;
/* compiled from: PG */
/* renamed from: alwx  reason: default package */
/* loaded from: classes.dex */
public final class alwx {
    public long a = -1;
    public int b = -1;
    public int c = 0;

    public final alwy a() {
        return new alwy(this.a, this.b, this.c);
    }

    public final void b(boolean z, long j, boolean z2, int i, dmpz dmpzVar) {
        if (true != z) {
            j = -1;
        }
        this.a = j;
        if (true != z2) {
            i = -1;
        }
        this.b = i;
        this.c = (dmpzVar.a & 1) != 0 ? dmpzVar.b : 0;
    }
}
