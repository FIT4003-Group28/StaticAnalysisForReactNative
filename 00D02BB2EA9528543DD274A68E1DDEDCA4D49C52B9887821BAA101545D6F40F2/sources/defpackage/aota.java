package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aota  reason: default package */
/* loaded from: classes2.dex */
public class aota implements ihz {
    final /* synthetic */ gga a;
    final /* synthetic */ anhg b;

    public aota(gga ggaVar, anhg anhgVar) {
        this.a = ggaVar;
        this.b = anhgVar;
    }

    @Override // defpackage.ihz
    public String b() {
        return this.a.getString(R.string.EXPLORE_YOUR_TIMELINE);
    }

    @Override // defpackage.ihz
    public cjtd c() {
        return cjtd.a(dtyc.ad);
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
        this.b.C();
        return cqkl.a;
    }
}
