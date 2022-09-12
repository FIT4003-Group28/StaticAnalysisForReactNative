package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: ckrw  reason: default package */
/* loaded from: classes4.dex */
final class ckrw implements Comparable<ckrw> {
    public final File a;
    public final long b;

    public ckrw(File file) {
        this.a = file;
        this.b = file.lastModified();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ckrw ckrwVar) {
        long j = this.b;
        long j2 = ckrwVar.b;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }
}
