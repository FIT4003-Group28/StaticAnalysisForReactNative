package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bafh  reason: default package */
/* loaded from: classes3.dex */
class bafh extends bbap {
    final /* synthetic */ bafl a;

    public bafh(bafl baflVar) {
        this.a = baflVar;
    }

    @Override // defpackage.baye
    public Boolean a() {
        return Boolean.valueOf(this.a.c().isEmpty());
    }

    @Override // defpackage.baye
    public String b() {
        return this.a.c.getString(R.string.FOLLOWED_TAB_EMPTY_STATE_HEADLINE);
    }
}
