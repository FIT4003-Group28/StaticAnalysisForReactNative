package defpackage;
/* compiled from: PG */
/* renamed from: ajsz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ajsz implements Runnable {
    public final /* synthetic */ ajtd a;
    public final /* synthetic */ yo b;
    private final /* synthetic */ int c;

    public /* synthetic */ ajsz(ajtd ajtdVar, yo yoVar) {
        this.a = ajtdVar;
        this.b = yoVar;
    }

    public /* synthetic */ ajsz(ajtd ajtdVar, yo yoVar, int i) {
        this.c = i;
        this.a = ajtdVar;
        this.b = yoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            this.a.a(this.b);
        } else {
            this.a.a(this.b);
        }
    }
}
