package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: aaej  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aaej implements anir {
    public final /* synthetic */ aael a;
    public final /* synthetic */ tpw b;
    private final /* synthetic */ int c;

    public /* synthetic */ aaej(aael aaelVar, tpw tpwVar) {
        this.a = aaelVar;
        this.b = tpwVar;
    }

    public /* synthetic */ aaej(aael aaelVar, tpw tpwVar, int i) {
        this.c = i;
        this.a = aaelVar;
        this.b = tpwVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        Integer num;
        if (this.c != 0) {
            aael aaelVar = this.a;
            tpw tpwVar = this.b;
            if (!((Boolean) obj).booleanValue()) {
                ((aaeo) aaelVar.d.get()).a(aqkb.DATA_PUSH_CLIENT_EVENT_TYPE_ADD_FILE_GROUP_FAILED, tpwVar.c);
                String valueOf = String.valueOf(tpwVar.c);
                throw new IOException(valueOf.length() != 0 ? "Unable to add filegroup: ".concat(valueOf) : new String("Unable to add filegroup: "));
            }
            aaek aaekVar = new aaek(aaelVar);
            trc trcVar = (trc) aaelVar.b.get();
            tqb tqbVar = new tqb(null);
            tqbVar.g = 0;
            tqbVar.h = 2;
            String str = tpwVar.c;
            if (str != null) {
                tqbVar.a = str;
                ampq ampqVar = tpu.a;
                if (ampqVar != null) {
                    tqbVar.e = ampqVar;
                    tqbVar.f = ampq.j(aaekVar);
                    String str2 = tqbVar.a;
                    if (str2 == null || (num = tqbVar.g) == null || tqbVar.h == 0) {
                        StringBuilder sb = new StringBuilder();
                        if (tqbVar.a == null) {
                            sb.append(" groupName");
                        }
                        if (tqbVar.g == null) {
                            sb.append(" groupSizeBytes");
                        }
                        if (tqbVar.h == 0) {
                            sb.append(" showNotifications");
                        }
                        String valueOf2 = String.valueOf(sb);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                        sb2.append("Missing required properties:");
                        sb2.append(valueOf2);
                        throw new IllegalStateException(sb2.toString());
                    }
                    trcVar.d(new tqc(str2, tqbVar.b, tqbVar.c, tqbVar.d, tqbVar.e, tqbVar.f, num.intValue(), tqbVar.h));
                    return ankq.a;
                }
                throw new NullPointerException("Null downloadConditionsOptional");
            }
            throw new NullPointerException("Null groupName");
        }
        aael aaelVar2 = this.a;
        tpw tpwVar2 = this.b;
        Void r14 = (Void) obj;
        trc trcVar2 = (trc) aaelVar2.b.get();
        tpr tprVar = new tpr(null);
        aopa mo52toBuilder = tpwVar2.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        tpw tpwVar3 = (tpw) mo52toBuilder.instance;
        tpwVar3.f = (tpx) tpu.a.e(tpx.a);
        tpwVar3.b |= 1024;
        tpw tpwVar4 = (tpw) mo52toBuilder.mo39build();
        if (tpwVar4 != null) {
            tprVar.a = tpwVar4;
            tpw tpwVar5 = tprVar.a;
            if (tpwVar5 == null) {
                throw new IllegalStateException("Missing required properties: dataFileGroup");
            }
            return trcVar2.a(new tps(tpwVar5, tprVar.b));
        }
        throw new NullPointerException("Null dataFileGroup");
    }
}
