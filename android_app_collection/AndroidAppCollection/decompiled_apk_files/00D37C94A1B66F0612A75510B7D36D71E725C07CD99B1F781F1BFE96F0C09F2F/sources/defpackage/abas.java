package defpackage;
/* compiled from: PG */
/* renamed from: abas  reason: default package */
/* loaded from: classes.dex */
public final class abas implements ajga {
    private final aruh a;
    private Object b;

    public abas(aruh aruhVar) {
        this.a = aruhVar;
    }

    @Override // defpackage.ajga
    public final auna a() {
        aruh aruhVar = this.a;
        if ((aruhVar.b & 4) != 0) {
            auna aunaVar = aruhVar.e;
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
