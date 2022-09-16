package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import j$.util.Optional;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: gvq  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gvq implements ampg {
    private final /* synthetic */ int v;
    public static final /* synthetic */ gvq u = new gvq(20);
    public static final /* synthetic */ gvq t = new gvq(19);
    public static final /* synthetic */ gvq s = new gvq(18);
    public static final /* synthetic */ gvq r = new gvq(17);
    public static final /* synthetic */ gvq q = new gvq(16);
    public static final /* synthetic */ gvq p = new gvq(15);
    public static final /* synthetic */ gvq o = new gvq(14);
    public static final /* synthetic */ gvq n = new gvq(13);
    public static final /* synthetic */ gvq m = new gvq(12);
    public static final /* synthetic */ gvq l = new gvq(11);
    public static final /* synthetic */ gvq k = new gvq(10);
    public static final /* synthetic */ gvq j = new gvq(9);
    public static final /* synthetic */ gvq i = new gvq(8);
    public static final /* synthetic */ gvq h = new gvq(7);
    public static final /* synthetic */ gvq g = new gvq(6);
    public static final /* synthetic */ gvq f = new gvq(5);
    public static final /* synthetic */ gvq e = new gvq(4);
    public static final /* synthetic */ gvq d = new gvq(3);
    public static final /* synthetic */ gvq c = new gvq(2);
    public static final /* synthetic */ gvq b = new gvq(1);
    public static final /* synthetic */ gvq a = new gvq();

    private /* synthetic */ gvq() {
    }

    private /* synthetic */ gvq(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        int i2 = 0;
        boolean z = false;
        r1 = false;
        boolean z2 = false;
        switch (this.v) {
            case 0:
                hwp hwpVar = (hwp) obj;
                actj actjVar = gvt.a;
                if (hwpVar != null) {
                    i2 = hwpVar.o;
                }
                return Integer.valueOf(i2);
            case 1:
                Integer num = (Integer) obj;
                actj actjVar2 = gvt.a;
                if (num != null && num.intValue() < 3) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 2:
                hwp hwpVar2 = (hwp) obj;
                actj actjVar3 = gvt.a;
                int i3 = hwpVar2.o;
                aopa mo52toBuilder = hwpVar2.mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                ((hwp) mo52toBuilder.instance).o = i3 + 1;
                return (hwp) mo52toBuilder.mo39build();
            case 3:
                return Long.valueOf(((pkl) obj).q());
            case 4:
                pkl pklVar = (pkl) obj;
                pklVar.M();
                return Long.valueOf(pklVar.c.r());
            case 5:
                return Boolean.valueOf(((pkl) obj).g());
            case 6:
                amuk amukVar = hes.a;
                aopa mo52toBuilder2 = ((hiv) obj).mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                ((hiv) mo52toBuilder2.instance).b = true;
                return (hiv) mo52toBuilder2.mo39build();
            case 7:
                int i4 = hml.ax;
                aopa mo52toBuilder3 = ((hwp) obj).mo52toBuilder();
                mo52toBuilder3.copyOnWrite();
                ((hwp) mo52toBuilder3.instance).n = true;
                return (hwp) mo52toBuilder3.mo39build();
            case 8:
                hwp hwpVar3 = (hwp) obj;
                if (hwpVar3 == null) {
                    return new ArrayList();
                }
                String str = hwpVar3.m;
                if (TextUtils.isEmpty(str)) {
                    return new ArrayList();
                }
                byte[] decode = Base64.decode(str, 0);
                try {
                    auzj auzjVar = (auzj) aopi.parseFrom(auzj.a, decode, aoos.b());
                    ArrayList arrayList = new ArrayList(auzjVar.b.size());
                    arrayList.addAll(auzjVar.b);
                    return arrayList;
                } catch (aopx e2) {
                    zep.d("Error reading recent stickers.", e2);
                    return new ArrayList();
                }
            case 9:
                int i5 = hvy.s;
                aopa mo52toBuilder4 = ((hwp) obj).mo52toBuilder();
                mo52toBuilder4.copyOnWrite();
                ((hwp) mo52toBuilder4.instance).c = true;
                return (hwp) mo52toBuilder4.mo39build();
            case 10:
                aopa aopaVar = (aopa) obj;
                aopaVar.copyOnWrite();
                hwp hwpVar4 = hwp.a;
                ((hwp) aopaVar.instance).b = 1;
                return aopaVar;
            case 11:
                if (((hwp) obj).b > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                aopa mo52toBuilder5 = ((ihs) obj).mo52toBuilder();
                mo52toBuilder5.copyOnWrite();
                ((ihs) mo52toBuilder5.instance).b = true;
                return (ihs) mo52toBuilder5.mo39build();
            case 13:
                return (avvb) obj;
            case 14:
                avvb avvbVar = (avvb) obj;
                if (avvbVar.getNumVideosFailed().intValue() > 0) {
                    return iml.a(avvbVar.getNumVideosFailed().intValue(), avvbVar.getNumVideosFailed().intValue() + avvbVar.getNumVideosInProgress().intValue() + avvbVar.getNumVideosCompleted().intValue());
                }
                if (avvbVar.getNumVideosInProgress().intValue() > 0) {
                    return imn.a(avvbVar.getUploadProgress().floatValue(), avvbVar.getNumVideosInProgress().intValue(), avvbVar.getNumVideosCompleted().intValue(), avvbVar.getNumVideosFailed().intValue());
                }
                return imk.a(avvbVar.getNumVideosCompleted().intValue(), avvbVar.getNumVideosInProgress().intValue(), avvbVar.getNumVideosFailed().intValue());
            case 15:
                return (Boolean) ((ampr) obj).b;
            case 16:
                String str2 = (String) obj;
                str2.getClass();
                aqxo.z(!str2.isEmpty(), "key cannot be empty");
                aopa createBuilder = asyr.a.createBuilder();
                createBuilder.copyOnWrite();
                asyr asyrVar = (asyr) createBuilder.instance;
                asyrVar.c = 1 | asyrVar.c;
                asyrVar.d = str2;
                return new asyo(createBuilder);
            case 17:
                return awjh.f((String) obj);
            case 18:
                return awkw.f((String) obj);
            case 19:
                return Boolean.valueOf(((jiq) obj).p);
            default:
                return Optional.ofNullable((aqqx) obj);
        }
    }
}
