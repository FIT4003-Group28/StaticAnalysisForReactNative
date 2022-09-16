package defpackage;
/* compiled from: PG */
/* renamed from: llx  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class llx implements yjc {
    public final /* synthetic */ awan a;
    private final /* synthetic */ int b;

    public /* synthetic */ llx(awan awanVar) {
        this.a = awanVar;
    }

    public /* synthetic */ llx(awan awanVar, int i) {
        this.b = i;
        this.a = awanVar;
    }

    @Override // defpackage.yjc
    public final Object a(Object obj, Object obj2) {
        if (this.b == 0) {
            awan awanVar = this.a;
            awuj awujVar = (awuj) obj;
            if (!((Boolean) obj2).booleanValue()) {
                return awujVar;
            }
            aopa mo52toBuilder = awujVar.mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            awuj awujVar2 = (awuj) mo52toBuilder.instance;
            awujVar2.n = awanVar.e;
            awujVar2.b |= 32;
            return (awuj) mo52toBuilder.mo39build();
        }
        awan awanVar2 = this.a;
        awuj awujVar3 = (awuj) obj;
        if (!((Boolean) obj2).booleanValue()) {
            return awujVar3;
        }
        aopa mo52toBuilder2 = awujVar3.mo52toBuilder();
        mo52toBuilder2.copyOnWrite();
        awuj awujVar4 = (awuj) mo52toBuilder2.instance;
        awujVar4.m = awanVar2.e;
        awujVar4.b |= 16;
        return (awuj) mo52toBuilder2.mo39build();
    }
}
