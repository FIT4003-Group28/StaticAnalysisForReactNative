package defpackage;

import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cmmb  reason: default package */
/* loaded from: classes5.dex */
public final class cmmb implements cmmc {
    public final cmmp a;
    public boolean b;
    public cmnm c;

    public cmmb(File file) {
        cmmn.c(true);
        cmmn.a(true);
        this.a = new cmmp(file);
    }

    public static final int a(cmma cmmaVar, int i) {
        int hashCode = (cmmaVar.a * 31) + cmmaVar.b.hashCode();
        if (i < 2) {
            long a = cmme.a(cmmaVar.e);
            return (hashCode * 31) + ((int) (a ^ (a >>> 32)));
        }
        return (hashCode * 31) + cmmaVar.e.hashCode();
    }

    @Override // defpackage.cmmc
    public final void b() {
        this.b = true;
    }
}
