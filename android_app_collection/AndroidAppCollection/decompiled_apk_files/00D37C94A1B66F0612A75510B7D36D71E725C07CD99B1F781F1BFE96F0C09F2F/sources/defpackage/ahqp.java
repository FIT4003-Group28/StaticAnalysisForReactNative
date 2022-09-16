package defpackage;
/* compiled from: PG */
/* renamed from: ahqp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahqp implements ahjt {
    public final /* synthetic */ ahpv a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahqp(ahpv ahpvVar) {
        this.a = ahpvVar;
    }

    public /* synthetic */ ahqp(ahpv ahpvVar, int i) {
        this.b = i;
        this.a = ahpvVar;
    }

    @Override // defpackage.ahjt
    public final void a() {
        int i = this.b;
        if (i == 0) {
            ahpv ahpvVar = this.a;
            int i2 = ahqq.e;
            ahpvVar.a();
        } else if (i == 1) {
            ahpv ahpvVar2 = this.a;
            int i3 = ahqq.e;
            ahpvVar2.a();
        } else if (i == 2) {
            ahpv ahpvVar3 = this.a;
            int i4 = ahqq.e;
            ahpx ahpxVar = ahpvVar3.a.a;
            ahpxVar.a.post(new ahpq(ahpxVar));
            ahpxVar.k = false;
            ahpxVar.k();
        } else if (i == 3) {
            ahpv ahpvVar4 = this.a;
            int i5 = ahqq.e;
            ahpx ahpxVar2 = ahpvVar4.a.a;
            ahpxVar2.a.post(new ahpq(ahpxVar2, 1));
            ahpxVar2.o = true;
        } else {
            ahpv ahpvVar5 = this.a;
            int i6 = ahqq.e;
            ahpx ahpxVar3 = ahpvVar5.a.a;
            ahpxVar3.a.post(new ahpq(ahpxVar3, 3));
            ahpxVar3.o = true;
        }
    }
}
