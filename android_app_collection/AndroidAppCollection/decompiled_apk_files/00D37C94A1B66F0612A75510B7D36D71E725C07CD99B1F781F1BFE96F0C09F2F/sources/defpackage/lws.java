package defpackage;

import android.util.Pair;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.IconBadgeRendererOuterClass;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate;
/* compiled from: PG */
/* renamed from: lws  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lws implements Predicate {
    private final /* synthetic */ int u;
    public static final /* synthetic */ lws t = new lws(20);
    public static final /* synthetic */ lws s = new lws(19);
    public static final /* synthetic */ lws r = new lws(17);
    public static final /* synthetic */ lws q = new lws(16);
    public static final /* synthetic */ lws p = new lws(15);
    public static final /* synthetic */ lws o = new lws(14);
    public static final /* synthetic */ lws n = new lws(13);
    public static final /* synthetic */ lws m = new lws(12);
    public static final /* synthetic */ lws l = new lws(11);
    public static final /* synthetic */ lws k = new lws(10);
    public static final /* synthetic */ lws j = new lws(9);
    public static final /* synthetic */ lws i = new lws(8);
    public static final /* synthetic */ lws h = new lws(7);
    public static final /* synthetic */ lws g = new lws(6);
    public static final /* synthetic */ lws f = new lws(5);
    public static final /* synthetic */ lws e = new lws(4);
    public static final /* synthetic */ lws d = new lws(3);
    public static final /* synthetic */ lws c = new lws(2);
    public static final /* synthetic */ lws b = new lws(1);
    public static final /* synthetic */ lws a = new lws();

    private /* synthetic */ lws() {
    }

    public /* synthetic */ lws(int i2) {
        this.u = i2;
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.u) {
            case 0:
                return predicate.getClass();
            case 1:
                return predicate.getClass();
            case 2:
                return predicate.getClass();
            case 3:
                return predicate.getClass();
            case 4:
                return predicate.getClass();
            case 5:
                return predicate.getClass();
            case 6:
                return predicate.getClass();
            case 7:
                return predicate.getClass();
            case 8:
                return predicate.getClass();
            case 9:
                return predicate.getClass();
            case 10:
                return predicate.getClass();
            case 11:
                return predicate.getClass();
            case 12:
                return predicate.getClass();
            case 13:
                return predicate.getClass();
            case 14:
                return predicate.getClass();
            case 15:
                return predicate.getClass();
            case 16:
                return predicate.getClass();
            case 17:
                return predicate.getClass();
            case 18:
                return predicate.getClass();
            case 19:
                return predicate.getClass();
            default:
                return predicate.getClass();
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.u) {
            case 0:
                return Predicate.CC.$default$negate(this);
            case 1:
                return Predicate.CC.$default$negate(this);
            case 2:
                return Predicate.CC.$default$negate(this);
            case 3:
                return Predicate.CC.$default$negate(this);
            case 4:
                return Predicate.CC.$default$negate(this);
            case 5:
                return Predicate.CC.$default$negate(this);
            case 6:
                return Predicate.CC.$default$negate(this);
            case 7:
                return Predicate.CC.$default$negate(this);
            case 8:
                return Predicate.CC.$default$negate(this);
            case 9:
                return Predicate.CC.$default$negate(this);
            case 10:
                return Predicate.CC.$default$negate(this);
            case 11:
                return Predicate.CC.$default$negate(this);
            case 12:
                return Predicate.CC.$default$negate(this);
            case 13:
                return Predicate.CC.$default$negate(this);
            case 14:
                return Predicate.CC.$default$negate(this);
            case 15:
                return Predicate.CC.$default$negate(this);
            case 16:
                return Predicate.CC.$default$negate(this);
            case 17:
                return Predicate.CC.$default$negate(this);
            case 18:
                return Predicate.CC.$default$negate(this);
            case 19:
                return Predicate.CC.$default$negate(this);
            default:
                return Predicate.CC.$default$negate(this);
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.u) {
            case 0:
                return predicate.getClass();
            case 1:
                return predicate.getClass();
            case 2:
                return predicate.getClass();
            case 3:
                return predicate.getClass();
            case 4:
                return predicate.getClass();
            case 5:
                return predicate.getClass();
            case 6:
                return predicate.getClass();
            case 7:
                return predicate.getClass();
            case 8:
                return predicate.getClass();
            case 9:
                return predicate.getClass();
            case 10:
                return predicate.getClass();
            case 11:
                return predicate.getClass();
            case 12:
                return predicate.getClass();
            case 13:
                return predicate.getClass();
            case 14:
                return predicate.getClass();
            case 15:
                return predicate.getClass();
            case 16:
                return predicate.getClass();
            case 17:
                return predicate.getClass();
            case 18:
                return predicate.getClass();
            case 19:
                return predicate.getClass();
            default:
                return predicate.getClass();
        }
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.u) {
            case 0:
                return obj instanceof apvg;
            case 1:
                return ((Optional) obj).isPresent();
            case 2:
                return (((apvg) obj).b & 1024) != 0;
            case 3:
                return obj instanceof aakq;
            case 4:
                return ((fry) obj).g() != R.id.menu_search;
            case 5:
                return ((aaky) obj).a() != null;
            case 6:
                apzg apzgVar = ((apoj) obj).o;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                return apzgVar.qn(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint);
            case 7:
                aslo asloVar = ((aslq) obj).d;
                if (asloVar == null) {
                    asloVar = aslo.a;
                }
                return (asloVar.b & 1) != 0;
            case 8:
                aunb aunbVar = (aunb) obj;
                return aunbVar.qn(ButtonRendererOuterClass.buttonRenderer) || aunbVar.qn(IconBadgeRendererOuterClass.iconBadgeRenderer);
            case 9:
                return ((Optional) obj).isPresent();
            case 10:
                return ((fry) obj).g() != R.id.menu_search;
            case 11:
                aunb aunbVar2 = (aunb) obj;
                return aunbVar2.qn(ButtonRendererOuterClass.buttonRenderer) || aunbVar2.qn(IconBadgeRendererOuterClass.iconBadgeRenderer);
            case 12:
                return ((Optional) obj).isPresent();
            case 13:
                int ch = awwc.ch(((aucd) obj).e);
                return ch != 0 && ch == 2;
            case 14:
                return obj instanceof aucd;
            case 15:
                return obj instanceof aucd;
            case 16:
                return ((nmc) obj) instanceof nlc;
            case 17:
                return ((ezx) obj).i();
            case 18:
                return ((String) obj).startsWith("PREF");
            case 19:
                return ((String) obj).contains("=");
            default:
                return Objects.nonNull((Pair) obj);
        }
    }
}
