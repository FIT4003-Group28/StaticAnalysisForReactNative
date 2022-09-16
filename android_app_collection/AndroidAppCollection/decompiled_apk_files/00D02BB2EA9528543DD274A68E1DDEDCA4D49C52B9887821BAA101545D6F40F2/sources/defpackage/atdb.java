package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atdb  reason: default package */
/* loaded from: classes2.dex */
public final class atdb {
    final /* synthetic */ atdd a;

    public atdb(atdd atddVar) {
        this.a = atddVar;
    }

    public final synchronized void a(crhn crhnVar) {
        aryr aryrVar = crhnVar.a;
        atdd atddVar = this.a;
        ((atlo) atddVar.a).h = aryrVar;
        S s = atddVar.c;
        if (s == 0 || !((atlq) s).b()) {
            return;
        }
        this.a.u();
    }
}
