package defpackage;
/* compiled from: PG */
/* renamed from: hmx  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hmx implements ampg {
    public final /* synthetic */ hni a;
    private final /* synthetic */ int b;

    public /* synthetic */ hmx(hni hniVar) {
        this.a = hniVar;
    }

    public /* synthetic */ hmx(hni hniVar, int i) {
        this.b = i;
        this.a = hniVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            hni hniVar = this.a;
            aopa mo52toBuilder = ((hwp) obj).mo52toBuilder();
            boolean z = hniVar.C;
            mo52toBuilder.copyOnWrite();
            ((hwp) mo52toBuilder.instance).d = z;
            return (hwp) mo52toBuilder.mo39build();
        }
        hni hniVar2 = this.a;
        hwp hwpVar = (hwp) obj;
        if (hniVar2.b.c() == null) {
            return hwpVar;
        }
        hniVar2.b.c().b();
        aopa mo52toBuilder2 = hwpVar.mo52toBuilder();
        String b = hniVar2.b.c().b();
        boolean z2 = hniVar2.I;
        mo52toBuilder2.copyOnWrite();
        hwp hwpVar2 = (hwp) mo52toBuilder2.instance;
        aoqp aoqpVar = hwpVar2.r;
        if (!aoqpVar.b) {
            hwpVar2.r = aoqpVar.a();
        }
        hwpVar2.r.put(b, Boolean.valueOf(z2));
        return (hwp) mo52toBuilder2.mo39build();
    }
}
