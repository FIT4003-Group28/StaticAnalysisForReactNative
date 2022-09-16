package defpackage;
/* compiled from: PG */
/* renamed from: kap  reason: default package */
/* loaded from: classes3.dex */
public class kap implements kao {
    private final atyy a;

    public kap(atyy atyyVar) {
        this.a = atyyVar;
    }

    @Override // defpackage.kao
    public atyu a() {
        atyu a = atyv.a();
        atyy atyyVar = this.a;
        a.copyOnWrite();
        ((atyv) a.instance).k(atyyVar);
        return a;
    }
}
