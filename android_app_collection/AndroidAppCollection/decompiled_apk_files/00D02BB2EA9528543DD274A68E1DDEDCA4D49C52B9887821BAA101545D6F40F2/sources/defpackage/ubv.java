package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ubv  reason: default package */
/* loaded from: classes7.dex */
public class ubv implements ubo {
    public final cqhn a;
    public final Activity b;
    public final HashMap<amve, ual> c = new HashMap<>();
    public dcdc<ual> d;
    public dcdc<ual> e;
    public tlv f;
    public final tuo g;
    public String h;
    @dzsi
    public String i;
    public boolean j;
    private final trs k;

    public ubv(Activity activity, cqhn cqhnVar, trs trsVar, tuo tuoVar, tlv tlvVar, boolean z) {
        this.j = false;
        this.a = cqhnVar;
        this.b = activity;
        this.k = trsVar;
        this.g = tuoVar;
        this.f = tlvVar;
        this.j = z;
        dccx F = dcdc.F();
        dcdc<amve> l = tlvVar.l();
        int size = l.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            amve amveVar = l.get(i);
            dbsg<ual> a = tuoVar.a(tlvVar, amveVar, z2 && z);
            if (a.a()) {
                F.g(a.b());
                this.c.put(amveVar, a.b());
                z2 = false;
            }
        }
        dcdc<ual> f = F.f();
        this.d = f;
        this.e = f.subList(0, tlvVar.n());
        this.h = tlvVar.y(activity);
        this.i = i(activity.getResources(), tlvVar);
    }

    @dzsi
    public static String i(Resources resources, tlv tlvVar) {
        if (!tlvVar.f().d() || !tlvVar.q() || !tlvVar.f().e()) {
            if (tlvVar.f().c()) {
                return resources.getString(ssv.GROUP_JUSTIFICATION_TITLE_EXTERNAL_LINK);
            }
            if (!tlvVar.f().d() || !tlvVar.q()) {
                if (tlvVar.f().e()) {
                    return resources.getString(ssv.GROUP_JUSTIFICATION_TITLE_EXPLICITLY_PREFERRED);
                }
                if (!tlvVar.f().f()) {
                    return null;
                }
                return resources.getString(ssv.GROUP_JUSTIFICATION_TITLE_IMPLICITLY_PREFERRED);
            }
            return resources.getString(ssv.GROUP_JUSTIFICATION_TITLE_FASTEST);
        }
        return resources.getString(ssv.GROUP_JUSTIFICATION_TITLE_RECOMMENDED);
    }

    @Override // defpackage.ubo
    public String a() {
        return this.h;
    }

    @Override // defpackage.ubo
    @dzsi
    public String b() {
        return this.i;
    }

    @Override // defpackage.ubo
    public dcdc<cqix<?>> c() {
        if (this.k.a(this.f)) {
            return tuo.b(this.d);
        }
        return tuo.b(this.e);
    }

    @Override // defpackage.ubo
    public Boolean d() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.ubo
    public Boolean e() {
        return Boolean.valueOf(this.f.r());
    }

    @Override // defpackage.ubo
    public String f() {
        if (this.k.a(this.f)) {
            return this.b.getString(ssv.SHOW_LESS_ITEMS_LIST_BUTTON);
        }
        return this.b.getString(ssv.SHOW_MORE_ITEMS_LIST_BUTTON);
    }

    @Override // defpackage.ubo
    @dzsi
    public cjtd g() {
        ddho ddhoVar;
        if (this.f.f().a() != tlx.TRAVEL_MODE) {
            return null;
        }
        dbsg<amve> p = this.f.p();
        if (!p.a()) {
            return null;
        }
        dqvj dqvjVar = dqvj.DRIVE;
        dqvj c = dqvj.c(p.b().b().b);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        int ordinal = c.ordinal();
        if (ordinal == 3) {
            ddhoVar = dtxn.dN;
        } else if (ordinal != 7) {
            return null;
        } else {
            ddhoVar = dtxn.dB;
        }
        return cjtd.a(ddhoVar);
    }

    @Override // defpackage.ubo
    public cqkl h() {
        if (e().booleanValue()) {
            trs trsVar = this.k;
            tlv tlvVar = this.f;
            trsVar.a.put(tlvVar.e(), Boolean.valueOf(!trsVar.a(tlvVar)));
            cqkx.p(this);
        }
        return cqkl.a;
    }
}
