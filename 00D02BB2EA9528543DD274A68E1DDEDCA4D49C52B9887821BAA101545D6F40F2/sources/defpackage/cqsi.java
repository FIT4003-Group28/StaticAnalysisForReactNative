package defpackage;

import android.graphics.PorterDuff;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqsi  reason: default package */
/* loaded from: classes5.dex */
public final class cqsi extends cqvc {
    private final cqpw a;
    private final cqtd b;
    private final cqss c;
    private final PorterDuff.Mode d;

    public cqsi(cqpw cqpwVar, cqtd cqtdVar, @dzsi cqss cqssVar, @dzsi PorterDuff.Mode mode) {
        this.a = cqpwVar;
        if (cqtdVar != null) {
            this.b = cqtdVar;
            this.c = cqssVar;
            this.d = mode;
            return;
        }
        throw new NullPointerException("Null drawable");
    }

    @Override // defpackage.cqvc
    public final cqpw a() {
        return this.a;
    }

    @Override // defpackage.cqvc
    public final cqtd c() {
        return this.b;
    }

    @Override // defpackage.cqvc
    @dzsi
    public final cqss d() {
        return this.c;
    }

    @Override // defpackage.cqvc
    @dzsi
    public final PorterDuff.Mode e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        cqss cqssVar;
        PorterDuff.Mode mode;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqvc) {
            cqvc cqvcVar = (cqvc) obj;
            if (this.a.equals(cqvcVar.a()) && this.b.equals(cqvcVar.c()) && ((cqssVar = this.c) != null ? cqssVar.equals(cqvcVar.d()) : cqvcVar.d() == null) && ((mode = this.d) != null ? mode.equals(cqvcVar.e()) : cqvcVar.e() == null) && cqvcVar.f() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqvc
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        cqss cqssVar = this.c;
        int i = 0;
        int hashCode2 = (hashCode ^ (cqssVar == null ? 0 : cqssVar.hashCode())) * 1000003;
        PorterDuff.Mode mode = this.d;
        if (mode != null) {
            i = mode.hashCode();
        }
        return (hashCode2 ^ i) * 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 66 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("State{stateSet=");
        sb.append(valueOf);
        sb.append(", drawable=");
        sb.append(valueOf2);
        sb.append(", tintColor=");
        sb.append(valueOf3);
        sb.append(", tintMode=");
        sb.append(valueOf4);
        sb.append(", id=");
        sb.append(0);
        sb.append("}");
        return sb.toString();
    }
}
