package defpackage;
/* compiled from: PG */
/* renamed from: algk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class algk implements Runnable {
    public final /* synthetic */ algq a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ algk(algq algqVar, String str) {
        this.a = algqVar;
        this.b = str;
    }

    public /* synthetic */ algk(algq algqVar, String str, int i) {
        this.c = i;
        this.a = algqVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            this.a.e(this.b);
        } else if (i == 1) {
            this.a.e(this.b);
        } else if (i == 2) {
            this.a.e(this.b);
        } else if (i == 3) {
            this.a.e(this.b);
        } else {
            algq algqVar = this.a;
            String str = this.b;
            algqVar.b(str, false);
            algqVar.e(str);
        }
    }
}
