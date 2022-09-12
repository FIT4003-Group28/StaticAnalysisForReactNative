package defpackage;
/* compiled from: PG */
/* renamed from: bate  reason: default package */
/* loaded from: classes3.dex */
public enum bate {
    VAGUE_SUGGESTION(dtxo.h, dtxo.f, dtxo.g),
    HOME_VAGUE_SUGGESTION(dtxo.d, dtxo.b, dtxo.c),
    WORK_VAGUE_SUGGESTION(dtxo.k, dtxo.i, dtxo.j);
    
    private final ddho d;
    private final ddho e;
    private final ddho f;

    bate(ddho ddhoVar, ddho ddhoVar2, ddho ddhoVar3) {
        this.d = ddhoVar;
        this.e = ddhoVar2;
        this.f = ddhoVar3;
    }

    public final ddho a(int i) {
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? this.f : this.e : this.d;
    }
}
