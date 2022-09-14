package defpackage;
/* compiled from: PG */
/* renamed from: eavt  reason: default package */
/* loaded from: classes6.dex */
public final class eavt extends dsqp<eavv, eavt> implements dssk {
    public eavt() {
        super(eavv.b);
    }

    public final void a(String str, eavs eavsVar) {
        str.getClass();
        eavsVar.getClass();
        if (this.c) {
            bF();
            this.c = false;
        }
        eavv eavvVar = (eavv) this.b;
        eavv eavvVar2 = eavv.b;
        dssd<String, eavs> dssdVar = eavvVar.a;
        if (!dssdVar.a) {
            eavvVar.a = dssdVar.a();
        }
        eavvVar.a.put(str, eavsVar);
    }
}
