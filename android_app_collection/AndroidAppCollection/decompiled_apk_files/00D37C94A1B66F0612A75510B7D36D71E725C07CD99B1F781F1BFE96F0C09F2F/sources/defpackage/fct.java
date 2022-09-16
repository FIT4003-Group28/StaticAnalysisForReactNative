package defpackage;

import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: fct  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fct implements ampg {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ fct(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                String str = this.a;
                fda fdaVar = (fda) obj;
                fcv fcvVar = fcv.a;
                aoqp aoqpVar = fdaVar.j;
                if (aoqpVar.containsKey(str)) {
                    fcvVar = (fcv) aoqpVar.get(str);
                }
                aopa mo52toBuilder = fcvVar.mo52toBuilder();
                aopa mo52toBuilder2 = fdaVar.mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                fcv fcvVar2 = (fcv) mo52toBuilder.instance;
                fcvVar2.b &= -2;
                fcvVar2.c = false;
                mo52toBuilder.copyOnWrite();
                fcv fcvVar3 = (fcv) mo52toBuilder.instance;
                fcvVar3.b &= -3;
                fcvVar3.d = 0L;
                mo52toBuilder2.i(str, (fcv) mo52toBuilder.mo39build());
                return (fda) mo52toBuilder2.mo39build();
            case 1:
                String str2 = this.a;
                aopa mo52toBuilder3 = ((fda) obj).mo52toBuilder();
                mo52toBuilder3.copyOnWrite();
                fda fdaVar2 = (fda) mo52toBuilder3.instance;
                str2.getClass();
                fdaVar2.b |= 1;
                fdaVar2.c = str2;
                return (fda) mo52toBuilder3.mo39build();
            case 2:
                String str3 = this.a;
                fcv fcvVar4 = fcv.a;
                aoqp aoqpVar2 = ((fda) obj).j;
                if (aoqpVar2.containsKey(str3)) {
                    fcvVar4 = (fcv) aoqpVar2.get(str3);
                }
                return Boolean.valueOf(fcvVar4.f);
            case 3:
                String str4 = this.a;
                fcv fcvVar5 = fcv.a;
                aoqp aoqpVar3 = ((fda) obj).j;
                if (aoqpVar3.containsKey(str4)) {
                    fcvVar5 = (fcv) aoqpVar3.get(str4);
                }
                return Boolean.valueOf(fcvVar5.e);
            case 4:
                String str5 = this.a;
                llq llqVar = (llq) obj;
                aopa mo52toBuilder4 = llqVar.mo52toBuilder();
                llr llrVar = llqVar.c;
                if (llrVar == null) {
                    llrVar = llr.a;
                }
                aopa mo52toBuilder5 = llrVar.mo52toBuilder();
                mo52toBuilder5.copyOnWrite();
                llr llrVar2 = (llr) mo52toBuilder5.instance;
                str5.getClass();
                llrVar2.b |= 1;
                llrVar2.c = str5;
                mo52toBuilder4.copyOnWrite();
                llq llqVar2 = (llq) mo52toBuilder4.instance;
                llr llrVar3 = (llr) mo52toBuilder5.mo39build();
                llrVar3.getClass();
                llqVar2.c = llrVar3;
                llqVar2.b |= 1;
                return (llq) mo52toBuilder4.mo39build();
            case 5:
                String str6 = this.a;
                aopa mo52toBuilder6 = ((gft) obj).mo52toBuilder();
                mo52toBuilder6.copyOnWrite();
                gft gftVar = (gft) mo52toBuilder6.instance;
                str6.getClass();
                gftVar.b |= 8;
                gftVar.f = str6;
                return (gft) mo52toBuilder6.mo39build();
            case 6:
                String str7 = this.a;
                aopa mo52toBuilder7 = ((hwp) obj).mo52toBuilder();
                mo52toBuilder7.copyOnWrite();
                str7.getClass();
                ((hwp) mo52toBuilder7.instance).k = str7;
                return (hwp) mo52toBuilder7.mo39build();
            case 7:
                String str8 = this.a;
                aopa mo52toBuilder8 = ((hwp) obj).mo52toBuilder();
                mo52toBuilder8.copyOnWrite();
                str8.getClass();
                ((hwp) mo52toBuilder8.instance).l = str8;
                return (hwp) mo52toBuilder8.mo39build();
            case 8:
                String str9 = this.a;
                aopa mo52toBuilder9 = ((hwp) obj).mo52toBuilder();
                mo52toBuilder9.copyOnWrite();
                str9.getClass();
                ((hwp) mo52toBuilder9.instance).m = str9;
                return (hwp) mo52toBuilder9.mo39build();
            case 9:
                String str10 = this.a;
                aopa mo52toBuilder10 = ((fdb) obj).mo52toBuilder();
                mo52toBuilder10.copyOnWrite();
                fdb fdbVar = (fdb) mo52toBuilder10.instance;
                str10.getClass();
                fdbVar.b |= 1;
                fdbVar.c = str10;
                return (fdb) mo52toBuilder10.mo39build();
            case 10:
                String str11 = this.a;
                aopa mo52toBuilder11 = ((ljp) obj).mo52toBuilder();
                mo52toBuilder11.copyOnWrite();
                ljp ljpVar = (ljp) mo52toBuilder11.instance;
                ljpVar.b |= 2;
                ljpVar.d = str11;
                return (ljp) mo52toBuilder11.mo39build();
            case 11:
                return (tqm) Collections.unmodifiableMap(((tqt) obj).b).get(this.a);
            case 12:
                return (tqw) Collections.unmodifiableMap(((tqt) obj).c).get(this.a);
            case 13:
                String str12 = this.a;
                aopa mo52toBuilder12 = ((tqt) obj).mo52toBuilder();
                mo52toBuilder12.z(str12);
                return (tqt) mo52toBuilder12.mo39build();
            case 14:
                return (tqz) Collections.unmodifiableMap(((trb) obj).b).get(this.a);
            case 15:
                String str13 = this.a;
                aopa mo52toBuilder13 = ((trb) obj).mo52toBuilder();
                mo52toBuilder13.B(str13);
                return (trb) mo52toBuilder13.mo39build();
            case 16:
                String str14 = this.a;
                vbu vbuVar = vcr.a;
                vcd vcdVar = vcd.a;
                aoqp aoqpVar4 = ((vch) obj).b;
                if (aoqpVar4.containsKey(str14)) {
                    vcdVar = (vcd) aoqpVar4.get(str14);
                }
                return vcdVar.c;
            case 17:
                String str15 = this.a;
                vbu vbuVar2 = vcr.a;
                vcd vcdVar2 = vcd.a;
                str15.getClass();
                aoqp aoqpVar5 = ((vch) obj).b;
                if (aoqpVar5.containsKey(str15)) {
                    vcdVar2 = (vcd) aoqpVar5.get(str15);
                }
                return vcdVar2.d;
            case 18:
                String str16 = this.a;
                vbu vbuVar3 = vcr.a;
                aopa createBuilder = vch.a.createBuilder();
                for (Map.Entry entry : Collections.unmodifiableMap(((vch) obj).b).entrySet()) {
                    vcd vcdVar3 = (vcd) entry.getValue();
                    aopa createBuilder2 = vcd.a.createBuilder();
                    if (!vcdVar3.d.equals(str16)) {
                        String str17 = vcdVar3.d;
                        createBuilder2.copyOnWrite();
                        vcd vcdVar4 = (vcd) createBuilder2.instance;
                        str17.getClass();
                        vcdVar4.b |= 1;
                        vcdVar4.d = str17;
                    }
                    for (String str18 : vcdVar3.c) {
                        if (!str18.equals(str16)) {
                            createBuilder2.E(str18);
                        }
                    }
                    createBuilder.F((String) entry.getKey(), (vcd) createBuilder2.mo39build());
                }
                return (vch) createBuilder.mo39build();
            case 19:
                String str19 = this.a;
                vbu vbuVar4 = vcr.a;
                aopa mo52toBuilder14 = ((vch) obj).mo52toBuilder();
                mo52toBuilder14.copyOnWrite();
                ((vch) mo52toBuilder14.instance).a().remove(str19);
                return (vch) mo52toBuilder14.mo39build();
            default:
                String str20 = this.a;
                vch vchVar = (vch) obj;
                vbu vbuVar5 = vcr.a;
                vcd vcdVar5 = vcd.a;
                str20.getClass();
                aoqp aoqpVar6 = vchVar.b;
                if (aoqpVar6.containsKey(str20)) {
                    vcdVar5 = (vcd) aoqpVar6.get(str20);
                }
                aopa mo52toBuilder15 = vcdVar5.mo52toBuilder();
                if (!Collections.unmodifiableList(((vcd) mo52toBuilder15.instance).c).contains("")) {
                    mo52toBuilder15.E("");
                }
                aopa mo52toBuilder16 = vchVar.mo52toBuilder();
                mo52toBuilder15.copyOnWrite();
                vcd vcdVar6 = (vcd) mo52toBuilder15.instance;
                vcdVar6.b |= 1;
                vcdVar6.d = "";
                mo52toBuilder16.F(str20, (vcd) mo52toBuilder15.mo39build());
                return (vch) mo52toBuilder16.mo39build();
        }
    }
}
