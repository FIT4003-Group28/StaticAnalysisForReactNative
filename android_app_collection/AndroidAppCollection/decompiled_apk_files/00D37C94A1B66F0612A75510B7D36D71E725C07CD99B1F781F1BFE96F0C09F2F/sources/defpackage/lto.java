package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: lto  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lto implements yjc {
    private final /* synthetic */ int v;
    public static final /* synthetic */ lto u = new lto(20);
    public static final /* synthetic */ lto t = new lto(19);
    public static final /* synthetic */ lto s = new lto(18);
    public static final /* synthetic */ lto r = new lto(17);
    public static final /* synthetic */ lto q = new lto(16);
    public static final /* synthetic */ lto p = new lto(15);
    public static final /* synthetic */ lto o = new lto(14);
    public static final /* synthetic */ lto n = new lto(13);
    public static final /* synthetic */ lto m = new lto(12);
    public static final /* synthetic */ lto l = new lto(11);
    public static final /* synthetic */ lto k = new lto(10);
    public static final /* synthetic */ lto j = new lto(9);
    public static final /* synthetic */ lto i = new lto(8);
    public static final /* synthetic */ lto h = new lto(7);
    public static final /* synthetic */ lto g = new lto(6);
    public static final /* synthetic */ lto f = new lto(5);
    public static final /* synthetic */ lto e = new lto(4);
    public static final /* synthetic */ lto d = new lto(3);
    public static final /* synthetic */ lto c = new lto(2);
    public static final /* synthetic */ lto b = new lto(1);
    public static final /* synthetic */ lto a = new lto();

    private /* synthetic */ lto() {
    }

    private /* synthetic */ lto(int i2) {
        this.v = i2;
    }

    @Override // defpackage.yjc
    public final Object a(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                return ltp.a((vlq) obj, (ltq) obj2);
            case 1:
                aopa mo52toBuilder = ((awuj) obj).mo52toBuilder();
                awan awanVar = ((Boolean) obj2).booleanValue() ? awan.VIDEO_QUALITY_SETTING_DATA_SAVER : awan.VIDEO_QUALITY_SETTING_UNKNOWN;
                mo52toBuilder.copyOnWrite();
                awuj awujVar = (awuj) mo52toBuilder.instance;
                awujVar.m = awanVar.e;
                awujVar.b |= 16;
                return (awuj) mo52toBuilder.mo39build();
            case 2:
                return lxx.a((vlq) obj, (lxz) obj2);
            case 3:
                return okx.a((vlq) obj, (okz) obj2);
            case 4:
                aopa aopaVar = (aopa) obj;
                aopaVar.copyOnWrite();
                arra arraVar = (arra) aopaVar.instance;
                aroy aroyVar = (aroy) ((aopa) obj2).mo39build();
                arra arraVar2 = arra.a;
                aroyVar.getClass();
                arraVar.e = aroyVar;
                arraVar.b |= 1;
                return aopaVar;
            case 5:
                aopa aopaVar2 = (aopa) obj2;
                amzs it = ((yvg) obj).a.entrySet().iterator();
                while (it.hasNext()) {
                    String str = (String) ((Map.Entry) it.next()).getKey();
                    if (str.startsWith("incognito_promotion_already_shown")) {
                        aopaVar2.aZ(str.substring(33));
                    }
                }
                return aopaVar2;
            case 6:
                aopa aopaVar3 = (aopa) obj;
                aopaVar3.copyOnWrite();
                aryv aryvVar = (aryv) aopaVar3.instance;
                aroy aroyVar2 = (aroy) ((aopa) obj2).mo39build();
                aryv aryvVar2 = aryv.a;
                aroyVar2.getClass();
                aryvVar.c = aroyVar2;
                aryvVar.b |= 1;
                return aopaVar3;
            case 7:
                aopa mo52toBuilder2 = ((kud) obj).mo52toBuilder();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                mo52toBuilder2.copyOnWrite();
                kud kudVar = (kud) mo52toBuilder2.instance;
                kudVar.b |= 128;
                kudVar.i = booleanValue;
                return (kud) mo52toBuilder2.mo39build();
            case 8:
                aopa mo52toBuilder3 = ((kud) obj).mo52toBuilder();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                mo52toBuilder3.copyOnWrite();
                kud kudVar2 = (kud) mo52toBuilder3.instance;
                kudVar2.b |= 1;
                kudVar2.c = booleanValue2;
                return (kud) mo52toBuilder3.mo39build();
            case 9:
                aopa mo52toBuilder4 = ((kud) obj).mo52toBuilder();
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                mo52toBuilder4.copyOnWrite();
                kud kudVar3 = (kud) mo52toBuilder4.instance;
                kudVar3.b |= 64;
                kudVar3.h = booleanValue3;
                return (kud) mo52toBuilder4.mo39build();
            case 10:
                aopa mo52toBuilder5 = ((kud) obj).mo52toBuilder();
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                mo52toBuilder5.copyOnWrite();
                kud kudVar4 = (kud) mo52toBuilder5.instance;
                kudVar4.b |= 256;
                kudVar4.j = booleanValue4;
                return (kud) mo52toBuilder5.mo39build();
            case 11:
                aopa mo52toBuilder6 = ((kud) obj).mo52toBuilder();
                boolean booleanValue5 = ((Boolean) obj2).booleanValue();
                mo52toBuilder6.copyOnWrite();
                kud kudVar5 = (kud) mo52toBuilder6.instance;
                kudVar5.b |= 32;
                kudVar5.g = booleanValue5;
                return (kud) mo52toBuilder6.mo39build();
            case 12:
                aopa mo52toBuilder7 = ((kud) obj).mo52toBuilder();
                boolean booleanValue6 = ((Boolean) obj2).booleanValue();
                mo52toBuilder7.copyOnWrite();
                kud kudVar6 = (kud) mo52toBuilder7.instance;
                kudVar6.b |= 4;
                kudVar6.d = booleanValue6;
                return (kud) mo52toBuilder7.mo39build();
            case 13:
                aopa mo52toBuilder8 = ((kud) obj).mo52toBuilder();
                boolean booleanValue7 = ((Boolean) obj2).booleanValue();
                mo52toBuilder8.copyOnWrite();
                kud kudVar7 = (kud) mo52toBuilder8.instance;
                kudVar7.b |= 8;
                kudVar7.e = booleanValue7;
                return (kud) mo52toBuilder8.mo39build();
            case 14:
                aopa mo52toBuilder9 = ((kud) obj).mo52toBuilder();
                boolean booleanValue8 = ((Boolean) obj2).booleanValue();
                mo52toBuilder9.copyOnWrite();
                kud kudVar8 = (kud) mo52toBuilder9.instance;
                kudVar8.b |= 16;
                kudVar8.f = booleanValue8;
                return (kud) mo52toBuilder9.mo39build();
            case 15:
                aopa aopaVar4 = (aopa) obj2;
                amzs it2 = ((yvg) obj).a.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    aopaVar4.bb((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                }
                return aopaVar4;
            case 16:
                awtm awtmVar = (awtm) obj;
                return (awtm) obj2;
            case 17:
                awtm awtmVar2 = (awtm) obj;
                return (awtm) obj2;
            case 18:
                aopa aopaVar5 = (aopa) obj;
                aopaVar5.copyOnWrite();
                arkm arkmVar = (arkm) aopaVar5.instance;
                aroy aroyVar3 = (aroy) ((aopa) obj2).mo39build();
                arkm arkmVar2 = arkm.a;
                aroyVar3.getClass();
                arkmVar.e = aroyVar3;
                arkmVar.b |= 1;
                return aopaVar5;
            case 19:
                aopa aopaVar6 = (aopa) obj;
                aopaVar6.copyOnWrite();
                artq artqVar = (artq) aopaVar6.instance;
                aroy aroyVar4 = (aroy) ((aopa) obj2).mo39build();
                artq artqVar2 = artq.a;
                aroyVar4.getClass();
                artqVar.c = aroyVar4;
                artqVar.b |= 1;
                return aopaVar6;
            default:
                aopa aopaVar7 = (aopa) obj;
                aopaVar7.copyOnWrite();
                asbm asbmVar = (asbm) aopaVar7.instance;
                aroy aroyVar5 = (aroy) ((aopa) obj2).mo39build();
                asbm asbmVar2 = asbm.a;
                aroyVar5.getClass();
                asbmVar.c = aroyVar5;
                asbmVar.b |= 1;
                return aopaVar7;
        }
    }
}
