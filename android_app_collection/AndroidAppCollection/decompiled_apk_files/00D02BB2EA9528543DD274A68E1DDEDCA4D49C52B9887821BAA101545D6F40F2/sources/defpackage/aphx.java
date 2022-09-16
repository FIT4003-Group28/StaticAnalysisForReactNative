package defpackage;

import com.google.android.apps.maps.R;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: aphx  reason: default package */
/* loaded from: classes2.dex */
public class aphx implements aphn {
    private final gga a;
    private final bwqv b;
    private final Callable<bwrs<aoyg>> c;

    public aphx(gga ggaVar, bwqv bwqvVar, Callable<bwrs<aoyg>> callable) {
        this.a = ggaVar;
        this.b = bwqvVar;
        this.c = callable;
    }

    @Override // defpackage.aphn
    public String a() {
        return this.a.getString(R.string.MAPS_ACTIVITY_VIEW_ALL_VISITED_PLACES_BUTTON);
    }

    @Override // defpackage.aphn
    public cqkl b() {
        try {
            this.a.D(apdh.g(this.b, this.c.call()));
        } catch (Exception unused) {
        }
        return cqkl.a;
    }
}
