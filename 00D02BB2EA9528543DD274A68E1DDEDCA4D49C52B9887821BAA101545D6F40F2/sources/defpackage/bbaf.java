package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bbaf  reason: default package */
/* loaded from: classes3.dex */
class bbaf extends bbap {
    final /* synthetic */ bbag a;

    public bbaf(bbag bbagVar) {
        this.a = bbagVar;
    }

    @Override // defpackage.baye
    public Boolean a() {
        boolean z = false;
        if (this.a.b.isEmpty() && !this.a.d().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.baye
    public String b() {
        return this.a.d.getString(R.string.FOLLOWED_TAB_EMPTY_STATE_HEADLINE);
    }
}
