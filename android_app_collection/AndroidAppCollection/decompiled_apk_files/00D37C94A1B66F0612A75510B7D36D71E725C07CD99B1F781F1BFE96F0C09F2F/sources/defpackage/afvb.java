package defpackage;
/* compiled from: PG */
/* renamed from: afvb  reason: default package */
/* loaded from: classes.dex */
public final class afvb {
    private final afvn a;
    private final yni b;

    public afvb(afvn afvnVar, yni yniVar) {
        this.a = afvnVar;
        this.b = yniVar;
    }

    public final afvd a(ampg ampgVar) {
        afvd afvdVar = new afvd(this.a, ampgVar);
        this.b.g(afvdVar);
        afvdVar.b();
        return afvdVar;
    }

    public final afvd b(final amqo amqoVar) {
        return a(new ampg() { // from class: afva
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                afvm afvmVar = (afvm) obj;
                return (afuz) amqo.this.get();
            }
        });
    }
}
