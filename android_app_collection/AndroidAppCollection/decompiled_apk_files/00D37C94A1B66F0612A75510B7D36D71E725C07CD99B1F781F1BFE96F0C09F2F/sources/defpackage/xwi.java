package defpackage;
/* compiled from: PG */
/* renamed from: xwi  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xwi implements ayqe {
    public final /* synthetic */ xwk a;
    private final /* synthetic */ int b;

    public /* synthetic */ xwi(xwk xwkVar) {
        this.a = xwkVar;
    }

    public /* synthetic */ xwi(xwk xwkVar, int i) {
        this.b = i;
        this.a = xwkVar;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        if (this.b == 0) {
            return aynr.t(new xwh(this.a, (bahm) obj));
        }
        return aynr.t(new xwh(this.a, (bahm) obj, 1));
    }
}
