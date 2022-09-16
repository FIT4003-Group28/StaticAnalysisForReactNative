package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
/* compiled from: PG */
/* renamed from: adif  reason: default package */
/* loaded from: classes.dex */
public final class adif extends adig {
    public final adib a;

    public adif(adib adibVar) {
        this.a = adibVar;
    }

    @Override // defpackage.adig
    public final String b() {
        return this.a.e;
    }

    @Override // defpackage.adig
    public final String c() {
        return "cloudPairedDevice";
    }

    @Override // defpackage.adig
    public final int d() {
        return 4;
    }

    public final ScreenId e() {
        return this.a.f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof adif) {
            return this.a.equals(((adif) obj).a);
        }
        return false;
    }

    public final String f() {
        return this.a.e;
    }

    @Override // defpackage.adig
    public final String g() {
        return this.a.g();
    }

    public final adit h() {
        return this.a.h;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.adig
    public final boolean i(adig adigVar) {
        if (!(adigVar instanceof adif)) {
            return false;
        }
        return this.a.i(((adif) adigVar).a);
    }

    @Override // defpackage.adig
    public final Bundle r() {
        return this.a.r();
    }
}
