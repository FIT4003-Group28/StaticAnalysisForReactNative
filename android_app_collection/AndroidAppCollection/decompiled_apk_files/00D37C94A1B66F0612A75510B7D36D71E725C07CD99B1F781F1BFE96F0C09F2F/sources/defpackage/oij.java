package defpackage;

import android.animation.ArgbEvaluator;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: oij  reason: default package */
/* loaded from: classes3.dex */
final class oij {
    private final EnumMap a;
    private final ArgbEvaluator b;

    public oij() {
        EnumMap enumMap = new EnumMap(fsb.class);
        for (fsb fsbVar : fsb.values()) {
            enumMap.put((EnumMap) fsbVar, (fsb) new oii());
        }
        this.a = enumMap;
        this.b = new ArgbEvaluator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        int i = 0;
        for (fsb fsbVar : fsb.values()) {
            oii oiiVar = (oii) this.a.get(fsbVar);
            i = ((Integer) this.b.evaluate(oiiVar.b, Integer.valueOf(i), Integer.valueOf(oiiVar.a))).intValue();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(fsb fsbVar, float f) {
        fsbVar.getClass();
        ((oii) this.a.get(fsbVar)).b = Math.max(0.0f, Math.min(1.0f, f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(fsb fsbVar, int i) {
        fsbVar.getClass();
        ((oii) this.a.get(fsbVar)).a = i;
    }
}
