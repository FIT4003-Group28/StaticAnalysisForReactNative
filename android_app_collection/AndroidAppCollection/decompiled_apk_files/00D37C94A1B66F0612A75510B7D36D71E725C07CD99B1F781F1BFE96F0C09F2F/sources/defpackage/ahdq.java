package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahdq */
/* loaded from: classes.dex */
public final class ahdq {
    public static String a(long j) {
        if (j < 0) {
            return "";
        }
        long j2 = j / 3600;
        long j3 = j - (3600 * j2);
        long j4 = j3 / 60;
        long j5 = j3 - (60 * j4);
        StringBuilder sb = new StringBuilder();
        if (j2 > 0) {
            sb.append(j2);
            sb.append(":");
            if (j4 < 10) {
                sb.append('0');
            }
        }
        sb.append(j4);
        sb.append(":");
        if (j5 < 10) {
            sb.append('0');
        }
        sb.append(j5);
        return sb.toString();
    }

    public static /* synthetic */ int b(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        return i >= i2 ? 1 : -1;
    }

    public static aryn c(aryp arypVar, String str) {
        if (arypVar == null) {
            return null;
        }
        for (aryq aryqVar : arypVar.c) {
            aryn arynVar = aryqVar.b;
            if (arynVar == null) {
                arynVar = aryn.a;
            }
            if (arynVar.b.equals(str)) {
                aryn arynVar2 = aryqVar.b;
                return arynVar2 == null ? aryn.a : arynVar2;
            }
        }
        return null;
    }

    public static atrp d(arys arysVar, String str) {
        for (atrq atrqVar : arysVar.d) {
            atrp atrpVar = atrqVar.b;
            if (atrpVar == null) {
                atrpVar = atrp.a;
            }
            if (atrpVar.c.equals(str)) {
                atrp atrpVar2 = atrqVar.b;
                return atrpVar2 == null ? atrp.a : atrpVar2;
            }
        }
        return null;
    }

    public static avhn e(avhn avhnVar, List list) {
        aalc aalcVar = new aalc(avhnVar);
        HashSet<aalb> hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aalb c = aalcVar.c(((Integer) it.next()).intValue());
            if (c != null) {
                hashSet.add(c);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (aalb aalbVar : hashSet) {
            aopa createBuilder = avhm.a.createBuilder();
            int i = aalbVar.a;
            createBuilder.copyOnWrite();
            avhm avhmVar = (avhm) createBuilder.instance;
            avhmVar.b |= 2;
            avhmVar.d = i;
            int i2 = aalbVar.b;
            createBuilder.copyOnWrite();
            avhm avhmVar2 = (avhm) createBuilder.instance;
            avhmVar2.b |= 4;
            avhmVar2.e = i2;
            String uri = aalbVar.a().toString();
            createBuilder.copyOnWrite();
            avhm avhmVar3 = (avhm) createBuilder.instance;
            uri.getClass();
            avhmVar3.b |= 1;
            avhmVar3.c = uri;
            arrayList.add((avhm) createBuilder.mo39build());
        }
        Collections.sort(arrayList, utr.p);
        aopc aopcVar = (aopc) avhn.a.createBuilder();
        aopcVar.copyOnWrite();
        avhn avhnVar2 = (avhn) aopcVar.instance;
        avhnVar2.a();
        aonk.addAll((Iterable) arrayList, (List) avhnVar2.c);
        return (avhn) aopcVar.mo39build();
    }

    public static void f(attp attpVar, acti actiVar, String str, String str2, attl attlVar, boolean z, agqn agqnVar, atpx atpxVar) {
        if (actiVar == null) {
            return;
        }
        aqxo.p(TextUtils.isEmpty(str) != TextUtils.isEmpty(str2));
        aopa createBuilder = asjj.a.createBuilder();
        aopa createBuilder2 = asjn.a.createBuilder();
        createBuilder2.copyOnWrite();
        asjn asjnVar = (asjn) createBuilder2.instance;
        asjnVar.c = attlVar.k;
        asjnVar.b |= 1;
        createBuilder2.copyOnWrite();
        asjn asjnVar2 = (asjn) createBuilder2.instance;
        asjnVar2.b |= 2;
        asjnVar2.d = z;
        agqn agqnVar2 = agqn.OFFLINE_IMMEDIATELY;
        if (agqnVar.ordinal() == 0) {
            createBuilder2.copyOnWrite();
            asjn asjnVar3 = (asjn) createBuilder2.instance;
            asjnVar3.e = 1;
            asjnVar3.b |= 4;
        } else {
            createBuilder2.copyOnWrite();
            asjn asjnVar4 = (asjn) createBuilder2.instance;
            asjnVar4.e = 0;
            asjnVar4.b |= 4;
        }
        if (!TextUtils.isEmpty(str)) {
            createBuilder2.copyOnWrite();
            asjn asjnVar5 = (asjn) createBuilder2.instance;
            asjnVar5.f = 1;
            asjnVar5.b |= 8;
            createBuilder2.copyOnWrite();
            asjn asjnVar6 = (asjn) createBuilder2.instance;
            str.getClass();
            asjnVar6.b |= 16;
            asjnVar6.g = str;
        } else if (!TextUtils.isEmpty(str2)) {
            createBuilder2.copyOnWrite();
            asjn asjnVar7 = (asjn) createBuilder2.instance;
            asjnVar7.f = 2;
            asjnVar7.b |= 8;
            createBuilder2.copyOnWrite();
            asjn asjnVar8 = (asjn) createBuilder2.instance;
            str2.getClass();
            asjnVar8.b |= 16;
            asjnVar8.g = str2;
        }
        if (atpxVar != null) {
            createBuilder2.copyOnWrite();
            asjn asjnVar9 = (asjn) createBuilder2.instance;
            asjnVar9.h = atpxVar.f;
            asjnVar9.b |= 32;
        }
        createBuilder.copyOnWrite();
        asjj asjjVar = (asjj) createBuilder.instance;
        asjn asjnVar10 = (asjn) createBuilder2.mo39build();
        asjnVar10.getClass();
        asjjVar.h = asjnVar10;
        asjjVar.b |= 16;
        if ((attpVar.b & 128) == 0 || attpVar.i.d() <= 0) {
            if (true == TextUtils.isEmpty(str)) {
                str = str2;
            }
            actiVar.H(3, acun.a(actiVar.g(str, actj.OFFLINEABILITY_RENDERER)), (asjj) createBuilder.mo39build());
            return;
        }
        actiVar.H(3, new acte(attpVar.i), (asjj) createBuilder.mo39build());
    }

    public static void g(attp attpVar, acti actiVar) {
        actiVar.u(new acte(attpVar.i), null);
    }

    public static /* synthetic */ String h(int i) {
        switch (i) {
            case 1:
                return "ad";
            case 2:
                return "crash";
            case 3:
                return "creator";
            case 4:
                return "embeddedplayer";
            case 5:
                return "innertube";
            case 6:
                return "media";
            case 7:
                return "notification";
            case 8:
                return "onesie";
            case 9:
                return "upload";
            case 10:
                return "player";
            case 11:
                return "payment";
            case 12:
                return "logging";
            case 13:
                return "music";
            case 14:
                return "kids";
            case 15:
                return "reactr";
            case 16:
                return "imagemanager";
            case 17:
                return "unplugged";
            case 18:
                return "initialization";
            case 19:
                return "streamingstats";
            case 20:
                return "lite";
            case 21:
                return "mdx";
            case 22:
                return "offlinep2p";
            case 23:
                return "elements";
            case 24:
                return "reels";
            case 25:
                return "main";
            case 26:
                return "location";
            case 27:
                return "system_health";
            case 28:
                return "offline";
            case 29:
                return "livecreation";
            case 30:
                return "entities";
            case 31:
                return "livechat";
            case 32:
                return "youtube_assistant";
            case 33:
                return "youtube_suggest";
            case 34:
                return "account";
            default:
                return "channel";
        }
    }

    public static String i(afuq afuqVar, afvn afvnVar) {
        String str = afuqVar.a;
        return (!TextUtils.isEmpty(str) || afvnVar.c().g() || afuqVar.b) ? str : afvnVar.g();
    }

    public static ayoi j(tdb tdbVar, String str) {
        return tdbVar.a(str).I(zwb.i).ag(1L).V(aaku.g).J(aaku.h);
    }

    public static String k(long j, Context context) {
        return DateUtils.formatDateTime(context, j, 65557);
    }
}
