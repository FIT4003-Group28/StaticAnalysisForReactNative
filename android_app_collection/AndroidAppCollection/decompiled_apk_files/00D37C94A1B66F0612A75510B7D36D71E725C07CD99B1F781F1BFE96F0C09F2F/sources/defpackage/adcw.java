package defpackage;

import com.google.android.gms.cast.CastDevice;
/* compiled from: PG */
/* renamed from: adcw  reason: default package */
/* loaded from: classes.dex */
public final class adcw implements aaqw {
    public adnt a;

    static {
        zep.a("MDX.innertube");
    }

    @Override // defpackage.aaqw
    public final void a(aopa aopaVar) {
        arov arovVar;
        adnt adntVar = this.a;
        if (adntVar == null || adntVar.a() == 2) {
            return;
        }
        arow arowVar = ((aroy) aopaVar.instance).d;
        if (arowVar == null) {
            arowVar = arow.a;
        }
        aopa mo52toBuilder = arowVar.mo52toBuilder();
        adnt adntVar2 = this.a;
        String str = null;
        if (adntVar2 != null && adntVar2.a() != 2) {
            str = adntVar2.s();
        }
        if ("tvlite".equals(str)) {
            arovVar = arov.TVLITE;
        } else if ("xbox".equals(str)) {
            arovVar = arov.XBOX;
        } else if (adntVar2 == null || !adntVar2.aa()) {
            arovVar = arov.TVHTML5;
        } else {
            arovVar = arov.TVHTML5_AUDIO;
        }
        String.valueOf(String.valueOf(arovVar)).length();
        mo52toBuilder.copyOnWrite();
        arow arowVar2 = (arow) mo52toBuilder.instance;
        arowVar2.p = arovVar.ay;
        arowVar2.b |= 16777216;
        adig k = adntVar.k();
        if (k instanceof adid) {
            adid adidVar = (adid) k;
            String str2 = adidVar.f;
            if (str2 != null) {
                mo52toBuilder.copyOnWrite();
                arow arowVar3 = (arow) mo52toBuilder.instance;
                arowVar3.b = Integer.MIN_VALUE | arowVar3.b;
                arowVar3.s = str2;
            }
            String str3 = adidVar.g;
            if (str3 != null) {
                mo52toBuilder.copyOnWrite();
                arow arowVar4 = (arow) mo52toBuilder.instance;
                arowVar4.c |= 2;
                arowVar4.u = str3;
            }
            String str4 = adidVar.i;
            if (str4 != null) {
                mo52toBuilder.copyOnWrite();
                arow arowVar5 = (arow) mo52toBuilder.instance;
                arowVar5.c |= 32;
                arowVar5.w = str4;
            }
            String str5 = adidVar.f;
            String str6 = adidVar.g;
            String str7 = adidVar.i;
            String.valueOf(str5).length();
            String.valueOf(str6).length();
            String.valueOf(str7).length();
        } else if (k instanceof adhz) {
            CastDevice castDevice = ((adhz) k).a;
            mo52toBuilder.copyOnWrite();
            arow arowVar6 = (arow) mo52toBuilder.instance;
            arowVar6.b = Integer.MIN_VALUE | arowVar6.b;
            arowVar6.s = "Google Inc.";
            String str8 = castDevice.e;
            mo52toBuilder.copyOnWrite();
            arow arowVar7 = (arow) mo52toBuilder.instance;
            str8.getClass();
            arowVar7.c |= 2;
            arowVar7.u = str8;
            String str9 = castDevice.f;
            mo52toBuilder.copyOnWrite();
            arow arowVar8 = (arow) mo52toBuilder.instance;
            str9.getClass();
            arowVar8.c |= 32;
            arowVar8.w = str9;
            String str10 = castDevice.e;
            String str11 = castDevice.f;
            String.valueOf(str10).length();
            String.valueOf(str11).length();
        }
        arow arowVar9 = (arow) mo52toBuilder.mo39build();
        aopaVar.copyOnWrite();
        aroy aroyVar = (aroy) aopaVar.instance;
        arowVar9.getClass();
        aroyVar.d = arowVar9;
        aroyVar.b |= 2;
    }
}
