package defpackage;
/* compiled from: PG */
/* renamed from: ampu  reason: default package */
/* loaded from: classes2.dex */
public final class ampu extends ampv {
    public final boolean a;

    public ampu(alwy alwyVar, boolean z, int i) {
        super(alwyVar, i);
        this.a = z;
    }

    @Override // defpackage.ampv
    public final boolean equals(@dzsi Object obj) {
        ampu ampuVar;
        return (obj instanceof ampu) && (ampuVar = (ampu) obj) != null && this.b.equals(ampuVar.b) && this.a == ampuVar.a;
    }

    @Override // defpackage.ampv
    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
    }
}
