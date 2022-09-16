package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fhi  reason: default package */
/* loaded from: classes3.dex */
public final class fhi extends ajin {
    public fhi(Executor executor) {
        super(executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajin
    public final /* bridge */ /* synthetic */ aqtb a(Object obj) {
        arhb arhbVar = (arhb) obj;
        if ((arhbVar.b & 512) != 0) {
            aqtb aqtbVar = arhbVar.n;
            return aqtbVar == null ? aqtb.a : aqtbVar;
        }
        return null;
    }
}
