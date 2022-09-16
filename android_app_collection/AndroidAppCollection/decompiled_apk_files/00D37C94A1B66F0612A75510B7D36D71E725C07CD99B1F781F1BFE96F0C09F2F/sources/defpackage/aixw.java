package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aixw  reason: default package */
/* loaded from: classes.dex */
public final class aixw extends ajbg {
    private final List a;
    private final zdt b;

    public aixw(long j, long j2, List list, zdt zdtVar) {
        super(j, j2, 1, 1, null);
        this.a = list;
        this.b = zdtVar;
    }

    @Override // defpackage.ajbg
    protected final void a() {
    }

    @Override // defpackage.ajbg
    public final void b(boolean z, boolean z2, boolean z3) {
        zdt zdtVar = this.b;
        if (zdtVar != null) {
            zdtVar.a(this.a);
        }
    }
}
