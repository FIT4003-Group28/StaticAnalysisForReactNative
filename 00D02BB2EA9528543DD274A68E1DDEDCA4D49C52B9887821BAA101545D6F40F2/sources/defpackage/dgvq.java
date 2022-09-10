package defpackage;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/* compiled from: PG */
/* renamed from: dgvq  reason: default package */
/* loaded from: classes6.dex */
public final class dgvq extends dgtl<Date> {
    public static final dgtm a = new dgtm() { // from class: com.google.gson.internal.bind.SqlDateTypeAdapter$1
        @Override // defpackage.dgtm
        public final <T> dgtl<T> a(dgsx dgsxVar, dgxd<T> dgxdVar) {
            if (dgxdVar.a == Date.class) {
                return new dgvq();
            }
            return null;
        }
    };
    private final DateFormat b = new SimpleDateFormat("MMM d, yyyy");

    @Override // defpackage.dgtl
    /* renamed from: d */
    public final synchronized Date a(dgxe dgxeVar) {
        if (dgxeVar.q() == 9) {
            dgxeVar.j();
            return null;
        }
        try {
            return new Date(this.b.parse(dgxeVar.h()).getTime());
        } catch (ParseException e) {
            throw new dgtj(e);
        }
    }

    @Override // defpackage.dgtl
    /* renamed from: e */
    public final synchronized void b(dgxg dgxgVar, Date date) {
        dgxgVar.j(date == null ? null : this.b.format((java.util.Date) date));
    }
}
