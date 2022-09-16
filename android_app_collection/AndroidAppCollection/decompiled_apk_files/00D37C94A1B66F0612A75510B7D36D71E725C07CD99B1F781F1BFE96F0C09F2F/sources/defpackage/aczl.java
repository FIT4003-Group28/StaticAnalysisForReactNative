package defpackage;
/* compiled from: PG */
/* renamed from: aczl  reason: default package */
/* loaded from: classes.dex */
public final class aczl {
    private final acrr a;
    private final axnm b;

    public aczl(acrr acrrVar, axnm axnmVar) {
        this.a = acrrVar;
        this.b = axnmVar;
    }

    public final void a(atcu atcuVar) {
        b(atcuVar, null, false);
    }

    public final void b(atcu atcuVar, Integer num, boolean z) {
        atbw a = atbx.a();
        a.copyOnWrite();
        ((atbx) a.instance).i(atcuVar);
        if (num != null) {
            int intValue = num.intValue();
            a.copyOnWrite();
            ((atbx) a.instance).h(intValue);
            a.copyOnWrite();
            ((atbx) a.instance).g(z);
        }
        adnt e = ((adoa) this.b.get()).e();
        if (e != null) {
            boolean ai = e.ai();
            a.copyOnWrite();
            ((atbx) a.instance).j(ai);
        }
        acrr acrrVar = this.a;
        arrf a2 = arrh.a();
        a2.copyOnWrite();
        ((arrh) a2.instance).cZ((atbx) a.mo39build());
        acrrVar.c((arrh) a2.mo39build());
    }
}
