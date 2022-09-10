package defpackage;
/* compiled from: PG */
/* renamed from: bbqf  reason: default package */
/* loaded from: classes3.dex */
abstract class bbqf {
    public static final void i(dcdc<cruz> dcdcVar, dcdc<? extends bbqp> dcdcVar2, bbqa bbqaVar, bbqe bbqeVar, bbqd bbqdVar) {
        dbsk.l(dcdcVar2.size() == dcdcVar.size());
        for (int i = 0; i < dcdcVar.size(); i++) {
            cruz cruzVar = dcdcVar.get(i);
            bbqp bbqpVar = dcdcVar2.get(i);
            bbqpVar.b(cruzVar, bbqeVar, bbqdVar);
            bbqpVar.a(cruzVar, bbqaVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract dcdc<cruz> a(String str, dwyd dwydVar, dbsg<bbvh> dbsgVar, dcdc<bbpw> dcdcVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract dcdc<cruz> b(String str, dwyd dwydVar, dbsg<bbvh> dbsgVar, dcdc<bbpy> dcdcVar);

    public abstract boolean c();

    public abstract void d(boolean z);

    public abstract dbsg<String> e(String str);

    public abstract dbsg<String> f(String str);

    public abstract dbsg<String> g(String str);

    public abstract int h(String str);
}
