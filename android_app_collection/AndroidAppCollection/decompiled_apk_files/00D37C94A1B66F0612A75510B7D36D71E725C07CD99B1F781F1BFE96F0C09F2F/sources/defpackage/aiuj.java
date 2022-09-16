package defpackage;

import android.net.Uri;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: aiuj  reason: default package */
/* loaded from: classes.dex */
public final class aiuj implements afzn {
    public aijs a;
    public long b;
    public boolean c;
    private final yrj d;
    private final snc e;
    private final long g;
    private final String h;
    private final aijz i;

    public aiuj(yrj yrjVar, aijs aijsVar, aijz aijzVar, snc sncVar, long j, String str) {
        this.d = yrjVar;
        this.i = aijzVar;
        this.a = aijsVar;
        this.e = sncVar;
        this.g = j;
        this.h = str;
    }

    private static String c(long j) {
        Locale locale = Locale.US;
        double d = j;
        Double.isNaN(d);
        return String.format(locale, "%.1f", Double.valueOf(d / 1000.0d));
    }

    @Override // defpackage.afzn
    public final String a(Uri uri, String str) {
        Integer num = (Integer) aiui.a.get(str);
        if (num == null) {
            return null;
        }
        switch (num.intValue()) {
            case 1:
                return c(this.b);
            case 2:
                return this.h;
            case 3:
                return true != this.c ? "pause" : "playing";
            case 4:
                return String.valueOf(this.d.a());
            case 5:
                return c(this.e.d() - this.g);
            case 6:
                aijs aijsVar = this.a;
                return aijsVar != null ? aijsVar.a() : "0";
            case 7:
                return this.i.a();
            default:
                return null;
        }
    }

    @Override // defpackage.afzn
    public final String b() {
        return "VideoStats2MacroConverter";
    }
}
