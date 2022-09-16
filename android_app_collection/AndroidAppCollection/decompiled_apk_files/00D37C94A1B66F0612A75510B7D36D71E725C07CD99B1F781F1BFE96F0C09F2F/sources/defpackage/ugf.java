package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: ugf  reason: default package */
/* loaded from: classes4.dex */
public final class ugf implements ufu {
    private static final amvn a = amvn.s(aojw.SHOWN, aojw.SHOWN_FORCED);
    private final Context b;
    private final ucj c;
    private final uhe d;
    private final ufx e;
    private final ugd f;

    static {
        amvn.v(aojw.ACTION_CLICK, aojw.CLICKED, aojw.DISMISSED, aojw.SHOWN, aojw.SHOWN_FORCED);
    }

    public ugf(Context context, ucj ucjVar, uhe uheVar, ufx ufxVar, ugd ugdVar) {
        this.b = context;
        this.c = ucjVar;
        this.d = uheVar;
        this.e = ufxVar;
        this.f = ugdVar;
    }

    private final String c() {
        try {
            String str = this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 0).versionName;
            return !TextUtils.isEmpty(str) ? str : "unknown";
        } catch (PackageManager.NameNotFoundException e) {
            uev.c("RenderContextHelperImpl", e, "Failed to get app version.", new Object[0]);
            return "unknown";
        }
    }

    private final String d() {
        try {
            return rxn.c(this.b.getContentResolver(), "device_country");
        } catch (SecurityException e) {
            uev.c("RenderContextHelperImpl", e, "Exception reading GServices 'device_country' key.", new Object[0]);
            return null;
        }
    }

    @Override // defpackage.ufu
    public final aojo a(aojw aojwVar) {
        aopa createBuilder = aojn.a.createBuilder();
        float f = this.b.getResources().getDisplayMetrics().density;
        createBuilder.copyOnWrite();
        aojn aojnVar = (aojn) createBuilder.instance;
        aojnVar.b |= 1;
        aojnVar.c = f;
        String c = c();
        createBuilder.copyOnWrite();
        aojn aojnVar2 = (aojn) createBuilder.instance;
        c.getClass();
        aojnVar2.b |= 8;
        aojnVar2.f = c;
        int i = Build.VERSION.SDK_INT;
        createBuilder.copyOnWrite();
        aojn aojnVar3 = (aojn) createBuilder.instance;
        aojnVar3.b |= 128;
        aojnVar3.j = i;
        createBuilder.copyOnWrite();
        aojn aojnVar4 = (aojn) createBuilder.instance;
        int i2 = 3;
        aojnVar4.d = 3;
        aojnVar4.b |= 2;
        String num = Integer.toString(391249389);
        createBuilder.copyOnWrite();
        aojn aojnVar5 = (aojn) createBuilder.instance;
        num.getClass();
        aojnVar5.b |= 4;
        aojnVar5.e = num;
        int i3 = (this.b.getResources().getConfiguration().uiMode & 48) == 32 ? 3 : 2;
        createBuilder.copyOnWrite();
        aojn aojnVar6 = (aojn) createBuilder.instance;
        aojnVar6.q = i3 - 1;
        aojnVar6.b |= 8192;
        if (!TextUtils.isEmpty(Build.VERSION.RELEASE)) {
            String str = Build.VERSION.RELEASE;
            createBuilder.copyOnWrite();
            aojn aojnVar7 = (aojn) createBuilder.instance;
            str.getClass();
            aojnVar7.b |= 16;
            aojnVar7.g = str;
        }
        if (!TextUtils.isEmpty(Build.ID)) {
            String str2 = Build.ID;
            createBuilder.copyOnWrite();
            aojn aojnVar8 = (aojn) createBuilder.instance;
            str2.getClass();
            aojnVar8.b = 32 | aojnVar8.b;
            aojnVar8.h = str2;
        }
        if (!TextUtils.isEmpty(Build.MODEL)) {
            String str3 = Build.MODEL;
            createBuilder.copyOnWrite();
            aojn aojnVar9 = (aojn) createBuilder.instance;
            str3.getClass();
            aojnVar9.b |= 64;
            aojnVar9.i = str3;
        }
        if (!TextUtils.isEmpty(Build.MANUFACTURER)) {
            String str4 = Build.MANUFACTURER;
            createBuilder.copyOnWrite();
            aojn aojnVar10 = (aojn) createBuilder.instance;
            str4.getClass();
            aojnVar10.b |= 256;
            aojnVar10.k = str4;
        }
        for (uhb uhbVar : this.d.c()) {
            aoit a2 = uhbVar.a();
            createBuilder.copyOnWrite();
            aojn aojnVar11 = (aojn) createBuilder.instance;
            a2.getClass();
            aopu aopuVar = aojnVar11.l;
            if (!aopuVar.c()) {
                aojnVar11.l = aopi.mutableCopy(aopuVar);
            }
            aojnVar11.l.add(a2);
        }
        for (uhd uhdVar : this.d.b()) {
            aois a3 = uhdVar.a();
            createBuilder.copyOnWrite();
            aojn aojnVar12 = (aojn) createBuilder.instance;
            a3.getClass();
            aopu aopuVar2 = aojnVar12.m;
            if (!aopuVar2.c()) {
                aojnVar12.m = aopi.mutableCopy(aopuVar2);
            }
            aojnVar12.m.add(a3);
        }
        int i4 = true != fq.a(this.b).g() ? 3 : 2;
        createBuilder.copyOnWrite();
        aojn aojnVar13 = (aojn) createBuilder.instance;
        aojnVar13.n = i4 - 1;
        aojnVar13.b |= 1024;
        String d = d();
        if (!TextUtils.isEmpty(d)) {
            createBuilder.copyOnWrite();
            aojn aojnVar14 = (aojn) createBuilder.instance;
            d.getClass();
            aojnVar14.b |= 2048;
            aojnVar14.o = d;
        }
        aopa createBuilder2 = aojm.a.createBuilder();
        if (a.contains(aojwVar)) {
            ampq a4 = this.f.a();
            if (a4.h()) {
                int ordinal = ((uft) a4.c()).ordinal();
                if (ordinal == 0) {
                    i2 = 2;
                } else if (ordinal != 1) {
                    if (ordinal == 2) {
                        i2 = 4;
                    } else if (ordinal != 3) {
                        throw new AssertionError("Invalid enum value.");
                    } else {
                        i2 = 5;
                    }
                }
                createBuilder2.copyOnWrite();
                aojm aojmVar = (aojm) createBuilder2.instance;
                aojmVar.c = i2 - 1;
                aojmVar.b |= 8;
            }
        }
        aojm aojmVar2 = (aojm) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        aojn aojnVar15 = (aojn) createBuilder.instance;
        aojmVar2.getClass();
        aojnVar15.p = aojmVar2;
        aojnVar15.b |= 4096;
        aopa createBuilder3 = aojo.a.createBuilder();
        String e = e();
        createBuilder3.copyOnWrite();
        aojo aojoVar = (aojo) createBuilder3.instance;
        e.getClass();
        aojoVar.b |= 1;
        aojoVar.e = e;
        String id = TimeZone.getDefault().getID();
        createBuilder3.copyOnWrite();
        aojo aojoVar2 = (aojo) createBuilder3.instance;
        id.getClass();
        aojoVar2.c = 4;
        aojoVar2.d = id;
        createBuilder3.copyOnWrite();
        aojo aojoVar3 = (aojo) createBuilder3.instance;
        aojn aojnVar16 = (aojn) createBuilder.mo39build();
        aojnVar16.getClass();
        aojoVar3.f = aojnVar16;
        aojoVar3.b |= 8;
        return (aojo) createBuilder3.mo39build();
    }

    @Override // defpackage.ufu
    public final aolm b() {
        aomg aomgVar;
        aopa createBuilder = aoll.a.createBuilder();
        float f = this.b.getResources().getDisplayMetrics().density;
        createBuilder.copyOnWrite();
        aoll aollVar = (aoll) createBuilder.instance;
        aollVar.b |= 1;
        aollVar.c = f;
        String c = c();
        createBuilder.copyOnWrite();
        aoll aollVar2 = (aoll) createBuilder.instance;
        c.getClass();
        aollVar2.b |= 8;
        aollVar2.f = c;
        int i = Build.VERSION.SDK_INT;
        createBuilder.copyOnWrite();
        aoll aollVar3 = (aoll) createBuilder.instance;
        aollVar3.b |= 128;
        aollVar3.j = i;
        String str = this.c.e;
        createBuilder.copyOnWrite();
        aoll aollVar4 = (aoll) createBuilder.instance;
        str.getClass();
        aollVar4.b |= 512;
        aollVar4.l = str;
        createBuilder.copyOnWrite();
        aoll aollVar5 = (aoll) createBuilder.instance;
        int i2 = 3;
        aollVar5.d = 3;
        aollVar5.b |= 2;
        String num = Integer.toString(391249389);
        createBuilder.copyOnWrite();
        aoll aollVar6 = (aoll) createBuilder.instance;
        num.getClass();
        aollVar6.b |= 4;
        aollVar6.e = num;
        if (!TextUtils.isEmpty(Build.VERSION.RELEASE)) {
            String str2 = Build.VERSION.RELEASE;
            createBuilder.copyOnWrite();
            aoll aollVar7 = (aoll) createBuilder.instance;
            str2.getClass();
            aollVar7.b |= 16;
            aollVar7.g = str2;
        }
        if (!TextUtils.isEmpty(Build.ID)) {
            String str3 = Build.ID;
            createBuilder.copyOnWrite();
            aoll aollVar8 = (aoll) createBuilder.instance;
            str3.getClass();
            aollVar8.b |= 32;
            aollVar8.h = str3;
        }
        if (!TextUtils.isEmpty(Build.MODEL)) {
            String str4 = Build.MODEL;
            createBuilder.copyOnWrite();
            aoll aollVar9 = (aoll) createBuilder.instance;
            str4.getClass();
            aollVar9.b |= 64;
            aollVar9.i = str4;
        }
        if (!TextUtils.isEmpty(Build.MANUFACTURER)) {
            String str5 = Build.MANUFACTURER;
            createBuilder.copyOnWrite();
            aoll aollVar10 = (aoll) createBuilder.instance;
            str5.getClass();
            aollVar10.b |= 256;
            aollVar10.k = str5;
        }
        for (uhb uhbVar : this.d.c()) {
            aopa createBuilder2 = aolj.a.createBuilder();
            String str6 = uhbVar.a;
            createBuilder2.copyOnWrite();
            aolj aoljVar = (aolj) createBuilder2.instance;
            str6.getClass();
            aoljVar.b |= 1;
            aoljVar.c = str6;
            int i3 = uhbVar.c;
            int i4 = i3 - 1;
            uft uftVar = uft.FILTER_ALL;
            if (i3 == 0) {
                throw null;
            }
            int i5 = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? 1 : 2 : 5 : 4 : 3;
            createBuilder2.copyOnWrite();
            aolj aoljVar2 = (aolj) createBuilder2.instance;
            aoljVar2.e = i5 - 1;
            aoljVar2.b |= 4;
            if (!TextUtils.isEmpty(uhbVar.b)) {
                String str7 = uhbVar.b;
                createBuilder2.copyOnWrite();
                aolj aoljVar3 = (aolj) createBuilder2.instance;
                str7.getClass();
                aoljVar3.b |= 2;
                aoljVar3.d = str7;
            }
            aolj aoljVar4 = (aolj) createBuilder2.mo39build();
            createBuilder.copyOnWrite();
            aoll aollVar11 = (aoll) createBuilder.instance;
            aoljVar4.getClass();
            aopu aopuVar = aollVar11.m;
            if (!aopuVar.c()) {
                aollVar11.m = aopi.mutableCopy(aopuVar);
            }
            aollVar11.m.add(aoljVar4);
        }
        for (uhd uhdVar : this.d.b()) {
            aopa createBuilder3 = aolk.a.createBuilder();
            String str8 = uhdVar.a;
            createBuilder3.copyOnWrite();
            aolk aolkVar = (aolk) createBuilder3.instance;
            str8.getClass();
            aolkVar.b |= 1;
            aolkVar.c = str8;
            int i6 = true != uhdVar.b ? 2 : 3;
            createBuilder3.copyOnWrite();
            aolk aolkVar2 = (aolk) createBuilder3.instance;
            aolkVar2.d = i6 - 1;
            aolkVar2.b |= 2;
            aolk aolkVar3 = (aolk) createBuilder3.mo39build();
            createBuilder.copyOnWrite();
            aoll aollVar12 = (aoll) createBuilder.instance;
            aolkVar3.getClass();
            aopu aopuVar2 = aollVar12.n;
            if (!aopuVar2.c()) {
                aollVar12.n = aopi.mutableCopy(aopuVar2);
            }
            aollVar12.n.add(aolkVar3);
        }
        if (true == fq.a(this.b).g()) {
            i2 = 2;
        }
        createBuilder.copyOnWrite();
        aoll aollVar13 = (aoll) createBuilder.instance;
        aollVar13.o = i2 - 1;
        aollVar13.b |= 1024;
        String d = d();
        if (!TextUtils.isEmpty(d)) {
            createBuilder.copyOnWrite();
            aoll aollVar14 = (aoll) createBuilder.instance;
            d.getClass();
            aollVar14.b |= 2048;
            aollVar14.p = d;
        }
        Set<aoiq> set = (Set) ((axov) this.e.a).a;
        if (set.isEmpty()) {
            aomgVar = aomg.a;
        } else {
            ArrayList<Integer> arrayList = new ArrayList(set.size());
            for (aoiq aoiqVar : set) {
                arrayList.add(Integer.valueOf(aoiqVar.f));
            }
            aopa createBuilder4 = aomg.a.createBuilder();
            int i7 = 1;
            for (Integer num2 : arrayList) {
                i7 = Math.max((num2.intValue() / 64) + 1, i7);
            }
            ArrayList arrayList2 = new ArrayList(i7);
            arrayList2.addAll(Collections.nCopies(i7, 0L));
            for (Integer num3 : arrayList) {
                int intValue = num3.intValue();
                int i8 = intValue / 64;
                arrayList2.set(i8, Long.valueOf((1 << (intValue % 64)) | ((Long) arrayList2.get(i8)).longValue()));
            }
            createBuilder4.copyOnWrite();
            aomg aomgVar2 = (aomg) createBuilder4.instance;
            aopt aoptVar = aomgVar2.b;
            if (!aoptVar.c()) {
                aomgVar2.b = aopi.mutableCopy(aoptVar);
            }
            aonk.addAll((Iterable) arrayList2, (List) aomgVar2.b);
            aomgVar = (aomg) createBuilder4.mo39build();
        }
        createBuilder.copyOnWrite();
        aoll aollVar15 = (aoll) createBuilder.instance;
        aomgVar.getClass();
        aollVar15.q = aomgVar;
        aollVar15.b |= 4096;
        ufx ufxVar = this.e;
        aopa createBuilder5 = aomm.a.createBuilder();
        if (axqk.f()) {
            aopa createBuilder6 = aoml.a.createBuilder();
            createBuilder6.copyOnWrite();
            aoml aomlVar = (aoml) createBuilder6.instance;
            aomlVar.b = 2 | aomlVar.b;
            aomlVar.d = true;
            createBuilder5.copyOnWrite();
            aomm aommVar = (aomm) createBuilder5.instance;
            aoml aomlVar2 = (aoml) createBuilder6.mo39build();
            aomlVar2.getClass();
            aommVar.c = aomlVar2;
            aommVar.b |= 1;
        }
        for (aomm aommVar2 : (Set) ufxVar.b.get()) {
            createBuilder5.mergeFrom((aopi) aommVar2);
        }
        aomm aommVar3 = (aomm) createBuilder5.mo39build();
        createBuilder.copyOnWrite();
        aoll aollVar16 = (aoll) createBuilder.instance;
        aommVar3.getClass();
        aollVar16.r = aommVar3;
        aollVar16.b |= 8192;
        aopa createBuilder7 = aolm.a.createBuilder();
        String e = e();
        createBuilder7.copyOnWrite();
        aolm aolmVar = (aolm) createBuilder7.instance;
        e.getClass();
        aolmVar.b = 1 | aolmVar.b;
        aolmVar.c = e;
        String id = TimeZone.getDefault().getID();
        createBuilder7.copyOnWrite();
        aolm aolmVar2 = (aolm) createBuilder7.instance;
        id.getClass();
        aolmVar2.b |= 8;
        aolmVar2.d = id;
        aoll aollVar17 = (aoll) createBuilder.mo39build();
        createBuilder7.copyOnWrite();
        aolm aolmVar3 = (aolm) createBuilder7.instance;
        aollVar17.getClass();
        aolmVar3.e = aollVar17;
        aolmVar3.b |= 32;
        return (aolm) createBuilder7.mo39build();
    }

    private final String e() {
        if (!uid.c()) {
            return this.b.getResources().getConfiguration().locale.toLanguageTag();
        }
        return this.b.getResources().getConfiguration().getLocales().get(0).toLanguageTag();
    }
}
