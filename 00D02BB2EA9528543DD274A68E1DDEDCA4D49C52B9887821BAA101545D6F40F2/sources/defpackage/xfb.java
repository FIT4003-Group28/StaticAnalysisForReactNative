package defpackage;

import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
import com.google.commerce.tapandpay.android.seclient.GetSeCardBalanceResponse;
/* compiled from: PG */
/* renamed from: xfb  reason: default package */
/* loaded from: classes7.dex */
public final class xfb {
    public static final xfb a = new xfb(dice.m);
    public final dice b;
    @dzsi
    public GetAllCardsResponse c;
    @dzsi
    public GetSeCardBalanceResponse d;

    public xfb(dice diceVar) {
        this.b = diceVar;
    }

    public final boolean a() {
        int a2 = dicb.a(this.b.g);
        if (a2 == 0) {
            a2 = 1;
        }
        return a2 == 2 || a2 == 3 || this.c != null;
    }

    @dzsi
    public final String b() {
        GetSeCardBalanceResponse getSeCardBalanceResponse = this.d;
        if (getSeCardBalanceResponse != null) {
            int i = getSeCardBalanceResponse.b;
            if (i != 1 && i != 2) {
                return null;
            }
            return vxc.d(getSeCardBalanceResponse.a, "JPY", true);
        }
        return null;
    }

    public final boolean c() {
        return this.b.k.size() > 0;
    }

    public final boolean d() {
        if (a()) {
            if (e()) {
                return true;
            }
            dice diceVar = this.b;
            if (!dbsj.d(diceVar != null ? diceVar.c : null)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        return ((this.b.a & 128) == 0 || this.c == null) ? false : true;
    }

    public final boolean f() {
        return this.d != null;
    }

    public final boolean g(xfb xfbVar) {
        if (e()) {
            return xfbVar.e();
        }
        String str = this.b.f;
        return !str.isEmpty() && str.equals(xfbVar.b.f);
    }

    public final int h() {
        int a2 = dicb.a(this.b.g);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
