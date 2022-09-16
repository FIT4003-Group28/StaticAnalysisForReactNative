package defpackage;

import java.io.File;
import java.io.FileOutputStream;
/* compiled from: PG */
/* renamed from: ddas  reason: default package */
/* loaded from: classes5.dex */
public final class ddas extends ddaf {
    private final File a;
    private final dcep<ddar> b;

    public ddas(File file, ddar... ddarVarArr) {
        this.a = file;
        this.b = dcep.M(ddarVarArr);
    }

    public final FileOutputStream a() {
        return new FileOutputStream(this.a, this.b.contains(ddar.a));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20 + String.valueOf(valueOf2).length());
        sb.append("Files.asByteSink(");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
