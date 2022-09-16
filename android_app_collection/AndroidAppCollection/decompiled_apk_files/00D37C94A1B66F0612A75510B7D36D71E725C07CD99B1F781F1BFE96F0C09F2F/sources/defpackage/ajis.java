package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajis  reason: default package */
/* loaded from: classes.dex */
public final class ajis extends ajin {
    public ajis(Executor executor) {
        super(executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajin
    public final /* bridge */ /* synthetic */ aqtb a(Object obj) {
        aslt asltVar = (aslt) obj;
        if ((asltVar.h & 1048576) != 0) {
            aqtb aqtbVar = asltVar.av;
            return aqtbVar == null ? aqtb.a : aqtbVar;
        }
        return null;
    }
}
