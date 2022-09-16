package defpackage;

import com.google.android.gms.cast.CastDevice;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: adqu  reason: default package */
/* loaded from: classes.dex */
public final class adqu {
    public static final String a = zep.a("MDX.EventLogger");
    public final acrr b;

    public adqu(acrr acrrVar) {
        acrrVar.getClass();
        this.b = acrrVar;
    }

    public static atbs a(adig adigVar) {
        boolean z = adigVar instanceof adid;
        if (z || (adigVar instanceof adhz)) {
            aopa createBuilder = atbs.a.createBuilder();
            if (z) {
                adid adidVar = (adid) adigVar;
                String str = adidVar.d;
                createBuilder.copyOnWrite();
                atbs atbsVar = (atbs) createBuilder.instance;
                str.getClass();
                atbsVar.b |= 1;
                atbsVar.c = str;
                String str2 = adidVar.f;
                if (str2 != null && !str2.isEmpty()) {
                    createBuilder.copyOnWrite();
                    atbs atbsVar2 = (atbs) createBuilder.instance;
                    atbsVar2.b |= 4;
                    atbsVar2.e = str2;
                }
                String str3 = adidVar.g;
                if (str3 != null && !str3.isEmpty()) {
                    createBuilder.copyOnWrite();
                    atbs atbsVar3 = (atbs) createBuilder.instance;
                    atbsVar3.b |= 2;
                    atbsVar3.d = str3;
                }
            } else {
                CastDevice castDevice = ((adhz) adigVar).a;
                String str4 = castDevice.d;
                if (!str4.isEmpty()) {
                    createBuilder.copyOnWrite();
                    atbs atbsVar4 = (atbs) createBuilder.instance;
                    str4.getClass();
                    atbsVar4.b |= 1;
                    atbsVar4.c = str4;
                }
                createBuilder.copyOnWrite();
                atbs atbsVar5 = (atbs) createBuilder.instance;
                atbsVar5.b |= 4;
                atbsVar5.e = "UnknownCastManufacturer";
                String str5 = castDevice.e;
                createBuilder.copyOnWrite();
                atbs atbsVar6 = (atbs) createBuilder.instance;
                str5.getClass();
                atbsVar6.b |= 2;
                atbsVar6.d = str5;
            }
            return (atbs) createBuilder.mo39build();
        }
        return null;
    }

    public static int b(int i) {
        if (i != 0) {
            return i != 1 ? 4 : 3;
        }
        return 2;
    }

    public static aopa c(adqy adqyVar) {
        aopa createBuilder = atbf.a.createBuilder();
        adid adidVar = (adid) adqyVar.k();
        adit aditVar = adqyVar.am.j;
        int a2 = adidVar.a.a();
        int i = a2 != -1 ? a2 != 0 ? a2 != 1 ? a2 != 2 ? a2 != 3 ? 2 : 6 : 4 : 5 : 7 : 3;
        createBuilder.copyOnWrite();
        atbf atbfVar = (atbf) createBuilder.instance;
        atbfVar.c = i - 1;
        atbfVar.b |= 1;
        boolean z = adidVar.l == 1;
        createBuilder.copyOnWrite();
        atbf atbfVar2 = (atbf) createBuilder.instance;
        atbfVar2.b = 4 | atbfVar2.b;
        atbfVar2.e = z;
        boolean o = adidVar.o();
        createBuilder.copyOnWrite();
        atbf atbfVar3 = (atbf) createBuilder.instance;
        atbfVar3.b |= 2;
        atbfVar3.d = o;
        int i2 = adidVar.m;
        createBuilder.copyOnWrite();
        atbf atbfVar4 = (atbf) createBuilder.instance;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        atbfVar4.g = i3;
        atbfVar4.b |= 16;
        int ro = adqyVar.ro();
        createBuilder.copyOnWrite();
        atbf atbfVar5 = (atbf) createBuilder.instance;
        atbfVar5.b |= 32;
        atbfVar5.h = ro;
        if (aditVar != null) {
            String str = aditVar.c;
            createBuilder.copyOnWrite();
            atbf atbfVar6 = (atbf) createBuilder.instance;
            atbfVar6.b |= 8;
            atbfVar6.f = str;
        }
        atbf atbfVar7 = (atbf) createBuilder.mo39build();
        Locale locale = Locale.US;
        Object[] objArr = new Object[3];
        int Y = almu.Y(atbfVar7.c);
        if (Y == 0) {
            Y = 1;
        }
        objArr[0] = Integer.valueOf(Y - 1);
        objArr[1] = Boolean.valueOf(atbfVar7.e);
        objArr[2] = Boolean.valueOf(atbfVar7.d);
        String.format(locale, "dial info: appStatus=%d isSleeping=%b isWakeOnLan=%b", objArr);
        return createBuilder;
    }
}
