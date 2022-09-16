package defpackage;

import java.io.File;
import java.io.FileInputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ddat  reason: default package */
/* loaded from: classes5.dex */
public final class ddat extends ddah {
    private final File a;

    public ddat(File file) {
        dbsk.s(file);
        this.a = file;
    }

    @Override // defpackage.ddah
    public final byte[] a() {
        ddaq a = ddaq.a();
        try {
            FileInputStream fileInputStream = new FileInputStream(this.a);
            a.c(fileInputStream);
            return ddak.c(fileInputStream, fileInputStream.getChannel().size());
        } finally {
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Files.asByteSource(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
