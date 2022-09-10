package defpackage;

import com.google.android.libraries.social.populous.core.AffinityContext;
import com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: czfb  reason: default package */
/* loaded from: classes5.dex */
public final class czfb extends czfn {
    public dcdc<cywm> a;
    public Long b;
    private AffinityContext c;
    private dcdc<cyxj> d;
    private dcdc<cywi> e;
    private cyes f;
    private AutocompletionCallbackMetadata g;
    private Boolean h;

    @Override // defpackage.czfn
    public final void b(AffinityContext affinityContext) {
        if (affinityContext != null) {
            this.c = affinityContext;
            return;
        }
        throw new NullPointerException("Null affinityContext");
    }

    @Override // defpackage.czfn
    public final void c(AutocompletionCallbackMetadata autocompletionCallbackMetadata) {
        if (autocompletionCallbackMetadata != null) {
            this.g = autocompletionCallbackMetadata;
            return;
        }
        throw new NullPointerException("Null callbackMetadata");
    }

    @Override // defpackage.czfn
    public final void d(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    @Override // defpackage.czfn
    public final void e(dcdc<cywi> dcdcVar) {
        if (dcdcVar != null) {
            this.e = dcdcVar;
            return;
        }
        throw new NullPointerException("Null items");
    }

    @Override // defpackage.czfn
    public final void f(dcdc<cyxj> dcdcVar) {
        if (dcdcVar != null) {
            this.d = dcdcVar;
            return;
        }
        throw new NullPointerException("Null scoringParams");
    }

    @Override // defpackage.czfn
    public final void g(cyes cyesVar) {
        if (cyesVar != null) {
            this.f = cyesVar;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // defpackage.czfn
    public final czfo a() {
        String str = this.c == null ? " affinityContext" : "";
        if (this.d == null) {
            str = str.concat(" scoringParams");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" items");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" peopleStackItems");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" status");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" callbackMetadata");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" containsPartialResults");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new czfc(this.c, this.d, this.e, this.a, this.f, this.b, this.g, this.h.booleanValue());
    }
}
