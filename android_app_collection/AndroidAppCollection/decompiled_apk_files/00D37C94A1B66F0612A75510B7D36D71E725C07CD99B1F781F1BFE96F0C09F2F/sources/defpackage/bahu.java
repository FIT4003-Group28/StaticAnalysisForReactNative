package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bahu  reason: default package */
/* loaded from: classes2.dex */
public final class bahu extends bain implements Serializable, baif {
    public static final bahu a = new bahu(0);
    private static final long serialVersionUID = 2471658376918L;

    public bahu(long j) {
        super(j);
    }

    public static bahu b(long j) {
        return j == 0 ? a : new bahu(j);
    }

    public static bahu c(long j) {
        return j == 0 ? a : new bahu(bajw.c(j, 1000));
    }

    public final long a() {
        return this.b / 3600000;
    }
}
