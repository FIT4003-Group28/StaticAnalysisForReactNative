package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aeiz  reason: default package */
/* loaded from: classes2.dex */
class aeiz implements ihz {
    final /* synthetic */ aeja a;

    public aeiz(aeja aejaVar) {
        this.a = aejaVar;
    }

    @Override // defpackage.ihz
    public String b() {
        aeja aejaVar = this.a;
        return aejaVar.b.getString(true != aejaVar.i() ? R.string.EXPLORE_SEE_MORE : R.string.HOTELS_SEE_ALL);
    }

    @Override // defpackage.ihz
    public cjtd c() {
        return this.a.e;
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
        this.a.c.f(cjqmVar, dbpy.a, this.a.i());
        return cqkl.a;
    }
}
