package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
/* compiled from: PG */
/* renamed from: eakd  reason: default package */
/* loaded from: classes6.dex */
public final class eakd implements eakg {
    final /* synthetic */ File a;

    public eakd(File file) {
        this.a = file;
    }

    @Override // defpackage.eakg
    public final FileChannel a() {
        return new FileInputStream(this.a).getChannel();
    }
}
