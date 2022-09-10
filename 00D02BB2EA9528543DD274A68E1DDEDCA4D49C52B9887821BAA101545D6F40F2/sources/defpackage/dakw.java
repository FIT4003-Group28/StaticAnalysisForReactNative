package defpackage;

import dagger.internal.Factory;
import java.io.File;
/* compiled from: PG */
/* renamed from: dakw  reason: default package */
/* loaded from: classes5.dex */
public final class dakw implements Factory<dakv> {
    private final dzsj<dall> a;
    private final dzsj<damu> b;
    private final dzsj<File> c;

    public dakw(dzsj<dall> dzsjVar, dzsj<damu> dzsjVar2, dzsj<File> dzsjVar3) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new dakv(dxjc.c(this.a), dxjc.c(this.b), dxjc.c(this.c));
    }
}
