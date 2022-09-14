package defpackage;

import java.io.Serializable;
import java.lang.Comparable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aoun  reason: default package */
/* loaded from: classes2.dex */
public final class aoun<K extends Comparable<? super K>, U extends Serializable> extends aove<K, U> {
    private final angu<K, U> a;
    private final angt<K, U> b;

    public aoun(angu<K, U> anguVar, angt<K, U> angtVar) {
        if (anguVar != null) {
            this.a = anguVar;
            if (angtVar != null) {
                this.b = angtVar;
                return;
            }
            throw new NullPointerException("Null listener");
        }
        throw new NullPointerException("Null dataReference");
    }

    @Override // defpackage.aove
    public final angu<K, U> a() {
        return this.a;
    }

    @Override // defpackage.aove
    public final angt<K, U> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aove) {
            aove aoveVar = (aove) obj;
            if (this.a.equals(aoveVar.a()) && this.b.equals(aoveVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(valueOf2).length());
        sb.append("DataEntry{dataReference=");
        sb.append(valueOf);
        sb.append(", listener=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
