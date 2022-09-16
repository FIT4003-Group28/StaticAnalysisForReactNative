package defpackage;

import java.io.File;
import java.io.FileInputStream;
/* compiled from: PG */
/* renamed from: anes  reason: default package */
/* loaded from: classes.dex */
public final class anes extends anhg {
    private final File a;

    public anes(File file) {
        file.getClass();
        this.a = file;
    }

    public final FileInputStream a() {
        return new FileInputStream(this.a);
    }

    @Override // defpackage.anhg
    public final byte[] b() {
        anep a = anep.a();
        try {
            FileInputStream a2 = a();
            a.c(a2);
            return anek.d(a2, a2.getChannel().size());
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
