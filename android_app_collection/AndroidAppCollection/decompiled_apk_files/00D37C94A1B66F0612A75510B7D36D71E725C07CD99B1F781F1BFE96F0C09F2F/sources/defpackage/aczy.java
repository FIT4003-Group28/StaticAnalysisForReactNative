package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: aczy  reason: default package */
/* loaded from: classes.dex */
public final class aczy {
    private final azqb a;
    private final aopa b = atcp.a.createBuilder();

    public aczy(azqb azqbVar) {
        this.a = azqbVar;
    }

    public final atcp a(List list) {
        ylr.c();
        aopa aopaVar = this.b;
        aopaVar.copyOnWrite();
        atcp atcpVar = atcp.a;
        ((atcp) aopaVar.instance).b = atcp.emptyProtobufList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bhc bhcVar = (bhc) it.next();
            aopa createBuilder = atcr.a.createBuilder();
            String str = bhcVar.d;
            createBuilder.copyOnWrite();
            atcr atcrVar = (atcr) createBuilder.instance;
            str.getClass();
            atcrVar.b |= 1;
            atcrVar.c = str;
            String str2 = bhcVar.c;
            createBuilder.copyOnWrite();
            atcr atcrVar2 = (atcr) createBuilder.instance;
            str2.getClass();
            atcrVar2.b |= 2;
            atcrVar2.d = str2;
            adig c = ((adnq) this.a.get()).c(bhcVar.q);
            if (c != null) {
                if (c instanceof adif) {
                    String str3 = ((adif) c).e().c;
                    createBuilder.copyOnWrite();
                    atcr atcrVar3 = (atcr) createBuilder.instance;
                    atcrVar3.b |= 4;
                    atcrVar3.e = str3;
                } else if (c instanceof adid) {
                    adid adidVar = (adid) c;
                    if (adidVar.l() != null) {
                        String str4 = adidVar.l().c;
                        createBuilder.copyOnWrite();
                        atcr atcrVar4 = (atcr) createBuilder.instance;
                        atcrVar4.b |= 4;
                        atcrVar4.e = str4;
                    }
                }
            }
            aopa aopaVar2 = this.b;
            atcr atcrVar5 = (atcr) createBuilder.mo39build();
            aopaVar2.copyOnWrite();
            atcp atcpVar2 = (atcp) aopaVar2.instance;
            atcrVar5.getClass();
            aopu aopuVar = atcpVar2.b;
            if (!aopuVar.c()) {
                atcpVar2.b = aopi.mutableCopy(aopuVar);
            }
            atcpVar2.b.add(atcrVar5);
        }
        return (atcp) this.b.mo39build();
    }
}
