package defpackage;
/* compiled from: PG */
/* renamed from: cvqo  reason: default package */
/* loaded from: classes5.dex */
public abstract class cvqo implements cvql {
    public static cvqo e(cvqn cvqnVar, dbty<dbsg<Boolean>> dbtyVar) {
        return new cvqm(cvqnVar, dbtyVar);
    }

    @Override // defpackage.cvql
    public final float a(dsfz dsfzVar) {
        return c(dsfzVar).a;
    }

    @Override // defpackage.cvql
    public final dbsg<Float> b(dsfz dsfzVar) {
        dbsg<Boolean> d = d();
        if (!d.a()) {
            return dbpy.a;
        }
        dsfc c = c(dsfzVar);
        float f = d.b().booleanValue() ? c.b : c.c;
        if (f == -1.0f) {
            return dbpy.a;
        }
        return dbsg.i(Float.valueOf(f));
    }

    protected abstract dsfc c(dsfz dsfzVar);

    protected abstract dbsg<Boolean> d();
}
