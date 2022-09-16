package defpackage;

import android.os.Bundle;
import java.util.List;
/* compiled from: PG */
/* renamed from: bpgj  reason: default package */
/* loaded from: classes3.dex */
public class bpgj implements bpwm {
    public final ff a;
    public final dcdc<bpgi> d;
    private final dcdc<boxh> e;
    public int b = -1;
    public boxh c = boxh.UNKNOWN;
    private final cqkn<bpwp> f = new bpgh(this);

    public bpgj(ff ffVar) {
        this.a = ffVar;
        dcdc<boxh> h = dcdc.h(boxh.WHOLE_ROUTE, boxh.SEGMENT_SELECTION, boxh.NOT_SURE);
        this.e = h;
        dccx F = dcdc.F();
        int size = h.size();
        for (int i = 0; i < size; i++) {
            F.g(new bpgi(this, h.get(i), this.f));
        }
        this.d = F.f();
    }

    public void a(Bundle bundle) {
        int i = bundle.getInt("selected_extent_type", this.b);
        this.b = i;
        if (i < 0 || i >= this.d.size()) {
            return;
        }
        this.d.get(this.b).d(true);
        this.c = this.d.get(this.b).f();
    }

    @Override // defpackage.bpwm
    public List<bpgi> b() {
        return this.d;
    }
}
