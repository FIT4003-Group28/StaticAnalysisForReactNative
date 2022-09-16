package defpackage;
/* compiled from: PG */
/* renamed from: cui  reason: default package */
/* loaded from: classes3.dex */
public final class cui implements cuh {
    private cug a;
    private final hcx b;

    public cui(int i) {
        this.b = new hcx(i);
    }

    @Override // defpackage.cuh
    public final cug a(int i, boolean z) {
        if (i == 5 || !z) {
            return cue.a;
        }
        if (this.a == null) {
            this.a = new cul(this.b, null);
        }
        return this.a;
    }
}
