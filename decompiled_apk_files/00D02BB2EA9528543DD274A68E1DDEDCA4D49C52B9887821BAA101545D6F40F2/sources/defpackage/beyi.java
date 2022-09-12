package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: beyi  reason: default package */
/* loaded from: classes3.dex */
public final class beyi {
    public static final long a = TimeUnit.DAYS.toSeconds(14);
    public final cqat b;
    public final bfaq c;
    private final btvo d;

    public beyi(btvo btvoVar, cqat cqatVar, bfaq bfaqVar) {
        this.d = btvoVar;
        this.b = cqatVar;
        this.c = bfaqVar;
    }

    public final boolean a() {
        return this.d.getPlaceSheetParameters().f() && this.d.getLocalFollowParameters().b;
    }
}
