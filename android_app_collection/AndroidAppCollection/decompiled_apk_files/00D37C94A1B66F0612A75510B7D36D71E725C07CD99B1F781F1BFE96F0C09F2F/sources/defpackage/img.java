package defpackage;

import android.graphics.Rect;
import android.util.Pair;
/* compiled from: PG */
/* renamed from: img  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class img implements ayqc {
    private final /* synthetic */ int l;
    public static final /* synthetic */ img k = new img(11);
    public static final /* synthetic */ img j = new img(10);
    public static final /* synthetic */ img i = new img(9);
    public static final /* synthetic */ img h = new img(8);
    public static final /* synthetic */ img g = new img(7);
    public static final /* synthetic */ img f = new img(5);
    public static final /* synthetic */ img e = new img(4);
    public static final /* synthetic */ img d = new img(3);
    public static final /* synthetic */ img c = new img(2);
    public static final /* synthetic */ img b = new img(1);
    public static final /* synthetic */ img a = new img();

    private /* synthetic */ img() {
    }

    public /* synthetic */ img(int i2) {
        this.l = i2;
    }

    @Override // defpackage.ayqc
    public final Object a(Object obj, Object obj2, Object obj3) {
        boolean z = true;
        int i2 = 1;
        r1 = true;
        boolean z2 = true;
        r1 = true;
        boolean z3 = true;
        switch (this.l) {
            case 0:
                imj imjVar = (imj) obj;
                return (!((Boolean) obj2).booleanValue() || ((Boolean) obj3).booleanValue()) ? imjVar : imp.d(imjVar);
            case 1:
                return babp.d((Boolean) obj, (egm) obj2, (ezx) obj3);
            case 2:
                imj imjVar2 = (imj) obj;
                return (!((Boolean) obj3).booleanValue() || ((Boolean) obj2).booleanValue()) ? imjVar2 : imp.d(imjVar2);
            case 3:
                nsr nsrVar = (nsr) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                int intValue = ((Integer) obj3).intValue();
                if (nsrVar == nsr.HIDDEN || booleanValue || intValue != 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                Pair pair = (Pair) obj;
                return Pair.create((ampq) obj2, (aqlr) obj3);
            case 5:
                return new mhl((avvb) ((aajp) obj).c, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue());
            case 6:
                Rect rect = (Rect) obj3;
                int intValue2 = ((Integer) obj2).intValue() - ((Integer) obj).intValue();
                return new Rect(rect.left, intValue2, rect.right, Math.max(intValue2, rect.height()));
            case 7:
                return Integer.valueOf(nsj.a(((Rect) obj).bottom, ((Integer) obj2).intValue(), (nsr) obj3));
            case 8:
                Boolean bool = (Boolean) obj2;
                Boolean bool2 = (Boolean) obj3;
                if ((!((Boolean) obj).booleanValue() || !bool.booleanValue()) && !bool2.booleanValue()) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 9:
                return babp.d((Boolean) obj, (nsr) obj2, (nqq) obj3);
            case 10:
                nqq nqqVar = (nqq) obj2;
                Boolean bool3 = (Boolean) obj3;
                if (((Boolean) obj).booleanValue() || (nqqVar != nqq.LANDSCAPE_PLAYER_OVERLAY && !bool3.booleanValue())) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            default:
                aika aikaVar = (aika) obj;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                boolean booleanValue3 = ((Boolean) obj3).booleanValue();
                long j2 = nvp.a;
                if (!aikaVar.h()) {
                    i2 = (aikaVar.c(aika.READY) || booleanValue2 || booleanValue3) ? 0 : -1;
                }
                return Integer.valueOf(i2);
        }
    }
}
