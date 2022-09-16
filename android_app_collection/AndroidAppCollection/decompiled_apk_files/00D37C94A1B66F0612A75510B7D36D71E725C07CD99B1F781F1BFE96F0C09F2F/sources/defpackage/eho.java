package defpackage;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: eho  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class eho implements aypx {
    private final /* synthetic */ int u;
    public static final /* synthetic */ eho t = new eho(20);
    public static final /* synthetic */ eho s = new eho(19);
    public static final /* synthetic */ eho r = new eho(17);
    public static final /* synthetic */ eho q = new eho(16);
    public static final /* synthetic */ eho p = new eho(15);
    public static final /* synthetic */ eho o = new eho(14);
    public static final /* synthetic */ eho n = new eho(13);
    public static final /* synthetic */ eho m = new eho(12);
    public static final /* synthetic */ eho l = new eho(11);
    public static final /* synthetic */ eho k = new eho(10);
    public static final /* synthetic */ eho j = new eho(9);
    public static final /* synthetic */ eho i = new eho(8);
    public static final /* synthetic */ eho h = new eho(7);
    public static final /* synthetic */ eho g = new eho(6);
    public static final /* synthetic */ eho f = new eho(5);
    public static final /* synthetic */ eho e = new eho(4);
    public static final /* synthetic */ eho d = new eho(3);
    public static final /* synthetic */ eho c = new eho(2);
    public static final /* synthetic */ eho b = new eho(1);
    public static final /* synthetic */ eho a = new eho();

    private /* synthetic */ eho() {
    }

    public /* synthetic */ eho(int i2) {
        this.u = i2;
    }

    @Override // defpackage.aypx
    public final Object a(Object obj, Object obj2) {
        kak d2;
        int intValue;
        boolean z = true;
        r1 = true;
        boolean z2 = true;
        int i2 = 1;
        boolean z3 = true;
        int i3 = 0;
        switch (this.u) {
            case 0:
                Boolean bool = (Boolean) obj2;
                if (!((Boolean) obj).booleanValue() || !bool.booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                return ampr.a((babp) obj, (aawr) obj2);
            case 2:
                Boolean bool2 = (Boolean) obj2;
                if (!((Boolean) obj).booleanValue() || !bool2.booleanValue()) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 3:
                return ampr.a((fbc) obj, (amvn) obj2);
            case 4:
                Context context = (Context) obj;
                Boolean bool3 = (Boolean) obj2;
                if (!zew.y(context)) {
                    return 0;
                }
                if (!zew.w(context)) {
                    return 1;
                }
                if (true != bool3.booleanValue()) {
                    i2 = 2;
                }
                return Integer.valueOf(i2);
            case 5:
                Optional optional = (Optional) obj;
                artv artvVar = (artv) obj2;
                int i4 = ige.k;
                if (!optional.isPresent()) {
                    return artvVar;
                }
                aopa createBuilder = artv.a.createBuilder(artvVar);
                asaj asajVar = ((PlayerResponseModel) optional.get()).a;
                createBuilder.copyOnWrite();
                artv artvVar2 = (artv) createBuilder.instance;
                asajVar.getClass();
                artvVar2.e = asajVar;
                artvVar2.b |= 4;
                return (artv) createBuilder.mo39build();
            case 6:
                return ((ily) obj2) == ily.FORCE_GONE ? imm.a() : (imj) obj;
            case 7:
                Boolean bool4 = (Boolean) obj2;
                if (!((Boolean) obj).booleanValue() && !bool4.booleanValue()) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 8:
                return ampr.a((aajp) obj, obj2);
            case 9:
                Integer num = (Integer) obj;
                zaw zawVar = (zaw) obj2;
                if (num.intValue() > 0) {
                    i3 = num.intValue() - zawVar.a.a.left;
                }
                return Integer.valueOf(i3);
            case 10:
                zhx zhxVar = (zhx) obj2;
                return (zhx) obj;
            case 11:
                return ampr.a((Boolean) obj, (Boolean) obj2);
            case 12:
                return new kaj((kal) obj, ((Integer) obj2).intValue());
            case 13:
                d2 = kak.d((kao) obj, (kaj) obj2);
                return d2;
            case 14:
                return ampr.a((Float) obj, (Boolean) obj2);
            case 15:
                int intValue2 = ((Integer) obj).intValue();
                float f2 = 0.0f;
                if (((Integer) obj2).intValue() > 0) {
                    f2 = Math.round(almu.z(1.0f - (intValue2 / intValue), 0.0f, 1.0f) * 100.0f) / 100.0f;
                }
                return Float.valueOf(f2);
            case 16:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                return Integer.valueOf((booleanValue || !((Boolean) obj2).booleanValue()) ? true != booleanValue ? 2131233468 : 2131233467 : 2131231455);
            case 17:
                kfa kfaVar = (kfa) obj2;
                kez kezVar = kfb.a;
                kew kewVar = kfaVar.b;
                kfe kfeVar = ((kez) obj).a;
                kfc kfcVar = kewVar.a;
                Object obj3 = kewVar.b;
                kfd kfdVar = new kfd(kfeVar);
                kfcVar.a(kfdVar, obj3);
                return kez.a(kfdVar.a(), kfaVar.a);
            case 18:
                return Boolean.valueOf(kgn.b(((Boolean) obj).booleanValue(), (nsr) obj2));
            case 19:
                Rect rect = (Rect) obj2;
                asxp asxpVar = ((arhd) obj).e;
                if (asxpVar == null) {
                    asxpVar = asxp.a;
                }
                if (asxpVar.bm) {
                    return Integer.valueOf(rect.right);
                }
                return 0;
            default:
                return ampr.a((String) obj, (jiq) obj2);
        }
    }
}
