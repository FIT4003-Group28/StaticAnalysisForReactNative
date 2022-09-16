package defpackage;

import java.util.ArrayDeque;
/* compiled from: PG */
/* renamed from: aepu  reason: default package */
/* loaded from: classes.dex */
final class aepu extends zer {
    final /* synthetic */ aepv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aepu(aepv aepvVar) {
        super("recentBandwidthSamples");
        this.a = aepvVar;
    }

    @Override // defpackage.zer
    protected final /* bridge */ /* synthetic */ Object a() {
        afkr afkrVar;
        aepv aepvVar = this.a;
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (aepvVar.c()) {
                awuj awujVar = (awuj) aepvVar.b.c();
                if ((awujVar.b & 2) != 0) {
                    afkrVar = awujVar.e;
                    if (afkrVar == null) {
                        afkrVar = afkr.a;
                    }
                } else {
                    afkrVar = null;
                }
                if (afkrVar != null) {
                    arrayDeque.addAll(afkrVar.b);
                }
            }
        } catch (ClassCastException | IllegalArgumentException e) {
            afus.c(1, 6, "Invalid persisted bandwidth samples. Ignored.", e);
        }
        return arrayDeque;
    }
}
