package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cufp  reason: default package */
/* loaded from: classes5.dex */
public abstract class cufp {
    public static cufo o() {
        cudc cudcVar = new cudc();
        cudcVar.i(false);
        cudcVar.d(dcdc.f(200));
        cudcVar.j(-1L);
        cudcVar.a = 0L;
        cudcVar.b(new HashMap());
        cudcVar.k(0L);
        return cudcVar;
    }

    public abstract ConversationId a();

    public abstract dbsg<String> b();

    public abstract dbsg<String> c();

    public abstract dbsg<Bitmap> d();

    public abstract boolean e();

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof cufp) {
            final cufp cufpVar = (cufp) obj;
            if (a().equals(cufpVar.a()) && b().equals(cufpVar.b()) && c().equals(cufpVar.c()) && d().a() == cufpVar.d().a() && ((!d().a() || !cufpVar.d().a() || d().b().sameAs(cufpVar.d().b())) && e() == cufpVar.e() && f().equals(cufpVar.f()) && h() == cufpVar.h() && i().keySet().equals(cufpVar.i().keySet()) && j().equals(cufpVar.j()) && dcbg.b(i().keySet()).q(new dbsl(this, cufpVar) { // from class: cufn
                private final cufp a;
                private final cufp b;

                {
                    this.a = this;
                    this.b = cufpVar;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj2) {
                    String str = (String) obj2;
                    return Arrays.equals(this.a.i().get(str), this.b.i().get(str));
                }
            }) && dchl.m(k(), cufpVar.k()) && l().equals(cufpVar.l()) && m().equals(cufpVar.m()))) {
                return true;
            }
        }
        return false;
    }

    public abstract Long f();

    public abstract Long g();

    public abstract boolean h();

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((a().hashCode() + 527) * 31) + b().hashCode()) * 31) + c().hashCode()) * 31) + (true != d().a() ? 1237 : 1231)) * 31) + (true != e() ? 1237 : 1231)) * 31) + f().hashCode()) * 31;
        if (true == h()) {
            i = 1231;
        }
        int hashCode2 = ((((hashCode + i) * 31) + i().keySet().hashCode()) * 31) + j().hashCode();
        for (byte[] bArr : i().values()) {
            hashCode2 = (hashCode2 * 31) + Arrays.hashCode(bArr);
        }
        return (((((hashCode2 * 31) + k().hashCode()) * 31) + l().hashCode()) * 31) + m().hashCode();
    }

    public abstract Map<String, byte[]> i();

    public abstract dbsg<cuib> j();

    public abstract dcdc<Integer> k();

    public abstract Long l();

    public abstract Long m();

    public abstract cufo n();
}
