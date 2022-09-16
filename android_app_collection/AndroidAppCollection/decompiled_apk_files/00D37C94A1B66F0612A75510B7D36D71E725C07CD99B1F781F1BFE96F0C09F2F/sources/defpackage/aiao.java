package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: aiao  reason: default package */
/* loaded from: classes.dex */
public final class aiao implements aiaq {
    private final List a;

    public aiao(aiaq... aiaqVarArr) {
        this.a = Arrays.asList(aiaqVarArr);
    }

    @Override // defpackage.aiaq
    public final void nK(boolean z) {
        for (aiaq aiaqVar : this.a) {
            aiaqVar.nK(z);
        }
    }

    @Override // defpackage.aiaq
    public final void pB(boolean z) {
        for (aiaq aiaqVar : this.a) {
            aiaqVar.pB(z);
        }
    }

    @Override // defpackage.aiaq
    public final void pD(aiap aiapVar) {
        for (aiaq aiaqVar : this.a) {
            aiaqVar.pD(aiapVar);
        }
    }
}
