package defpackage;
/* compiled from: PG */
/* renamed from: alvc  reason: default package */
/* loaded from: classes.dex */
public class alvc implements alvd {
    private final dbty<alyx> a;

    public alvc(dbty<alyx> dbtyVar) {
        this.a = dbtyVar;
    }

    @Override // defpackage.alvd
    public alvb a(akry akryVar, int i, boolean z) {
        if (z) {
            return new alux(akryVar, i, this.a.a());
        }
        return new alva(akryVar, this.a.a());
    }
}
