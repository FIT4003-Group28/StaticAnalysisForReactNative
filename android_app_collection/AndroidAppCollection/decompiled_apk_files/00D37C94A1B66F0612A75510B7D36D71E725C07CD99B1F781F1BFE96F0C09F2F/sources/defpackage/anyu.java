package defpackage;
/* compiled from: PG */
/* renamed from: anyu  reason: default package */
/* loaded from: classes.dex */
final class anyu implements anyz {
    private final int a;
    private final anyy b;

    public anyu(int i, anyy anyyVar) {
        this.a = i;
        this.b = anyyVar;
    }

    @Override // defpackage.anyz
    public final int a() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return anyz.class;
    }

    @Override // defpackage.anyz
    public final anyy b() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anyz)) {
            return false;
        }
        anyz anyzVar = (anyz) obj;
        return this.a == anyzVar.a() && this.b.equals(anyzVar.b());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (this.b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + this.b + ')';
    }
}
