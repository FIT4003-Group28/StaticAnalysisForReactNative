package ezvcard.util;

import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: VCardDateFormat.java */
/* loaded from: classes.dex */
public enum i {
    DATE_BASIC("yyyyMMdd"),
    DATE_EXTENDED("yyyy-MM-dd"),
    DATE_TIME_BASIC("yyyyMMdd'T'HHmmssZ"),
    DATE_TIME_EXTENDED("yyyy-MM-dd'T'HH:mm:ssZ") { // from class: ezvcard.util.i.1
    },
    UTC_DATE_TIME_BASIC("yyyyMMdd'T'HHmmss'Z'") { // from class: ezvcard.util.i.2
    },
    UTC_DATE_TIME_EXTENDED("yyyy-MM-dd'T'HH:mm:ss'Z'") { // from class: ezvcard.util.i.3
    },
    HCARD_DATE_TIME("yyyy-MM-dd'T'HH:mm:ssZ");
    
    protected final String h;

    i(String str) {
        this.h = str;
    }

    public static Date a(String str) {
        a aVar = new a(str);
        if (!aVar.a()) {
            throw ezvcard.b.INSTANCE.d(41, str);
        }
        Calendar calendar = Calendar.getInstance(aVar.j() ? TimeZone.getTimeZone("UTC") : TimeZone.getDefault());
        calendar.clear();
        calendar.set(1, aVar.b());
        calendar.set(2, aVar.c() - 1);
        calendar.set(5, aVar.d());
        if (aVar.e()) {
            calendar.set(11, aVar.f());
            calendar.set(12, aVar.g());
            calendar.set(13, aVar.h());
            calendar.set(14, aVar.i());
            if (aVar.j()) {
                calendar.set(15, aVar.k());
            }
        }
        return calendar.getTime();
    }

    /* compiled from: VCardDateFormat.java */
    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final Pattern f5636a = Pattern.compile("^(\\d{4})-?(\\d{2})-?(\\d{2})(T(\\d{2}):?(\\d{2}):?(\\d{2})(\\.\\d+)?(Z|([-+])((\\d{2})|((\\d{2}):?(\\d{2}))))?)?$");

        /* renamed from: b  reason: collision with root package name */
        private final Matcher f5637b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f5638c;

        public a(String str) {
            this.f5637b = f5636a.matcher(str);
            this.f5638c = this.f5637b.find();
        }

        public boolean a() {
            return this.f5638c;
        }

        public int b() {
            return a(1);
        }

        public int c() {
            return a(2);
        }

        public int d() {
            return a(3);
        }

        public boolean e() {
            return this.f5637b.group(5) != null;
        }

        public int f() {
            return a(5);
        }

        public int g() {
            return a(6);
        }

        public int h() {
            return a(7);
        }

        public int i() {
            if (this.f5637b.group(8) == null) {
                return 0;
            }
            return (int) Math.round(Double.parseDouble(this.f5637b.group(8)) * 1000.0d);
        }

        public boolean j() {
            return this.f5637b.group(9) != null;
        }

        public int k() {
            int a2;
            int i = 0;
            if (this.f5637b.group(9).equals("Z")) {
                return 0;
            }
            int i2 = this.f5637b.group(10).equals("+") ? 1 : -1;
            if (this.f5637b.group(12) != null) {
                a2 = a(12);
            } else {
                a2 = a(14);
                i = a(15);
            }
            return ((a2 * 60 * 60 * NetstatsParserPatterns.NEW_TS_TO_MILLIS) + (i * 60 * NetstatsParserPatterns.NEW_TS_TO_MILLIS)) * i2;
        }

        private int a(int i) {
            return Integer.parseInt(this.f5637b.group(i));
        }
    }

    public static TimeZone b(String str) {
        TimeZone timeZone = TimeZone.getTimeZone(str);
        if ("GMT".equals(timeZone.getID())) {
            return null;
        }
        return timeZone;
    }
}
