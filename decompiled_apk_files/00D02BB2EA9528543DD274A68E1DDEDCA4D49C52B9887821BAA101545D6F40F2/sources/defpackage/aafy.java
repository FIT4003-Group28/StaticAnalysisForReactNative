package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aafy  reason: default package */
/* loaded from: classes2.dex */
public abstract class aafy extends ivk {
    private final gga e;
    private final btvo f;
    private final dxio<brba> g;
    private final aaft h;
    private final aafx i;

    /* JADX INFO: Access modifiers changed from: protected */
    public aafy(aafv aafvVar, aafw aafwVar) {
        super(aafvVar.a);
        this.i = new aafx();
        this.e = aafvVar.b;
        this.f = aafvVar.c;
        this.g = aafvVar.d;
        Activity activity = (Activity) ((dxjd) aafvVar.e.a).a;
        aafu.a(activity, 1);
        aafu.a(aafwVar, 2);
        this.h = new aaft(activity, aafwVar);
    }

    @Override // defpackage.ivk, defpackage.izs
    public String E() {
        return this.e.getString(R.string.SEARCH_HINT);
    }

    @Override // defpackage.ivk, defpackage.izs
    public Boolean L() {
        boolean z = false;
        if (this.f.getEnableFeatureParameters().bc && super.L().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.izs
    public izi ae() {
        return this.h;
    }

    @Override // defpackage.izs
    public izh af() {
        return this.i;
    }

    public void ah() {
        M(true);
    }

    public void ai() {
        M(false);
    }

    @Override // defpackage.ivk, defpackage.izs
    public cqkl c() {
        bxko bxkoVar = new bxko();
        bxkoVar.Z();
        bxkoVar.Y();
        this.g.a().f(bvpb.b(d()).toString(), bxkoVar);
        return cqkl.a;
    }

    @Override // defpackage.ivk, defpackage.izs
    public cqss u() {
        return ibm.b();
    }
}
