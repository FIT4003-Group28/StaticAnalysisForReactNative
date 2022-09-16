package defpackage;
/* compiled from: PG */
/* renamed from: ahly  reason: default package */
/* loaded from: classes.dex */
public final class ahly implements ahji {
    public float a;
    private final ahlx b;
    private final ahjh c = new ahjh();
    private final float d;

    public ahly(ahlx ahlxVar, float f, float f2) {
        this.b = ahlxVar;
        this.a = f;
        this.d = f2;
    }

    @Override // defpackage.ahji
    public final void a(boolean z, long j) {
        this.c.b(z, j);
        float a = this.c.a();
        this.b.l((this.d * a) + ((1.0f - a) * this.a));
    }
}
