package defpackage;

import com.google.android.libraries.social.populous.AutoValue_PersonMetadata;
import com.google.android.libraries.social.populous.IdentityInfo;
import com.google.android.libraries.social.populous.PersonMetadata;
/* compiled from: PG */
/* renamed from: cxxj  reason: default package */
/* loaded from: classes5.dex */
public final class cxxj extends cxzz {
    public String a;
    public IdentityInfo b;
    public int c;

    @Override // defpackage.cxzz
    public final PersonMetadata a() {
        String str = this.c == 0 ? " autocompletionType" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new AutoValue_PersonMetadata(this.a, this.b, this.c);
    }
}
