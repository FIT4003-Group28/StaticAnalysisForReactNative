package defpackage;
/* compiled from: PG */
/* renamed from: dasd  reason: default package */
/* loaded from: classes5.dex */
public final class dasd {
    private final dasj a;
    private final dase b;

    public dasd(dasj dasjVar, dase daseVar) {
        this.a = dasjVar;
        this.b = daseVar;
    }

    public final dasc a(String str, darw darwVar, darx darxVar) {
        dasc dascVar = new dasc(this.a);
        dase daseVar = this.b;
        if (daseVar != null) {
            daseVar.a(dascVar);
        }
        dascVar.b(str);
        if (darwVar != null) {
            dascVar.g = darwVar;
        }
        if (darxVar != null) {
            dascVar.d = darxVar;
        }
        return dascVar;
    }
}
