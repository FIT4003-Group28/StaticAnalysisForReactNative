package defpackage;
/* compiled from: PG */
/* renamed from: aktu  reason: default package */
/* loaded from: classes.dex */
final class aktu implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ aktw b;
    final /* synthetic */ int c;
    final /* synthetic */ auoo d;
    final /* synthetic */ auon e;
    final /* synthetic */ amuk f;
    final /* synthetic */ long g;
    final /* synthetic */ aktv h;

    public aktu(aktv aktvVar, String str, aktw aktwVar, int i, auoo auooVar, auon auonVar, amuk amukVar, long j) {
        this.h = aktvVar;
        this.a = str;
        this.b = aktwVar;
        this.c = i;
        this.d = auooVar;
        this.e = auonVar;
        this.f = amukVar;
        this.g = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        auop a = auoq.a();
        String str = this.a;
        a.copyOnWrite();
        auoq.c((auoq) a.instance, str);
        long j = this.b.d;
        a.copyOnWrite();
        auoq.g((auoq) a.instance, (int) j);
        int i = this.c;
        a.copyOnWrite();
        auoq.h((auoq) a.instance, i);
        auoo auooVar = this.d;
        a.copyOnWrite();
        auoq.i((auoq) a.instance, auooVar);
        auon auonVar = this.e;
        a.copyOnWrite();
        auoq.d((auoq) a.instance, auonVar);
        a.copyOnWrite();
        auoq.e((auoq) a.instance, false);
        aktv aktvVar = this.h;
        aktw aktwVar = this.b;
        amuk amukVar = this.f;
        aopa createBuilder = aqrk.a.createBuilder();
        long j2 = aktwVar.d;
        createBuilder.copyOnWrite();
        aqrk aqrkVar = (aqrk) createBuilder.instance;
        aqrkVar.b |= 1;
        aqrkVar.d = (int) j2;
        for (int i2 = 0; i2 < 6; i2++) {
            long j3 = aktwVar.c[i2];
            long j4 = aktwVar.b[i2];
            long j5 = 0;
            if (j3 > 0) {
                j5 = j4 / j3;
            }
            int i3 = (int) j5;
            if (aktwVar.a[i2] > 0 || i3 > 0) {
                aopa createBuilder2 = aqrj.a.createBuilder();
                int i4 = aktv.b[i2];
                createBuilder2.copyOnWrite();
                aqrj aqrjVar = (aqrj) createBuilder2.instance;
                aqrjVar.b |= 1;
                aqrjVar.c = i4;
                int i5 = aktwVar.a[i2];
                createBuilder2.copyOnWrite();
                aqrj aqrjVar2 = (aqrj) createBuilder2.instance;
                aqrjVar2.b |= 2;
                aqrjVar2.d = i5;
                createBuilder2.copyOnWrite();
                aqrj aqrjVar3 = (aqrj) createBuilder2.instance;
                aqrjVar3.b |= 4;
                aqrjVar3.e = i3;
                createBuilder.copyOnWrite();
                aqrk aqrkVar2 = (aqrk) createBuilder.instance;
                aqrj aqrjVar4 = (aqrj) createBuilder2.mo39build();
                aqrjVar4.getClass();
                aopu aopuVar = aqrkVar2.c;
                if (!aopuVar.c()) {
                    aqrkVar2.c = aopi.mutableCopy(aopuVar);
                }
                aqrkVar2.c.add(aqrjVar4);
            }
        }
        aopa createBuilder3 = aqeq.a.createBuilder();
        int i6 = aktvVar.r;
        createBuilder3.copyOnWrite();
        aqeq aqeqVar = (aqeq) createBuilder3.instance;
        aqeqVar.b |= 1;
        aqeqVar.d = i6;
        createBuilder3.aa(amukVar);
        createBuilder.copyOnWrite();
        aqrk aqrkVar3 = (aqrk) createBuilder.instance;
        aqeq aqeqVar2 = (aqeq) createBuilder3.mo39build();
        aqeqVar2.getClass();
        aqrkVar3.e = aqeqVar2;
        aqrkVar3.b |= 2;
        a.copyOnWrite();
        auoq.f((auoq) a.instance, (aqrk) createBuilder.mo39build());
        arrf a2 = arrh.a();
        a2.copyOnWrite();
        ((arrh) a2.instance).dC((auoq) a.mo39build());
        this.h.o.f((arrh) a2.mo39build(), this.g);
    }
}
