package defpackage;

import java.util.Arrays;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abjl  reason: default package */
/* loaded from: classes.dex */
final class abjl implements afzf {
    final /* synthetic */ Map a;
    final /* synthetic */ abjm b;

    public abjl(abjm abjmVar, Map map) {
        this.b = abjmVar;
        this.a = map;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.b.b.e(cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        abgz abgzVar;
        arvu arvuVar = (arvu) obj;
        if (arvuVar.c.size() > 0) {
            Object obj2 = this.a.get("com.google.android.libraries.youtube.innertube.endpoint.tag");
            if (obj2 instanceof abjh) {
                abgzVar = ((abjh) obj2).a();
            } else {
                abgzVar = obj2 instanceof abgz ? (abgz) obj2 : null;
            }
            if (abgzVar == null) {
                String valueOf = String.valueOf(Arrays.toString(Thread.currentThread().getStackTrace()));
                afus.b(2, 31, valueOf.length() != 0 ? "Moderate live chat command called with no context. \n".concat(valueOf) : new String("Moderate live chat command called with no context. \n"));
                return;
            }
            this.b.a.a(arvuVar.c, abgzVar, true);
        }
    }
}
