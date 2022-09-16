package defpackage;
/* compiled from: PG */
/* renamed from: pin  reason: default package */
/* loaded from: classes4.dex */
public final class pin {
    public boolean a;
    public pjs b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;

    public pin(pjs pjsVar) {
        this.b = pjsVar;
    }

    public final void a(int i) {
        boolean z = true;
        if (1 != ((this.a ? 1 : 0) | i)) {
            z = false;
        }
        this.a = z;
        this.c += i;
    }
}
