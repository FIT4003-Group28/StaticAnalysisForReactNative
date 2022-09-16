package defpackage;

import j$.util.Optional;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: lyd  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lyd implements ayqe {
    private final /* synthetic */ int v;
    public static final /* synthetic */ lyd u = new lyd(20);
    public static final /* synthetic */ lyd t = new lyd(19);
    public static final /* synthetic */ lyd s = new lyd(18);
    public static final /* synthetic */ lyd r = new lyd(17);
    public static final /* synthetic */ lyd q = new lyd(16);
    public static final /* synthetic */ lyd p = new lyd(15);
    public static final /* synthetic */ lyd o = new lyd(14);
    public static final /* synthetic */ lyd n = new lyd(13);
    public static final /* synthetic */ lyd m = new lyd(12);
    public static final /* synthetic */ lyd l = new lyd(11);
    public static final /* synthetic */ lyd k = new lyd(10);
    public static final /* synthetic */ lyd j = new lyd(9);
    public static final /* synthetic */ lyd i = new lyd(8);
    public static final /* synthetic */ lyd h = new lyd(7);
    public static final /* synthetic */ lyd g = new lyd(6);
    public static final /* synthetic */ lyd f = new lyd(5);
    public static final /* synthetic */ lyd e = new lyd(4);
    public static final /* synthetic */ lyd d = new lyd(3);
    public static final /* synthetic */ lyd c = new lyd(2);
    public static final /* synthetic */ lyd b = new lyd(1);
    public static final /* synthetic */ lyd a = new lyd();

    private /* synthetic */ lyd() {
    }

    private /* synthetic */ lyd(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        atxh atxhVar;
        Integer num;
        switch (this.v) {
            case 0:
                arul arulVar = (arul) obj;
                if (arulVar.b == 123267149) {
                    return (atia) arulVar.c;
                }
                return atia.a;
            case 1:
                return (ayos) ayoi.Q(((aawr) obj).a.d).I(kth.f).V(c).j().O().K(d).V(e).ay(yps.i);
            case 2:
                arul arulVar2 = (arul) obj;
                if (arulVar2.b == 117866661) {
                    return (atxm) arulVar2.c;
                }
                return atxm.a;
            case 3:
                return ((atxm) obj).b;
            case 4:
                atxn atxnVar = (atxn) obj;
                int i2 = atxnVar.b;
                if (i2 == 117501096) {
                    apzg apzgVar = ((atxk) atxnVar.c).e;
                    return apzgVar == null ? apzg.a : apzgVar;
                }
                if (i2 == 318370163) {
                    atxhVar = (atxh) atxnVar.c;
                } else {
                    atxhVar = atxh.a;
                }
                apzg apzgVar2 = atxhVar.e;
                return apzgVar2 == null ? apzg.a : apzgVar2;
            case 5:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 6:
                return (CharSequence) ((Optional) obj).get();
            case 7:
                Integer num2 = (Integer) obj;
                return num2.intValue() <= 9 ? String.format(Locale.getDefault(), "%d", num2) : String.format(Locale.getDefault(), "%d+", 9);
            case 8:
                return (Integer) ((Optional) obj).get();
            case 9:
                return (Boolean) ((Optional) obj).map(meg.b).orElse(Boolean.FALSE);
            case 10:
                return (Boolean) ((Optional) obj).map(meg.a).orElse(Boolean.FALSE);
            case 11:
                return (ayoi) obj;
            case 12:
                aajj aajjVar = ((aajp) obj).c;
                aajjVar.getClass();
                return aajjVar;
            case 13:
                return (aajj) ((ampq) obj).c();
            case 14:
                return (aajj) ((ampq) obj).c();
            case 15:
                return ((aajp) obj).c;
            case 16:
                return Boolean.valueOf(((ahgk) obj).a());
            case 17:
                return Boolean.valueOf(((ezx) obj).i());
            case 18:
                return ((aajp) obj).c;
            case 19:
                atad atadVar = (atad) obj;
                npu npuVar = new npu();
                String panelId = atadVar.getPanelId();
                if (panelId != null) {
                    npuVar.a = panelId;
                    npuVar.b = Integer.valueOf(atadVar.getActiveItemIndex().intValue());
                    String str = npuVar.a;
                    if (str == null || (num = npuVar.b) == null) {
                        StringBuilder sb = new StringBuilder();
                        if (npuVar.a == null) {
                            sb.append(" panelId");
                        }
                        if (npuVar.b == null) {
                            sb.append(" itemIndex");
                        }
                        String valueOf = String.valueOf(sb);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                        sb2.append("Missing required properties:");
                        sb2.append(valueOf);
                        throw new IllegalStateException(sb2.toString());
                    }
                    return new npv(str, num.intValue());
                }
                throw new NullPointerException("Null panelId");
            default:
                return Boolean.valueOf(!((ezx) obj).b());
        }
    }
}
