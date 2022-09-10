package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bagm  reason: default package */
/* loaded from: classes3.dex */
class bagm extends bbap {
    final /* synthetic */ bago a;

    public bagm(bago bagoVar) {
        this.a = bagoVar;
    }

    @Override // defpackage.baye
    public Boolean a() {
        return Boolean.valueOf(this.a.c().isEmpty());
    }

    @Override // defpackage.baye
    public String b() {
        return this.a.a.getString(R.string.MY_MAPS_EMPTY_STATE_TEXT);
    }
}
