package defpackage;

import android.database.Cursor;
/* compiled from: PG */
/* renamed from: cyrw  reason: default package */
/* loaded from: classes5.dex */
public final class cyrw extends cyrv {
    private final bn a;

    public cyrw(bn bnVar) {
        this.a = bnVar;
    }

    @Override // defpackage.cyrv
    public final long b(awb awbVar) {
        this.a.E();
        Cursor q = this.a.q(awbVar);
        try {
            return q.moveToFirst() ? q.getLong(0) : 0L;
        } finally {
            q.close();
        }
    }
}
