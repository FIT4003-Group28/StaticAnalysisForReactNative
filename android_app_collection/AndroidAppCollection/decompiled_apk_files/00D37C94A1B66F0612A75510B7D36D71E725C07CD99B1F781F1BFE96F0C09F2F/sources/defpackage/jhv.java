package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: jhv  reason: default package */
/* loaded from: classes3.dex */
public final class jhv implements jip {
    private final ayor a;
    private final fbx b;

    public jhv(ayor ayorVar, fbx fbxVar) {
        this.a = ayorVar;
        this.b = fbxVar;
    }

    @Override // defpackage.jip
    public final ayoi b() {
        asxj asxjVar = this.b.a.b().e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        long j = asxjVar.bf;
        if (j <= 0) {
            j = 60;
        }
        long j2 = j;
        return ayoi.S(j2, j2, TimeUnit.SECONDS, this.a).X(this.a);
    }

    public final boolean equals(Object obj) {
        return obj instanceof jhv;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{60L});
    }
}
