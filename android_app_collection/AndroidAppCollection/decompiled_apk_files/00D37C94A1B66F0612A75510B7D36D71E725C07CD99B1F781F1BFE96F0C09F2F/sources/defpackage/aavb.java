package defpackage;
/* compiled from: PG */
/* renamed from: aavb  reason: default package */
/* loaded from: classes.dex */
public final class aavb implements ajga {
    private final arnu a;
    private Object b;

    public aavb(arnu arnuVar) {
        this.a = arnuVar;
    }

    @Override // defpackage.ajga
    public final auna a() {
        auna aunaVar = this.a.c;
        return aunaVar == null ? auna.a : aunaVar;
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
        return this.a.d.I();
    }
}
