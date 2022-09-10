package defpackage;

import com.google.android.libraries.social.populous.AutoValue_GroupMember;
import com.google.android.libraries.social.populous.GroupMember;
import com.google.android.libraries.social.populous.Person;
/* compiled from: PG */
/* renamed from: cxxg  reason: default package */
/* loaded from: classes5.dex */
public final class cxxg extends cxzk {
    public Person a;
    private int b;

    @Override // defpackage.cxzk
    @dzsi
    protected final Person a() {
        return this.a;
    }

    @Override // defpackage.cxzk
    protected final void c() {
        this.b = 2;
    }

    @Override // defpackage.cxzk
    protected final GroupMember b() {
        String str = this.b == 0 ? " memberType" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new AutoValue_GroupMember(this.b, this.a);
    }
}
