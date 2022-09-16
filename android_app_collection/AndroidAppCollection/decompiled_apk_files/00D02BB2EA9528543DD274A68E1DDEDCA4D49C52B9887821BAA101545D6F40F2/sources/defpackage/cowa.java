package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.model.AccountMetadata;
/* compiled from: PG */
/* renamed from: cowa  reason: default package */
/* loaded from: classes5.dex */
public final class cowa extends cntp implements cowu {
    public cowa(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    private final AccountMetadata N() {
        Bundle bundle = (Bundle) this.a.f.getParcelable("account_metadata");
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(getClass().getClassLoader());
        return (AccountMetadata) bundle.getParcelable(b());
    }

    @Override // defpackage.cowu
    public final String A() {
        return K("dasher_domain");
    }

    @Override // defpackage.cowu
    public final String B() {
        return coxh.a.b(K("cover_photo_url"));
    }

    @Override // defpackage.cowu
    public final int C() {
        return I("cover_photo_height");
    }

    @Override // defpackage.cowu
    public final int D() {
        return I("cover_photo_width");
    }

    @Override // defpackage.cowu
    public final String E() {
        return K("cover_photo_id");
    }

    @Override // defpackage.cntp, defpackage.cntw
    public final boolean F() {
        return !this.a.f();
    }

    @Override // defpackage.cowu
    public final long a() {
        return H("_id");
    }

    @Override // defpackage.cowu
    public final String b() {
        return K("account_name");
    }

    @Override // defpackage.cowu
    public final boolean c() {
        return k() != null;
    }

    @Override // defpackage.cowu
    public final boolean d() {
        return !TextUtils.isEmpty(K("display_name"));
    }

    @Override // defpackage.cowu
    public final String e() {
        return d() ? K("display_name") : b();
    }

    @Override // defpackage.cowu
    public final boolean f() {
        return !TextUtils.isEmpty(K("given_name"));
    }

    @Override // defpackage.cowu
    public final String g() {
        return f() ? K("given_name") : "null";
    }

    @Override // defpackage.cowu
    public final boolean h() {
        return !TextUtils.isEmpty(K("family_name"));
    }

    @Override // defpackage.cowu
    public final String i() {
        return h() ? K("family_name") : "null";
    }

    @Override // defpackage.cowu
    public final String j() {
        return K("gaia_id");
    }

    @Override // defpackage.cowu
    public final String k() {
        return K("page_gaia_id");
    }

    @Override // defpackage.cowu
    @Deprecated
    public final String l() {
        return j();
    }

    @Override // defpackage.cowu
    @dzsi
    @Deprecated
    public final String m() {
        return k();
    }

    @Override // defpackage.cowu
    public final String n() {
        return coxh.a.b(K("avatar"));
    }

    @Override // defpackage.cowu
    public final boolean o() {
        AccountMetadata N = N();
        if (N == null) {
            return false;
        }
        return c() ? N.d : N.b;
    }

    @Override // defpackage.cowu
    public final boolean p() {
        AccountMetadata N = N();
        if (N == null) {
            return false;
        }
        return c() ? N.c : N.b;
    }

    @Override // defpackage.cowu
    public final long q() {
        return H("last_sync_start_time");
    }

    @Override // defpackage.cowu
    public final long r() {
        return H("last_sync_finish_time");
    }

    @Override // defpackage.cowu
    public final int s() {
        return I("last_sync_status");
    }

    @Override // defpackage.cowu
    public final long t() {
        return H("last_successful_sync_time");
    }

    @Override // defpackage.cowu
    @Deprecated
    public final boolean u() {
        return v();
    }

    @Override // defpackage.cowu
    public final boolean v() {
        return J("sync_circles_to_contacts");
    }

    @Override // defpackage.cowu
    public final boolean w() {
        return J("sync_evergreen_to_contacts");
    }

    @Override // defpackage.cowu
    public final boolean x() {
        return J("sync_me_to_contacts");
    }

    @Override // defpackage.cowu
    public final boolean y() {
        if (c()) {
            return true;
        }
        AccountMetadata N = N();
        if (N != null) {
            return N.a;
        }
        return false;
    }

    @Override // defpackage.cowu
    public final int z() {
        return I("is_dasher");
    }
}
