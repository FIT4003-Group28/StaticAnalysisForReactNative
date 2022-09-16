package defpackage;
/* compiled from: PG */
/* renamed from: abal  reason: default package */
/* loaded from: classes.dex */
public final class abal implements ajga {
    public final atut a;
    private Object b;

    public abal(atut atutVar) {
        this.a = atutVar;
    }

    @Override // defpackage.ajga
    public final auna a() {
        auna aunaVar = this.a.d;
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
        return this.a.f.I();
    }
}
