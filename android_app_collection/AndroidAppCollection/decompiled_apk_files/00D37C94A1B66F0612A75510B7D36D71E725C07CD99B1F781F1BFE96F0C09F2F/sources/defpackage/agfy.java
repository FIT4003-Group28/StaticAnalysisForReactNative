package defpackage;
/* compiled from: PG */
/* renamed from: agfy  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agfy implements Runnable {
    public final /* synthetic */ ji a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ agfy(ji jiVar, int i) {
        this.a = jiVar;
        this.b = i;
    }

    public /* synthetic */ agfy(ji jiVar, int i, int i2) {
        this.c = i2;
        this.a = jiVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            this.a.accept(Integer.valueOf(this.b));
        } else {
            this.a.accept(Integer.valueOf(this.b));
        }
    }
}
