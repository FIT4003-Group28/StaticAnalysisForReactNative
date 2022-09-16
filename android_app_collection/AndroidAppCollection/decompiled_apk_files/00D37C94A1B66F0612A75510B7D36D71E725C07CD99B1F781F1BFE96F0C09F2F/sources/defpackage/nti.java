package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Pair;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: nti  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nti implements aypx {
    private final /* synthetic */ int v;
    public static final /* synthetic */ nti u = new nti(20);
    public static final /* synthetic */ nti t = new nti(19);
    public static final /* synthetic */ nti s = new nti(18);
    public static final /* synthetic */ nti r = new nti(17);
    public static final /* synthetic */ nti q = new nti(16);
    public static final /* synthetic */ nti p = new nti(15);
    public static final /* synthetic */ nti o = new nti(14);
    public static final /* synthetic */ nti n = new nti(13);
    public static final /* synthetic */ nti m = new nti(12);
    public static final /* synthetic */ nti l = new nti(11);
    public static final /* synthetic */ nti k = new nti(10);
    public static final /* synthetic */ nti j = new nti(9);
    public static final /* synthetic */ nti i = new nti(8);
    public static final /* synthetic */ nti h = new nti(7);
    public static final /* synthetic */ nti g = new nti(6);
    public static final /* synthetic */ nti f = new nti(5);
    public static final /* synthetic */ nti e = new nti(4);
    public static final /* synthetic */ nti d = new nti(3);
    public static final /* synthetic */ nti c = new nti(2);
    public static final /* synthetic */ nti b = new nti(1);
    public static final /* synthetic */ nti a = new nti();

    private /* synthetic */ nti() {
    }

    private /* synthetic */ nti(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aypx
    public final Object a(Object obj, Object obj2) {
        arag aragVar;
        int i2 = 12;
        boolean z = true;
        int i3 = 0;
        switch (this.v) {
            case 0:
                Boolean bool = (Boolean) obj;
                if (((nqq) obj2) == nqq.LANDSCAPE_PLAYER_OVERLAY || !bool.booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                int intValue = ((Integer) obj).intValue();
                if (true != ((Boolean) obj2).booleanValue()) {
                    i3 = intValue;
                }
                return Integer.valueOf(i3);
            case 2:
                Integer num = (Integer) obj;
                zaw zawVar = (zaw) obj2;
                if (num.intValue() > 0) {
                    i3 = num.intValue() - zawVar.a.a.top;
                }
                return Integer.valueOf(i3);
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int intValue2 = ((Integer) obj2).intValue();
                if (!booleanValue) {
                    if (intValue2 == 2) {
                        return nza.HIDDEN;
                    }
                } else if (intValue2 == 4) {
                    return nza.MINIPLAYER;
                }
                return nza.UNFORCED;
            case 4:
                return Pair.create((Integer) obj, (Boolean) obj2);
            case 5:
                ezx ezxVar = (ezx) obj2;
                if (!((ahxu) obj).a || ezxVar.j()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                ampr amprVar = (ampr) obj;
                okv a2 = okw.a();
                a2.c((String) amprVar.a);
                a2.d(((Integer) amprVar.b).intValue());
                a2.b(((Integer) obj2).intValue());
                return a2.a();
            case 7:
                Integer num2 = (Integer) obj;
                ((aynw) obj2).a(num2);
                return Integer.valueOf(num2.intValue() + 1);
            case 8:
                return ampr.a((String) obj, (Integer) obj2);
            case 9:
                Integer num3 = (Integer) obj;
                if (!((Boolean) obj2).booleanValue() || num3.intValue() != 6) {
                    i2 = num3.intValue();
                }
                return Integer.valueOf(i2);
            case 10:
                Integer num4 = (Integer) obj;
                if (!((Boolean) obj2).booleanValue() || num4.intValue() != 6) {
                    i2 = num4.intValue();
                }
                return Integer.valueOf(i2);
            case 11:
                return new Pair((Boolean) obj, (ampq) obj2);
            case 12:
                Boolean bool2 = (Boolean) obj2;
                if (!((Boolean) obj).booleanValue() && !bool2.booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                return new aepq((apmv) obj, (ByteBuffer) obj2);
            case 14:
                return new Pair((avfu) obj, (awpv) obj2);
            case 15:
                return new Pair((avfu) obj, (awpv) obj2);
            case 16:
                return agel.j((Context) obj, (Intent) obj2);
            case 17:
                return agel.k((Context) obj, (Intent) obj2);
            case 18:
                apgm apgmVar = (apgm) obj;
                fg fgVar = new fg();
                fgVar.a = (Bitmap) obj2;
                arag aragVar2 = null;
                if ((apgmVar.b & 8) != 0) {
                    aragVar = apgmVar.f;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                fgVar.d(ajgl.b(aragVar));
                if ((apgmVar.b & 16) != 0 && (aragVar2 = apgmVar.g) == null) {
                    aragVar2 = arag.a;
                }
                fgVar.e(ajgl.b(aragVar2));
                return fgVar;
            case 19:
                aopa aopaVar = (aopa) obj;
                alcp alcpVar = (alcp) obj2;
                aopaVar.copyOnWrite();
                alcw alcwVar = (alcw) aopaVar.instance;
                alcw alcwVar2 = alcw.a;
                alcpVar.getClass();
                alcwVar.q = alcpVar;
                alcwVar.b |= 16384;
                return aopaVar;
            default:
                aopa aopaVar2 = (aopa) obj;
                aopaVar2.copyOnWrite();
                alcw alcwVar3 = (alcw) aopaVar2.instance;
                alcw alcwVar4 = alcw.a;
                alcwVar3.l = ((alcu) obj2).g;
                alcwVar3.b |= 128;
                return aopaVar2;
        }
    }
}
