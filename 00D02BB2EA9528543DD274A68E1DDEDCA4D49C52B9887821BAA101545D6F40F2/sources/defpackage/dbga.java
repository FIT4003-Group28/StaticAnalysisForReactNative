package defpackage;

import com.google.android.filament.MaterialInstance;
import com.google.ar.sceneform.rendering.EngineInstance;
/* compiled from: PG */
/* renamed from: dbga  reason: default package */
/* loaded from: classes5.dex */
public final class dbga implements dbfz {
    final MaterialInstance a;

    public dbga(MaterialInstance materialInstance) {
        this.a = materialInstance;
    }

    @Override // defpackage.dbfz
    public final MaterialInstance a() {
        return this.a;
    }

    @Override // defpackage.dbfz
    public final boolean b() {
        return this.a != null;
    }

    @Override // defpackage.dbfz
    public final void c() {
        dbet a = EngineInstance.a();
        if (a == null || !a.a()) {
            return;
        }
        a.a.destroyMaterialInstance(this.a);
    }
}
