package defpackage;

import com.google.android.gms.cast.CastDevice;
import j$.util.Optional;
import java.util.Map;
/* compiled from: PG */
/* renamed from: adep  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adep implements anir {
    public final /* synthetic */ adeq a;
    public final /* synthetic */ amuk b;
    private final /* synthetic */ int c;

    public /* synthetic */ adep(adeq adeqVar, amuk amukVar) {
        this.a = adeqVar;
        this.b = amukVar;
    }

    public /* synthetic */ adep(adeq adeqVar, amuk amukVar, int i) {
        this.c = i;
        this.a = adeqVar;
        this.b = amukVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        char c;
        if (this.c == 0) {
            adeq adeqVar = this.a;
            amuk amukVar = this.b;
            Map map = (Map) obj;
            atbu[] d = adeq.d();
            if (map == null) {
                zep.c(adeq.a, "Could not retrieve RouteInfo to CastDevice map.");
                return anlz.q(d);
            }
            adeqVar.a(amukVar, map);
            for (int i = 0; i < amukVar.size(); i++) {
                bhc bhcVar = (bhc) amukVar.get(i);
                Optional optional = (Optional) map.get(bhcVar);
                if (adgl.i(bhcVar)) {
                    c = adeqVar.c(bhcVar) ? (char) 5 : (char) 2;
                } else if (optional != null && optional.isPresent() && adgj.b((CastDevice) optional.get()) && adeqVar.b) {
                    c = 4;
                } else if (optional == null || !optional.isPresent()) {
                    c = adgl.g(bhcVar) ? (char) 3 : (char) 6;
                } else {
                    c = 1;
                }
                aopa mo52toBuilder = d[c].mo52toBuilder();
                int i2 = d[c].d;
                mo52toBuilder.copyOnWrite();
                atbu atbuVar = (atbu) mo52toBuilder.instance;
                atbuVar.b = 2 | atbuVar.b;
                atbuVar.d = i2 + 1;
                d[c] = (atbu) mo52toBuilder.mo39build();
            }
            return anlz.q(d);
        }
        adeq adeqVar2 = this.a;
        amuk amukVar2 = this.b;
        Map map2 = (Map) obj;
        if (map2 == null) {
            zep.c(adeq.a, "Could not retrieve RouteInfo to CastDevice map.");
            return anlz.p(new Throwable());
        }
        return anlz.q(adeqVar2.a(amukVar2, map2));
    }
}
