package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bain  reason: default package */
/* loaded from: classes2.dex */
public class bain extends baij implements Serializable, baif {
    private static final long serialVersionUID = 2581698638990L;
    public volatile long b;

    /* JADX INFO: Access modifiers changed from: protected */
    public bain(long j) {
        this.b = j;
    }

    @Override // defpackage.baif
    public final long d() {
        return this.b;
    }
}
