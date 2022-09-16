package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cayz  reason: default package */
/* loaded from: classes4.dex */
public class cayz extends cayp {
    private final cbqg h;
    private final boolean i;
    private final Context j;

    public cayz(Context context, @dzsi dpvi dpviVar, @dzsi cbau cbauVar, cbbs cbbsVar, cqkj cqkjVar, boolean z, @dzsi dpvi dpviVar2, ges gesVar, boolean z2, cbqg cbqgVar) {
        super(context, dpviVar, cbauVar, cbbsVar, cqkjVar, z, dpviVar2, gesVar);
        this.h = cbqgVar;
        this.i = z2;
        this.j = context;
    }

    @Override // defpackage.cbqm
    public Boolean l() {
        boolean z = false;
        if (!this.i && this.h.c() && this.c) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cbqm
    @dzsi
    public String m() {
        return this.j.getString(R.string.EVENT_REPEATS);
    }

    @Override // defpackage.cbqm
    public cqkl n() {
        this.g.dismiss();
        dpvi j = j();
        this.e.i(j);
        dpvi c = this.e.c();
        if (c != null && !cbpy.a(j).C(cbpy.a(c))) {
            this.e.l(null);
        }
        this.d.aZ(cbbt.g(this.e));
        return cqkl.a;
    }
}
