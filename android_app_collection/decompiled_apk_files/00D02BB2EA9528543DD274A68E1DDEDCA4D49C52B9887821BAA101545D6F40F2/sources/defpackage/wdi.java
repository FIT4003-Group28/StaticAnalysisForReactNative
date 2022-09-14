package defpackage;

import com.google.android.apps.gmm.directions.savedtrips.api.AutoValue_SavedTrip;
import com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip;
/* compiled from: PG */
/* renamed from: wdi  reason: default package */
/* loaded from: classes7.dex */
public final class wdi extends wdq {
    private String a;
    private wdr b;
    private SavedTrip.Data c;

    wdi() {
    }

    public wdi(SavedTrip savedTrip) {
        this.a = savedTrip.a();
        this.c = savedTrip.b();
    }

    @Override // defpackage.wdq
    public final wdr a() {
        if (this.b == null) {
            SavedTrip.Data data = this.c;
            if (data == null) {
                this.b = SavedTrip.Data.i();
            } else {
                this.b = data.f();
                this.c = null;
            }
        }
        return this.b;
    }

    @Override // defpackage.wdq
    public final SavedTrip b() {
        wdr wdrVar = this.b;
        if (wdrVar != null) {
            this.c = wdrVar.a();
        } else if (this.c == null) {
            this.c = SavedTrip.Data.i().a();
        }
        String str = this.a == null ? " id" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new AutoValue_SavedTrip(this.a, this.c);
    }
}
