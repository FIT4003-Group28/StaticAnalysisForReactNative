package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajit  reason: default package */
/* loaded from: classes.dex */
public final class ajit extends ajin {
    public ajit(Executor executor) {
        super(executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajin
    public final /* bridge */ /* synthetic */ aqtb a(Object obj) {
        aslo asloVar = (aslo) obj;
        if ((asloVar.b & 64) != 0) {
            aqtb aqtbVar = asloVar.i;
            return aqtbVar == null ? aqtb.a : aqtbVar;
        }
        return null;
    }
}
