package defpackage;
/* compiled from: PG */
/* renamed from: iek  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class iek implements ampg {
    public final /* synthetic */ iel a;
    private final /* synthetic */ int b;

    public /* synthetic */ iek(iel ielVar) {
        this.a = ielVar;
    }

    public /* synthetic */ iek(iel ielVar, int i) {
        this.b = i;
        this.a = ielVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            iel ielVar = this.a;
            aopa mo52toBuilder = ((ihr) obj).mo52toBuilder();
            int i = ielVar.f;
            mo52toBuilder.copyOnWrite();
            ((ihr) mo52toBuilder.instance).c = i;
            String str = ielVar.b;
            mo52toBuilder.copyOnWrite();
            str.getClass();
            ((ihr) mo52toBuilder.instance).e = str;
            if (ielVar.d) {
                mo52toBuilder.copyOnWrite();
                ((ihr) mo52toBuilder.instance).b = true;
            }
            return (ihr) mo52toBuilder.mo39build();
        }
        iel ielVar2 = this.a;
        aopa mo52toBuilder2 = ((ihr) obj).mo52toBuilder();
        int i2 = ielVar2.e;
        mo52toBuilder2.copyOnWrite();
        ((ihr) mo52toBuilder2.instance).d = i2;
        String str2 = ielVar2.b;
        mo52toBuilder2.copyOnWrite();
        str2.getClass();
        ((ihr) mo52toBuilder2.instance).e = str2;
        return (ihr) mo52toBuilder2.mo39build();
    }
}
