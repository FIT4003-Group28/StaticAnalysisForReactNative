package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: auge  reason: default package */
/* loaded from: classes2.dex */
public abstract class auge {
    public abstract augf a();

    public abstract void b(dbsg<ddcu> dbsgVar);

    public abstract void c(ddho ddhoVar);

    public abstract void d(int i);

    public abstract void e(auhx auhxVar);

    public abstract void f(boolean z);

    public abstract void g(CharSequence charSequence);

    public abstract void h(dbsg<String> dbsgVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final augf i() {
        augf a = a();
        if (a.g().a()) {
            dbsk.a(!a.h().a());
        }
        if (a.h().a()) {
            dbsk.a(!a.g().a());
        }
        return a;
    }
}
