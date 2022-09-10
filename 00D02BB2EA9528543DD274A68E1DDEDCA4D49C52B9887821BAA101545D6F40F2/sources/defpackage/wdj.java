package defpackage;

import com.google.android.apps.gmm.directions.savedtrips.api.AutoValue_SavedTrip_Data;
import com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip;
/* compiled from: PG */
/* renamed from: wdj  reason: default package */
/* loaded from: classes7.dex */
public final class wdj extends wdr {
    public amvh a;
    public dqvj b;
    public dspd c;
    public dbsg<dcdc<dspd>> d;
    public int e;
    public int f;
    private amvh g;

    public wdj() {
        this.d = dbpy.a;
    }

    public wdj(SavedTrip.Data data) {
        this.d = dbpy.a;
        this.a = data.a();
        this.g = data.b();
        this.b = data.c();
        this.e = data.g();
        this.c = data.d();
        this.d = data.e();
        this.f = data.h();
    }

    @Override // defpackage.wdr
    public final void b(amvh amvhVar) {
        if (amvhVar != null) {
            this.g = amvhVar;
            return;
        }
        throw new NullPointerException("Null destination");
    }

    @Override // defpackage.wdr
    public final void c(amvh amvhVar) {
        this.a = amvhVar;
    }

    @Override // defpackage.wdr
    public final SavedTrip.Data a() {
        String str = this.g == null ? " destination" : "";
        if (this.b == null) {
            str = str.concat(" travelMode");
        }
        if (this.e == 0) {
            str = String.valueOf(str).concat(" source");
        }
        if (this.f == 0) {
            str = String.valueOf(str).concat(" generatingFeature");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_SavedTrip_Data(this.a, this.g, this.b, this.e, this.c, this.d, this.f);
    }
}
