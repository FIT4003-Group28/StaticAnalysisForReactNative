package defpackage;

import com.google.android.libraries.social.populous.core.AutoValue_SourceIdentity;
import com.google.android.libraries.social.populous.core.SourceIdentity;
/* compiled from: PG */
/* renamed from: cycf  reason: default package */
/* loaded from: classes5.dex */
public final class cycf extends cygv {
    public String a;
    public String b;
    private duej c;

    @Override // defpackage.cygv
    public final void b(duej duejVar) {
        if (duejVar != null) {
            this.c = duejVar;
            return;
        }
        throw new NullPointerException("Null containerType");
    }

    @Override // defpackage.cygv
    public final SourceIdentity a() {
        String str = this.c == null ? " containerType" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new AutoValue_SourceIdentity(this.c, this.a, this.b);
    }
}
