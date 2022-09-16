package defpackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/* compiled from: PG */
/* renamed from: sdz  reason: default package */
/* loaded from: classes4.dex */
public final class sdz extends sef {
    private final SimpleDateFormat d;
    private final Calendar e;

    public sdz() {
        super("h", "MMM d ha", 5);
        Calendar a = saa.a();
        this.e = a;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ha");
        this.d = simpleDateFormat;
        simpleDateFormat.setCalendar(a);
    }

    @Override // defpackage.sef
    public final String a(Date date) {
        this.e.setTime(date);
        if (this.e.get(11) == 12) {
            return this.d.format(date);
        }
        return super.a(date);
    }
}
