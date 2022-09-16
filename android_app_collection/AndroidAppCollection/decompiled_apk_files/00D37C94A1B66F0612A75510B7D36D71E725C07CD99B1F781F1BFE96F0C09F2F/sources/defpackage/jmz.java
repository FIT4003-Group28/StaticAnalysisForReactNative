package defpackage;
/* compiled from: PG */
/* renamed from: jmz  reason: default package */
/* loaded from: classes3.dex */
public final class jmz implements ajga {
    public final aakw a;
    private final aakq b;
    private final auna c;

    @Override // defpackage.ajga
    public final auna a() {
        return this.c;
    }

    @Override // defpackage.ajga
    public final Object b() {
        return this.b;
    }

    @Override // defpackage.ajga
    public final void c(Object obj) {
    }

    @Override // defpackage.ajga
    public final byte[] d() {
        return aadi.b;
    }

    public jmz(auqh auqhVar, aslq aslqVar) {
        auna aunaVar = null;
        this.a = auqhVar == null ? null : new aakw(auqhVar);
        this.b = aslqVar == null ? null : new aakq(aslqVar);
        if (aslqVar != null) {
            aopc aopcVar = (aopc) auna.a.createBuilder();
            aopcVar.e(aslq.b, aslqVar);
            aunaVar = (auna) aopcVar.mo39build();
        }
        this.c = aunaVar;
    }
}
