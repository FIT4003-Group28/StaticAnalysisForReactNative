package defpackage;

import android.os.Bundle;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Optional;
import j$.util.function.Predicate;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gka  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gka implements Predicate {
    private final /* synthetic */ int u;
    public static final /* synthetic */ gka t = new gka(20);
    public static final /* synthetic */ gka s = new gka(19);
    public static final /* synthetic */ gka r = new gka(18);
    public static final /* synthetic */ gka q = new gka(16);
    public static final /* synthetic */ gka p = new gka(15);
    public static final /* synthetic */ gka o = new gka(14);
    public static final /* synthetic */ gka n = new gka(13);
    public static final /* synthetic */ gka m = new gka(12);
    public static final /* synthetic */ gka l = new gka(11);
    public static final /* synthetic */ gka k = new gka(10);
    public static final /* synthetic */ gka j = new gka(9);
    public static final /* synthetic */ gka i = new gka(8);
    public static final /* synthetic */ gka h = new gka(7);
    public static final /* synthetic */ gka g = new gka(6);
    public static final /* synthetic */ gka f = new gka(5);
    public static final /* synthetic */ gka e = new gka(4);
    public static final /* synthetic */ gka d = new gka(3);
    public static final /* synthetic */ gka c = new gka(2);
    public static final /* synthetic */ gka b = new gka(1);
    public static final /* synthetic */ gka a = new gka();

    private /* synthetic */ gka() {
    }

    public /* synthetic */ gka(int i2) {
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
        awnc c2;
        switch (this.u) {
            case 0:
                int i2 = gkf.q;
                if (((Map.Entry) obj).getValue() != null) {
                    return true;
                }
                break;
            case 1:
                return ((ampq) obj).h();
            case 2:
                return ((dp) obj) instanceof ibn;
            case 3:
                int i3 = ico.bD;
                return ((Bundle) obj).containsKey(gsw.a);
            case 4:
                return (((ReelWatchEndpointOuterClass$ReelWatchEndpoint) obj).b & 2097152) != 0;
            case 5:
                int i4 = iou.cp;
                return obj instanceof ActionBarColor;
            case 6:
                int i5 = iou.cp;
                return ((ngj) obj) instanceof nhr;
            case 7:
                return (((arlt) obj).b & 262144) != 0;
            case 8:
                return ((Optional) obj).isPresent();
            case 9:
                return ((Optional) obj).isPresent();
            case 10:
                return ((agqv) obj).b();
            case 11:
                return ((agqv) obj).b();
            case 12:
                return ((agqv) obj).b();
            case 13:
                return (((atpy) obj).b & 2) != 0;
            case 14:
                return (((atpy) obj).b & 1) != 0;
            case 15:
                return (((atpy) obj).b & 1) != 0;
            case 16:
                return ((Optional) obj).isPresent();
            case 17:
                if (!(obj instanceof ajhh) || (c2 = jsd.c((ajhh) obj)) == null) {
                    return false;
                }
                return c2.qn(aqpx.b) || c2.qn(aqpz.b);
            case 18:
                ezx ezxVar = (ezx) obj;
                return true;
            case 19:
                return ((ezx) obj).b();
            default:
                attl attlVar = (attl) obj;
                acum acumVar = OfflinePrefsFragment.c;
                if (attlVar != attl.HD) {
                    return true;
                }
                break;
        }
        return false;
    }
}
