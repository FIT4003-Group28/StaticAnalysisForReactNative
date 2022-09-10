package defpackage;
/* compiled from: PG */
/* renamed from: zla  reason: default package */
/* loaded from: classes7.dex */
public class zla extends zhb implements zcn {
    private final zqj c;
    private final znz d;

    public zla(cqhn cqhnVar, zqj zqjVar, znz znzVar) {
        super(cqhnVar, znzVar.b());
        this.c = zqjVar;
        this.d = znzVar;
    }

    @Override // defpackage.zcn
    public Boolean d() {
        return Boolean.valueOf(this.d.b().Os().intValue() > 0);
    }

    @Override // defpackage.zhb, defpackage.zds
    public Boolean f() {
        return Boolean.valueOf(d().booleanValue() ? super.f().booleanValue() : true);
    }

    @Override // defpackage.zcn
    /* renamed from: i */
    public zqj a() {
        return this.c;
    }

    @Override // defpackage.zcn
    /* renamed from: j */
    public znz c() {
        return this.d;
    }
}
