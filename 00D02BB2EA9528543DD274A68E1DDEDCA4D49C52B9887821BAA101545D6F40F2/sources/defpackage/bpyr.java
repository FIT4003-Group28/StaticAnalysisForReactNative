package defpackage;

import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bpyr  reason: default package */
/* loaded from: classes4.dex */
public class bpyr implements bqig {
    public final bqgw a;
    private final ff b;
    private final SpinnerAdapter c;

    public bpyr(bqgw bqgwVar, ff ffVar, cqhn cqhnVar) {
        int i;
        this.a = bqgwVar;
        this.b = ffVar;
        ArrayList arrayList = new ArrayList(bpyp.values().length);
        for (bpyp bpypVar : bpyp.values()) {
            int ordinal = bpypVar.ordinal();
            if (ordinal == 0) {
                i = R.string.MISSING_ROAD_CATEGORY_PLACEHOLDER;
            } else if (ordinal == 1) {
                i = R.string.MISSING_ROAD_CATEGORY_NORMAL_ROAD_2;
            } else if (ordinal == 2) {
                i = R.string.MISSING_ROAD_CATEGORY_HIGHWAY;
            } else if (ordinal == 3) {
                i = R.string.MISSING_ROAD_CATEGORY_PARKING_LOT;
            } else if (ordinal != 4) {
                throw null;
            } else {
                i = R.string.MISSING_ROAD_CATEGORY_TRAIL;
            }
            arrayList.add(ffVar.getString(i));
        }
        this.c = new bpth(ffVar, 17367049, arrayList);
    }

    @Override // defpackage.jbg
    public AdapterView.OnItemSelectedListener Rs() {
        return new bpyq(this);
    }

    @Override // defpackage.jbg
    public Integer Rt() {
        bpyp[] values;
        for (bpyp bpypVar : bpyp.values()) {
            if (bpypVar.f == this.a.f) {
                return Integer.valueOf(bpypVar.ordinal());
            }
        }
        return 0;
    }

    @Override // defpackage.jbg
    public SpinnerAdapter Rv() {
        return this.c;
    }

    @Override // defpackage.bqig
    public String d() {
        return this.b.getString(R.string.MISSING_ROAD_CATEGORY_CAPTION);
    }
}
