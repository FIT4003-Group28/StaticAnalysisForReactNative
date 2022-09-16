package defpackage;
/* compiled from: PG */
/* renamed from: wkx  reason: default package */
/* loaded from: classes4.dex */
public final class wkx {
    public final xdu a;
    public xci b;
    public int c;

    public wkx(xdu xduVar) {
        this.a = xduVar;
    }

    public final String a() {
        int i = this.c;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "RENDERING" : "ENTERED" : "ENTER_REQUESTED" : "SCHEDULED" : "NOT_SCHEDULED";
    }

    public final boolean b() {
        int i = this.c;
        return i == 2 || i == 3 || i == 4;
    }

    public final boolean c() {
        return this.c == 4;
    }
}
