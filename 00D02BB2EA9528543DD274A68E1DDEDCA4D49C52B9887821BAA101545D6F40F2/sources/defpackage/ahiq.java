package defpackage;
/* compiled from: PG */
/* renamed from: ahiq  reason: default package */
/* loaded from: classes2.dex */
public class ahiq implements ahae {
    @dzsi
    private final CharSequence a;
    @dzsi
    private final CharSequence b;
    @dzsi
    private final cqkn<ahae> c;
    private final cjtd d;

    public ahiq(@dzsi CharSequence charSequence, @dzsi CharSequence charSequence2, @dzsi cqkn<ahae> cqknVar, cjtd cjtdVar) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = cqknVar;
        this.d = cjtdVar;
    }

    @Override // defpackage.ahae
    @dzsi
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.ahae
    @dzsi
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.ahae
    public cjtd c() {
        return this.d;
    }

    @Override // defpackage.ahae
    public Boolean d() {
        return Boolean.valueOf(this.c != null);
    }

    @Override // defpackage.ahae
    @dzsi
    public cqkn<ahae> e() {
        return this.c;
    }
}
