package defpackage;

import android.content.Context;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bpcz  reason: default package */
/* loaded from: classes3.dex */
public class bpcz implements jbg {
    public static final dcdc<bpcy> a = dcdc.h(bpcy.c(R.string.ROAD_CLOSED_DIRECTION_PLACEHOLDER, 1), bpcy.c(R.string.ROAD_CLOSED_DIRECTION_TWO_WAYS, 2), bpcy.c(R.string.ROAD_CLOSED_DIRECTION_ONE_WAY, 3));
    public final boxb b;
    public int c;
    private final ArrayAdapter<String> d;
    private final AdapterView.OnItemSelectedListener e = new bpcx(this);

    public bpcz(Context context, boxb boxbVar) {
        int i = 0;
        this.c = 0;
        this.b = boxbVar;
        ArrayList arrayList = new ArrayList();
        while (true) {
            dcdc<bpcy> dcdcVar = a;
            if (i < dcdcVar.size()) {
                bpcy bpcyVar = dcdcVar.get(i);
                if (boxbVar.e == bpcyVar.b()) {
                    this.c = i;
                }
                arrayList.add(context.getString(bpcyVar.a()));
                i++;
            } else {
                this.d = new bpth(context, 17367043, arrayList);
                return;
            }
        }
    }

    @Override // defpackage.jbg
    public AdapterView.OnItemSelectedListener Rs() {
        return this.e;
    }

    @Override // defpackage.jbg
    public Integer Rt() {
        return Integer.valueOf(this.c);
    }

    @Override // defpackage.jbg
    public SpinnerAdapter Rv() {
        return this.d;
    }
}
