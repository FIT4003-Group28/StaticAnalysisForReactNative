package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akxt  reason: default package */
/* loaded from: classes2.dex */
public abstract class akxt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static akxt d(dnpo dnpoVar) {
        String str = dnpoVar.b;
        int a = dnpl.a(dnpoVar.h);
        if (a == 0) {
            a = 1;
        }
        return new akxo(str, a, dnpoVar.d.size() > 0 ? dnpo.e.a(Integer.valueOf(dnpoVar.d.f(0))).N : -1);
    }

    public abstract String a();

    public abstract int b();

    public abstract int c();
}
