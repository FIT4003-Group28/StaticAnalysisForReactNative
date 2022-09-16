package defpackage;
/* compiled from: PG */
/* renamed from: axpc  reason: default package */
/* loaded from: classes3.dex */
class axpc implements iao {
    private final String a;
    private final cjtd b;

    public axpc(String str, ddho ddhoVar) {
        this.a = str;
        this.b = cjtd.a(ddhoVar);
    }

    @Override // defpackage.iao
    public cjtd b() {
        return this.b;
    }

    @Override // defpackage.iao
    public CharSequence c() {
        return ian.a(this);
    }

    @Override // defpackage.iao
    public Boolean d() {
        return ian.c();
    }

    @Override // defpackage.iao
    public hxy e() {
        return null;
    }

    @Override // defpackage.iao
    public Integer f() {
        return ian.b();
    }

    @Override // defpackage.iao
    /* renamed from: g */
    public String a() {
        return this.a;
    }
}
