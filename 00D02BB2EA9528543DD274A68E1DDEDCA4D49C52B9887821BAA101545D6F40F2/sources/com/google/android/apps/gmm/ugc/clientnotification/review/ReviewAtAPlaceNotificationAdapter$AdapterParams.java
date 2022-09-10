package com.google.android.apps.gmm.ugc.clientnotification.review;

import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ReviewAtAPlaceNotificationAdapter$AdapterParams implements Parcelable {
    public abstract long a();

    public abstract String b();

    public abstract String c();

    public abstract dbsg<String> d();

    public abstract dbsg<String> e();

    public abstract dbsg<String> f();

    public abstract dbsg<bzvt> g();

    public abstract dbsg<bzvt> h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract int l();

    public abstract dbsg<byte[]> m();

    public abstract dbsg<byte[]> n();

    public abstract boolean o();

    public abstract bzuy p();

    public final akqi q() {
        return akqi.b(b());
    }

    public final boolean r() {
        return l() == dpyv.SERVICE_RECOMMENDATION_POST_INTERACTION.dm;
    }

    public final bzvt s() {
        if (h().a()) {
            return h().b();
        }
        if (g().a()) {
            return g().b();
        }
        return bzvt.d().c();
    }
}
