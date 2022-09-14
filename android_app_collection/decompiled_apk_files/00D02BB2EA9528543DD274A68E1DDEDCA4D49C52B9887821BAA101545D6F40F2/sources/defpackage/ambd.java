package defpackage;
/* compiled from: PG */
/* renamed from: ambd  reason: default package */
/* loaded from: classes.dex */
final class ambd {
    final /* synthetic */ ambe a;
    private final dxio<amcf> b;
    @dzsi
    private amch c = null;
    private boolean d = false;

    public ambd(ambe ambeVar, dxio<amcf> dxioVar) {
        this.a = ambeVar;
        this.b = dxioVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final synchronized amch a() {
        if (this.d) {
            return this.c;
        }
        ambe ambeVar = this.a;
        amch b = this.b.a().b(ambeVar.c, ambeVar.h);
        this.c = b;
        this.d = true;
        return b;
    }
}
