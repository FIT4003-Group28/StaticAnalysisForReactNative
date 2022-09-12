package defpackage;

import android.app.Activity;
import java.util.List;
/* compiled from: PG */
/* renamed from: jsk  reason: default package */
/* loaded from: classes7.dex */
public class jsk implements jrj {
    private final dcdc<jri> a;
    private int b;

    public jsk(Activity activity, jrh jrhVar, List<jry> list, int i) {
        dbsk.b(!list.isEmpty(), "Must have at least one vertical");
        dccx F = dcdc.F();
        for (int i2 = 0; i2 < list.size(); i2++) {
            F.g(new jsj(jrhVar, list.get(i2).a(activity), i2));
        }
        dcdc<jri> f = F.f();
        this.a = f;
        this.b = i;
        f.get(i).d(true);
    }

    @Override // defpackage.jrj
    public List<jri> a() {
        return this.a;
    }

    @Override // defpackage.jrj
    public Float b() {
        return Float.valueOf(this.b + 1.0f);
    }

    @Override // defpackage.jrj
    public void c(int i) {
        this.a.get(this.b).d(false);
        this.b = i;
        this.a.get(i).d(true);
    }
}
