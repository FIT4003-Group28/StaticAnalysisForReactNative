package defpackage;
/* compiled from: PG */
/* renamed from: erq  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class erq implements aniq {
    public final /* synthetic */ err a;
    public final /* synthetic */ auqu b;
    private final /* synthetic */ int c;

    public /* synthetic */ erq(err errVar, auqu auquVar) {
        this.a = errVar;
        this.b = auquVar;
    }

    public /* synthetic */ erq(err errVar, auqu auquVar, int i) {
        this.c = i;
        this.a = errVar;
        this.b = auquVar;
    }

    @Override // defpackage.aniq
    public final ankt a() {
        boolean z = false;
        if (this.c == 0) {
            err errVar = this.a;
            auqu auquVar = this.b;
            if (auquVar.b == 3) {
                z = ((Boolean) auquVar.c).booleanValue();
            }
            return ((yvc) ((fcu) errVar.b.get()).c.get()).b(new fco(((afvn) errVar.c.get()).c().b(), z, 1));
        }
        err errVar2 = this.a;
        auqu auquVar2 = this.b;
        if (auquVar2.b == 3) {
            z = ((Boolean) auquVar2.c).booleanValue();
        }
        return ((fcu) errVar2.b.get()).e(((afvn) errVar2.c.get()).c().b(), z);
    }
}
