package defpackage;
/* compiled from: PG */
/* renamed from: chtn  reason: default package */
/* loaded from: classes4.dex */
final class chtn extends chtr {
    private final dcdn<dpwe, Integer> a;

    public chtn(dcdn<dpwe, Integer> dcdnVar) {
        if (dcdnVar != null) {
            this.a = dcdnVar;
            return;
        }
        throw new NullPointerException("Null taskPointTable");
    }

    @Override // defpackage.chtr
    public final dcdn<dpwe, Integer> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof chtr)) {
            return false;
        }
        return this.a.equals(((chtr) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("TaskPointTable{taskPointTable=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
