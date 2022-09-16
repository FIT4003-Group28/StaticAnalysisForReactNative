package defpackage;
/* compiled from: PG */
/* renamed from: aayz  reason: default package */
/* loaded from: classes.dex */
public final class aayz implements ajga {
    private final arwd a;
    private Object b;

    public aayz(arwd arwdVar) {
        arwdVar.getClass();
        this.a = arwdVar;
    }

    @Override // defpackage.ajga
    public final auna a() {
        arwd arwdVar = this.a;
        if ((arwdVar.b & 4) != 0) {
            auna aunaVar = arwdVar.e;
            return aunaVar == null ? auna.a : aunaVar;
        }
        return null;
    }

    @Override // defpackage.ajga
    public final Object b() {
        return this.b;
    }

    @Override // defpackage.ajga
    public final void c(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.ajga
    public final byte[] d() {
        return this.a.f.I();
    }
}
