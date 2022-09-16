package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: cxnz  reason: default package */
/* loaded from: classes5.dex */
public final class cxnz {
    private final dzsj<Set<cxob>> a;
    private Set<cxob> b;

    public cxnz(dzsj<Set<cxob>> dzsjVar) {
        this.a = dzsjVar;
    }

    public final synchronized Set<cxob> a() {
        if (this.b == null) {
            this.b = ((cxoa) this.a).a;
        }
        return this.b;
    }
}
