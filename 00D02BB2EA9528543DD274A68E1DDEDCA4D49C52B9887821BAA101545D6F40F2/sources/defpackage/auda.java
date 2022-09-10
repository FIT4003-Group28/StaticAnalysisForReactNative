package defpackage;

import com.google.android.apps.maps.R;
/* renamed from: auda  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class auda implements cqlc {
    static final cqlc a = new auda();

    private auda() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cqtv cqtvVar = audg.a;
        if (((audo) cqkpVar).d().booleanValue()) {
            return iva.g(R.drawable.redesigned_speedlimit_na_bg, R.drawable.redesigned_speedlimit_na_bg_night);
        }
        return iva.g(R.drawable.redesigned_speedlimit_world_bg, R.drawable.redesigned_speedlimit_world_bg_night);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
