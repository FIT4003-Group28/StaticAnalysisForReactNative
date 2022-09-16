package defpackage;
/* compiled from: PG */
/* renamed from: hgt  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hgt implements Runnable {
    public final /* synthetic */ hhc a;
    private final /* synthetic */ int b;

    public /* synthetic */ hgt(hhc hhcVar, int i) {
        this.b = i;
        this.a = hhcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.s.setVisibility(8);
        } else if (i == 1) {
            this.a.s.setVisibility(8);
        } else if (i == 2) {
            hfz hfzVar = this.a.A;
            hfzVar.c = null;
            hfzVar.a.clear();
        } else {
            this.a.v();
        }
    }
}
