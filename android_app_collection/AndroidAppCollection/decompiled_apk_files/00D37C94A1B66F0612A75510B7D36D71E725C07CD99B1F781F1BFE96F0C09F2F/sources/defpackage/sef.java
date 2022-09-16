package defpackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/* compiled from: PG */
/* renamed from: sef  reason: default package */
/* loaded from: classes4.dex */
public class sef {
    public final SimpleDateFormat a;
    public final int b;
    public final Calendar c;
    private final SimpleDateFormat d;

    public sef(String str, String str2, int i) {
        Calendar a = saa.a();
        this.c = a;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        this.d = simpleDateFormat;
        simpleDateFormat.setCalendar(a);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str2);
        this.a = simpleDateFormat2;
        simpleDateFormat2.setCalendar(a);
        this.b = i;
    }

    public String a(Date date) {
        return this.d.format(date);
    }
}
