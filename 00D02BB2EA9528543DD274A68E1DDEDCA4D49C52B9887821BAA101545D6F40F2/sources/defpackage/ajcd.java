package defpackage;
/* compiled from: PG */
/* renamed from: ajcd  reason: default package */
/* loaded from: classes2.dex */
public class ajcd implements ajbz {
    public final aion a;
    private final ajcc b;

    public ajcd(aion aionVar, ajcc ajccVar) {
        this.a = aionVar;
        this.b = ajccVar;
    }

    @Override // defpackage.ajbz
    public CharSequence a() {
        return this.a.b();
    }

    @Override // defpackage.ajbz
    public aiom b() {
        return this.a.a();
    }

    @Override // defpackage.ajbz
    @dzsi
    public CharSequence c() {
        aion aionVar = this.a;
        if (ajcb.b(aionVar) || aionVar.f().a()) {
            return this.a.c();
        }
        return null;
    }

    @Override // defpackage.ajbz
    public Boolean d() {
        return this.a.d();
    }

    @Override // defpackage.ajbz
    public cqkl e() {
        this.b.a(this.a);
        return cqkl.a;
    }
}
