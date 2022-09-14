package com.google.android.apps.gmm.directions.api;

import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class GmmNotice implements Parcelable {
    public static GmmNotice e(dozz dozzVar, @dzsi dwag dwagVar) {
        return new AutoValue_GmmNotice(dsuv.f(dozzVar), dwagVar == null ? null : dsuv.f(dwagVar));
    }

    public static GmmNotice f(dozz dozzVar) {
        return e(dozzVar, null);
    }

    public static dcdc<GmmNotice> g(Iterable<dozz> iterable) {
        return dcbg.b(iterable).s(qbu.a).z();
    }

    protected abstract ProtoParsers$ParcelableProto<dozz> a();

    @dzsi
    protected abstract ProtoParsers$ParcelableProto<dwag> b();

    public final dozz c() {
        return a().a(dozz.y, dsqa.b());
    }

    @dzsi
    public final dwag d() {
        ProtoParsers$ParcelableProto<dwag> b = b();
        if (b == null) {
            return null;
        }
        return b.a(dwag.c, dsqa.b());
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GmmNotice) {
            GmmNotice gmmNotice = (GmmNotice) obj;
            if (dbsd.a(c(), gmmNotice.c()) && dbsd.a(d(), gmmNotice.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{c(), d()});
    }
}
