package defpackage;

import java.util.ArrayDeque;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aeqs  reason: default package */
/* loaded from: classes.dex */
public final class aeqs {
    public static final aeqs a = new aeqs(new ArrayDeque(), new ArrayDeque(), new ArrayDeque(), new ArrayDeque(), -1, "EMPTY");
    ArrayDeque b;
    ArrayDeque c;
    ArrayDeque d;
    ArrayDeque e;
    long f;
    String g;

    public aeqs(afks afksVar) {
        this.f = -1L;
        this.b = new ArrayDeque();
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new ArrayDeque();
        this.b.addAll(afksVar.b);
        this.c.addAll(afksVar.d);
        this.d.addAll(afksVar.c);
        this.e.addAll(afksVar.e);
        this.f = afksVar.f;
        this.g = afksVar.g;
    }

    public aeqs(ArrayDeque arrayDeque, ArrayDeque arrayDeque2, ArrayDeque arrayDeque3, ArrayDeque arrayDeque4, long j, String str) {
        this.b = arrayDeque;
        this.c = arrayDeque2;
        this.d = arrayDeque3;
        this.e = arrayDeque4;
        this.f = j;
        this.g = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aeqs a(aeqs aeqsVar) {
        return new aeqs(aeqsVar.b, aeqsVar.c, aeqsVar.d, aeqsVar.e, aeqsVar.f, aeqsVar.g);
    }
}
