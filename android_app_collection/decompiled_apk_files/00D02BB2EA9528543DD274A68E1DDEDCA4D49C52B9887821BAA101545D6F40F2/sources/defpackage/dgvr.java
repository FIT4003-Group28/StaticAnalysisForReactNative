package defpackage;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/* compiled from: PG */
/* renamed from: dgvr  reason: default package */
/* loaded from: classes6.dex */
public final class dgvr extends dgtl<Time> {
    public static final dgtm a = new dgtm() { // from class: com.google.gson.internal.bind.TimeTypeAdapter$1
        @Override // defpackage.dgtm
        public final <T> dgtl<T> a(dgsx dgsxVar, dgxd<T> dgxdVar) {
            if (dgxdVar.a == Time.class) {
                return new dgvr();
            }
            return null;
        }
    };
    private final DateFormat b = new SimpleDateFormat("hh:mm:ss a");

    @Override // defpackage.dgtl
    /* renamed from: d */
    public final synchronized Time a(dgxe dgxeVar) {
        if (dgxeVar.q() == 9) {
            dgxeVar.j();
            return null;
        }
        try {
            return new Time(this.b.parse(dgxeVar.h()).getTime());
        } catch (ParseException e) {
            throw new dgtj(e);
        }
    }

    @Override // defpackage.dgtl
    /* renamed from: e */
    public final synchronized void b(dgxg dgxgVar, Time time) {
        dgxgVar.j(time == null ? null : this.b.format((Date) time));
    }
}
