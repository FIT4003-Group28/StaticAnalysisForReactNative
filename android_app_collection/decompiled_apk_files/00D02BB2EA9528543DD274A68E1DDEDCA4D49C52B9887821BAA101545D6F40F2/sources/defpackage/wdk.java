package defpackage;

import com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip;
/* compiled from: PG */
/* renamed from: wdk  reason: default package */
/* loaded from: classes7.dex */
public final class wdk extends wdo {
    public amvh a;
    private dccx<SavedTrip> b;
    private dcdc<SavedTrip> c;

    @Override // defpackage.wdo
    public final amvh a() {
        amvh amvhVar = this.a;
        if (amvhVar != null) {
            return amvhVar;
        }
        throw new IllegalStateException("Property \"destination\" has not been set");
    }

    @Override // defpackage.wdo
    public final dccx<SavedTrip> b() {
        if (this.b == null) {
            this.b = dcdc.F();
        }
        return this.b;
    }

    @Override // defpackage.wdo
    public final wdp c() {
        dccx<SavedTrip> dccxVar = this.b;
        if (dccxVar != null) {
            this.c = dccxVar.f();
        } else if (this.c == null) {
            this.c = dcdc.e();
        }
        String str = this.a == null ? " destination" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new wdl(this.a, this.c);
    }
}
