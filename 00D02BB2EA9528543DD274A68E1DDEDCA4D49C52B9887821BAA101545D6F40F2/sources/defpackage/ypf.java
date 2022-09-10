package defpackage;

import android.widget.RadioGroup;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: ypf  reason: default package */
/* loaded from: classes7.dex */
final class ypf implements RadioGroup.OnCheckedChangeListener, Serializable {
    final /* synthetic */ yph a;

    public ypf(yph yphVar) {
        this.a = yphVar;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (this.a.b.h(i)) {
            if (this.a.t() != vxr.DEPARTURE_TIME) {
                ype ypeVar = this.a.c;
                ypeVar.b = false;
                ypeVar.c.u();
            }
            cqkx.p(this.a);
        }
    }
}
