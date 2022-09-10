package defpackage;

import android.os.Bundle;
import com.google.android.apps.gmm.directions.commute.hub.api.CommuteHubDirective$RouteInfo;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: qup  reason: default package */
/* loaded from: classes7.dex */
public abstract class qup {
    public static qup f(dndr dndrVar, domy domyVar, Iterable<CommuteHubDirective$RouteInfo> iterable, @dzsi quq quqVar, long j) {
        return new quj(dndrVar, domyVar, dcdc.q(iterable), quqVar, j);
    }

    public static qup g(quq quqVar) {
        return f(dndr.UNKNOWN_ALIAS_TYPE, domy.UNKNOWN_TRAVEL_MODE, dcdc.e(), quqVar, Long.MAX_VALUE);
    }

    @dzsi
    public static qup i(@dzsi Bundle bundle) {
        quq quqVar;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("error-type")) {
            int i = bundle.getInt("error-type");
            quq[] values = quq.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    quqVar = quq.INTERNAL_ERROR;
                    break;
                }
                quqVar = values[i2];
                if (quqVar.e == i) {
                    break;
                }
                i2++;
            }
            return g(quqVar);
        }
        return f(dndr.b(bundle.getInt("destination-alias-type", dndr.UNKNOWN_ALIAS_TYPE.h)), domy.b(bundle.getInt("travel-mode", domy.UNKNOWN_TRAVEL_MODE.h)), bundle.getParcelableArrayList("routes-info"), null, bundle.getLong("creation-time"));
    }

    public abstract dndr a();

    public abstract domy b();

    public abstract dcdc<CommuteHubDirective$RouteInfo> c();

    @dzsi
    public abstract quq d();

    public abstract long e();

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qup)) {
            return false;
        }
        qup qupVar = (qup) obj;
        return dbsd.a(a(), qupVar.a()) && dbsd.a(b(), qupVar.b()) && dbsd.a(c(), qupVar.c()) && dbsd.a(d(), qupVar.d());
    }

    public final Bundle h() {
        Bundle bundle = new Bundle();
        quq d = d();
        if (d != null) {
            bundle.putInt("error-type", d.e);
            return bundle;
        }
        bundle.putInt("destination-alias-type", a().h);
        bundle.putInt("travel-mode", b().h);
        bundle.putParcelableArrayList("routes-info", new ArrayList<>(c()));
        bundle.putLong("creation-time", e());
        return bundle;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), c(), d()});
    }
}
