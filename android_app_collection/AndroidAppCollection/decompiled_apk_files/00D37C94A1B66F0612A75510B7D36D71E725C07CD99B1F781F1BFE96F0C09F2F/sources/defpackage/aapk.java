package defpackage;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import j$.util.function.Function;
import j$.util.function.UnaryOperator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: aapk  reason: default package */
/* loaded from: classes.dex */
public final class aapk {
    public final aadd a;
    public final aapm b;
    public final aakl c;
    public final ankw d;
    public final AtomicReference e;
    public final aacz f;
    private final arov g;
    private final snc h;
    private final azqb i;
    private final azqb j;
    private final zer k;
    private final TelephonyManager l;
    private final axwp m;
    private final AtomicBoolean n;
    private final arou o;
    private final String p;
    private final yrj q;

    public aapk(Context context, arov arovVar, TelephonyManager telephonyManager, snc sncVar, azqb azqbVar, azqb azqbVar2, aadd aaddVar, aacz aaczVar, aapm aapmVar, yrj yrjVar, aakl aaklVar, axwp axwpVar, ankw ankwVar) {
        arou arouVar;
        String str;
        this.g = arovVar;
        this.l = telephonyManager;
        this.h = sncVar;
        this.i = azqbVar;
        this.a = aaddVar;
        this.f = aaczVar;
        this.j = azqbVar2;
        this.b = aapmVar;
        this.k = new aaph(context);
        if (zfm.f(context)) {
            arouVar = arou.WEARABLE_FORM_FACTOR;
        } else if (zfm.e(context)) {
            arouVar = arou.AUTOMOTIVE_FORM_FACTOR;
        } else {
            int m = zew.m(context);
            if (m == 1 || m == 2) {
                arouVar = arou.SMALL_FORM_FACTOR;
            } else if (m == 3 || m == 4) {
                arouVar = arou.LARGE_FORM_FACTOR;
            } else {
                arouVar = arou.UNKNOWN_FORM_FACTOR;
            }
        }
        this.o = arouVar;
        if (zfm.f(context)) {
            str = "Android Wear";
        } else {
            str = zfm.e(context) ? "Android Automotive" : "Android";
        }
        this.p = str;
        this.q = yrjVar;
        this.c = aaklVar;
        this.m = axwpVar;
        this.d = ankwVar;
        this.e = new AtomicReference();
        this.n = new AtomicBoolean(false);
    }

    private final String d() {
        Boolean bool;
        aqxe aqxeVar = this.m.a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45352485L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45352485L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45352485L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            if (!this.n.getAndSet(true) && Build.VERSION.SDK_INT <= 30) {
                this.l.listen(new aapj(this), 1);
            }
            return (String) DesugarAtomicReference.updateAndGet(this.e, new UnaryOperator() { // from class: aapg
                @Override // j$.util.function.Function
                public final /* synthetic */ Function andThen(Function function) {
                    return function.getClass();
                }

                @Override // j$.util.function.Function
                public final Object apply(Object obj) {
                    String str = (String) obj;
                    return str == null ? aapk.this.a() : str;
                }

                @Override // j$.util.function.Function
                public final /* synthetic */ Function compose(Function function) {
                    return function.getClass();
                }
            });
        }
        return zgt.d(this.l);
    }

    public final String a() {
        return zgt.d(this.l);
    }

    public final void b() {
        d();
        this.k.get();
        this.i.get();
        ((aara) this.j.get()).a();
    }

    public final aopa c() {
        aopa createBuilder = arow.a.createBuilder();
        String a = aaqt.a(Locale.getDefault());
        createBuilder.copyOnWrite();
        arow arowVar = (arow) createBuilder.instance;
        a.getClass();
        arowVar.b |= 2;
        arowVar.f = a;
        arov arovVar = this.g;
        createBuilder.copyOnWrite();
        arow arowVar2 = (arow) createBuilder.instance;
        arowVar2.p = arovVar.ay;
        arowVar2.b |= 16777216;
        String str = (String) this.k.get();
        createBuilder.copyOnWrite();
        arow arowVar3 = (arow) createBuilder.instance;
        str.getClass();
        arowVar3.b |= 67108864;
        arowVar3.r = str;
        String str2 = Build.VERSION.RELEASE;
        createBuilder.copyOnWrite();
        arow arowVar4 = (arow) createBuilder.instance;
        str2.getClass();
        arowVar4.c |= 32;
        arowVar4.w = str2;
        int i = Build.VERSION.SDK_INT;
        createBuilder.copyOnWrite();
        arow arowVar5 = (arow) createBuilder.instance;
        arowVar5.b |= 33554432;
        arowVar5.q = i;
        String str3 = this.p;
        createBuilder.copyOnWrite();
        arow arowVar6 = (arow) createBuilder.instance;
        arowVar6.c |= 16;
        arowVar6.v = str3;
        String str4 = Build.MANUFACTURER;
        createBuilder.copyOnWrite();
        arow arowVar7 = (arow) createBuilder.instance;
        str4.getClass();
        arowVar7.b |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        arowVar7.s = str4;
        String str5 = Build.BRAND;
        createBuilder.copyOnWrite();
        arow arowVar8 = (arow) createBuilder.instance;
        str5.getClass();
        arowVar8.c |= 1;
        arowVar8.t = str5;
        String str6 = Build.MODEL;
        createBuilder.copyOnWrite();
        arow arowVar9 = (arow) createBuilder.instance;
        str6.getClass();
        arowVar9.c |= 2;
        arowVar9.u = str6;
        int intValue = ((Integer) this.i.get()).intValue();
        createBuilder.copyOnWrite();
        arow arowVar10 = (arow) createBuilder.instance;
        arowVar10.d |= 2;
        arowVar10.K = intValue;
        arou arouVar = this.o;
        createBuilder.copyOnWrite();
        arow arowVar11 = (arow) createBuilder.instance;
        arowVar11.I = arouVar.f;
        arowVar11.c |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        long minutes = TimeUnit.MILLISECONDS.toMinutes(TimeZone.getDefault().getOffset(this.h.c()));
        createBuilder.copyOnWrite();
        arow arowVar12 = (arow) createBuilder.instance;
        arowVar12.d |= 64;
        arowVar12.M = (int) minutes;
        String id = TimeZone.getDefault().getID();
        createBuilder.copyOnWrite();
        arow arowVar13 = (arow) createBuilder.instance;
        id.getClass();
        arowVar13.d |= 128;
        arowVar13.N = id;
        String d = d();
        if (!TextUtils.isEmpty(d)) {
            createBuilder.copyOnWrite();
            arow arowVar14 = (arow) createBuilder.instance;
            d.getClass();
            arowVar14.b |= 16;
            arowVar14.i = d;
        }
        apwf b = apwf.b(this.q.a());
        if (b != null) {
            createBuilder.copyOnWrite();
            arow arowVar15 = (arow) createBuilder.instance;
            arowVar15.x = b.o;
            arowVar15.c |= 1024;
        }
        aara aaraVar = (aara) this.j.get();
        aaqz a2 = aaraVar.a();
        int i2 = a2.a;
        createBuilder.copyOnWrite();
        arow arowVar16 = (arow) createBuilder.instance;
        arowVar16.c |= 524288;
        arowVar16.A = i2;
        int i3 = a2.b;
        createBuilder.copyOnWrite();
        arow arowVar17 = (arow) createBuilder.instance;
        arowVar17.c |= 1048576;
        arowVar17.B = i3;
        float f = a2.c;
        createBuilder.copyOnWrite();
        arow arowVar18 = (arow) createBuilder.instance;
        arowVar18.c |= 8388608;
        arowVar18.E = f;
        float f2 = a2.d;
        createBuilder.copyOnWrite();
        arow arowVar19 = (arow) createBuilder.instance;
        arowVar19.c = 16777216 | arowVar19.c;
        arowVar19.F = f2;
        float f3 = a2.e;
        createBuilder.copyOnWrite();
        arow arowVar20 = (arow) createBuilder.instance;
        arowVar20.c = 67108864 | arowVar20.c;
        arowVar20.H = f3;
        int round = Math.round(a2.e);
        createBuilder.copyOnWrite();
        arow arowVar21 = (arow) createBuilder.instance;
        arowVar21.c |= 33554432;
        arowVar21.G = round;
        aaqz aaqzVar = aaraVar.a;
        if (aaqzVar != null) {
            int i4 = aaqzVar.b;
            createBuilder.copyOnWrite();
            arow arowVar22 = (arow) createBuilder.instance;
            arowVar22.c |= 4194304;
            arowVar22.D = i4;
            int i5 = aaqzVar.a;
            createBuilder.copyOnWrite();
            arow arowVar23 = (arow) createBuilder.instance;
            arowVar23.c |= 2097152;
            arowVar23.C = i5;
        }
        return createBuilder;
    }
}
