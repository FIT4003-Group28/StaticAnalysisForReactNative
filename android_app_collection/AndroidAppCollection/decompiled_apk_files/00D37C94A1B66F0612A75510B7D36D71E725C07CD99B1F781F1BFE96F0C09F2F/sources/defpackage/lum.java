package defpackage;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: lum  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lum implements aypx {
    private final /* synthetic */ int v;
    public static final /* synthetic */ lum u = new lum(20);
    public static final /* synthetic */ lum t = new lum(19);
    public static final /* synthetic */ lum s = new lum(18);
    public static final /* synthetic */ lum r = new lum(17);
    public static final /* synthetic */ lum q = new lum(16);
    public static final /* synthetic */ lum p = new lum(15);
    public static final /* synthetic */ lum o = new lum(14);
    public static final /* synthetic */ lum n = new lum(13);
    public static final /* synthetic */ lum m = new lum(12);
    public static final /* synthetic */ lum l = new lum(11);
    public static final /* synthetic */ lum k = new lum(10);
    public static final /* synthetic */ lum j = new lum(9);
    public static final /* synthetic */ lum i = new lum(8);
    public static final /* synthetic */ lum h = new lum(7);
    public static final /* synthetic */ lum g = new lum(6);
    public static final /* synthetic */ lum f = new lum(5);
    public static final /* synthetic */ lum e = new lum(4);
    public static final /* synthetic */ lum d = new lum(3);
    public static final /* synthetic */ lum c = new lum(2);
    public static final /* synthetic */ lum b = new lum(1);
    public static final /* synthetic */ lum a = new lum();

    private /* synthetic */ lum() {
    }

    private /* synthetic */ lum(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aypx
    public final Object a(Object obj, Object obj2) {
        Rect rect;
        boolean z = true;
        switch (this.v) {
            case 0:
                aqlr aqlrVar = (aqlr) obj2;
                asxp asxpVar = ((arhd) obj).e;
                if (asxpVar == null) {
                    asxpVar = asxp.a;
                }
                return asxpVar.bo ? aqlrVar.h : "";
            case 1:
                ampq ampqVar = (ampq) obj;
                return ampqVar.h() ? ampqVar : (ampq) obj2;
            case 2:
                return Pair.create((atia) obj, (ampq) obj2);
            case 3:
                float intValue = ((Integer) obj).intValue();
                float height = ((Rect) obj2).height();
                float f2 = 0.0f;
                if (height > 0.001f) {
                    f2 = almu.z(1.0f - (Math.abs(intValue - rect.top) / height), 0.0f, 1.0f);
                }
                return Float.valueOf(f2);
            case 4:
                return ampr.a((nml) obj, (apzg) obj2);
            case 5:
                View view = (View) obj;
                return (nsr) obj2;
            case 6:
                ampq ampqVar2 = (ampq) obj;
                return ((nst) obj2).a;
            case 7:
                ampq ampqVar3 = (ampq) obj;
                if (!((Boolean) obj2).booleanValue() || ampqVar3.h()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                ampq ampqVar4 = (ampq) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (ampqVar4.h()) {
                    intValue2 = ((Integer) ampqVar4.c()).intValue();
                }
                return Integer.valueOf(intValue2);
            case 9:
                ampr amprVar = (ampr) obj2;
                return Integer.valueOf(nsj.b(((Integer) obj).intValue(), ((Integer) amprVar.a).intValue(), ((Integer) amprVar.b).intValue(), ((Integer) amprVar.b).intValue()));
            case 10:
                ampr amprVar2 = (ampr) obj2;
                return Integer.valueOf(nsj.b(((Integer) obj).intValue(), ((Integer) amprVar2.a).intValue(), ((Integer) amprVar2.b).intValue(), 0));
            case 11:
                return Integer.valueOf(((Integer) obj).intValue() + ((Integer) obj2).intValue());
            case 12:
                return ampr.a((Integer) obj, (Integer) obj2);
            case 13:
                return ampr.a((nsr) obj, (Boolean) obj2);
            case 14:
                nsu nsuVar = (nsu) obj;
                int i2 = nsn.e;
                return babp.d((Boolean) obj2, nsuVar.a, nsuVar.b);
            case 15:
                Boolean bool = (Boolean) obj;
                nmc nmcVar = (nmc) obj2;
                int i3 = nsn.e;
                return bool;
            case 16:
                nsp nspVar = (nsp) obj;
                babp babpVar = (babp) obj2;
                boolean booleanValue = ((Boolean) babpVar.a()).booleanValue();
                nsr nsrVar = (nsr) babpVar.b();
                if (((nqq) babpVar.c()) == nqq.LANDSCAPE_PLAYER_OVERLAY) {
                    return nsp.NONE;
                }
                return nsrVar.equals(nsr.FULL_BLEED) ? booleanValue ? nsp.PAUSE_TEMPORARILY : nspVar : nspVar.equals(nsp.PAUSE_TEMPORARILY) ? nsp.UNPAUSE : nsp.NONE;
            case 17:
                nqq nqqVar = (nqq) obj2;
                if (((nsr) obj) != nsr.FULL_BLEED || nqqVar != nqq.PORTRAIT_WATCH_PANEL) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                PlayerResponseModel a2 = ((ahhj) obj2).a();
                if (!((ahia) obj).f() || a2 == null || a2.F()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                ampq ampqVar5 = (ampq) obj;
                nsr nsrVar2 = (nsr) obj2;
                int i4 = nsv.f;
                return (!ampqVar5.h() || nsrVar2 == nsr.HIDDEN) ? amon.a : ampq.j(nst.a((nsr) ampqVar5.c()));
            default:
                ampq ampqVar6 = (ampq) obj;
                Pair pair = (Pair) obj2;
                nte nteVar = (nte) pair.first;
                boolean booleanValue2 = ((Boolean) pair.second).booleanValue();
                return !ampqVar6.h() ? booleanValue2 ? ampq.j(nteVar) : ampqVar6 : (!nteVar.equals(ampqVar6.c()) || booleanValue2) ? ampqVar6 : amon.a;
        }
    }
}
