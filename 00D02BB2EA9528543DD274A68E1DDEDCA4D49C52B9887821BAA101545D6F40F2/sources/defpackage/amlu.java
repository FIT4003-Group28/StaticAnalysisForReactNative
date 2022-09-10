package defpackage;
/* compiled from: PG */
/* renamed from: amlu  reason: default package */
/* loaded from: classes.dex */
final class amlu implements alvd {
    public final alvd a;
    public final alyx b;

    public amlu(alvd alvdVar, alyx alyxVar) {
        this.a = alvdVar;
        this.b = alyxVar;
    }

    @Override // defpackage.alvd
    public final alvb a(akry akryVar, int i, boolean z) {
        return new altf(this.a.a(akryVar, i, z), this.b);
    }
}
