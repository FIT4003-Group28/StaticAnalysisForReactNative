package defpackage;
/* compiled from: PG */
/* renamed from: aaur  reason: default package */
/* loaded from: classes.dex */
public final class aaur implements ajga {
    private final armw a;
    private Object b;

    public aaur(armw armwVar) {
        armwVar.getClass();
        this.a = armwVar;
    }

    @Override // defpackage.ajga
    public final auna a() {
        armw armwVar = this.a;
        if ((armwVar.b & 8) != 0) {
            auna aunaVar = armwVar.d;
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
        return this.a.e.I();
    }
}
