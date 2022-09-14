package defpackage;

import com.google.android.filament.R;
import com.google.android.libraries.social.populous.core.SessionContext;
/* compiled from: PG */
/* renamed from: cyur  reason: default package */
/* loaded from: classes5.dex */
final class cyur extends cywa {
    private final cygp a;
    private final SessionContext b;
    private final boolean c;
    private final cyei d;

    public cyur(cygp cygpVar, SessionContext sessionContext, boolean z, cyei cyeiVar) {
        this.a = cygpVar;
        this.b = sessionContext;
        this.c = z;
        this.d = cyeiVar;
    }

    @Override // defpackage.cywa
    public final cygp a() {
        return this.a;
    }

    @Override // defpackage.cywa
    public final SessionContext b() {
        return this.b;
    }

    @Override // defpackage.cywa
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.cywa
    public final cyei d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cywa) {
            cywa cywaVar = (cywa) obj;
            if (this.a.equals(cywaVar.a()) && this.b.equals(cywaVar.b()) && this.c == cywaVar.c() && this.d.equals(cywaVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowActionModeOverlay + length2 + String.valueOf(valueOf3).length());
        sb.append("LoaderQueryOptions{resultsGroupingOption=");
        sb.append(valueOf);
        sb.append(", sessionContext=");
        sb.append(valueOf2);
        sb.append(", useLiveAutocomplete=");
        sb.append(z);
        sb.append(", minimumTopNCacheCallbackStatus=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
