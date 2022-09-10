package defpackage;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: dgvg  reason: default package */
/* loaded from: classes6.dex */
public final class dgvg extends dgtl<Date> {
    public static final dgtm a = new dgtm() { // from class: com.google.gson.internal.bind.DateTypeAdapter$1
        @Override // defpackage.dgtm
        public final <T> dgtl<T> a(dgsx dgsxVar, dgxd<T> dgxdVar) {
            if (dgxdVar.a == Date.class) {
                return new dgvg();
            }
            return null;
        }
    };
    private final List<DateFormat> b;

    public dgvg() {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (dgum.a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", Locale.US));
        }
    }

    private final synchronized Date e(String str) {
        for (DateFormat dateFormat : this.b) {
            try {
                return dateFormat.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return dgwz.a(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new dgtj(str, e);
        }
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ Date a(dgxe dgxeVar) {
        if (dgxeVar.q() == 9) {
            dgxeVar.j();
            return null;
        }
        return e(dgxeVar.h());
    }

    @Override // defpackage.dgtl
    /* renamed from: d */
    public final synchronized void b(dgxg dgxgVar, Date date) {
        if (date == null) {
            dgxgVar.f();
        } else {
            dgxgVar.j(this.b.get(0).format(date));
        }
    }
}
