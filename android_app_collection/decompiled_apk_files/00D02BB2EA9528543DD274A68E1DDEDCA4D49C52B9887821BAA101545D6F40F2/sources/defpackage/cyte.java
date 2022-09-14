package defpackage;

import com.google.android.libraries.social.populous.core.AffinityContext;
import com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cyte  reason: default package */
/* loaded from: classes5.dex */
public final class cyte extends cytn {
    public AffinityContext a;
    public cydx b;
    public Long c;
    public AutocompletionCallbackMetadata d;
    private dcdc<cyvs> e;
    private Boolean f;
    private Boolean g;
    private int h;

    @Override // defpackage.cytn
    @dzsi
    public final AutocompletionCallbackMetadata a() {
        return this.d;
    }

    @Override // defpackage.cytn
    public final void c(@dzsi AutocompletionCallbackMetadata autocompletionCallbackMetadata) {
        this.d = autocompletionCallbackMetadata;
    }

    @Override // defpackage.cytn
    public final void d(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    @Override // defpackage.cytn
    public final void e(dcdc<cyvs> dcdcVar) {
        if (dcdcVar != null) {
            this.e = dcdcVar;
            return;
        }
        throw new NullPointerException("Null internalResults");
    }

    @Override // defpackage.cytn
    public final void f(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.cytn
    public final void g(int i) {
        this.h = i;
    }

    @Override // defpackage.cytn
    public final cyto b() {
        String str = this.e == null ? " internalResults" : "";
        if (this.f == null) {
            str = str.concat(" isLastCallback");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" containsPartialResults");
        }
        if (this.h == 0) {
            str = String.valueOf(str).concat(" resultsSourceType");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cytf(this.a, this.e, this.b, this.c, this.f.booleanValue(), this.d, this.g.booleanValue(), this.h);
    }
}
