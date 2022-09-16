package defpackage;
/* compiled from: PG */
/* renamed from: yvq  reason: default package */
/* loaded from: classes4.dex */
public final class yvq implements yvs {
    private final axnm a;
    private boolean b = false;
    private final yvr c;
    private final yvw d;

    public yvq(axnm axnmVar, yvr yvrVar, yvw yvwVar) {
        this.a = axnmVar;
        this.c = yvrVar;
        this.d = yvwVar;
    }

    public yvq(Iterable iterable, yvr yvrVar, yvw yvwVar) {
        final amvn o = amvn.o(iterable);
        this.a = new axnm() { // from class: yvp
            @Override // defpackage.axnm
            public final Object get() {
                return o;
            }
        };
        this.c = yvrVar;
        this.d = yvwVar;
    }

    @Override // defpackage.yvs
    public final void a() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    this.b = true;
                    Iterable iterable = (Iterable) this.a.get();
                    iterable.getClass();
                    for (Object obj : iterable) {
                        obj.getClass();
                        this.c.a(obj);
                    }
                }
            }
        }
    }

    @Override // defpackage.yvs
    public final void b() {
        if (this.b) {
            synchronized (this) {
                if (this.b) {
                    this.b = false;
                    Iterable iterable = (Iterable) this.a.get();
                    iterable.getClass();
                    for (Object obj : iterable) {
                        obj.getClass();
                        this.d.a(obj);
                    }
                }
            }
        }
    }
}
