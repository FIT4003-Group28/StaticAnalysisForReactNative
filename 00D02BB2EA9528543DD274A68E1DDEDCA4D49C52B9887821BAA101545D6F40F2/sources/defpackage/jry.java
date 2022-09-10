package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: jry  reason: default package */
/* loaded from: classes7.dex */
public abstract class jry extends Enum<jry> {
    public static final jry a;
    public static final jry b;
    public static final jry c;
    private static final /* synthetic */ jry[] d;

    static {
        jry jryVar = new jry() { // from class: jrv
            @Override // defpackage.jry
            public final String a(Context context) {
                throw new UnsupportedOperationException("Unknown vertical!");
            }

            @Override // defpackage.jry
            @dzsi
            public final jqz b(Context context, jrm jrmVar) {
                return null;
            }
        };
        a = jryVar;
        jry jryVar2 = new jry() { // from class: jrw
            @Override // defpackage.jry
            public final String a(Context context) {
                return context.getString(R.string.MADDEN_VERTICAL_TAB_TITLE_FITNESS);
            }

            @Override // defpackage.jry
            public final jqz b(Context context, jrm jrmVar) {
                return new jrl(dcdc.k(jrmVar.a(context.getString(R.string.SERVICE_CATEGORY_YOGA), "q=yoga", "https://www.gstatic.com/maps/reserve/home/yoga.jpg"), jrmVar.a(context.getString(R.string.SERVICE_CATEGORY_PILATES), "q=pilates", "https://www.gstatic.com/maps/reserve/home/pilates.jpg"), jrmVar.a(context.getString(R.string.SERVICE_CATEGORY_BARRE), "q=barre", "https://www.gstatic.com/maps/reserve/home/barre2.jpg"), jrmVar.a(context.getString(R.string.SERVICE_CATEGORY_CYCLING), "q=cycling", "https://www.gstatic.com/maps/reserve/home/cycling_opt_small.jpg"), jrmVar.a(context.getString(R.string.SERVICE_CATEGORY_DANCING), "q=dancing", "https://www.gstatic.com/maps/reserve/home/dancing.jpg"), jrmVar.a(context.getString(R.string.SERVICE_CATEGORY_MORE), "sc=1", "https://www.gstatic.com/maps/reserve/home/feeling_lucky.jpg")));
            }

            @Override // defpackage.jry
            public final String c(Context context) {
                return context.getString(R.string.FITNESS_SERVICE_RECOMMENDATION_SET_TITLE);
            }

            @Override // defpackage.jry
            public final String d(Context context) {
                return context.getString(R.string.FITNESS_MERCHANT_RECOMMENDATION_SET_TITLE);
            }

            @Override // defpackage.jry
            public final jic e() {
                return new jic("https://www.gstatic.com/maps/reserve/home/bootcamp.jpg", ckqc.FULLY_QUALIFIED, R.drawable.generic_image_placeholder);
            }
        };
        b = jryVar2;
        jry jryVar3 = new jry() { // from class: jrx
            @Override // defpackage.jry
            public final String a(Context context) {
                return context.getString(R.string.MADDEN_VERTICAL_TAB_TITLE_BEAUTY);
            }

            @Override // defpackage.jry
            public final jqz b(Context context, jrm jrmVar) {
                return new jrl(dcdc.k(jrmVar.a(context.getString(R.string.SERVICE_CATEGORY_HAIRCUT), "q=haircut", "https://www.gstatic.com/maps/reserve/home/w_hair_opt_small.jpg"), jrmVar.a(context.getString(R.string.SERVICE_CATEGORY_MASSAGE), "q=massage", "https://www.gstatic.com/maps/reserve/home/massage_opt_small.jpg"), jrmVar.a(context.getString(R.string.SERVICE_CATEGORY_WAXING_THREADING), "q=\"hair removal\"", "https://www.gstatic.com/maps/reserve/home/wax_opt_small.jpg"), jrmVar.a(context.getString(R.string.SERVICE_CATEGORY_NAILS), "q=nails", "https://www.gstatic.com/maps/reserve/home/nails_opt_small.jpg"), jrmVar.a(context.getString(R.string.SERVICE_CATEGORY_FACIAL), "q=facial", "https://www.gstatic.com/maps/reserve/home/spa_opt_small.jpg"), jrmVar.a(context.getString(R.string.SERVICE_CATEGORY_MORE), "sc=15", "https://www.gstatic.com/maps/reserve/home/m_hair_opt_small.jpg")));
            }

            @Override // defpackage.jry
            @dzsi
            public final String c(Context context) {
                return null;
            }

            @Override // defpackage.jry
            public final String d(Context context) {
                return context.getString(R.string.BEAUTY_MERCHANT_RECOMMENDATION_SET_TITLE);
            }

            @Override // defpackage.jry
            public final jic e() {
                return new jic("https://www.gstatic.com/maps/reserve/home/beauty_default_small.jpg", ckqc.FULLY_QUALIFIED, R.drawable.generic_image_placeholder);
            }
        };
        c = jryVar3;
        d = new jry[]{jryVar, jryVar2, jryVar3};
    }

    public jry(String str, int i) {
    }

    public static jry f(String str) {
        char c2;
        int hashCode = str.hashCode();
        if (hashCode != -1393028996) {
            if (hashCode == -847338008 && str.equals("fitness")) {
                c2 = 0;
            }
            c2 = 65535;
        } else {
            if (str.equals("beauty")) {
                c2 = 1;
            }
            c2 = 65535;
        }
        return c2 != 0 ? c2 != 1 ? a : c : b;
    }

    public static jry[] values() {
        return (jry[]) d.clone();
    }

    public abstract String a(Context context);

    @dzsi
    public abstract jqz b(Context context, jrm jrmVar);

    @dzsi
    public String c(Context context) {
        return null;
    }

    public String d(Context context) {
        return context.getString(R.string.GENERIC_MERCHANT_RECOMMENDATION_SET_TITLE);
    }

    public jic e() {
        return new jic("https://www.gstatic.com/maps/reserve/home/hero.jpg", ckqc.FULLY_QUALIFIED, R.drawable.generic_image_placeholder);
    }
}
