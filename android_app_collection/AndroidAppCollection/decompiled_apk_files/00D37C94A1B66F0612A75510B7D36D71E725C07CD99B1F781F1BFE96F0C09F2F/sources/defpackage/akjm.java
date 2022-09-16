package defpackage;

import com.google.protos.youtube.api.innertube.SettingRenderer;
import j$.util.DesugarCollections;
import java.util.IdentityHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: akjm  reason: default package */
/* loaded from: classes.dex */
public final class akjm {
    public final Map a = DesugarCollections.synchronizedMap(new IdentityHashMap());
    public final Map b = DesugarCollections.synchronizedMap(new IdentityHashMap());

    private final auro k(auro auroVar) {
        auro auroVar2 = (auro) this.b.get(auroVar);
        return auroVar2 == null ? auroVar : auroVar2;
    }

    public final aurg a(aurg aurgVar) {
        aurg aurgVar2 = (aurg) this.a.get(aurgVar);
        return aurgVar2 == null ? aurgVar : aurgVar2;
    }

    public final aurm b(aurg aurgVar) {
        aunb aunbVar = a(aurgVar).n;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        return (aurm) aunbVar.qm(SettingRenderer.settingDialogRenderer);
    }

    public final aurt c(aurg aurgVar) {
        aunb aunbVar = a(aurgVar).n;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        return (aurt) aunbVar.qm(SettingRenderer.settingSingleOptionMenuRenderer);
    }

    public final void d(aurg aurgVar, boolean z) {
        Map map = this.a;
        aopa mo52toBuilder = a(aurgVar).mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        aurg aurgVar2 = (aurg) mo52toBuilder.instance;
        aurgVar2.b |= 64;
        aurgVar2.f = z;
        map.put(aurgVar, (aurg) mo52toBuilder.mo39build());
    }

    public final void e(auro auroVar, boolean z) {
        Map map = this.b;
        aopa mo52toBuilder = k(auroVar).mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        auro auroVar2 = (auro) mo52toBuilder.instance;
        auroVar2.b |= 8;
        auroVar2.f = z;
        map.put(auroVar, (auro) mo52toBuilder.mo39build());
    }

    public final void f(aurg aurgVar, aurm aurmVar) {
        Map map = this.a;
        aopa mo52toBuilder = a(aurgVar).mo52toBuilder();
        aunb aunbVar = a(aurgVar).n;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        aopc aopcVar = (aopc) aunbVar.mo52toBuilder();
        aopcVar.e(SettingRenderer.settingDialogRenderer, aurmVar);
        mo52toBuilder.copyOnWrite();
        aurg aurgVar2 = (aurg) mo52toBuilder.instance;
        aunb aunbVar2 = (aunb) aopcVar.mo39build();
        aunbVar2.getClass();
        aurgVar2.n = aunbVar2;
        aurgVar2.b |= 32768;
        map.put(aurgVar, (aurg) mo52toBuilder.mo39build());
    }

    public final boolean g(aurg aurgVar) {
        return a(aurgVar).f;
    }

    public final boolean h(auro auroVar) {
        return k(auroVar).f;
    }

    public final boolean i(aurg aurgVar) {
        aunb aunbVar = a(aurgVar).n;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        return aunbVar.qn(SettingRenderer.settingSingleOptionMenuRenderer);
    }

    public final boolean j(aurg aurgVar) {
        aunb aunbVar = a(aurgVar).n;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        return aunbVar.qn(SettingRenderer.settingDialogRenderer);
    }
}
