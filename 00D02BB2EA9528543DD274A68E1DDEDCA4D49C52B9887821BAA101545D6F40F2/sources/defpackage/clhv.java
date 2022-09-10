package defpackage;

import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: clhv  reason: default package */
/* loaded from: classes5.dex */
public final class clhv implements Factory<clhu> {
    private final dzsj<clib> a;

    public clhv(dzsj<clib> dzsjVar) {
        this.a = dzsjVar;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new clhu(clih.b(), clii.b(), clgy.b(), ((clic) this.a).a());
    }
}
