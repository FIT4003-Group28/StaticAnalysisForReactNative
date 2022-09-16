package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: fay  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fay implements Comparator {
    private final /* synthetic */ int v;
    public static final /* synthetic */ fay u = new fay(20);
    public static final /* synthetic */ fay t = new fay(19);
    public static final /* synthetic */ fay s = new fay(18);
    public static final /* synthetic */ fay r = new fay(17);
    public static final /* synthetic */ fay q = new fay(16);
    public static final /* synthetic */ fay p = new fay(15);
    public static final /* synthetic */ fay o = new fay(14);
    public static final /* synthetic */ fay n = new fay(13);
    public static final /* synthetic */ fay m = new fay(12);
    public static final /* synthetic */ fay l = new fay(11);
    public static final /* synthetic */ fay k = new fay(10);
    public static final /* synthetic */ fay j = new fay(9);
    public static final /* synthetic */ fay i = new fay(8);
    public static final /* synthetic */ fay h = new fay(7);
    public static final /* synthetic */ fay g = new fay(6);
    public static final /* synthetic */ fay f = new fay(5);
    public static final /* synthetic */ fay e = new fay(4);
    public static final /* synthetic */ fay d = new fay(3);
    public static final /* synthetic */ fay c = new fay(2);
    public static final /* synthetic */ fay b = new fay(1);
    public static final /* synthetic */ fay a = new fay();

    private /* synthetic */ fay() {
    }

    private /* synthetic */ fay(int i2) {
        this.v = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int d2;
        int d3;
        switch (this.v) {
            case 0:
                return -fbd.c((aajj) obj).compareTo(fbd.c((aajj) obj2));
            case 1:
                Comparator comparator = afi.a;
                return ((afd) obj).a.compareTo(((afd) obj2).a);
            case 2:
                d2 = ((axbm) obj2).d();
                d3 = ((axbm) obj).d();
                break;
            case 3:
                return -Long.valueOf(((agqv) obj).i).compareTo(Long.valueOf(((agqv) obj2).i));
            case 4:
                alcw alcwVar = (alcw) obj;
                alcw alcwVar2 = (alcw) obj2;
                alcwVar.getClass();
                alcwVar2.getClass();
                long j2 = alcwVar.h;
                long j3 = alcwVar2.h;
                if (j2 > j3) {
                    return -1;
                }
                return j2 == j3 ? 0 : 1;
            case 5:
                int i2 = nuw.t;
                d2 = ((Integer) obj2).intValue();
                d3 = ((Integer) obj).intValue();
                break;
            case 6:
                int i3 = ((psu) obj2).c;
                int i4 = ((psu) obj).c;
                if (i3 == i4) {
                    return 0;
                }
                return i3 >= i4 ? 1 : -1;
            case 7:
                int i5 = ((pum) obj).b.b;
                int i6 = ((pum) obj2).b.b;
                if (i5 == i6) {
                    return 0;
                }
                return i5 >= i6 ? 1 : -1;
            case 8:
                return (((pul) obj).b > ((pul) obj2).b ? 1 : (((pul) obj).b == ((pul) obj2).b ? 0 : -1));
            case 9:
                d2 = ((Format) obj2).h;
                d3 = ((Format) obj).h;
                break;
            case 10:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                amxr amxrVar = pvd.a;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                } else if (num2.intValue() != -1) {
                    return num.intValue() - num2.intValue();
                } else {
                    return 1;
                }
            case 11:
                Integer num3 = (Integer) obj;
                Integer num4 = (Integer) obj2;
                amxr amxrVar2 = pvd.a;
                return 0;
            case 12:
                return ((pwz) obj).a - ((pwz) obj2).a;
            case 13:
                return Float.compare(((pwz) obj).c, ((pwz) obj2).c);
            case 14:
                return pzh.a.indexOf((String) obj) - pzh.a.indexOf((String) obj2);
            case 15:
                return szb.a.indexOf(((tek) obj).getClass()) - szb.a.indexOf(((tek) obj2).getClass());
            case 16:
                return (int) (((aodt) obj).q() - ((aodt) obj2).q());
            case 17:
                return Integer.valueOf(((thx) obj).a).compareTo(Integer.valueOf(((thx) obj2).a));
            case 18:
                return uaw.e((aoqu) ((Pair) obj).first).compareTo(uaw.e((aoqu) ((Pair) obj2).first));
            case 19:
                return uaw.e((tqv) obj).compareTo(uaw.e((tqv) obj2));
            default:
                return uaw.e((tqy) obj).compareTo(uaw.e((tqy) obj2));
        }
        return d2 - d3;
    }
}
