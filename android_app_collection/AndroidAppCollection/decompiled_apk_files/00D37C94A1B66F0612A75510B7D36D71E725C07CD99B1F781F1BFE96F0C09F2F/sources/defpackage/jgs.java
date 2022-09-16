package defpackage;

import j$.util.Objects;
import java.util.List;
/* compiled from: PG */
/* renamed from: jgs  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jgs implements ayqf {
    private final /* synthetic */ int v;
    public static final /* synthetic */ jgs u = new jgs(20);
    public static final /* synthetic */ jgs t = new jgs(19);
    public static final /* synthetic */ jgs s = new jgs(18);
    public static final /* synthetic */ jgs r = new jgs(17);
    public static final /* synthetic */ jgs q = new jgs(16);
    public static final /* synthetic */ jgs p = new jgs(15);
    public static final /* synthetic */ jgs o = new jgs(14);
    public static final /* synthetic */ jgs n = new jgs(13);
    public static final /* synthetic */ jgs m = new jgs(12);
    public static final /* synthetic */ jgs l = new jgs(11);
    public static final /* synthetic */ jgs k = new jgs(10);
    public static final /* synthetic */ jgs j = new jgs(9);
    public static final /* synthetic */ jgs i = new jgs(8);
    public static final /* synthetic */ jgs h = new jgs(7);
    public static final /* synthetic */ jgs g = new jgs(6);
    public static final /* synthetic */ jgs f = new jgs(5);
    public static final /* synthetic */ jgs e = new jgs(4);
    public static final /* synthetic */ jgs d = new jgs(3);
    public static final /* synthetic */ jgs c = new jgs(2);
    public static final /* synthetic */ jgs b = new jgs(1);
    public static final /* synthetic */ jgs a = new jgs();

    private /* synthetic */ jgs() {
    }

    private /* synthetic */ jgs(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayqf
    public final boolean a(Object obj) {
        switch (this.v) {
            case 0:
                return ((ampq) obj).h();
            case 1:
                return ((aajp) obj).c != null;
            case 2:
                jhr jhrVar = (jhr) obj;
                return jhrVar.b.d(jhrVar.a).h();
            case 3:
                return !((String) obj).isEmpty();
            case 4:
                return ((awkp) obj) != null;
            case 5:
                return ((awkb) obj).b == 1;
            case 6:
                return !((String) obj).isEmpty();
            case 7:
                return ((Boolean) obj).booleanValue();
            case 8:
                return ((aajp) obj).c != null;
            case 9:
                return ((awjr) obj) != null;
            case 10:
                return ((aajp) obj).c != null;
            case 11:
                return ((amvn) obj).isEmpty();
            case 12:
                return Objects.nonNull((awkx) obj);
            case 13:
                return !((Boolean) obj).booleanValue();
            case 14:
                return ((ampq) obj).h();
            case 15:
                return ((Integer) obj).intValue() > 0;
            case 16:
                aika c2 = ((ahhw) obj).c();
                return c2.equals(aika.NEW) || c2.equals(aika.VIDEO_REQUESTED) || c2.equals(aika.ENDED);
            case 17:
                return ((List) obj).equals(kan.a);
            case 18:
                return ((aikd) obj).i != 3;
            case 19:
                return ((aajp) obj).c != null;
            default:
                return !((kso) obj).h.isEmpty();
        }
    }
}
