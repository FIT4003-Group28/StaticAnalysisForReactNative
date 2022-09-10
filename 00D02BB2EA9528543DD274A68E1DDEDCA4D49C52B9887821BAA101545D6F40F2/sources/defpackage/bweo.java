package defpackage;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bweo  reason: default package */
/* loaded from: classes4.dex */
public abstract class bweo implements Serializable {
    @dzsi
    public String a;
    public final List<bwen> b;

    public bweo() {
        this.b = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dqhg g(String str) {
        dqhe bZ = dqhg.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqhg dqhgVar = (dqhg) bZ.b;
        str.getClass();
        dqhgVar.b = 2;
        dqhgVar.c = str;
        dqhgVar.a |= 32;
        dqhgVar.f = false;
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dqhg h(drrp drrpVar, String str) {
        dqhe bZ = dqhg.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqhg dqhgVar = (dqhg) bZ.b;
        drrpVar.getClass();
        dqhgVar.c = drrpVar;
        dqhgVar.b = 1;
        str.getClass();
        int i = dqhgVar.a | 16;
        dqhgVar.a = i;
        dqhgVar.e = str;
        dqhgVar.a = i | 32;
        dqhgVar.f = false;
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String k(@dzsi String str, @dzsi String str2, Iterable<bwen> iterable, @dzsi String str3) {
        StringBuilder sb = new StringBuilder();
        if (!dbsj.d(str)) {
            sb.append(str);
            sb.append('\n');
        }
        if (!dbsj.d(str2)) {
            sb.append(str2);
            sb.append('\n');
        }
        for (bwen bwenVar : iterable) {
            String bwenVar2 = bwenVar.toString();
            if (!dbsj.d(bwenVar2)) {
                sb.append(bwenVar2);
                sb.append("\n\n");
            }
        }
        if (!dbsj.d(str3)) {
            sb.append(str3);
        }
        String trim = sb.toString().trim();
        return trim.equals(str) ? trim.concat("\n") : trim;
    }

    @dzsi
    public abstract String a(Context context, @dzsi bwfq bwfqVar);

    @dzsi
    public abstract String b(Context context, @dzsi bwfq bwfqVar);

    public boolean c() {
        return true;
    }

    public int d() {
        throw null;
    }

    public int e() {
        return 4;
    }

    public dhrt f() {
        dhrr bZ = dhrt.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhrt dhrtVar = (dhrt) bZ.b;
        dhrtVar.b = 0;
        dhrtVar.a |= 1;
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String i(String str) {
        String str2 = this.a;
        if (dbsj.d(str2) || dbsj.d(str)) {
            return !dbsj.d(str2) ? str2 : str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("\n\n");
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String j(@dzsi String str, @dzsi String str2) {
        return k(str, str2, this.b, this.a);
    }

    public final bwen l() {
        boolean z = true;
        if (this.b.size() != 1) {
            z = false;
        }
        dbsk.a(z);
        return this.b.get(0);
    }

    public final boolean m() {
        for (bwen bwenVar : this.b) {
            if (bwenVar.g()) {
                return false;
            }
        }
        return true;
    }

    public bweo(dqhg dqhgVar) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new bwen(dqhgVar));
    }

    public bweo(List<dqhg> list) {
        ArrayList arrayList = new ArrayList();
        for (dqhg dqhgVar : list) {
            arrayList.add(new bwen(dqhgVar));
        }
        this.b = arrayList;
    }
}
