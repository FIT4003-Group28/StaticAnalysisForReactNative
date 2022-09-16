package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.messaging.lighter.model.ContactId;
/* compiled from: PG */
/* renamed from: cufj  reason: default package */
/* loaded from: classes5.dex */
public abstract class cufj {
    public static cufi n() {
        cucz cuczVar = new cucz();
        cuczVar.h(false);
        cuczVar.j(dcdc.e());
        cuczVar.m(dcdc.e());
        cuczVar.l(0L);
        return cuczVar;
    }

    public abstract ContactId a();

    public abstract dbsg<String> b();

    public abstract dbsg<String> c();

    public abstract dbsg<String> d();

    public abstract dbsg<Bitmap> e();

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof cufj) {
            cufj cufjVar = (cufj) obj;
            if (a().equals(cufjVar.a()) && g().equals(cufjVar.g()) && d().equals(cufjVar.d()) && b().equals(cufjVar.b()) && f() == cufjVar.f() && k().equals(cufjVar.k()) && l().equals(cufjVar.l())) {
                return true;
            }
        }
        return false;
    }

    public abstract boolean f();

    public abstract Long g();

    public abstract dcdc<cugf> h();

    public final int hashCode() {
        int i = 1231;
        int i2 = 1237;
        int hashCode = (((((((a().hashCode() + 527) * 31) + d().hashCode()) * 31) + (true != e().a() ? 1237 : 1231)) * 31) + b().hashCode()) * 31;
        if (true != f()) {
            i = 1237;
        }
        int hashCode2 = (((hashCode + i) * 31) + g().hashCode()) * 31;
        if (k().a()) {
            i2 = k().b().hashCode();
        }
        return ((hashCode2 + i2) * 31) + l().hashCode();
    }

    public abstract dcdc<cugf> i();

    public abstract dbsg<cufx> j();

    public abstract dbsg<cugh> k();

    public abstract Long l();

    public abstract cufi m();
}
