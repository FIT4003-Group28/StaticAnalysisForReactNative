package defpackage;
/* compiled from: PG */
/* renamed from: lrr  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lrr implements zdt {
    public final /* synthetic */ lrs a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ lrr(lrs lrsVar, Object obj) {
        this.a = lrsVar;
        this.b = obj;
    }

    public /* synthetic */ lrr(lrs lrsVar, Object obj, int i) {
        this.c = i;
        this.a = lrsVar;
        this.b = obj;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.c == 0) {
            Throwable th = (Throwable) obj;
            this.a.a.d.a((awaj) this.b);
            return;
        }
        lrs lrsVar = this.a;
        Object obj2 = this.b;
        if (((Boolean) obj).booleanValue()) {
            return;
        }
        lrsVar.a.d.a((awaj) obj2);
    }
}
