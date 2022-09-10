package defpackage;

import com.google.android.libraries.social.populous.AutoValue_Group;
import com.google.android.libraries.social.populous.Group;
import com.google.android.libraries.social.populous.GroupMember;
import com.google.android.libraries.social.populous.core.GroupMetadata;
import com.google.android.libraries.social.populous.core.GroupOrigin;
/* compiled from: PG */
/* renamed from: cxxf  reason: default package */
/* loaded from: classes5.dex */
public final class cxxf extends cxzi {
    private String a;
    private String b;
    private GroupMetadata c;
    private dcdc<GroupOrigin> d;
    private dcdc<GroupMember> e;

    @Override // defpackage.cxzi
    public final void b(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null groupId");
    }

    @Override // defpackage.cxzi
    public final void c(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null key");
    }

    @Override // defpackage.cxzi
    public final void d(dcdc<GroupMember> dcdcVar) {
        if (dcdcVar != null) {
            this.e = dcdcVar;
            return;
        }
        throw new NullPointerException("Null membersSnippet");
    }

    @Override // defpackage.cxzi
    public final void e(GroupMetadata groupMetadata) {
        if (groupMetadata != null) {
            this.c = groupMetadata;
            return;
        }
        throw new NullPointerException("Null metadata");
    }

    @Override // defpackage.cxzi
    public final void f(dcdc<GroupOrigin> dcdcVar) {
        if (dcdcVar != null) {
            this.d = dcdcVar;
            return;
        }
        throw new NullPointerException("Null origins");
    }

    @Override // defpackage.cxzi
    public final Group a() {
        String str = this.a == null ? " key" : "";
        if (this.b == null) {
            str = str.concat(" groupId");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" metadata");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" origins");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" membersSnippet");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_Group(this.a, this.b, this.c, this.d, this.e);
    }
}
