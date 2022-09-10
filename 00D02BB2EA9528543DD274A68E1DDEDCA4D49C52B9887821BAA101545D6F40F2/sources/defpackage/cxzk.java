package defpackage;

import com.google.android.libraries.social.populous.GroupMember;
import com.google.android.libraries.social.populous.Person;
/* compiled from: PG */
/* renamed from: cxzk  reason: default package */
/* loaded from: classes5.dex */
public abstract class cxzk {
    protected abstract Person a();

    protected abstract GroupMember b();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void c();

    public final GroupMember d() {
        dbsk.m(a() != null, "Autocompletions must only contain one of: person...");
        if (a() != null) {
            c();
        }
        return b();
    }
}
