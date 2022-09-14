package defpackage;

import android.app.Activity;
import android.text.Spannable;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cecm  reason: default package */
/* loaded from: classes4.dex */
public class cecm implements oxk {
    public static final dcdn<dqwx, Integer> a;
    @dzsi
    private final CharSequence b;
    private final dcdc<oxj> c;

    static {
        dcdg p = dcdn.p();
        p.f(dqwx.SOLO, Integer.valueOf((int) R.string.SOLO_TRIP_TYPE_SELECTION_TEXT));
        p.f(dqwx.BUSINESS, Integer.valueOf((int) R.string.BUSINESS_TRIP_TYPE_SELECTION_TEXT));
        p.f(dqwx.FAMILY, Integer.valueOf((int) R.string.FAMILY_TRIP_TYPE_SELECTION_TEXT));
        p.f(dqwx.COUPLE, Integer.valueOf((int) R.string.COUPLE_TRIP_TYPE_SELECTION_TEXT));
        p.f(dqwx.FRIENDS, Integer.valueOf((int) R.string.FRIENDS_TRIP_TYPE_SELECTION_TEXT));
        p.f(dqwx.VACATION, Integer.valueOf((int) R.string.VACATION_TRIP_TYPE_SELECTION_TEXT));
        a = dcjz.c(p.b());
    }

    public cecm(final Activity activity, dqwy dqwyVar) {
        final bvsx bvsxVar = new bvsx(activity.getResources());
        Spannable spannable = null;
        if (dqwyVar.a.size() != 0) {
            dcbg s = dcbg.b(dqwyVar.a).o(cecf.a).s(cecg.a);
            final dcdn<dqwx, Integer> dcdnVar = a;
            dcdnVar.getClass();
            dcdc z = s.o(new dbsl(dcdnVar) { // from class: cech
                private final dcdn a;

                {
                    this.a = dcdnVar;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return this.a.containsKey((dqwx) obj);
                }
            }).s(new dbrn(activity) { // from class: ceci
                private final Activity a;

                {
                    this.a = activity;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    Activity activity2 = this.a;
                    Integer num = cecm.a.get((dqwx) obj);
                    dbsk.s(num);
                    return activity2.getString(num.intValue());
                }
            }).z();
            if (!z.isEmpty()) {
                bvsu c = bvsxVar.c(R.string.TRIP_TYPE_TEXT);
                bvsw bvswVar = new bvsw();
                bvswVar.c();
                c.b(bvswVar);
                c.a(bvsm.a(z, activity.getResources()));
                spannable = c.c();
            }
        }
        this.b = spannable;
        this.c = dcbg.b(dqwyVar.b).s(new dbrn(bvsxVar) { // from class: cecj
            private final bvsx a;

            {
                this.a = bvsxVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dcdn<dqwx, Integer> dcdnVar2 = cecm.a;
                return new cecl(this.a, (dqwo) obj);
            }
        }).o(ceck.a).z();
    }

    @Override // defpackage.oxk
    @dzsi
    public CharSequence a() {
        return this.b;
    }

    @Override // defpackage.oxk
    public List<oxj> b() {
        return this.c;
    }
}
