package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bbaj  reason: default package */
/* loaded from: classes3.dex */
class bbaj extends bbap {
    final /* synthetic */ bbak a;

    public bbaj(bbak bbakVar) {
        this.a = bbakVar;
    }

    @Override // defpackage.baye
    public Boolean a() {
        boolean z = false;
        if (this.a.QI().isEmpty() && !this.a.a) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.baye
    public String b() {
        return this.a.d.getString(R.string.MY_MAPS_EMPTY_STATE_TEXT);
    }
}
