package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import com.google.android.libraries.elements.interfaces.PerformOnceCommandController;
import com.youtube.android.libraries.elements.templates.UnifiedTemplateResolver;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: sza  reason: default package */
/* loaded from: classes4.dex */
public final class sza implements axou {
    public static syz a(Collection collection, Collection collection2, List list, teb tebVar, ampq ampqVar) {
        return new syz(collection, collection2, list, tebVar, ampqVar);
    }

    public static syy b(ampq ampqVar) {
        return new syy(ampqVar);
    }

    public static List c(Map map, Set set) {
        List c = szb.c(map, set);
        axzl.o(c);
        return c;
    }

    public static szc d(Map map, Map map2, ampq ampqVar, teb tebVar) {
        return new szc(map, map2, ampqVar, tebVar);
    }

    public static szd e(teb tebVar) {
        return new szd(tebVar);
    }

    public static szk f(ayor ayorVar) {
        return new szk(ayorVar);
    }

    public static szx g(axnm axnmVar, ampq ampqVar, ayor ayorVar) {
        return new szx(axnmVar, ampqVar, ayorVar);
    }

    public static Map h(ampq ampqVar) {
        amum amumVar = new amum();
        for (Map.Entry entry : ((Map) ((ampv) ampqVar).a).entrySet()) {
            amumVar.f(Integer.valueOf(((tey) ((Pair) entry.getValue()).first).a().a()), (Pair) entry.getValue());
        }
        return amumVar.b();
    }

    public static tap i(Context context, ampq ampqVar, ampq ampqVar2, azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new tap(context, ampqVar, ampqVar2, azqbVar, azqbVar2, azqbVar3);
    }

    public static tfa j(ampq ampqVar) {
        return (tfa) ampqVar.e(tfa.i);
    }

    public static tbl k(ampq ampqVar, Context context, azqb azqbVar, ampq ampqVar2) {
        tbl a = tbc.a(ampqVar, context, azqbVar, ampqVar2);
        axzl.o(a);
        return a;
    }

    public static DebuggerClient l(ampq ampqVar, String str, azqb azqbVar, Context context) {
        DebuggerClient b = tbc.b(ampqVar, str, azqbVar, context);
        axzl.o(b);
        return b;
    }

    public static tdc m(ampq ampqVar, azqb azqbVar) {
        tdc c = tbc.c(ampqVar, azqbVar);
        axzl.o(c);
        return c;
    }

    public static String n(ampq ampqVar) {
        String d = tbc.d(ampqVar);
        axzl.o(d);
        return d;
    }

    public static UnifiedTemplateResolver o(final ampq ampqVar, final ampq ampqVar2, final String str, final azqb azqbVar, final ampq ampqVar3, final ampq ampqVar4) {
        UnifiedTemplateResolver unifiedTemplateResolver = (UnifiedTemplateResolver) tbc.a.a(new teu() { // from class: taz
            @Override // defpackage.teu
            public final Object a() {
                ampq ampqVar5 = ampq.this;
                return new UnifiedTemplateResolver(((Boolean) ampqVar5.e(false)).booleanValue(), str, ((Boolean) ampqVar2.e(false)).booleanValue() ? (DebuggerClient) azqbVar.get() : null, ((Boolean) ampqVar3.e(false)).booleanValue(), ((Integer) ampqVar4.e(0)).intValue());
            }
        });
        axzl.o(unifiedTemplateResolver);
        return unifiedTemplateResolver;
    }

    public static tdw p(tei teiVar, ampq ampqVar, teb tebVar, tcu tcuVar, teh tehVar, ampq ampqVar2, ampq ampqVar3) {
        final tce tceVar = new tce(tebVar, ((Boolean) ampqVar2.e(true)).booleanValue(), (akcq) ((ampv) ampqVar).a, tcuVar, ((Float) ampqVar3.e(Float.valueOf(0.0f))).floatValue(), tehVar);
        return swa.b(teiVar, new svy() { // from class: tcg
            @Override // defpackage.svy
            public final cyp a(cyv cyvVar, tda tdaVar, Object obj, String str, aodt aodtVar, suc sucVar, List list) {
                tce tceVar2 = tce.this;
                axnc axncVar = (axnc) obj;
                teb tebVar2 = tceVar2.a;
                boolean z = tceVar2.b;
                akcq akcqVar = tceVar2.f;
                tcu tcuVar2 = tceVar2.c;
                float f = tceVar2.d;
                teh tehVar2 = tceVar2.e;
                aodt aM = axncVar.aM();
                if (aM == null) {
                    throw new ted("ImageType.image missing");
                }
                tcc tccVar = new tcc();
                tcc.c(tccVar, cyvVar, new tcd());
                tccVar.a.B = aM;
                boolean z2 = false;
                tccVar.d.set(0);
                tccVar.a.g = tebVar2;
                tccVar.d.set(4);
                tccVar.a.v = z;
                tccVar.d.set(5);
                if (axncVar.aK() != null) {
                    tccVar.a.z = axncVar.aK();
                }
                if (axncVar.aL() != null) {
                    tccVar.a.A = axncVar.aL();
                }
                tccVar.a.y = akcqVar;
                if (aM.Z() == 4 || aM.Z() == 3) {
                    tfy tfyVar = new tfy(tebVar2);
                    tfw g = tfyVar.g(axncVar.aJ());
                    tfw g2 = tfyVar.g(axncVar.aI());
                    awmt awmtVar = null;
                    awmt a = g != null ? g.a() : null;
                    if (g2 != null) {
                        awmtVar = g2.a();
                    }
                    tccVar.a.b = new tfl(a, awmtVar, tcuVar2, axncVar);
                }
                tccVar.a.f = axncVar.aG();
                tccVar.d.set(3);
                tcd tcdVar = tccVar.a;
                tcdVar.c = tdaVar;
                tcdVar.d = f;
                tccVar.d.set(1);
                if (aodtVar != null) {
                    axml axmlVar = new axml();
                    if (tfy.l(aodtVar, axmlVar, 168774763, tcf.a) && "primary_image".equals(axmlVar.X())) {
                        z2 = true;
                    }
                    tccVar.a.a = Boolean.valueOf(z2);
                }
                tccVar.a.e = tehVar2;
                tccVar.d.set(2);
                return tccVar;
            }
        }, 158796345, svn.j);
    }

    public static JSEnvironment q(ampq ampqVar) {
        return (JSEnvironment) ampqVar.e(new tfu());
    }

    public static szv r(axnm axnmVar, ayor ayorVar) {
        return new szv(axnmVar, ayorVar, 1);
    }

    public static sta s(PerformOnceCommandController performOnceCommandController, axnm axnmVar) {
        return new sta(axnmVar, 2);
    }

    public static sta t(axnm axnmVar) {
        return new sta(axnmVar, 3);
    }

    public static tck u() {
        return new tck();
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        throw null;
    }
}
