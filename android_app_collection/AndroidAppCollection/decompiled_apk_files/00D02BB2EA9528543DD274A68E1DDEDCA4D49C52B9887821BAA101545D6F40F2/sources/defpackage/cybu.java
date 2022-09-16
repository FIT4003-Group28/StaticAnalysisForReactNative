package defpackage;

import com.google.android.libraries.social.populous.core.AffinityMetadata;
import com.google.android.libraries.social.populous.core.AutoValue_AffinityMetadata;
/* compiled from: PG */
/* renamed from: cybu  reason: default package */
/* loaded from: classes5.dex */
public final class cybu extends cycj {
    private Boolean a;
    private Boolean b;
    private Boolean c;
    private Double d;
    private Double e;

    @Override // defpackage.cycj
    public final void b(double d) {
        this.d = Double.valueOf(d);
    }

    @Override // defpackage.cycj
    public final void c(double d) {
        this.e = Double.valueOf(d);
    }

    @Override // defpackage.cycj
    public final void d(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.cycj
    public final void e(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.cycj
    public final void f(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    @Override // defpackage.cycj
    public final AffinityMetadata a() {
        String str = this.a == null ? " isPopulated" : "";
        if (this.b == null) {
            str = str.concat(" isDeviceDataKnown");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" isDirectClientInteraction");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" cloudScore");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" deviceScore");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_AffinityMetadata(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.doubleValue(), this.e.doubleValue());
    }
}
