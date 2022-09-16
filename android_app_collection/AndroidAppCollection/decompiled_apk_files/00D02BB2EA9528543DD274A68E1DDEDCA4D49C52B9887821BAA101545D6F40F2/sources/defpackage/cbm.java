package defpackage;
/* compiled from: PG */
/* renamed from: cbm  reason: default package */
/* loaded from: classes.dex */
public final class cbm<Model> implements cap<Model, Model> {
    public static final cbm<?> a = new cbm<>();

    @Override // defpackage.cap
    public final boolean a(Model model) {
        return true;
    }

    @Override // defpackage.cap
    public final cao<Model> b(Model model, int i, int i2, bua buaVar) {
        return new cao<>(new ciy(model), new cbl(model));
    }
}
