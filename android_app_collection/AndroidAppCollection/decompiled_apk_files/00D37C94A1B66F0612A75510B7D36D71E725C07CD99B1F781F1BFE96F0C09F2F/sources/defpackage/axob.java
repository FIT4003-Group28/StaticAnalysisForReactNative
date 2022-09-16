package defpackage;
/* compiled from: PG */
/* renamed from: axob  reason: default package */
/* loaded from: classes2.dex */
public final class axob implements axon {
    private final ai a;
    private final Object b = new Object();
    private volatile eam c;

    public axob(abp abpVar) {
        this.a = new ai(abpVar, new axnw(abpVar));
    }

    @Override // defpackage.axon
    public final /* bridge */ /* synthetic */ Object lI() {
        if (this.c == null) {
            synchronized (this.b) {
                if (this.c == null) {
                    this.c = ((axny) this.a.a(axny.class)).a;
                }
            }
        }
        return this.c;
    }
}
