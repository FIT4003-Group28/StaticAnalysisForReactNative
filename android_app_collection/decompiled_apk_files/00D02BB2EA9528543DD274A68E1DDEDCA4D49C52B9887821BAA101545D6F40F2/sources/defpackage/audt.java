package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: audt  reason: default package */
/* loaded from: classes2.dex */
public final class audt implements atnc {
    public static final cqss a = cqrt.c(R.color.gmm_white);
    private final cqss b;
    private final cqss c;

    public audt(auds audsVar) {
        this.b = audsVar.a;
        this.c = audsVar.b;
    }

    @Override // defpackage.atnc
    public final cqss a(boolean z) {
        return z ? this.b : a;
    }

    @Override // defpackage.atnc
    public final cqss b(boolean z) {
        return z ? this.c : a;
    }
}
