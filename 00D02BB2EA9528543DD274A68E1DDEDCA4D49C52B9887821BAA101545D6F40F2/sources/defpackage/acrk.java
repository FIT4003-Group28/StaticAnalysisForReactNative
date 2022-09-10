package defpackage;

import android.app.Activity;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: acrk  reason: default package */
/* loaded from: classes2.dex */
public class acrk implements acmi {
    private static final dcdn<dpol, Integer> h;
    public final cjqy a;
    public final gce b;
    public final acrj c;
    public int d;
    private final Activity f;
    private SpinnerAdapter g;
    private dcdc<dvvq> e = dcdc.e();
    private final AdapterView.OnItemSelectedListener i = new acrh(this);

    static {
        dcdg p = dcdn.p();
        p.f(dpol.MONDAY, Integer.valueOf((int) R.string.BUSYNESS_MONDAYS));
        p.f(dpol.TUESDAY, Integer.valueOf((int) R.string.BUSYNESS_TUESDAYS));
        p.f(dpol.WEDNESDAY, Integer.valueOf((int) R.string.BUSYNESS_WEDNESDAYS));
        p.f(dpol.THURSDAY, Integer.valueOf((int) R.string.BUSYNESS_THURSDAYS));
        p.f(dpol.FRIDAY, Integer.valueOf((int) R.string.BUSYNESS_FRIDAYS));
        p.f(dpol.SATURDAY, Integer.valueOf((int) R.string.BUSYNESS_SATURDAYS));
        p.f(dpol.SUNDAY, Integer.valueOf((int) R.string.BUSYNESS_SUNDAYS));
        h = p.b();
    }

    public acrk(Activity activity, cjqy cjqyVar, gce gceVar, acrj acrjVar) {
        this.f = activity;
        this.a = cjqyVar;
        this.b = gceVar;
        this.c = acrjVar;
    }

    @Override // defpackage.acmi
    public SpinnerAdapter a() {
        if (this.g == null) {
            Activity activity = this.f;
            ArrayList arrayList = new ArrayList();
            dcdc<dvvq> dcdcVar = this.e;
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                Activity activity2 = this.f;
                dcdn<dpol, Integer> dcdnVar = h;
                dpol b = dpol.b(dcdcVar.get(i).b);
                if (b == null) {
                    b = dpol.DAY_OF_WEEK_UNSPECIFIED;
                }
                arrayList.add(activity2.getString(dcdnVar.get(b).intValue()));
            }
            acri acriVar = new acri(this, activity, arrayList);
            acriVar.setDropDownViewResource(R.layout.spinner_list_item);
            this.g = acriVar;
        }
        return this.g;
    }

    @Override // defpackage.acmi
    public AdapterView.OnItemSelectedListener b() {
        return this.i;
    }

    @Override // defpackage.acmi
    public Integer c() {
        return Integer.valueOf(this.d);
    }

    public void d(int i) {
        this.d = i;
    }

    public void e(dcdc<dvvq> dcdcVar, int i) {
        this.d = i;
        this.e = dcdcVar;
    }
}
