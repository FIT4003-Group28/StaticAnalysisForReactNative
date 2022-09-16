package defpackage;
/* compiled from: PG */
/* renamed from: ixa  reason: default package */
/* loaded from: classes3.dex */
final class ixa implements akev {
    final /* synthetic */ apzg a;
    final /* synthetic */ ixc b;

    public ixa(ixc ixcVar, apzg apzgVar) {
        this.b = ixcVar;
        this.a = apzgVar;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        akff akffVar = (akff) obj;
        String str = ixc.a;
        String.format("onDismissed with event=%s", Integer.valueOf(i));
        if (i != 1) {
            final adci adciVar = this.b.g;
            ((vne) adciVar.a.get()).b(new ampg() { // from class: adcg
                @Override // defpackage.ampg
                public final Object apply(Object obj2) {
                    adci adciVar2 = adci.this;
                    awtv awtvVar = (awtv) obj2;
                    String.format("RecordingIgnored: [id=%s][ignoredCount=%s]", awtvVar.c, Integer.valueOf(awtvVar.d));
                    if (awtvVar.d + 1 < 3) {
                        aopa createBuilder = awtv.a.createBuilder();
                        String str2 = awtvVar.c;
                        createBuilder.copyOnWrite();
                        awtv awtvVar2 = (awtv) createBuilder.instance;
                        str2.getClass();
                        awtvVar2.b |= 1;
                        awtvVar2.c = str2;
                        int i2 = awtvVar.d;
                        createBuilder.copyOnWrite();
                        awtv awtvVar3 = (awtv) createBuilder.instance;
                        awtvVar3.b = 2 | awtvVar3.b;
                        awtvVar3.d = i2 + 1;
                        return (awtv) createBuilder.mo39build();
                    }
                    adciVar2.b.a(awtvVar.c);
                    return awtv.a;
                }
            }, adciVar.c);
        }
        ixc ixcVar = this.b;
        ixcVar.h = null;
        ixcVar.a().q(new acte(actj.MDX_AUTOCONNECT_PROMPT_ACTION_BUTTON), null);
        ixcVar.a().q(new acte(actj.MDX_AUTOCONNECT_PROMPT_DISMISS_BUTTON), null);
        ixcVar.a().t();
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        String str = ixc.a;
        ixc ixcVar = this.b;
        ixcVar.h = (akff) obj;
        ixcVar.a().d(acuo.a(125598), this.a, null);
        ixcVar.a().n(new acte(actj.MDX_AUTOCONNECT_PROMPT_ACTION_BUTTON));
        ixcVar.a().n(new acte(actj.MDX_AUTOCONNECT_PROMPT_DISMISS_BUTTON));
    }
}
