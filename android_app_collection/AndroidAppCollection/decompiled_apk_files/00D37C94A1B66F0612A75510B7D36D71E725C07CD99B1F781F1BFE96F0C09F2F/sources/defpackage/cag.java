package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cag  reason: default package */
/* loaded from: classes2.dex */
public final class cag implements cak {
    private final bzz a;
    private final bzz b;

    public cag(bzz bzzVar, bzz bzzVar2) {
        this.a = bzzVar;
        this.b = bzzVar2;
    }

    @Override // defpackage.cak
    public final byy a() {
        return new bzk(this.a.a(), this.b.a());
    }

    @Override // defpackage.cak
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.cak
    public final boolean c() {
        return this.a.c() && this.b.c();
    }
}
