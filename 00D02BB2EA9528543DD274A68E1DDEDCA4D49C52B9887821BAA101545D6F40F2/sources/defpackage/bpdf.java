package defpackage;

import android.app.Activity;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import com.google.android.apps.gmm.majorevents.api.MajorEvent;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bpdf  reason: default package */
/* loaded from: classes3.dex */
public class bpdf implements bpvu {
    public final boxd a;
    @dzsi
    public String c;
    public dcdc<bpde> d;
    private final bpvv e;
    private final Activity f;
    private final int g;
    private final boxc h;
    private final cjtd i;
    private ArrayAdapter<String> j;
    public int b = 0;
    private final AdapterView.OnItemSelectedListener k = new bpdd(this);

    public bpdf(bpvv bpvvVar, boxd boxdVar, Activity activity, int i, boxc boxcVar, cjtd cjtdVar, dcdc<bpde> dcdcVar) {
        this.e = bpvvVar;
        this.a = boxdVar;
        this.f = activity;
        this.g = i;
        this.h = boxcVar;
        this.i = cjtdVar;
        this.d = dcdcVar;
        ArrayList arrayList = new ArrayList();
        int size = dcdcVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(dcdcVar.get(i2).a());
        }
        this.j = new bpth(activity, 17367043, arrayList);
        if (!dcdcVar.isEmpty()) {
            this.c = dcdcVar.get(0).b();
        }
    }

    @Override // defpackage.jbg
    public AdapterView.OnItemSelectedListener Rs() {
        return this.k;
    }

    @Override // defpackage.jbg
    public Integer Rt() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.jbg
    public SpinnerAdapter Rv() {
        return this.j;
    }

    @Override // defpackage.bpvu
    public void d(dcdc<MajorEvent> dcdcVar, boolean z) {
        Activity activity = this.f;
        dccx F = dcdc.F();
        if (!dcdcVar.isEmpty()) {
            F.g(bpde.c(activity.getString(R.string.ROAD_CLOSED_REASON_EVENT_PLACEHOLDER), null));
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                MajorEvent majorEvent = dcdcVar.get(i);
                F.g(bpde.c(majorEvent.f(), majorEvent.a()));
            }
            F.g(bpde.c(activity.getString(R.string.ROAD_CLOSED_REASON_OTHER), "OTHER"));
        }
        this.d = F.f();
        dccx F2 = dcdc.F();
        dcdc<bpde> dcdcVar2 = this.d;
        int size2 = dcdcVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            F2.g(dcdcVar2.get(i2).a());
        }
        bpth bpthVar = new bpth(this.f, 17367043, F2.f());
        this.j = bpthVar;
        bpthVar.notifyDataSetChanged();
        if (z) {
            this.b = 1;
            String b = this.d.get(1).b();
            this.c = b;
            this.a.b = b;
            this.e.e(boxc.EVENT);
        }
    }

    @Override // defpackage.bpvu
    public Boolean e() {
        return Boolean.valueOf(this.a.a == this.h);
    }

    @Override // defpackage.bpvu
    public CharSequence f() {
        return this.f.getText(this.g);
    }

    @Override // defpackage.bpvu
    public cqkl g() {
        this.e.e(this.h);
        return cqkl.a;
    }

    @Override // defpackage.bpvu
    public boxc h() {
        return this.h;
    }

    @Override // defpackage.bpvu
    public cjtd i() {
        return this.i;
    }

    @Override // defpackage.bpvu
    public Boolean j() {
        boolean z = false;
        if (e().booleanValue() && !this.d.isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bpvu
    @dzsi
    public String k() {
        return this.c;
    }
}
