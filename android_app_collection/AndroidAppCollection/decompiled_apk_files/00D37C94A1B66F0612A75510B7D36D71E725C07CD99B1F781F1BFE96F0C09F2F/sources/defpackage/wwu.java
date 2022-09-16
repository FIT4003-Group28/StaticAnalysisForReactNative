package defpackage;
/* compiled from: PG */
/* renamed from: wwu  reason: default package */
/* loaded from: classes4.dex */
public final class wwu implements acvl {
    private final aiji a;
    private final ahfs b;
    private final amqo c;
    private final /* synthetic */ int d;

    public wwu(aiji aijiVar, afkf afkfVar, amqo amqoVar, int i) {
        this.d = i;
        this.a = aijiVar;
        ahfs ahfsVar = new ahfs();
        this.b = ahfsVar;
        this.c = amqoVar;
        afkfVar.d(ahfsVar);
    }

    public wwu(aiji aijiVar, afkf afkfVar, amqo amqoVar) {
        this.a = aijiVar;
        ahfs ahfsVar = new ahfs();
        this.b = ahfsVar;
        this.c = amqoVar;
        afkfVar.d(ahfsVar);
    }

    public wwu(aiji aijiVar, afkf afkfVar, amqo amqoVar, int i, byte[] bArr) {
        this.d = i;
        this.a = aijiVar;
        ahfs ahfsVar = new ahfs();
        this.b = ahfsVar;
        this.c = amqoVar;
        afkfVar.d(ahfsVar);
    }

    public wwu(aiji aijiVar, afkf afkfVar, amqo amqoVar, int i, char[] cArr) {
        this.d = i;
        this.a = aijiVar;
        ahfs ahfsVar = new ahfs();
        this.b = ahfsVar;
        this.c = amqoVar;
        afkfVar.d(ahfsVar);
    }

    @Override // defpackage.acvl
    public final acvk a(acvp acvpVar) {
        int i = this.d;
        if (i == 0) {
            this.b.f();
            return new wwv(this.b, acvpVar.a().a(), this.a.d().d(), acvpVar.e().t(), ((evs) this.c).a);
        } else if (i == 1) {
            this.b.f();
            return new wws(this.b, acvpVar.a().a(), this.a.d().d(), acvpVar.e().t(), ((evs) this.c).a);
        } else if (i == 2) {
            this.b.f();
            return new www(this.b, acvpVar.a().a(), this.a.d().d(), acvpVar.e().t(), ((evs) this.c).a);
        } else {
            this.b.f();
            return new ahfv(acvpVar.a().a(), this.a.d().d(), acvpVar.e().t(), this.b, ((evs) this.c).a);
        }
    }
}
