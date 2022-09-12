package defpackage;
/* compiled from: PG */
/* renamed from: ahba  reason: default package */
/* loaded from: classes2.dex */
public class ahba implements agys {
    private final cqix<?> a;

    public ahba(cqix<?> cqixVar) {
        this.a = cqixVar;
    }

    @Override // defpackage.agys
    public cqix<?> a() {
        return this.a;
    }

    public boolean equals(@dzsi Object obj) {
        return (obj instanceof ahba) && this.a.equals(((ahba) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
