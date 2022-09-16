package defpackage;
/* compiled from: PG */
/* renamed from: lef  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lef implements zdt {
    public final /* synthetic */ leh a;
    private final /* synthetic */ int b;

    public /* synthetic */ lef(leh lehVar, int i) {
        this.b = i;
        this.a = lehVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.b == 0) {
            Throwable th = (Throwable) obj;
            this.a.r("");
            return;
        }
        this.a.r((String) obj);
    }
}
