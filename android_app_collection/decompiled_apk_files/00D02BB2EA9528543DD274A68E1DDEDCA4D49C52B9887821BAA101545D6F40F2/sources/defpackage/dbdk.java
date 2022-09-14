package defpackage;

import com.google.ar.sceneform.animation.ModelAnimatorImpl;
/* compiled from: PG */
/* renamed from: dbdk  reason: default package */
/* loaded from: classes5.dex */
public final class dbdk extends dbeh {
    @Override // defpackage.dbeh
    public final dbei a(dbef dbefVar, dbgt dbgtVar) {
        return new ModelAnimatorImpl(dbefVar, dbgtVar);
    }

    @Override // defpackage.dbeh
    public final dbei b(dbei dbeiVar) {
        if (dbeiVar instanceof ModelAnimatorImpl) {
            return new ModelAnimatorImpl((ModelAnimatorImpl) dbeiVar);
        }
        throw new IllegalStateException("Trying to create AnimatorImpl of an incorrect type.");
    }
}
