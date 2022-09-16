package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: aikb  reason: default package */
/* loaded from: classes.dex */
public final class aikb extends aijj {
    public static final apzg f(String str, String str2, int i, float f) {
        return (apzg) m(str, str2, i, f, null, null).mo39build();
    }

    public static final int g(awel awelVar) {
        return ahfo.d(awelVar.e, awelVar.d);
    }

    public static final aopc m(String str, String str2, int i, float f, String str3, String str4) {
        aopa createBuilder = awel.a.createBuilder();
        if (!TextUtils.isEmpty(str)) {
            createBuilder.copyOnWrite();
            awel awelVar = (awel) createBuilder.instance;
            str.getClass();
            awelVar.b |= 1;
            awelVar.c = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            createBuilder.copyOnWrite();
            awel awelVar2 = (awel) createBuilder.instance;
            str2.getClass();
            awelVar2.b |= 2;
            awelVar2.d = str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            createBuilder.copyOnWrite();
            awel awelVar3 = (awel) createBuilder.instance;
            str3.getClass();
            awelVar3.b |= 512;
            awelVar3.k = str3;
        }
        if (!TextUtils.isEmpty(str4)) {
            createBuilder.copyOnWrite();
            awel awelVar4 = (awel) createBuilder.instance;
            str4.getClass();
            awelVar4.b |= 16;
            awelVar4.f = str4;
        }
        createBuilder.copyOnWrite();
        awel awelVar5 = (awel) createBuilder.instance;
        awelVar5.b |= 4;
        awelVar5.e = i;
        createBuilder.copyOnWrite();
        awel awelVar6 = (awel) createBuilder.instance;
        awelVar6.b |= 128;
        awelVar6.i = f;
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(WatchEndpointOuterClass.watchEndpoint, (awel) createBuilder.mo39build());
        return aopcVar;
    }

    @Override // defpackage.aijj
    public final /* bridge */ /* synthetic */ ory a(Object obj) {
        awel awelVar = (awel) obj;
        aopa createBuilder = ory.a.createBuilder();
        String str = awelVar.c;
        createBuilder.copyOnWrite();
        ory oryVar = (ory) createBuilder.instance;
        str.getClass();
        int i = 1;
        oryVar.b |= 1;
        oryVar.c = str;
        String str2 = awelVar.d;
        createBuilder.copyOnWrite();
        ory oryVar2 = (ory) createBuilder.instance;
        str2.getClass();
        oryVar2.b |= 2;
        oryVar2.e = str2;
        int g = g(awelVar);
        createBuilder.copyOnWrite();
        ory oryVar3 = (ory) createBuilder.instance;
        oryVar3.b |= 4;
        oryVar3.f = g;
        String str3 = awelVar.f;
        createBuilder.copyOnWrite();
        ory oryVar4 = (ory) createBuilder.instance;
        str3.getClass();
        oryVar4.b |= 8;
        oryVar4.g = str3;
        String str4 = awelVar.k;
        createBuilder.copyOnWrite();
        ory oryVar5 = (ory) createBuilder.instance;
        str4.getClass();
        oryVar5.b |= 512;
        oryVar5.m = str4;
        boolean z = awelVar.g;
        createBuilder.copyOnWrite();
        ory oryVar6 = (ory) createBuilder.instance;
        oryVar6.b |= 64;
        oryVar6.j = z;
        boolean z2 = awelVar.h;
        createBuilder.copyOnWrite();
        ory oryVar7 = (ory) createBuilder.instance;
        oryVar7.b |= 128;
        oryVar7.k = z2;
        createBuilder.copyOnWrite();
        ory oryVar8 = (ory) createBuilder.instance;
        oryVar8.b |= 32;
        oryVar8.i = false;
        long millis = TimeUnit.SECONDS.toMillis(awelVar.i);
        createBuilder.copyOnWrite();
        ory oryVar9 = (ory) createBuilder.instance;
        oryVar9.b |= 256;
        oryVar9.l = millis;
        if ((awelVar.b & 16384) != 0) {
            atub atubVar = awelVar.n;
            if (atubVar == null) {
                atubVar = atub.a;
            }
            if ((atubVar.b & 2) != 0) {
                atub atubVar2 = awelVar.n;
                if (atubVar2 == null) {
                    atubVar2 = atub.a;
                }
                attz attzVar = atubVar2.d;
                if (attzVar == null) {
                    attzVar = attz.a;
                }
                createBuilder.copyOnWrite();
                ory oryVar10 = (ory) createBuilder.instance;
                attzVar.getClass();
                oryVar10.s = attzVar;
                oryVar10.b |= 262144;
            }
            atub atubVar3 = awelVar.n;
            if (atubVar3 == null) {
                atubVar3 = atub.a;
            }
            if ((atubVar3.b & 1) != 0) {
                atub atubVar4 = awelVar.n;
                if (atubVar4 == null) {
                    atubVar4 = atub.a;
                }
                atty attyVar = atubVar4.c;
                if (attyVar == null) {
                    attyVar = atty.a;
                }
                createBuilder.copyOnWrite();
                ory oryVar11 = (ory) createBuilder.instance;
                attyVar.getClass();
                oryVar11.r = attyVar;
                oryVar11.b |= 65536;
            }
        }
        for (Map.Entry entry : Collections.unmodifiableMap(awelVar.q).entrySet()) {
            String str5 = (String) entry.getKey();
            String str6 = (String) entry.getValue();
            str5.getClass();
            str6.getClass();
            createBuilder.copyOnWrite();
            ory oryVar12 = (ory) createBuilder.instance;
            aoqp aoqpVar = oryVar12.x;
            if (!aoqpVar.b) {
                oryVar12.x = aoqpVar.a();
            }
            oryVar12.x.put(str5, str6);
        }
        int i2 = awelVar.b;
        if ((i2 & 67108864) != 0) {
            int ao = akel.ao(awelVar.t);
            if (ao != 0) {
                i = ao;
            }
            createBuilder.copyOnWrite();
            ory oryVar13 = (ory) createBuilder.instance;
            oryVar13.y = i - 1;
            oryVar13.b = 67108864 | oryVar13.b;
        } else if ((i2 & 16777216) != 0 && awelVar.r) {
            createBuilder.copyOnWrite();
            ory oryVar14 = (ory) createBuilder.instance;
            oryVar14.y = 2;
            oryVar14.b = 67108864 | oryVar14.b;
        }
        if ((awelVar.b & 536870912) != 0) {
            aweh awehVar = awelVar.v;
            if (awehVar == null) {
                awehVar = aweh.a;
            }
            createBuilder.copyOnWrite();
            ory oryVar15 = (ory) createBuilder.instance;
            awehVar.getClass();
            oryVar15.A = awehVar;
            oryVar15.b |= 268435456;
        }
        if ((awelVar.b & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0) {
            aoob aoobVar = awelVar.w;
            createBuilder.copyOnWrite();
            ory oryVar16 = (ory) createBuilder.instance;
            aoobVar.getClass();
            oryVar16.b = 536870912 | oryVar16.b;
            oryVar16.B = aoobVar;
        }
        return (ory) createBuilder.mo39build();
    }

    @Override // defpackage.aijm
    public final aooq b() {
        return WatchEndpointOuterClass.watchEndpoint;
    }

    @Override // defpackage.aijj
    public final /* bridge */ /* synthetic */ String c(Object obj) {
        return ((awel) obj).d;
    }

    @Override // defpackage.aijj
    public final /* bridge */ /* synthetic */ String d(Object obj) {
        return ((awel) obj).c;
    }

    @Override // defpackage.aijj
    public final /* bridge */ /* synthetic */ boolean e(Object obj, Object obj2) {
        awel awelVar = (awel) obj;
        awel awelVar2 = (awel) obj2;
        if (akzj.f(awelVar, awelVar2)) {
            return true;
        }
        String str = awelVar.d;
        int g = g(awelVar);
        String str2 = awelVar2.d;
        int g2 = g(awelVar2);
        if (!TextUtils.equals(str, str2)) {
            return false;
        }
        if (!TextUtils.equals("", str) && Math.abs(g - g2) > 1) {
            return false;
        }
        return TextUtils.equals(awelVar.c, awelVar2.c);
    }
}
