package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* renamed from: kml  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class kml implements cqjb {
    static final cqjb a = new kml();

    private kml() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        bevj bevjVar = (bevj) cqkpVar;
        return bevjVar.m().booleanValue() ? context.getResources().getString(R.string.CAR_EV_INFO_NUM_AVAILABLE_PORTS, kmz.a.b(String.format(Locale.getDefault(), "%d", bevjVar.n())), kmz.a.b(String.format(Locale.getDefault(), "%d", bevjVar.b()))) : String.format(Locale.getDefault(), "%s: %d", context.getResources().getString(R.string.EV_INFO_AVAILABILITY_UNKNOWN), bevjVar.b());
    }
}
