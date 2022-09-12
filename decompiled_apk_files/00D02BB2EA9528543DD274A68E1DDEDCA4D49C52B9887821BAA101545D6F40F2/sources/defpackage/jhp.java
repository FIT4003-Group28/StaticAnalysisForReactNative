package defpackage;
/* compiled from: PG */
/* renamed from: jhp  reason: default package */
/* loaded from: classes7.dex */
public class jhp implements iuz<jic> {
    @dzsi
    public final jic a;
    @dzsi
    public final jic b;

    public jhp() {
        this.a = null;
        this.b = null;
    }

    public jhp(jic jicVar, jic jicVar2) {
        this.a = jicVar;
        this.b = jicVar2;
    }

    @Override // defpackage.iuz
    public final /* bridge */ /* synthetic */ jic NS() {
        return this.b;
    }

    @Override // defpackage.iuz
    public final /* bridge */ /* synthetic */ jic d() {
        return this.a;
    }

    public jhp(@dzsi String str, @dzsi String str2, ckqd ckqdVar) {
        this.a = new jic(str, ckqdVar, (cqtd) null, 0);
        this.b = new jic(str2, ckqdVar, (cqtd) null, 0);
    }
}
