package defpackage;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.List;
/* compiled from: PG */
/* renamed from: curo  reason: default package */
/* loaded from: classes5.dex */
public final class curo implements cvdw, cvdu {
    private static final dcdc<cvec> a = dcdc.f(cvec.RICH_CARD_BUBBLE);
    private final cuuc b;
    private final cuwi c;
    private final cuiv d;
    private final aqex e;

    public curo(cuuc cuucVar, aqex aqexVar, cuwi cuwiVar, cuiv cuivVar) {
        this.b = cuucVar;
        this.e = aqexVar;
        this.c = cuwiVar;
        this.d = cuivVar;
    }

    private final boolean h(cuqd cuqdVar) {
        dcdc<cuql> a2 = cuqdVar.a();
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            cuql cuqlVar = a2.get(i);
            cuqi cuqiVar = cuqi.STACK_COMPONENT;
            cupw cupwVar = cupw.STACK_CARD;
            int ordinal = cuqlVar.b().ordinal();
            if (ordinal == 0) {
                dcdc<cuqq> a3 = cuqlVar.a().a();
                int size2 = a3.size();
                int i2 = 0;
                while (i2 < size2) {
                    int i3 = i2 + 1;
                    if (!cury.a(a3.get(i2), this.b)) {
                        return false;
                    }
                    i2 = i3;
                }
                continue;
            } else if (ordinal == 1) {
                return cury.a(cuqlVar.c(), this.b);
            }
        }
        return true;
    }

    @Override // defpackage.cvdw
    public final cvdu a() {
        return this;
    }

    @Override // defpackage.cvdw
    public final dbsg<cvdv> b() {
        return dbpy.a;
    }

    @Override // defpackage.cvdw
    public final dbsg<cuij> c(cugu cuguVar) {
        dbsg<cupx> a2 = cumv.a(cuguVar);
        if (!a2.a()) {
            return dbpy.a;
        }
        cupx b = a2.b();
        int i = 1;
        int size = b.b().equals(cupw.CARD_CAROUSEL) ? b.a().c().size() : 1;
        ctxw ctxwVar = new ctxw();
        cupw b2 = b.b();
        cuqi cuqiVar = cuqi.STACK_COMPONENT;
        int ordinal = b2.ordinal();
        if (ordinal != 0) {
            i = ordinal != 1 ? ordinal != 2 ? 0 : 3 : 2;
        }
        ctxwVar.a = Integer.valueOf(i);
        ctxwVar.b = Integer.valueOf(size);
        String str = ctxwVar.a == null ? " cardType" : "";
        if (ctxwVar.b == null) {
            str = str.concat(" cardCount");
        }
        if (str.isEmpty()) {
            return dbsg.i(new cuby(new ctxx(ctxwVar.a.intValue(), ctxwVar.b.intValue())));
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    @Override // defpackage.cvdu
    public final List<cvec> d() {
        return a;
    }

    @Override // defpackage.cvdu
    public final acl e(ViewGroup viewGroup, cvec cvecVar) {
        dbsk.g(cvecVar.equals(cvec.RICH_CARD_BUBBLE), "Got non rich card CellType: %s", cvecVar);
        curt curtVar = new curt(viewGroup.getContext());
        curtVar.setActionHandler(this.b);
        curtVar.setImpressionLogger(this.c);
        curtVar.setPhotosMessagingController(this.d);
        curtVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        curq curqVar = new curq(curtVar);
        curqVar.b = this.e;
        curqVar.b();
        return new curn(curtVar, curqVar);
    }

    @Override // defpackage.cvdu
    public final void f(acl aclVar, cved cvedVar, ctyy ctyyVar) {
        if ((aclVar instanceof curn) && cvedVar.c().a().a()) {
            ((curt) aclVar.a).setAccountContext(ctyyVar);
            curq curqVar = ((curn) aclVar).s;
            curqVar.A();
            curqVar.a = cvedVar.c();
            curqVar.b();
            curqVar.z();
        }
    }

    @Override // defpackage.cvdu
    public final boolean g(cugu cuguVar) {
        dbsg<cupx> a2 = cumv.a(cuguVar);
        if (!a2.a()) {
            return false;
        }
        cuqi cuqiVar = cuqi.STACK_COMPONENT;
        cupw cupwVar = cupw.STACK_CARD;
        int ordinal = a2.b().b().ordinal();
        if (ordinal == 0) {
            return h(a2.b().c());
        }
        if (ordinal == 1) {
            if (dxzy.h()) {
                return h(a2.b().d().b());
            }
            return false;
        }
        if (ordinal == 2) {
            if (!dxzy.h() || a2.b().a().c().isEmpty()) {
                return false;
            }
            dcdc<cuqd> c = a2.b().a().c();
            int size = c.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (!h(c.get(i))) {
                    return false;
                }
                i = i2;
            }
        }
        return true;
    }
}
