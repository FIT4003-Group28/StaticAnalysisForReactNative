package defpackage;

import android.widget.RadioGroup;
import com.google.android.apps.maps.R;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: ypg  reason: default package */
/* loaded from: classes7.dex */
public class ypg implements Serializable, zed {
    private static final int[] a = {R.id.departat_button, R.id.arriveby_button, R.id.lastavailable_button};
    private static final int[] b = {R.string.DIRECTIONS_DEPART_AT_BUTTON, R.string.DIRECTIONS_ARRIVE_BY_BUTTON, R.string.DIRECTIONS_LAST_AVAILABLE_TIME_BUTTON};
    private static final ddho[] c = {dtxn.R, dtxn.P, dtxn.T};
    private int d;
    private vxr e;
    @dzsi
    private final transient RadioGroup.OnCheckedChangeListener f;
    private final boolean g;

    public ypg(vxr vxrVar, @dzsi RadioGroup.OnCheckedChangeListener onCheckedChangeListener, dqvj dqvjVar) {
        this.d = yph.q(vxrVar);
        this.e = vxrVar;
        this.f = onCheckedChangeListener;
        this.g = dqvjVar == dqvj.DRIVE;
    }

    @Override // defpackage.jbb
    public final Integer a(int i) {
        return Integer.valueOf(a[i]);
    }

    @Override // defpackage.jbb
    @dzsi
    public RadioGroup.OnCheckedChangeListener b() {
        return this.f;
    }

    @Override // defpackage.jab
    public final Integer c() {
        throw null;
    }

    @Override // defpackage.jab
    public Boolean d(int i) {
        return Boolean.valueOf(a(i).intValue() == this.d);
    }

    @Override // defpackage.jab
    public final CharSequence e(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.jab
    public cqkl f(cjqm cjqmVar, int i) {
        return cqkl.a;
    }

    @Override // defpackage.jab
    public cjtd g(int i) {
        return cjtd.a(c[i]);
    }

    public boolean h(int i) {
        vxr vxrVar;
        if (this.d == i) {
            return false;
        }
        this.d = i;
        if (i == R.id.departat_button) {
            vxrVar = vxr.DEPARTURE_TIME;
        } else if (i == R.id.arriveby_button) {
            vxrVar = vxr.ARRIVAL_TIME;
        } else if (i == R.id.lastavailable_button) {
            vxrVar = vxr.LAST_AVAILABLE;
        } else {
            int i2 = yph.h;
            vxrVar = vxr.DEPARTURE_TIME;
        }
        this.e = vxrVar;
        return true;
    }

    public vxr i() {
        return this.e;
    }

    @Override // defpackage.zed
    public Integer j(int i) {
        return Integer.valueOf(b[i]);
    }

    @Override // defpackage.zed
    public Boolean k() {
        return Boolean.valueOf(this.g);
    }
}
