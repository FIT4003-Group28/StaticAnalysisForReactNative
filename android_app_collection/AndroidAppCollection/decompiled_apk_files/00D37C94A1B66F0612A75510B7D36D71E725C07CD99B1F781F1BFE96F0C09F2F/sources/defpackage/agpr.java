package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: agpr  reason: default package */
/* loaded from: classes.dex */
public final class agpr {
    public static int a(int i) {
        int i2 = (i & 8) != 0 ? 2 : 0;
        if ((i & 2) != 0) {
            i2 |= 8;
        }
        if ((i & 4) != 0) {
            i2 |= 16;
        }
        if ((i & 384) != 0) {
            i2 |= 64;
        }
        return (i & 4096) != 0 ? i2 | 256 : i2;
    }

    public static boolean b(agpw agpwVar) {
        int f = agxg.f(agpwVar);
        return (f == 3 || f == 4) && !TextUtils.isEmpty(agxg.t(agpwVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static aopa c(agqz agqzVar) {
        aopa createBuilder = atsj.a.createBuilder();
        long j = agqzVar.d;
        createBuilder.copyOnWrite();
        atsj atsjVar = (atsj) createBuilder.instance;
        atsjVar.b |= 256;
        atsjVar.k = j / 1024;
        long j2 = agqzVar.e;
        createBuilder.copyOnWrite();
        atsj atsjVar2 = (atsj) createBuilder.instance;
        atsjVar2.b |= 1024;
        atsjVar2.m = j2 / 1024;
        int i = 3;
        boolean z = agxg.f(agqzVar.f) == 3;
        createBuilder.copyOnWrite();
        atsj atsjVar3 = (atsj) createBuilder.instance;
        atsjVar3.b |= 32768;
        atsjVar3.q = z;
        boolean ab = agxg.ab(agqzVar.f);
        createBuilder.copyOnWrite();
        atsj atsjVar4 = (atsj) createBuilder.instance;
        atsjVar4.b |= 33554432;
        atsjVar4.w = ab;
        attl b = ahdp.b(agxg.d(agqzVar.f));
        createBuilder.copyOnWrite();
        atsj atsjVar5 = (atsj) createBuilder.instance;
        atsjVar5.t = b.k;
        atsjVar5.b |= 1048576;
        int am = agxg.am(agqzVar.f);
        createBuilder.copyOnWrite();
        atsj atsjVar6 = (atsj) createBuilder.instance;
        int i2 = am - 1;
        if (am == 0) {
            throw null;
        }
        atsjVar6.u = i2;
        atsjVar6.b |= 2097152;
        int i3 = true != agxg.af(agqzVar.f) ? 2 : 3;
        createBuilder.copyOnWrite();
        atsj atsjVar7 = (atsj) createBuilder.instance;
        atsjVar7.r = i3 - 1;
        atsjVar7.b |= 65536;
        switch (agxg.f(agqzVar.f)) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 8;
                break;
            default:
                zep.b("Unrecognized offline transfer type, defaulting to unknown.");
                i = 1;
                break;
        }
        createBuilder.copyOnWrite();
        atsj atsjVar8 = (atsj) createBuilder.instance;
        atsjVar8.x = i - 1;
        atsjVar8.c |= 2;
        String t = agxg.t(agqzVar.f);
        createBuilder.copyOnWrite();
        atsj atsjVar9 = (atsj) createBuilder.instance;
        atsjVar9.b = 1 | atsjVar9.b;
        atsjVar9.d = t;
        String s = agxg.s(agqzVar.f);
        if (s != null) {
            createBuilder.copyOnWrite();
            atsj atsjVar10 = (atsj) createBuilder.instance;
            atsjVar10.b |= 2;
            atsjVar10.e = s;
        }
        String q = agxg.q(agqzVar.f);
        if (q != null) {
            createBuilder.copyOnWrite();
            atsj atsjVar11 = (atsj) createBuilder.instance;
            atsjVar11.b |= 4;
            atsjVar11.f = q;
        }
        String o = agxg.o(agqzVar.f);
        if (o != null) {
            createBuilder.copyOnWrite();
            atsj atsjVar12 = (atsj) createBuilder.instance;
            atsjVar12.b |= 524288;
            atsjVar12.s = o;
        }
        byte[] ak = agxg.ak(agqzVar.f);
        if (ak != null) {
            aoob x = aoob.x(ak);
            createBuilder.copyOnWrite();
            atsj atsjVar13 = (atsj) createBuilder.instance;
            atsjVar13.c |= 32;
            atsjVar13.z = x;
        }
        return createBuilder;
    }

    public static final PlayerResponseModel d(Cursor cursor, int i) {
        PlayerResponseModel j;
        if (!cursor.isNull(i) && (j = PlayerResponseModel.j(cursor.getBlob(i), 0L)) != null) {
            return j;
        }
        return null;
    }

    public static Collection e(List list, List list2) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            agqo agqoVar = (agqo) it.next();
            hashMap.put(agqoVar.f(), agqoVar);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            hashMap.remove(((agqo) it2.next()).f());
        }
        return hashMap.values();
    }

    public static final agqq f(Cursor cursor, int i, int i2, int i3) {
        return new agqq(cursor.getString(i), cursor.getInt(i2), cursor.getInt(i3));
    }

    public static final List g(Cursor cursor, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            arrayList.add(f(cursor, i, i2, i3));
        }
        return arrayList;
    }

    public static afky h(FormatStreamModel formatStreamModel) {
        return i(formatStreamModel.e());
    }

    public static afky i(int i) {
        Set r = aank.r();
        Integer valueOf = Integer.valueOf(i);
        if (!r.contains(valueOf) || aank.q().contains(valueOf)) {
            return afky.NO_FALLBACK;
        }
        if (aank.h().contains(valueOf)) {
            return afky.DRM;
        }
        if (aank.n().contains(valueOf)) {
            return afky.VP9;
        }
        if (aank.m().contains(valueOf)) {
            return afky.H264;
        }
        return afky.NO_FALLBACK;
    }

    public static int k(boolean z, int i) {
        if (z) {
            return 0;
        }
        return i;
    }

    public static int l(boolean z, int i) {
        if (z) {
            return i;
        }
        return 0;
    }

    public static String m(boolean z) {
        return true != z ? "0" : "1";
    }

    public static String n(String str) {
        return str != null ? str.replaceAll("[&:,]", "_") : "";
    }

    public static boolean o(int i, int i2) {
        return (i & i2) > 0;
    }

    public static String p(int i) {
        if (i != 1) {
            if (i == 2) {
                return "m";
            }
            if (i == 3) {
                return "a";
            }
            switch (i) {
                case 10000:
                    return "s";
                case 10001:
                    return "r";
                case 10002:
                    return "v";
                case 10003:
                    return "c";
                default:
                    return null;
            }
        }
        return "i";
    }

    public static boolean q(int i) {
        if (i != 1 && i != 2 && i != 3) {
            switch (i) {
                case 10000:
                case 10001:
                case 10002:
                case 10003:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final synchronized void j() {
    }
}
