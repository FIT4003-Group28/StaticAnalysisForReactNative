package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: arwb  reason: default package */
/* loaded from: classes2.dex */
public abstract class arwb<T extends cqkp> implements arxl<T> {
    protected final arvo a;
    protected final arvw b;
    private final boolean c;

    public arwb(arvo arvoVar, arvw arvwVar, boolean z) {
        this.a = arvoVar;
        this.b = arvwVar;
        this.c = z;
    }

    @Override // defpackage.arxl
    public final arxk c() {
        return new arvq(this.a, this.b, this.c);
    }
}
