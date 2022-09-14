package defpackage;
/* compiled from: PG */
/* renamed from: bmej  reason: default package */
/* loaded from: classes3.dex */
final class bmej implements Runnable {
    final /* synthetic */ cafi a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    public bmej(cafi cafiVar, String str, String str2) {
        this.a = cafiVar;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cafi cafiVar = this.a;
        String str = this.b;
        String str2 = this.c;
        dcdn<String, dkcp> dcdnVar = bmek.a;
        String[] split = str2.split("/");
        dkcp dkcpVar = null;
        if (split.length > 6) {
            String str3 = split[6];
            if (bmek.a.containsKey(str3)) {
                dkcpVar = bmek.a.get(str3);
            }
        }
        cafiVar.k(str, dkcpVar);
    }
}
