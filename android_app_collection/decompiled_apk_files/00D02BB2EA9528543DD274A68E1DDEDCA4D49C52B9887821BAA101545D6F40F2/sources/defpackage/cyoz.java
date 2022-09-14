package defpackage;

import com.google.android.libraries.social.populous.logging.LogEntity;
import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: cyoz  reason: default package */
/* loaded from: classes5.dex */
public abstract class cyoz {
    public abstract EnumSet<cygl> a();

    public abstract EnumSet<cygl> b();

    public abstract String c();

    public abstract LogEntity d();

    public abstract void e(boolean z);

    public abstract void f(Integer num);

    public abstract void g(int i);

    public abstract void h(int i);

    public abstract void i(String str);

    public abstract void j(boolean z);

    public abstract void k(boolean z);

    public abstract void l(boolean z);

    public abstract void m(boolean z);

    public abstract void n(int i);

    public abstract void o(int i);

    public abstract void p(String str);

    public abstract void q(EnumSet<cygl> enumSet);

    public abstract void r(EnumSet<cygl> enumSet);

    public final LogEntity s() {
        LogEntity.x(this);
        return d();
    }

    public final void t(cygl cyglVar) {
        a().add(cyglVar);
    }

    public final void u(cygl cyglVar) {
        b().add(cyglVar);
    }
}
