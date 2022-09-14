package defpackage;
/* compiled from: PG */
/* renamed from: adbn  reason: default package */
/* loaded from: classes.dex */
public class adbn extends aczs implements adbl {
    private final acyo a;
    private final cjtd b = cjtd.a(dtxr.at);

    public adbn(acyo acyoVar) {
        this.a = acyoVar;
        acyoVar.a.add(new adbm(this));
    }

    @Override // defpackage.adbl
    public Boolean a() {
        return Boolean.valueOf(this.a.b);
    }

    @Override // defpackage.aczr
    public cjtd e() {
        return this.b;
    }
}
