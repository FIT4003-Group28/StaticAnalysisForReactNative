package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: tze  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tze implements vlp {
    public final /* synthetic */ tyk a;
    private final /* synthetic */ int b;

    public /* synthetic */ tze(tyk tykVar) {
        this.a = tykVar;
    }

    public /* synthetic */ tze(tyk tykVar, int i) {
        this.b = i;
        this.a = tykVar;
    }

    @Override // defpackage.vlp
    public final aoqu a(vlq vlqVar, aoqu aoquVar) {
        if (this.b == 0) {
            tyk tykVar = this.a;
            trb trbVar = (trb) aoquVar;
            aopa createBuilder = trb.a.createBuilder();
            amzs it = vlqVar.c().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                try {
                    String str = (String) entry.getValue();
                    str.getClass();
                    try {
                        createBuilder.A((String) entry.getKey(), (tqz) uaw.c(str, tqz.a.getParserForType()));
                    } catch (aopx e) {
                        typ.c("SharedPreferences shared files metadata had unexpected format: %s", e);
                        tykVar.g(1084);
                    }
                } catch (ClassCastException | NullPointerException e2) {
                    typ.c("SharedPreferences shared files metadata key wasn't a string: %s", e2);
                    tykVar.g(1083);
                }
            }
            return (trb) createBuilder.mo39build();
        }
        tyk tykVar2 = this.a;
        tqt tqtVar = (tqt) aoquVar;
        aopa createBuilder2 = tqt.a.createBuilder();
        amzs it2 = vlqVar.c().entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            try {
                String str2 = (String) entry2.getValue();
                str2.getClass();
                try {
                    createBuilder2.y((String) entry2.getKey(), (tqm) uaw.c(str2, tqm.a.getParserForType()));
                } catch (aopx e3) {
                    typ.c("SharedPreferences file groups metadata had unexpected format: %s", e3);
                    tykVar2.g(1084);
                }
            } catch (ClassCastException | NullPointerException e4) {
                typ.c("SharedPreferences file groups metadata key wasn't a string: %s", e4);
                tykVar2.g(1083);
            }
        }
        return (tqt) createBuilder2.mo39build();
    }
}
