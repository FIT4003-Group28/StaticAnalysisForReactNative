package defpackage;
/* compiled from: PG */
/* renamed from: szw  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class szw implements ayqe {
    public final /* synthetic */ tcu a;
    public final /* synthetic */ tcs b;
    private final /* synthetic */ int c;

    public /* synthetic */ szw(tcu tcuVar, tcs tcsVar) {
        this.a = tcuVar;
        this.b = tcsVar;
    }

    public /* synthetic */ szw(tcu tcuVar, tcs tcsVar, int i) {
        this.c = i;
        this.a = tcuVar;
        this.b = tcsVar;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        int i = this.c;
        if (i == 0) {
            return this.a.d((awmt) obj, this.b, 1);
        } else if (i == 1) {
            return this.a.d((awmt) obj, this.b, 1).J();
        } else {
            return this.a.d((awmt) obj, this.b, 1);
        }
    }
}
