package defpackage;

import com.google.android.libraries.elements.interfaces.JSControllerInitializationMode;
/* compiled from: PG */
/* renamed from: ste  reason: default package */
/* loaded from: classes4.dex */
public final class ste {
    public final JSControllerInitializationMode a;
    public final boolean b;
    public final int c;

    public ste() {
    }

    public ste(JSControllerInitializationMode jSControllerInitializationMode, boolean z, int i) {
        this.a = jSControllerInitializationMode;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ste) {
            ste steVar = (ste) obj;
            if (this.a.equals(steVar.a) && this.b == steVar.b && this.c == steVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        int i = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 93);
        sb.append("JavaScriptConfig{initializationMode=");
        sb.append(valueOf);
        sb.append(", enableVmContextLru=");
        sb.append(z);
        sb.append(", vmContextLruSize=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
