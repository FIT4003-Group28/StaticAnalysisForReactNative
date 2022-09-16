package defpackage;

import java.util.Collection;
/* compiled from: PG */
/* renamed from: sdv  reason: default package */
/* loaded from: classes7.dex */
public abstract class sdv {
    public static sdv d(sdu sduVar, int i, Collection<dbsg<dopk>> collection) {
        dbsk.e(collection.size() >= 2, "transitStations size (%s) must be >= 2", collection.size());
        return new sbu(sduVar, i, dcdc.r(collection));
    }

    public static sdv e(sdu sduVar, int i) {
        return d(sduVar, i, dcdc.g(dbpy.a, dbpy.a));
    }

    public abstract sdu a();

    public abstract dcdc<dbsg<dopk>> b();

    public abstract int c();
}
