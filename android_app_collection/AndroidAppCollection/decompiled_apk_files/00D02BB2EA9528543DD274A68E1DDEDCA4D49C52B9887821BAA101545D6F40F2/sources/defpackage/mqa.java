package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.Objects;
/* compiled from: PG */
/* renamed from: mqa  reason: default package */
/* loaded from: classes7.dex */
public class mqa implements mpa {
    private final String a;
    private final String b;
    private final boolean c;
    private final Runnable d;
    @dzsi
    private final String e;

    public mqa(Context context, List<doew> list, @dzsi String str, Runnable runnable) {
        this.e = str;
        this.d = runnable;
        dcdc z = dcbg.b(list).s(mpy.a).o(mpz.a).z();
        String str2 = "";
        this.a = (String) dcft.r(z, str2);
        int size = z.size() - 1;
        this.b = size > 0 ? context.getResources().getQuantityString(R.plurals.CAR_PLACE_DETAILS_ADDITIONAL_EV_PAYMENT_METHODS_COUNT, size, Integer.valueOf(size)) : str2;
        this.c = !z.isEmpty();
    }

    @Override // defpackage.mpa
    public String a() {
        return this.a;
    }

    @Override // defpackage.mpa
    public String b() {
        return this.b;
    }

    @Override // defpackage.mpa
    public Boolean c() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.mpa
    public cjtd d() {
        cjta b = cjtd.b();
        b.g(this.e);
        b.d = this.c ? dtxm.cW : dtxm.cX;
        return b.a();
    }

    @Override // defpackage.mpa
    public cqkl e() {
        if (this.c) {
            this.d.run();
        }
        return cqkl.a;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
