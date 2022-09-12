package defpackage;

import com.google.android.filament.Material;
import com.google.ar.sceneform.rendering.EngineInstance;
/* compiled from: PG */
/* renamed from: dbgc  reason: default package */
/* loaded from: classes5.dex */
public final class dbgc extends dbgb {
    public Material a;

    public dbgc(Material material) {
        this.a = material;
    }

    @Override // defpackage.dbiw
    protected final void a() {
        dbix.a();
        dbet a = EngineInstance.a();
        Material material = this.a;
        this.a = null;
        if (material == null || a == null || !a.a()) {
            return;
        }
        a.a.destroyMaterial(material);
    }
}
