package defpackage;

import com.google.android.libraries.social.populous.core.SocialAffinityAllEventSource;
/* compiled from: PG */
/* renamed from: cygu  reason: default package */
/* loaded from: classes5.dex */
public final class cygu {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public final void b(int i) {
        this.d = i;
    }

    public final void c(int i) {
        this.a = i;
    }

    public final void d(int i) {
        this.f = i;
    }

    public final void e(int i) {
        this.c = i;
    }

    public final void f(int i) {
        this.e = i;
    }

    public final void g(int i) {
        this.b = i;
    }

    public final SocialAffinityAllEventSource a() {
        String str = this.a == 0 ? " socialAffinityAutocompletePersonEventSource" : "";
        if (this.b == 0) {
            str = str.concat(" socialAffinitySuggestionPersonEventSource");
        }
        if (this.c == 0) {
            str = String.valueOf(str).concat(" socialAffinityExternalPersonEventSource");
        }
        if (this.d == 0) {
            str = String.valueOf(str).concat(" socialAffinityAutocompleteFieldEventSource");
        }
        if (this.e == 0) {
            str = String.valueOf(str).concat(" socialAffinitySuggestionFieldEventSource");
        }
        if (this.f == 0) {
            str = String.valueOf(str).concat(" socialAffinityExternalFieldEventSource");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new SocialAffinityAllEventSource(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
