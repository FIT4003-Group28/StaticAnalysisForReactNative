package defpackage;
/* compiled from: PG */
/* renamed from: bzt  reason: default package */
/* loaded from: classes.dex */
public final class bzt<Model, Data> implements cap<Model, Data> {
    private final bzr a;

    public bzt(bzr bzrVar) {
        this.a = bzrVar;
    }

    @Override // defpackage.cap
    public final boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // defpackage.cap
    public final cao<Data> b(Model model, int i, int i2, bua buaVar) {
        return new cao<>(new ciy(model), new bzq(model.toString()));
    }
}
