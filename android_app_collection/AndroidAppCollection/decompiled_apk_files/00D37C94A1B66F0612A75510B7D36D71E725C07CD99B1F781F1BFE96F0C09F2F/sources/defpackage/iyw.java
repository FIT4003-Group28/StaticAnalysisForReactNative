package defpackage;

import j$.util.Optional;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: iyw  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class iyw implements ayqe {
    private final /* synthetic */ int v;
    public static final /* synthetic */ iyw u = new iyw(20);
    public static final /* synthetic */ iyw t = new iyw(19);
    public static final /* synthetic */ iyw s = new iyw(18);
    public static final /* synthetic */ iyw r = new iyw(17);
    public static final /* synthetic */ iyw q = new iyw(16);
    public static final /* synthetic */ iyw p = new iyw(15);
    public static final /* synthetic */ iyw o = new iyw(14);
    public static final /* synthetic */ iyw n = new iyw(13);
    public static final /* synthetic */ iyw m = new iyw(12);
    public static final /* synthetic */ iyw l = new iyw(11);
    public static final /* synthetic */ iyw k = new iyw(10);
    public static final /* synthetic */ iyw j = new iyw(9);
    public static final /* synthetic */ iyw i = new iyw(8);
    public static final /* synthetic */ iyw h = new iyw(7);
    public static final /* synthetic */ iyw g = new iyw(6);
    public static final /* synthetic */ iyw f = new iyw(5);
    public static final /* synthetic */ iyw e = new iyw(4);
    public static final /* synthetic */ iyw d = new iyw(3);
    public static final /* synthetic */ iyw c = new iyw(2);
    public static final /* synthetic */ iyw b = new iyw(1);
    public static final /* synthetic */ iyw a = new iyw();

    private /* synthetic */ iyw() {
    }

    private /* synthetic */ iyw(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        switch (this.v) {
            case 0:
                return (ayok) ((Optional) obj).map(ioc.j).orElse(ayoi.T(Optional.empty()));
            case 1:
                return Optional.of((izk) obj);
            case 2:
                int i2 = izo.b;
                return (ayok) ((Optional) obj).map(ioc.k).orElse(ayoi.T(Optional.empty()));
            case 3:
                aajj aajjVar = ((aajp) obj).c;
                aajjVar.getClass();
                return aajjVar;
            case 4:
                amvn amvnVar = jcq.a;
                return ((jbj) obj).a;
            case 5:
                amvn amvnVar2 = jcq.a;
                return aynx.B((jbj) obj).H();
            case 6:
                return ((aypu) obj).Q(ikb.u).am(TimeUnit.MILLISECONDS).H();
            case 7:
                return ((aajp) obj).c;
            case 8:
                return amyv.f((amuk) obj);
            case 9:
                return (byte[]) ((ampq) obj).c();
            case 10:
                try {
                    return (avgi) aopi.parseFrom(avgi.a, (byte[]) obj, aoos.b());
                } catch (aopx e2) {
                    throw new aopx("Could not parse ThemeSetEntity", e2);
                }
            case 11:
                return ((jhr) obj).a;
            case 12:
                awuy b2 = awuy.b(((awvb) obj).c);
                return b2 == null ? awuy.UNKNOWN : b2;
            case 13:
                return ((awkg) obj).f();
            case 14:
                return ((awkg) obj).f();
            case 15:
                return amuk.o((List) obj);
            case 16:
                return ayoi.Q((List) obj);
            case 17:
                awuy b3 = awuy.b(((awvb) obj).c);
                return b3 == null ? awuy.UNKNOWN : b3;
            case 18:
                return ((awka) obj).getDownloads();
            case 19:
                awkb awkbVar = (awkb) obj;
                return awkbVar.b == 1 ? (String) awkbVar.c : "";
            default:
                return Optional.of((aajj) obj);
        }
    }
}
