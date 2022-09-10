package defpackage;
/* compiled from: PG */
/* renamed from: mqb  reason: default package */
/* loaded from: classes7.dex */
public class mqb implements mpb {
    private final float a;
    private final cqsn b;
    private final cjtd c;

    public mqb(float f, cqsn cqsnVar, cjtd cjtdVar) {
        this.a = f;
        dbsk.s(cqsnVar);
        this.b = cqsnVar;
        dbsk.s(cjtdVar);
        this.c = cjtdVar;
    }

    @Override // defpackage.mpb
    public Float a() {
        return Float.valueOf(this.a);
    }

    @Override // defpackage.mpb
    public cqsn b() {
        return this.b;
    }

    @Override // defpackage.mpb
    public cjtd c() {
        return this.c;
    }

    public mqb(float f, CharSequence charSequence, cjtd cjtdVar) {
        this(f, cqsk.a(charSequence), cjtdVar);
    }
}
