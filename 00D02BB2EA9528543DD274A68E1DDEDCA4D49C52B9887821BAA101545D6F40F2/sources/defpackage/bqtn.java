package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bqtn  reason: default package */
/* loaded from: classes4.dex */
public class bqtn extends bquc<Integer> implements bqsr {
    private static final dcdn<dqwi, Integer> d;
    private static final dcdn<dqwi, Integer> e;
    private static final dcdn<dqwi, Integer> f;
    public final dqwi a;
    private final Activity b;
    @dzsi
    private final String c;

    static {
        dcdg p = dcdn.p();
        p.f(dqwi.ROOMS, Integer.valueOf((int) R.string.ROOM_HOTEL_ATTRIBUTE_RATING_QUESTION));
        p.f(dqwi.SERVICE, Integer.valueOf((int) R.string.SERVICE_HOTEL_ATTRIBUTE_RATING_QUESTION));
        p.f(dqwi.LOCATION, Integer.valueOf((int) R.string.LOCATION_HOTEL_ATTRIBUTE_RATING_QUESTION));
        d = dcjz.c(p.b());
        dcdg p2 = dcdn.p();
        p2.f(dqwi.ROOMS, Integer.valueOf((int) R.string.HOTEL_ROOM_ATTRIBUTE_CLEAR_BUTTON_DESCRIPTION));
        p2.f(dqwi.SERVICE, Integer.valueOf((int) R.string.HOTEL_SERVICE_ATTRIBUTE_CLEAR_BUTTON_DESCRIPTION));
        p2.f(dqwi.LOCATION, Integer.valueOf((int) R.string.HOTEL_LOCATION_ATTRIBUTE_CLEAR_BUTTON_DESCRIPTION));
        e = dcjz.c(p2.b());
        dcdg p3 = dcdn.p();
        p3.f(dqwi.ROOMS, Integer.valueOf((int) R.string.HOTEL_ROOMS_ATTRIBUTE_DESCRIPTION));
        p3.f(dqwi.SERVICE, Integer.valueOf((int) R.string.HOTEL_SERVICE_ATTRIBUTE_DESCRIPTION));
        p3.f(dqwi.LOCATION, Integer.valueOf((int) R.string.HOTEL_LOCATION_ATTRIBUTE_DESCRIPTION));
        f = dcjz.c(p3.b());
    }

    public bqtn(Activity activity, dqwi dqwiVar, int i) {
        super(Integer.valueOf(i));
        this.b = activity;
        this.a = dqwiVar;
        Integer num = d.get(dqwiVar);
        this.c = num == null ? null : activity.getString(num.intValue());
    }

    @Override // defpackage.jbc
    public Float a() {
        return Float.valueOf(k().intValue());
    }

    @Override // defpackage.jbc
    @dzsi
    public jez b() {
        return new jez(this) { // from class: bqtm
            private final bqtn a;

            {
                this.a = this;
            }

            @Override // defpackage.jez
            public final void a(cjqm cjqmVar, float f2) {
                this.a.o(Integer.valueOf((int) f2));
            }
        };
    }

    @Override // defpackage.jbc
    @dzsi
    public cjtd c() {
        return null;
    }

    @Override // defpackage.bqsr
    @dzsi
    public String d() {
        return this.c;
    }

    @Override // defpackage.bqsr
    public cqkl e() {
        o(1);
        cqkx.p(this);
        o(0);
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.bqsr
    @dzsi
    public String f() {
        dbsg j = dbsg.j(e.get(this.a));
        final Activity activity = this.b;
        activity.getClass();
        return (String) j.h(new dbrn(activity) { // from class: bqti
            private final Activity a;

            {
                this.a = activity;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.getString(((Integer) obj).intValue());
            }
        }).f();
    }

    @Override // defpackage.bqsr
    @dzsi
    public String g() {
        dbsg j = dbsg.j(f.get(this.a));
        final Activity activity = this.b;
        activity.getClass();
        return (String) j.h(new dbrn(activity) { // from class: bqtj
            private final Activity a;

            {
                this.a = activity;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.getString(((Integer) obj).intValue());
            }
        }).f();
    }

    @Override // defpackage.bquc
    protected final dbsg<Integer> h(docg docgVar) {
        dqwy dqwyVar = docgVar.G;
        if (dqwyVar == null) {
            dqwyVar = dqwy.c;
        }
        return dcbg.b(dqwyVar.b).r(new dbsl(this) { // from class: bqtk
            private final bqtn a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                bqtn bqtnVar = this.a;
                dqwo dqwoVar = (dqwo) obj;
                if ((dqwoVar.a & 2) != 0) {
                    dqwm dqwmVar = dqwoVar.b;
                    if (dqwmVar == null) {
                        dqwmVar = dqwm.d;
                    }
                    dqwi b = dqwi.b(dqwmVar.b);
                    if (b == null) {
                        b = dqwi.UNKNOWN_ATTRIBUTE_TYPE;
                    }
                    return b.equals(bqtnVar.a);
                }
                return false;
            }
        }).h(bqtl.a);
    }
}
