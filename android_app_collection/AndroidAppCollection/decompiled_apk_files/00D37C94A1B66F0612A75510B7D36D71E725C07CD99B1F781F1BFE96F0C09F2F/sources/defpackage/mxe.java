package defpackage;
/* compiled from: PG */
/* renamed from: mxe  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mxe implements Runnable {
    public final /* synthetic */ mxf a;
    public final /* synthetic */ aoyl b;
    private final /* synthetic */ int c;

    public /* synthetic */ mxe(mxf mxfVar, aoyl aoylVar) {
        this.a = mxfVar;
        this.b = aoylVar;
    }

    public /* synthetic */ mxe(mxf mxfVar, aoyl aoylVar, int i) {
        this.c = i;
        this.a = mxfVar;
        this.b = aoylVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            mxf mxfVar = this.a;
            mxfVar.v.c(this.b);
            mxfVar.w = false;
            return;
        }
        mxf mxfVar2 = this.a;
        mxfVar2.v.c(this.b);
        mxfVar2.w = false;
    }
}
