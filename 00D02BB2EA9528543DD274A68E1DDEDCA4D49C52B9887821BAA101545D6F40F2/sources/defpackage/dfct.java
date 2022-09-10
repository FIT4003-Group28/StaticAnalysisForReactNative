package defpackage;
/* compiled from: PG */
/* renamed from: dfct  reason: default package */
/* loaded from: classes6.dex */
final class dfct extends dyfb {
    private final Object a = new Object();
    private dfcr b;
    private final dfcq c;

    public dfct(dfcq dfcqVar) {
        this.c = dfcqVar;
    }

    @Override // defpackage.dyfb
    public final dyfe b() {
        synchronized (this.a) {
            if (this.b != null) {
                return new dfcs();
            }
            dfcr dfcrVar = new dfcr(this.c);
            this.b = dfcrVar;
            return dfcrVar;
        }
    }
}
