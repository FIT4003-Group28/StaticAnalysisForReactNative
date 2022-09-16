package defpackage;

import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: msf  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class msf implements fmq {
    public final /* synthetic */ msg a;
    public final /* synthetic */ apos b;
    private final /* synthetic */ int c;

    public /* synthetic */ msf(msg msgVar, apos aposVar) {
        this.a = msgVar;
        this.b = aposVar;
    }

    public /* synthetic */ msf(msg msgVar, apos aposVar, int i) {
        this.c = i;
        this.a = msgVar;
        this.b = aposVar;
    }

    @Override // defpackage.fmq
    public final void a(boolean z) {
        if (this.c != 0) {
            msg msgVar = this.a;
            apos aposVar = this.b;
            itx itxVar = msgVar.c.o;
            aopa mo52toBuilder = aposVar.mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            apos aposVar2 = (apos) mo52toBuilder.instance;
            aposVar2.b |= 8;
            aposVar2.e = false;
            apos aposVar3 = (apos) mo52toBuilder.mo39build();
            if ((itxVar.a().b & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0) {
                awao awaoVar = itxVar.a().z;
                if (awaoVar == null) {
                    awaoVar = awao.a;
                }
                aopa mo52toBuilder2 = awaoVar.mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                awao awaoVar2 = (awao) mo52toBuilder2.instance;
                aposVar3.getClass();
                awaoVar2.c = aposVar3;
                awaoVar2.b = 79971800;
                awao awaoVar3 = (awao) mo52toBuilder2.mo39build();
                aopc aopcVar = (aopc) itxVar.a().mo52toBuilder();
                aopcVar.copyOnWrite();
                awar awarVar = (awar) aopcVar.instance;
                awaoVar3.getClass();
                awarVar.z = awaoVar3;
                awarVar.b |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                itxVar.b((awar) aopcVar.mo39build());
            }
            msgVar.b.d();
            return;
        }
        msg msgVar2 = this.a;
        apos aposVar4 = this.b;
        itx itxVar2 = msgVar2.c.o;
        aopa mo52toBuilder3 = aposVar4.mo52toBuilder();
        mo52toBuilder3.copyOnWrite();
        apos aposVar5 = (apos) mo52toBuilder3.instance;
        aposVar5.b |= 8;
        aposVar5.e = false;
        apos aposVar6 = (apos) mo52toBuilder3.mo39build();
        if ((itxVar2.a().b & 1073741824) != 0) {
            awao awaoVar4 = itxVar2.a().y;
            if (awaoVar4 == null) {
                awaoVar4 = awao.a;
            }
            aopa mo52toBuilder4 = awaoVar4.mo52toBuilder();
            mo52toBuilder4.copyOnWrite();
            awao awaoVar5 = (awao) mo52toBuilder4.instance;
            aposVar6.getClass();
            awaoVar5.c = aposVar6;
            awaoVar5.b = 79971800;
            awao awaoVar6 = (awao) mo52toBuilder4.mo39build();
            aopc aopcVar2 = (aopc) itxVar2.a().mo52toBuilder();
            aopcVar2.copyOnWrite();
            awar awarVar2 = (awar) aopcVar2.instance;
            awaoVar6.getClass();
            awarVar2.y = awaoVar6;
            awarVar2.b |= 1073741824;
            itxVar2.b((awar) aopcVar2.mo39build());
        }
        msgVar2.a.d();
    }
}
