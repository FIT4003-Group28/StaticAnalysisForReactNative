package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dd  reason: default package */
/* loaded from: classes5.dex */
public final class dd implements Serializable {
    private static final long serialVersionUID = 1;
    public boolean a = false;
    public final List<dc> b = new ArrayList();

    public final void a(dc dcVar) {
        String str = dcVar.a;
        for (dc dcVar2 : this.b) {
            if (str.equals(dcVar2.a)) {
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Duplicate keyword: ".concat(valueOf) : new String("Duplicate keyword: "));
            }
        }
        this.b.add(dcVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (dc dcVar : this.b) {
            if (sb.length() != 0) {
                sb.append(";  ");
            }
            sb.append(dcVar);
        }
        return sb.toString();
    }
}
