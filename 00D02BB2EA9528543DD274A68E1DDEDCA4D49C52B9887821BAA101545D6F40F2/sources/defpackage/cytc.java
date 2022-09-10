package defpackage;

import com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata;
import java.util.List;
/* compiled from: PG */
/* renamed from: cytc  reason: default package */
/* loaded from: classes5.dex */
public final class cytc extends cytg {
    public dbsg<cyts> a = dbpy.a;
    public cydx b;
    public Long c;
    public Integer d;
    private dcdc<cyvs> e;
    private Integer f;
    private Integer g;
    private cytq h;
    private Boolean i;
    private AutocompletionCallbackMetadata j;
    private Boolean k;
    private int l;

    @Override // defpackage.cytg
    public final void b(int i) {
        this.f = Integer.valueOf(i);
    }

    @Override // defpackage.cytg
    public final void c(boolean z) {
        this.k = Boolean.valueOf(z);
    }

    @Override // defpackage.cytg
    public final void d(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    @Override // defpackage.cytg
    public final void e(AutocompletionCallbackMetadata autocompletionCallbackMetadata) {
        if (autocompletionCallbackMetadata != null) {
            this.j = autocompletionCallbackMetadata;
            return;
        }
        throw new NullPointerException("Null metadata");
    }

    @Override // defpackage.cytg
    public final void f(int i) {
        this.g = Integer.valueOf(i);
    }

    @Override // defpackage.cytg
    public final void g(cytq cytqVar) {
        if (cytqVar != null) {
            this.h = cytqVar;
            return;
        }
        throw new NullPointerException("Null queryState");
    }

    @Override // defpackage.cytg
    public final void h(List<cyvs> list) {
        this.e = dcdc.r(list);
    }

    @Override // defpackage.cytg
    public final void i(int i) {
        if (i != 0) {
            this.l = i;
            return;
        }
        throw new NullPointerException("Null resultsSourceType");
    }

    @Override // defpackage.cytg
    public final cyth a() {
        String str = this.e == null ? " results" : "";
        if (this.f == null) {
            str = str.concat(" callbackNumber");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" positionOffset");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" queryState");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" isLastCallback");
        }
        if (this.l == 0) {
            str = String.valueOf(str).concat(" resultsSourceType");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" metadata");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" containsPartialResults");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cytd(this.e, this.a, this.b, this.f.intValue(), this.g.intValue(), this.h, this.c, this.i.booleanValue(), this.d, this.l, this.j, this.k.booleanValue());
    }
}
