package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: cab  reason: default package */
/* loaded from: classes.dex */
public final class cab<Data> implements cap<File, Data> {
    private final bzy<Data> a;

    public cab(bzy<Data> bzyVar) {
        this.a = bzyVar;
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ boolean a(File file) {
        return true;
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ cao b(File file, int i, int i2, bua buaVar) {
        File file2 = file;
        return new cao(new ciy(file2), new bzx(file2, this.a));
    }
}
