package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: gnb  reason: default package */
/* loaded from: classes3.dex */
public final class gnb implements aafl {
    public static final /* synthetic */ int b = 0;
    public final azqb a;
    private final aagi c;
    private final afvn d;
    private final aizb e;
    private final ezh f;

    public gnb(aagi aagiVar, afvn afvnVar, azqb azqbVar, aizb aizbVar, ezh ezhVar) {
        this.c = aagiVar;
        afvnVar.getClass();
        this.d = afvnVar;
        this.a = azqbVar;
        ezhVar.getClass();
        this.f = ezhVar;
        this.e = aizbVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!apzgVar.qn(auqt.b)) {
            return;
        }
        final auqt auqtVar = (auqt) apzgVar.qm(auqt.b);
        ezx g = this.f.g();
        if (auqtVar.d) {
            if (g.b()) {
                return;
            }
            if (auqtVar.f && g.k()) {
                return;
            }
            if (auqtVar.e && !this.e.d()) {
                return;
            }
            ((nix) this.a.get()).p(true);
            final aagh a = this.c.a(this.d.c());
            a.f(auqtVar.c).g(aozq.class).l(new aypv() { // from class: gmy
                @Override // defpackage.aypv
                public final void a() {
                    auqt auqtVar2 = auqt.this;
                    aajl aajlVar = a;
                    int i = gnb.b;
                    afus.b(2, 1, "Could not retrieve ad player fullscreen state entity on enter");
                    String str = auqtVar2.c;
                    str.getClass();
                    aqxo.z(!str.isEmpty(), "key cannot be empty");
                    aopa createBuilder = aozr.a.createBuilder();
                    createBuilder.copyOnWrite();
                    aozr aozrVar = (aozr) createBuilder.instance;
                    aozrVar.b |= 1;
                    aozrVar.c = str;
                    aozp aozpVar = new aozp(createBuilder);
                    aozpVar.b(true);
                    aozq c = aozpVar.c();
                    aajs c2 = aajlVar.c();
                    c2.d(c);
                    c2.b().T();
                }
            }).c(new gna(a)).q(fzc.k).Q();
        } else if (!g.b()) {
        } else {
            this.c.a(this.d.c()).f(auqtVar.c).g(aozq.class).o(new ayqb() { // from class: gmz
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    gnb gnbVar = gnb.this;
                    aozq aozqVar = (aozq) obj;
                    if (aozqVar == null) {
                        afus.b(2, 1, "Ad player fullscreen state entity is null in onSuccess on exit");
                    } else if (!aozqVar.getFullscreenForced().booleanValue()) {
                    } else {
                        ((nix) gnbVar.a.get()).p(false);
                    }
                }
            }).m(fzc.l).l(fzb.e).S();
        }
    }
}
