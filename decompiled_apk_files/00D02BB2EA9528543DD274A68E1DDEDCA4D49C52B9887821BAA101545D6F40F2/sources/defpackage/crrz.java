package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: crrz  reason: default package */
/* loaded from: classes5.dex */
public final class crrz {
    public final btrm a;
    public final cqat b;
    public final Queue<crry> c;
    public final long d;
    public boolean e;
    public float f;
    public final crsb g;

    public crrz(btrm btrmVar, cqat cqatVar, long j, crsb crsbVar) {
        this.a = btrmVar;
        this.b = cqatVar;
        this.d = j;
        dbsk.e(true, "minNumOfSamples was %s but expected > 0", 10);
        this.g = crsbVar;
        this.c = new ArrayDeque();
    }
}
