package defpackage;
/* compiled from: PG */
/* renamed from: cuj  reason: default package */
/* loaded from: classes3.dex */
public final class cuj implements cuh {
    private cuk a;
    private final ajnx b;

    public cuj(ajnx ajnxVar) {
        this.b = ajnxVar;
    }

    @Override // defpackage.cuh
    public final cug a(int i, boolean z) {
        if (i == 5 || !z) {
            return cue.a;
        }
        if (this.a == null) {
            this.a = new cuk(this.b);
        }
        return this.a;
    }
}
