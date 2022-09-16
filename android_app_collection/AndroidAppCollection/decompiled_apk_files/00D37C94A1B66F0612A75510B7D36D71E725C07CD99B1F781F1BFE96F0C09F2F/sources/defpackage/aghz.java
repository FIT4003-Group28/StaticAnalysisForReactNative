package defpackage;
/* compiled from: PG */
/* renamed from: aghz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aghz implements Runnable {
    public final /* synthetic */ agia a;
    public final /* synthetic */ agqz b;
    private final /* synthetic */ int c;

    public /* synthetic */ aghz(agia agiaVar, agqz agqzVar) {
        this.a = agiaVar;
        this.b = agqzVar;
    }

    public /* synthetic */ aghz(agia agiaVar, agqz agqzVar, int i) {
        this.c = i;
        this.a = agiaVar;
        this.b = agqzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            this.a.m(this.b);
        } else if (i == 1) {
            this.a.m(this.b);
        } else if (i == 2) {
            this.a.m(this.b);
        } else {
            this.a.m(this.b);
        }
    }
}
