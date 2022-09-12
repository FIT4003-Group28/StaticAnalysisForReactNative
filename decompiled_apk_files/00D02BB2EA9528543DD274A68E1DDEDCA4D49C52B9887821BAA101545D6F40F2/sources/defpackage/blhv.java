package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: blhv  reason: default package */
/* loaded from: classes3.dex */
public abstract class blhv {
    protected abstract String a();

    protected abstract dbsg<djck> b();

    protected abstract blhw c();

    public abstract void d(akqi akqiVar);

    public abstract void e(String str);

    public abstract void f(String str);

    protected abstract void g(String str);

    public abstract void h(boolean z);

    public abstract void i(blif blifVar);

    protected abstract void j(dbsg<djck> dbsgVar);

    public abstract void k(djck djckVar);

    public final blhw l() {
        dbsg<djck> b = b();
        final djck djckVar = djck.i;
        djckVar.getClass();
        if (((Boolean) b.h(new dbrn(djckVar) { // from class: blhu
            private final djck a;

            {
                this.a = djckVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return Boolean.valueOf(this.a.equals((djck) obj));
            }
        }).c(false)).booleanValue()) {
            j(dbpy.a);
        }
        g(a().toLowerCase(Locale.getDefault()).trim());
        return c();
    }
}
