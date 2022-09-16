package defpackage;

import org.chromium.net.CellularSignalStrengthError;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
@azrk(b = "kotlinx.coroutines.flow.AbstractFlow", c = "Flow.kt", d = "collect", e = {212})
/* renamed from: azxc  reason: default package */
/* loaded from: classes2.dex */
public final class azxc extends azri {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ azxd c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azxc(azxd azxdVar, azqy azqyVar) {
        super(azqyVar);
        this.c = azxdVar;
    }

    @Override // defpackage.azrg
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        return this.c.a(null, this);
    }
}
