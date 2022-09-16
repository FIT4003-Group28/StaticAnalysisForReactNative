package defpackage;
/* compiled from: PG */
/* renamed from: aicf  reason: default package */
/* loaded from: classes2.dex */
public final class aicf implements aibx {
    private final cqat a;
    private final btrm b;
    private final aibf c;
    private final btvo d;

    public aicf(cqat cqatVar, btrm btrmVar, aibf aibfVar, btvo btvoVar) {
        this.a = cqatVar;
        this.b = btrmVar;
        this.c = aibfVar;
        this.d = btvoVar;
    }

    @Override // defpackage.aibx
    public final aica a(aiby aibyVar) {
        return new aicg(this.a, this.b, aibyVar, this.d);
    }
}
