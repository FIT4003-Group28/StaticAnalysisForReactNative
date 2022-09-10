package defpackage;

import android.content.Context;
import dagger.internal.Factory;
import java.io.File;
/* compiled from: PG */
/* renamed from: damv  reason: default package */
/* loaded from: classes5.dex */
public final class damv implements Factory<damu> {
    private final dzsj<Context> a;
    private final dzsj<File> b;
    private final dzsj<dalc> c;

    public damv(dzsj<Context> dzsjVar, dzsj<File> dzsjVar2, dzsj<dalc> dzsjVar3) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new damu(((dalo) this.a).a(), this.b.a(), this.c.a());
    }
}
