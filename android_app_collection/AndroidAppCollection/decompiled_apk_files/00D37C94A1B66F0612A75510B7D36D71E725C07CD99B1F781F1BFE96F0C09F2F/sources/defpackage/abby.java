package defpackage;
/* compiled from: PG */
/* renamed from: abby  reason: default package */
/* loaded from: classes.dex */
public final class abby extends aarq {
    private final abfh a;

    public abby(aaqj aaqjVar, yqw yqwVar, abfh abfhVar) {
        super(aaqjVar, yqwVar, arxs.a, abaa.t, abbc.g);
        this.a = abfhVar;
    }

    @Override // defpackage.aarq
    public final /* bridge */ /* synthetic */ Object h(aoqu aoquVar) {
        final arxs arxsVar = (arxs) aoquVar;
        if ((arxsVar.b & 8) != 0) {
            abfg a = this.a.a();
            ((abfl) a).b = new ampg() { // from class: abbx
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    apij apijVar = (apij) obj;
                    apij apijVar2 = arxs.this.e;
                    return apijVar2 == null ? apij.a : apijVar2;
                }
            };
            ylx.m(a.a(), ngc.s);
        }
        return arxsVar;
    }
}
