package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jzc  reason: default package */
/* loaded from: classes7.dex */
public final class jzc implements crzp<dcep<ktr>> {
    final /* synthetic */ jze a;

    public jzc(jze jzeVar) {
        this.a = jzeVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<dcep<ktr>> crzmVar) {
        dcep<ktr> l = crzmVar.l();
        dbsk.s(l);
        if (l.contains(ktr.LOCATION_PERMISSION_NOT_ACCEPTED)) {
            jze jzeVar = this.a;
            jzeVar.a(jzeVar.a.getResources().getString(R.string.CAR_PHONE_PERMISSION_NOTIFICATION_TEXT));
        } else if (l.contains(ktr.GPS_DISABLED)) {
            jze jzeVar2 = this.a;
            jzeVar2.a(jzeVar2.a.getResources().getString(R.string.CAR_PHONE_LOCATION_NOTIFICATION_TEXT));
        } else if (!l.equals(ktr.g)) {
        } else {
            this.a.z.cancel(dpyv.CAR_ROADBLOCK_FIRST_RUN.dm);
        }
    }
}
