package defpackage;
/* compiled from: PG */
/* renamed from: ajjr  reason: default package */
/* loaded from: classes.dex */
public final class ajjr {
    private final Object a = new Object();
    private volatile ajke b = null;
    private final azqb c;

    public ajjr(azqb azqbVar) {
        this.c = azqbVar;
    }

    public final ajke a() {
        ajke ajkeVar = this.b;
        if (ajkeVar == null) {
            synchronized (this.a) {
                ajkeVar = ((ajjq) this.c).get();
                this.b = ajkeVar;
            }
        }
        return ajkeVar;
    }
}
