package defpackage;

import android.database.Cursor;
/* compiled from: PG */
/* renamed from: aniw  reason: default package */
/* loaded from: classes.dex */
public final class aniw implements anir {
    final /* synthetic */ anjd a;
    final /* synthetic */ aaja b;

    public aniw(anjd anjdVar, aaja aajaVar) {
        this.a = anjdVar;
        this.b = aajaVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        anja anjaVar = this.a.b;
        aaja aajaVar = this.b;
        anja anjaVar2 = new anja();
        try {
            return anlz.q(aajaVar.a.b((Cursor) obj, aajaVar.b));
        } finally {
            anjaVar.a(anjaVar2, anjk.a);
        }
    }

    public final String toString() {
        return this.b.toString();
    }
}
