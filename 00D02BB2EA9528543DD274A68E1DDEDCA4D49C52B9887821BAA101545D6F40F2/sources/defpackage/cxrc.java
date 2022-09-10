package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cxrc  reason: default package */
/* loaded from: classes5.dex */
public final class cxrc {
    public static boolean a(Channel channel, Channel channel2) {
        if (channel.d() != channel2.d()) {
            return false;
        }
        String c = channel.c();
        String c2 = channel2.c();
        if (channel.d() == 1 || channel.d() == 5) {
            c = cxqz.e(c);
            c2 = cxqz.e(c2);
        }
        return TextUtils.equals(c, c2);
    }

    public static int b(Channel channel) {
        String c = channel.c();
        if (channel.d() == 1 || channel.d() == 5) {
            c = cxqz.e(c);
        }
        int d = channel.d();
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 13);
        sb.append(c);
        sb.append("::");
        sb.append(d);
        return sb.toString().hashCode();
    }

    public static czha c(Channel channel, Context context) {
        czgx bZ = czha.f.bZ();
        String c = channel.c();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        czha czhaVar = (czha) bZ.b;
        c.getClass();
        czhaVar.a |= 2;
        czhaVar.c = c;
        czgz d = d(channel.d());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        czha czhaVar2 = (czha) bZ.b;
        czhaVar2.b = d.h;
        czhaVar2.a |= 1;
        czgt bZ2 = czgu.l.bZ();
        if (!TextUtils.isEmpty(channel.f()) && !channel.k()) {
            String f = channel.f();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            czgu czguVar = (czgu) bZ2.b;
            f.getClass();
            czguVar.a |= 1;
            czguVar.b = f;
            if (channel.j()) {
                String f2 = channel.f();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                czgu czguVar2 = (czgu) bZ2.b;
                f2.getClass();
                czguVar2.a |= 2048;
                czguVar2.k = f2;
            }
        }
        if (!TextUtils.isEmpty(channel.g())) {
            String g = channel.g();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            czgu czguVar3 = (czgu) bZ2.b;
            g.getClass();
            czguVar3.a |= 1024;
            czguVar3.j = g;
        }
        if (!TextUtils.isEmpty(channel.n())) {
            String n = channel.n();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            czgu czguVar4 = (czgu) bZ2.b;
            n.getClass();
            czguVar4.a |= 2;
            czguVar4.c = n;
        }
        if (!TextUtils.isEmpty(channel.m())) {
            String m = channel.m();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            czgu czguVar5 = (czgu) bZ2.b;
            m.getClass();
            czguVar5.a |= 128;
            czguVar5.i = m;
        }
        if (!TextUtils.isEmpty(channel.s())) {
            String s = channel.s();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            czgu czguVar6 = (czgu) bZ2.b;
            s.getClass();
            czguVar6.a |= 4;
            czguVar6.d = s;
        }
        String f3 = cxqz.f(context);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        czgu czguVar7 = (czgu) bZ2.b;
        f3.getClass();
        czguVar7.a |= 64;
        czguVar7.h = f3;
        boolean l = channel.l();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        czgu czguVar8 = (czgu) bZ2.b;
        czguVar8.a |= 8;
        czguVar8.e = l;
        if (channel.y() && !TextUtils.isEmpty(channel.q())) {
            String q = channel.q();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            czgu czguVar9 = (czgu) bZ2.b;
            q.getClass();
            czguVar9.a |= 16;
            czguVar9.f = q;
            czgz d2 = d(channel.r());
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            czgu czguVar10 = (czgu) bZ2.b;
            czguVar10.g = d2.h;
            czguVar10.a |= 32;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        czha czhaVar3 = (czha) bZ.b;
        czgu bK = bZ2.bK();
        bK.getClass();
        czhaVar3.d = bK;
        czhaVar3.a |= 4;
        return bZ.bK();
    }

    public static int e(czgz czgzVar) {
        czgz czgzVar2 = czgz.UNKNOWN_TYPE;
        switch (czgzVar.ordinal()) {
            case 1:
                return 1;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 2;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return 0;
        }
    }

    public static String f(String str) {
        if (!TextUtils.isEmpty(str)) {
            char charAt = str.charAt(0);
            return ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) ? "" : String.valueOf(charAt).toUpperCase(Locale.getDefault());
        }
        return "";
    }

    public static List<CoalescedChannels> g(List<CoalescedChannels> list) {
        ArrayList arrayList = new ArrayList();
        for (CoalescedChannels coalescedChannels : list) {
            if (coalescedChannels.e() != 1) {
                arrayList.add(coalescedChannels);
            }
        }
        return arrayList;
    }

    public static String h(CoalescedChannels coalescedChannels, Context context) {
        String g;
        Channel channel = coalescedChannels.b().get(0);
        List<Channel> c = coalescedChannels.c();
        if (!TextUtils.isEmpty(channel.i(context))) {
            return channel.i(context);
        }
        if (coalescedChannels.a() != 1 || c.isEmpty()) {
            String str = "";
            int i = 0;
            while (i < c.size()) {
                Channel channel2 = c.get(i);
                if (TextUtils.isEmpty(channel2.g())) {
                    g = channel2.i(context);
                } else {
                    g = channel2.g();
                }
                str = i == 0 ? g : context.getString(R.string.peoplekit_group_name_builder, str, g);
                i++;
            }
            return coalescedChannels.a() > c.size() ? context.getString(R.string.peoplekit_group_name_more_members, str) : str;
        }
        return c.get(0).i(context);
    }

    public static boolean i(Channel channel, String str, String str2) {
        if (TextUtils.isEmpty(str) || !cxqz.c(str, channel.c())) {
            return !TextUtils.isEmpty(str2) && str2.equals(channel.s());
        }
        return true;
    }

    public static String j(Channel channel, Context context) {
        String f = channel.f();
        String l = l(channel, context);
        if (TextUtils.isEmpty(f)) {
            return l;
        }
        if (TextUtils.isEmpty(l)) {
            return f;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 3 + String.valueOf(l).length());
        sb.append(f);
        sb.append(" <");
        sb.append(l);
        sb.append(">");
        return sb.toString();
    }

    public static ExecutorService k() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        deip deipVar = new deip();
        deipVar.a = "AutocompleteBackground-%d";
        return cyck.a(decl.b(15L), timeUnit, deip.a(deipVar));
    }

    public static String l(Channel channel, Context context) {
        String b = channel.b(context);
        int d = channel.d();
        if (d != 3) {
            if (d == 4) {
                return cxqz.d(channel.c(), context);
            }
            return d != 5 ? b : channel.c();
        }
        String q = channel.q();
        if (TextUtils.isEmpty(q)) {
            return null;
        }
        return channel.r() == 2 ? cxqz.d(q, context) : q;
    }

    static czgz d(int i) {
        switch (i) {
            case 1:
                return czgz.EMAIL;
            case 2:
                return czgz.SMS;
            case 3:
                return czgz.IN_APP_GAIA;
            case 4:
                return czgz.IN_APP_PHONE;
            case 5:
                return czgz.IN_APP_EMAIL;
            case 6:
                return czgz.GROUP;
            default:
                return czgz.UNKNOWN_TYPE;
        }
    }
}
