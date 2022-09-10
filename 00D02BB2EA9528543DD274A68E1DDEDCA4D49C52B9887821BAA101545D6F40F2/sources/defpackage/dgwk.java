package defpackage;

import java.sql.Timestamp;
import java.util.Date;
/* compiled from: PG */
/* renamed from: dgwk  reason: default package */
/* loaded from: classes6.dex */
public final class dgwk extends dgtl<Timestamp> {
    final /* synthetic */ dgtl a;

    public dgwk(dgtl dgtlVar) {
        this.a = dgtlVar;
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ Timestamp a(dgxe dgxeVar) {
        Date date = (Date) this.a.a(dgxeVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, Timestamp timestamp) {
        this.a.b(dgxgVar, timestamp);
    }
}
