package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
/* compiled from: PG */
/* renamed from: badr  reason: default package */
/* loaded from: classes2.dex */
public final class badr implements badu {
    final /* synthetic */ File a;

    public badr(File file) {
        this.a = file;
    }

    @Override // defpackage.badu
    public final FileChannel a() {
        return new FileInputStream(this.a).getChannel();
    }
}
