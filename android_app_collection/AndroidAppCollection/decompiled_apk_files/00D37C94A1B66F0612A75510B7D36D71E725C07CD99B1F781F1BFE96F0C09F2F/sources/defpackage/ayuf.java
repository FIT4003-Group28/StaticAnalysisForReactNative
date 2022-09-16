package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ayuf  reason: default package */
/* loaded from: classes2.dex */
public final class ayuf extends ayua {
    final int c;
    final Callable d;

    public ayuf(aynx aynxVar, int i, Callable callable) {
        super(aynxVar);
        this.c = i;
        this.d = callable;
    }

    @Override // defpackage.aynx
    public final void ae(bame bameVar) {
        int i = this.c;
        if (i == 1) {
            this.b.ac(new ayuc(bameVar, this.d));
        } else if (i <= 0) {
            this.b.ac(new ayue(bameVar, i, this.d));
        } else {
            this.b.ac(new ayud(bameVar, i, this.d));
        }
    }
}
