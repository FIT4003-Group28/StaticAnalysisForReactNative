package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: beah  reason: default package */
/* loaded from: classes3.dex */
public class beah extends bruj {
    private final Activity e;
    private final dxio<begg> f;
    private final jba g;
    private final brsc h;

    public beah(Activity activity, dxio<begg> dxioVar, brsc brscVar, jba jbaVar, brrx brrxVar) {
        super(brscVar, brrxVar);
        this.e = activity;
        this.f = dxioVar;
        this.g = jbaVar;
        this.h = brscVar;
    }

    @Override // defpackage.brvb
    public cqkl a(cjqm cjqmVar) {
        this.h.d(bege.DIRECTORY);
        return cqkl.a;
    }

    @Override // defpackage.brvb
    public String b() {
        String g = this.g.g();
        if (dbsj.d(g)) {
            return this.e.getString(R.string.MALLS_DIRECTORY_TITLE);
        }
        return this.e.getString(R.string.MALLS_DIRECTORY_CONTEXT_DESCRIPTION, new Object[]{g});
    }

    @Override // defpackage.bruj
    protected final String c() {
        return this.e.getString(R.string.MALLS_DIRECTORY_TITLE);
    }

    @Override // defpackage.brvb
    public Boolean d() {
        boolean z = false;
        if (r() != null && this.f.a().i(bege.DIRECTORY)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brvb
    public cqtd f() {
        return cqrt.g(2131231754, ibm.w());
    }
}
