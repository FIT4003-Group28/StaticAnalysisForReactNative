package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.TypefaceSpan;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ydb  reason: default package */
/* loaded from: classes7.dex */
public final class ydb {
    public static final TypefaceSpan a = new TypefaceSpan("sans-serif");
    private static final yda b = new yda(false, R.string.TRANSIT_WALKING_DESCRIPTION, R.string.TRANSIT_SEGMENT_WALK_DISTANCE, R.string.TRANSIT_SEGMENT_WALK_DURATION, R.string.TRANSIT_SEGMENT_WALK_DURATION_DISTANCE, R.string.TRANSIT_SEGMENT_WALK_DURATION_DISTANCE_WAIT);
    private static final yda c = new yda(false, R.string.TRANSIT_DRIVE_DESCRIPTION, R.string.TRANSIT_SEGMENT_DRIVE_DISTANCE, R.string.TRANSIT_SEGMENT_DRIVE_DURATION, R.string.TRANSIT_SEGMENT_DRIVE_DURATION_DISTANCE, -1);
    @dzsi
    private static final yda d = new yda(false, R.string.TRANSIT_BICYCLE_DESCRIPTION, R.string.TRANSIT_SEGMENT_BICYCLE_DISTANCE, R.string.TRANSIT_SEGMENT_BICYCLE_DURATION, R.string.TRANSIT_SEGMENT_BICYCLE_DURATION_DISTANCE, -1);
    @dzsi
    private static final yda e = new yda(true, R.string.TRANSIT_TAXI_RIDE_DESCRIPTION, R.string.TRANSIT_SEGMENT_TAXI_RIDE_DISTANCE, R.string.TRANSIT_SEGMENT_TAXI_RIDE_DURATION, R.string.TRANSIT_SEGMENT_TAXI_RIDE_DURATION_DISTANCE, -1);
    @dzsi
    private static final yda f = new yda(false, R.string.TRANSIT_TAXI_RIDE_DESCRIPTION, R.string.TRANSIT_SEGMENT_TAXI_GENERIC_RIDE_DISTANCE, R.string.TRANSIT_SEGMENT_TAXI_GENERIC_RIDE_DURATION, R.string.TRANSIT_SEGMENT_TAXI_GENERIC_RIDE_DURATION_DISTANCE, -1);
    @dzsi
    private static final yda g = new yda(false, R.string.TRANSIT_TWO_WHEELER_DRIVE_DESCRIPTION, R.string.TRANSIT_SEGMENT_TWO_WHEELER_DRIVE_DISTANCE, R.string.TRANSIT_SEGMENT_TWO_WHEELER_DRIVE_DURATION, R.string.TRANSIT_SEGMENT_TWO_WHEELER_DRIVE_DURATION_DISTANCE, -1);

    @dzsi
    public static CharSequence a(dpdy dpdyVar, bvsl bvslVar, Resources resources, @dzsi dgas dgasVar, boolean z) {
        yda ydaVar;
        Object string;
        int i;
        dqvj dqvjVar = dqvj.DRIVE;
        dpec dpecVar = dpdyVar.c;
        if (dpecVar == null) {
            dpecVar = dpec.o;
        }
        dqvj c2 = dqvj.c(dpecVar.b);
        if (c2 == null) {
            c2 = dqvj.DRIVE;
        }
        int ordinal = c2.ordinal();
        CharSequence charSequence = null;
        if (ordinal == 0) {
            ydaVar = c;
        } else if (ordinal == 1) {
            ydaVar = d;
        } else if (ordinal == 2) {
            ydaVar = b;
        } else if (ordinal == 5) {
            ydaVar = g;
        } else if (ordinal != 7) {
            ydaVar = null;
        } else {
            ydaVar = (dpdyVar.a & 256) != 0 ? e : f;
        }
        if (ydaVar == null) {
            return null;
        }
        dpah dpahVar = dpdyVar.j;
        if (dpahVar == null) {
            dpahVar = dpah.g;
        }
        String str = dpahVar.e;
        dpec dpecVar2 = dpdyVar.c;
        if (dpecVar2 == null) {
            dpecVar2 = dpec.o;
        }
        dowb dowbVar = dpecVar2.d;
        if (dowbVar == null) {
            dowbVar = dowb.d;
        }
        String f2 = dbsj.f(bvslVar.i(dowbVar));
        CharSequence b2 = vxp.b(dpecVar2, resources, bvsz.ABBREVIATED);
        if (b2 == null) {
            b2 = null;
        } else {
            doxd doxdVar = dpecVar2.k;
            if (doxdVar == null) {
                doxdVar = doxd.l;
            }
            if ((doxdVar.a & 4) != 0) {
                doxd doxdVar2 = dpecVar2.k;
                if (doxdVar2 == null) {
                    doxdVar2 = doxd.l;
                }
                dpej b3 = dpej.b(doxdVar2.c);
                if (b3 == null) {
                    b3 = dpej.DELAY_NODATA;
                }
                int Y = vyb.Y(b3, z);
                bvsv a2 = new bvsx(resources).a(b2);
                a2.l(resources.getColor(Y));
                b2 = a2.c();
            }
        }
        if (true != TextUtils.isEmpty(b2)) {
            charSequence = b2;
        }
        bvsx bvsxVar = new bvsx(resources);
        if (f2 == null || charSequence == null) {
            if (f2 != null) {
                bvsu c3 = bvsxVar.c(ydaVar.b);
                c3.a(ydaVar.a(str, f2));
                string = c3.c();
            } else if (charSequence == null) {
                string = resources.getString(ydaVar.a);
            } else {
                bvsu c4 = bvsxVar.c(ydaVar.c);
                c4.a(ydaVar.a(str, charSequence));
                string = c4.c();
            }
            bvsv a3 = bvsxVar.a(string);
            a3.j(a);
            return a3.c();
        }
        bvsv a4 = bvsxVar.a(charSequence);
        TypefaceSpan typefaceSpan = a;
        a4.j(typefaceSpan);
        Spannable c5 = a4.c();
        StringBuilder sb = new StringBuilder(f2.length() + 2);
        sb.append("(");
        sb.append(f2);
        sb.append(")");
        String sb2 = sb.toString();
        if (dgasVar == null || (i = ydaVar.e) == -1) {
            bvsu c6 = bvsxVar.c(ydaVar.d);
            bvsw bvswVar = new bvsw();
            bvswVar.d(typefaceSpan);
            c6.b(bvswVar);
            c6.a(ydaVar.a(str, c5, sb2));
            return c6.c();
        }
        bvsu c7 = bvsxVar.c(i);
        bvsw bvswVar2 = new bvsw();
        bvswVar2.d(typefaceSpan);
        c7.b(bvswVar2);
        Object[] objArr = new Object[3];
        objArr[0] = c5;
        objArr[1] = sb2;
        objArr[2] = (dgasVar.a & 2) != 0 ? dgasVar.c : resources.getString(R.string.TRANSIT_SEGMENT_WALK_WAIT_TIME_FORMAT, Long.valueOf(TimeUnit.SECONDS.toMinutes(dgasVar.b)));
        c7.a(ydaVar.a(str, objArr));
        return c7.c();
    }

    @dzsi
    public static String b(Context context, dpdy dpdyVar, @dzsi CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        dpec dpecVar = dpdyVar.c;
        if (dpecVar == null) {
            dpecVar = dpec.o;
        }
        doxd doxdVar = dpecVar.k;
        if (doxdVar == null) {
            doxdVar = doxd.l;
        }
        if ((doxdVar.a & 4) == 0) {
            return charSequence.toString();
        }
        bvsi bvsiVar = new bvsi(context);
        bvsiVar.c(charSequence);
        dpec dpecVar2 = dpdyVar.c;
        if (dpecVar2 == null) {
            dpecVar2 = dpec.o;
        }
        doxd doxdVar2 = dpecVar2.k;
        if (doxdVar2 == null) {
            doxdVar2 = doxd.l;
        }
        dpej b2 = dpej.b(doxdVar2.c);
        if (b2 == null) {
            b2 = dpej.DELAY_NODATA;
        }
        bvsiVar.c(vyb.j(context, b2));
        return bvsiVar.toString();
    }

    public static String c(@dzsi CharSequence charSequence, Resources resources) {
        if (charSequence != null) {
            return resources.getString(R.string.TRANSIT_DETAILS_TRANSFER_TO_PLATFORM, charSequence);
        }
        return resources.getString(R.string.TRANSIT_DETAILS_TRANSFER);
    }
}
