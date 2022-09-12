package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alvo  reason: default package */
/* loaded from: classes2.dex */
public final class alvo extends alwj {
    private final dmpm a;
    private final int b;

    public alvo(dmpm dmpmVar, int i) {
        if (dmpmVar != null) {
            this.a = dmpmVar;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null tiePoint");
    }

    @Override // defpackage.alwj
    public final dmpm a() {
        return this.a;
    }

    @Override // defpackage.alwj
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alwj) {
            alwj alwjVar = (alwj) obj;
            if (this.a.equals(alwjVar.a()) && this.b == alwjVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }
}
