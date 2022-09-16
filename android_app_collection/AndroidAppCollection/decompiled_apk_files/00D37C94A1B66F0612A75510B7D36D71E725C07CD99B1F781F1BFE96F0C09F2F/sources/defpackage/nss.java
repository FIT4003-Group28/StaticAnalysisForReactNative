package defpackage;
/* compiled from: PG */
/* renamed from: nss  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nss implements aypx {
    public final /* synthetic */ nsw a;
    private final /* synthetic */ int b;

    public /* synthetic */ nss(nsw nswVar, int i) {
        this.b = i;
        this.a = nswVar;
    }

    @Override // defpackage.aypx
    public final Object a(Object obj, Object obj2) {
        if (this.b == 0) {
            return this.a.d(((Boolean) obj).booleanValue(), (amvn) obj2);
        }
        nsw nswVar = this.a;
        ntd ntdVar = (ntd) obj;
        int i = nsv.f;
        return new nsu(ntdVar, nswVar.a(ntdVar, ((Integer) obj2).intValue()));
    }
}
