package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bftg  reason: default package */
/* loaded from: classes3.dex */
class bftg implements ihz {
    private final Resources a;
    private final aeim b;

    public bftg(Resources resources, aeim aeimVar) {
        this.a = resources;
        this.b = aeimVar;
    }

    @Override // defpackage.ihz
    public String b() {
        return this.a.getString(R.string.MORE_HOTELS_CATEGORICAL_LURE);
    }

    @Override // defpackage.ihz
    public cjtd c() {
        return cjtd.a(dtxj.aX);
    }

    @Override // defpackage.ihz
    public Boolean d() {
        return ihy.a();
    }

    @Override // defpackage.ihz
    public cqtc e() {
        return cquz.a;
    }

    @Override // defpackage.ihz
    public cqkl f(cjqm cjqmVar) {
        this.b.a(cjqmVar);
        return cqkl.a;
    }
}
