package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fhm  reason: default package */
/* loaded from: classes3.dex */
public final class fhm extends ajin {
    public fhm(Executor executor) {
        super(executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajin
    public final /* bridge */ /* synthetic */ aqtb a(Object obj) {
        avwn avwnVar = (avwn) obj;
        if ((avwnVar.b & 512) != 0) {
            aqtb aqtbVar = avwnVar.n;
            return aqtbVar == null ? aqtb.a : aqtbVar;
        }
        return null;
    }
}
