package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aczj  reason: default package */
/* loaded from: classes.dex */
public class aczj implements jbm {
    private final String b;
    private final dxio<abfb> d;
    private final acwt e;
    private final cqtd a = cqrt.g(2131231690, ibm.p());
    private final cjtd c = cjtd.a(dtxr.z);

    public aczj(Activity activity, dxio<abfb> dxioVar, acwt acwtVar) {
        this.d = dxioVar;
        this.e = acwtVar;
        this.b = activity.getString(R.string.EXPLORE_MORE_SUBINTENTS);
    }

    @Override // defpackage.jbm
    public cqtd a() {
        return this.a;
    }

    @Override // defpackage.jbm
    public String b() {
        return this.b;
    }

    @Override // defpackage.jbm
    public cjtd c() {
        return this.c;
    }

    @Override // defpackage.jbm
    public cqkl d(cjqm cjqmVar) {
        this.e.a();
        this.d.a().e(abse.e);
        return cqkl.a;
    }
}
