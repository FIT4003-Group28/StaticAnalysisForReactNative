package defpackage;

import android.app.Activity;
import java.util.List;
/* compiled from: PG */
/* renamed from: behj  reason: default package */
/* loaded from: classes3.dex */
public class behj implements cqkp, bega {
    private final Activity a;
    private final dxio<afha> b;
    private final List<behh> c = dchl.a();

    public behj(Activity activity, dxio<afha> dxioVar) {
        this.a = activity;
        this.b = dxioVar;
    }

    public List<behh> a() {
        return this.c;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            u();
            return;
        }
        for (dnoj dnojVar : iloVar.bz()) {
            this.c.add(new behi(this.a, dnojVar, this.b.a()));
        }
    }

    @Override // defpackage.bega
    public void u() {
        this.c.clear();
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(!this.c.isEmpty());
    }
}
