package defpackage;
/* compiled from: PG */
/* renamed from: aayu  reason: default package */
/* loaded from: classes.dex */
final class aayu implements ajga {
    final /* synthetic */ arwb a;
    private Object b;

    public aayu(arwb arwbVar) {
        this.a = arwbVar;
    }

    @Override // defpackage.ajga
    public final auna a() {
        arwb arwbVar = this.a;
        if ((arwbVar.b & 4) != 0) {
            auna aunaVar = arwbVar.d;
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
