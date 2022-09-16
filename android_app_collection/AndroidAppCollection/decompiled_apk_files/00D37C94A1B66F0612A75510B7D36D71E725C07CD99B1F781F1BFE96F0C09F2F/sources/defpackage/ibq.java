package defpackage;

import android.util.Pair;
/* compiled from: PG */
/* renamed from: ibq  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ibq implements ayqe {
    public final /* synthetic */ ahic a;
    private final /* synthetic */ int b;

    public /* synthetic */ ibq(ahic ahicVar) {
        this.a = ahicVar;
    }

    public /* synthetic */ ibq(ahic ahicVar, int i) {
        this.b = i;
        this.a = ahicVar;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return new Pair(this.a.a(), (ahhx) obj);
            }
            return new Pair(this.a.a(), obj);
        }
        ahic ahicVar = this.a;
        ahgp ahgpVar = (ahgp) obj;
        int i2 = ico.bD;
        return ahicVar.a().c();
    }
}
